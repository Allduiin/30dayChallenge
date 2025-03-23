package com.challange.day17.service

import com.challange.day17.module.Account
import com.challange.day17.repository.AccountRepository
import org.springframework.dao.CannotAcquireLockException
import org.springframework.stereotype.Service
import org.springframework.transaction.annotation.Isolation
import org.springframework.transaction.annotation.Transactional

@Service
class AccountService(private val accountRepository: AccountRepository) {

    @Transactional(isolation = Isolation.READ_COMMITTED)
    fun deposit(accountId: Long, amount: Double): Account? {
        try {
            return performDeposit(accountId, amount)
        } catch (e: CannotAcquireLockException) {
            // Логируем и пробуем повторно
            println("------ Deadlock detected, retrying deposit...")
            Thread.sleep(3000) // небольшая задержка перед повтором
            return performDeposit(accountId, amount)
        }
    }

    private fun performDeposit(accountId: Long, amount: Double): Account? {
        println("------ Depositing account $accountId with amount $amount")
        val timeStarted = System.currentTimeMillis()
        // Получаем аккаунт с блокировкой PESSIMISTIC_WRITE
        val account = accountRepository.findByIdForUpdate(accountId)
            .orElseThrow { IllegalArgumentException("Account not found") }
        println("------ Got account $accountId with amount ${account.balance}")
        Thread.sleep(1500)
        account.balance += amount
        accountRepository.save(account)
        val timeElapsed = System.currentTimeMillis() - timeStarted
        println("------ Added for account $accountId amount: $amount final amount: ${account.balance} \ntime for operation: $timeElapsed")
        return account
    }

    @Transactional(isolation = Isolation.READ_COMMITTED, readOnly = true)
    fun getBalance(accountId: Long): Double = accountRepository.findById(accountId)
            .orElseThrow { IllegalArgumentException("Account not found") }
            .balance
}