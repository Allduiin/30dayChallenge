package com.cashir.day19constraints.controller

import com.cashir.day19constraints.model.Order
import com.cashir.day19constraints.model.Product
import com.cashir.day19constraints.model.User
import com.cashir.day19constraints.repository.OrderRepository
import com.cashir.day19constraints.repository.ProductRepository
import com.cashir.day19constraints.repository.UsersRepository
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RestController

@RestController
class MainController(
    val usersRepository: UsersRepository,
    val orderRepository: OrderRepository,
    val productRepository: ProductRepository
) {
    @PostMapping("/users")
    fun addUser(@RequestBody user: User): User = usersRepository.save(user)

    @PostMapping("/products")
    fun addProduct(@RequestBody product: Product): Product = productRepository.save(product)

    @PostMapping("/orders")
    fun addOrder(@RequestBody order: Order): Order = orderRepository.save(order)
}