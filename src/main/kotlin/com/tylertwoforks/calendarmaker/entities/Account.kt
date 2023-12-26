package com.tylertwoforks.calendarmaker.entities

import jakarta.persistence.Entity
import jakarta.persistence.GeneratedValue
import jakarta.persistence.Id

@Entity
data class Account(
		@Id
		@GeneratedValue
		var id: Long = 0,
		val number: Int,
		val balance: Int
)
