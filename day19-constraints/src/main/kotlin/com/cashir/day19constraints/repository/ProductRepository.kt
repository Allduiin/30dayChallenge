package com.cashir.day19constraints.repository

import com.cashir.day19constraints.model.Product
import org.springframework.data.jpa.repository.JpaRepository

interface ProductRepository: JpaRepository<Product, Long>