package com.cashir.day19constraints.repository

import com.cashir.day19constraints.model.User
import org.springframework.data.jpa.repository.JpaRepository

interface UsersRepository: JpaRepository<User, Long>