package com.tylertwoforks.calendarmaker.repositories

import com.tylertwoforks.calendarmaker.entities.Account
import org.springframework.data.repository.CrudRepository
import org.springframework.stereotype.Repository
import org.springframework.transaction.annotation.Propagation.REQUIRED
import org.springframework.transaction.annotation.Transactional

@Repository
@Transactional(propagation = REQUIRED)
interface AccountRepository : CrudRepository<Account, Long>