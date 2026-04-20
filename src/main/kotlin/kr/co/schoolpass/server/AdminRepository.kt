package kr.co.schoolpass.server

import kr.co.schoolpass.server.data.Admin
import org.springframework.data.jpa.repository.JpaRepository

interface AdminRepository : JpaRepository<Admin, Long> {

    fun findByUsername(username: String): Admin?
}