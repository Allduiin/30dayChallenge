package com.challange.day17

import com.challange.day17.module.Account
import com.challange.day17.repository.AccountRepository
import com.challange.day17.service.AccountService
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.test.context.SpringBootTest
import kotlin.concurrent.thread
import kotlin.test.Test

@SpringBootTest
class AccountServiceTest {

    @Autowired
    lateinit var accountService: AccountService

    @Autowired
    lateinit var accountRepository: AccountRepository

    @Test
    fun `test concurrent deposit with isolation`() {
        // Создаем аккаунт с начальным балансом
        val account = accountRepository.save(Account(balance = 100.0))

        // Запускаем две конкурентные транзакции для пополнения баланса
        val thread1 = thread {
            accountService.deposit(account.id, 50.0)
        }
        val thread2 = thread {
            accountService.deposit(account.id, 100.0)
        }
        thread1.join()
        thread2.join()

        // Проверяем итоговый баланс
        val finalBalance = accountService.getBalance(account.id)
        println("Final Balance: $finalBalance")
    }
}