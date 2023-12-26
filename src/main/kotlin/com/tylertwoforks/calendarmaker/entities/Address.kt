package com.tylertwoforks.calendarmaker.entities

import jakarta.persistence.Entity
import jakarta.persistence.GeneratedValue
import jakarta.persistence.Id

@Entity
data class Address(
		@Id
		@GeneratedValue
		var id: Long = 0,
		val street: String,
		val number: String,
		val zipCode: Int,
		val city: String,
		val country: String
)
