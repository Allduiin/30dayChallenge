package com.cashir.day19constraints.repository

import com.cashir.day19constraints.model.Order
import org.springframework.data.jpa.repository.JpaRepository

interface OrderRepository: JpaRepository<Order, Long>