package com.example.demo

import java.time.LocalDateTime
import java.util.*

data class UserModel(
        val firstName: String = "Tiago",
        val lastName: String = "Leao",
        val age: Int = 36,
        val currentDate: LocalDateTime = LocalDateTime.now(),
        val ids: AnotherModel = AnotherModel()
)

data class AnotherModel(
        val id: Int = 0,
        val uuid: String = UUID.randomUUID().toString()
)

