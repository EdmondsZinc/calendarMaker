package com.tylertwoforks.calendarmaker.entities

import jakarta.persistence.*
import java.time.LocalDate

@Entity
data class Customer(
		@Id
		@GeneratedValue
		var id: Long = 0,
		val firstName: String,
		val lastName: String,
		val birthdate: LocalDate,
		val email: String,
		@OneToOne
		val address: Address,
		@OneToMany(cascade = [CascadeType.ALL], orphanRemoval = true, fetch = FetchType.EAGER)
		@JoinColumn(name = "addresss_id")
		val accounts: Set<Account> = emptySet()
)
