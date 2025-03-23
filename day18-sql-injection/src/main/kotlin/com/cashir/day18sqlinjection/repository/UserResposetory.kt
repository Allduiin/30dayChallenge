package com.cashir.day18sqlinjection.repository

import com.cashir.day18sqlinjection.model.User
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.data.jpa.repository.Query

interface UserRepository : JpaRepository<User, Long> {
    // Небезопасный метод: значение параметра напрямую конкатенируется в SQL-строку
    @Query(value = "SELECT u FROM User u WHERE u.name = :name")
    fun findByNameVulnerable(name: String): List<User>
}