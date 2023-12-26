package com.tylertwoforks.calendarmaker

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class CalendarMakerApplication

fun main(args: Array<String>) {
	runApplication<CalendarMakerApplication>(*args)
}
