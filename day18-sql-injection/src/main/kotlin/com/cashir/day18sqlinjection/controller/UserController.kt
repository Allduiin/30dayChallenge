package com.cashir.day18sqlinjection.controller

import com.cashir.day18sqlinjection.model.User
import com.cashir.day18sqlinjection.repository.UserRepository
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RequestParam
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/user")
class UserController (private val userRepository: UserRepository) {
    @PostMapping
    fun create(@RequestParam name: String): User {
        return userRepository.save(User(name = name))
    }

    // Уязвимый метод поиска пользователей по имени
    @GetMapping
    fun getUser(@RequestParam name: String): List<User> {
        // Обратите внимание, что здесь используется не параметризованный запрос (unsafe)
        return userRepository.findByNameVulnerable(name)
    }
}