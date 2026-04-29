package kr.co.yellowpass.server.repository

import kr.co.yellowpass.server.data.entity.Parent
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.data.jpa.repository.Query

interface ParentRepository : JpaRepository<Parent, Long> {
    fun findByPhone(phone: String?): Parent?

    @Query("SELECT p FROM Parent p WHERE REPLACE(p.phone, '-', '') = :phone")
    fun findByPhoneNormalized(phone: String?): Parent?
}