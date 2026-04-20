package kr.co.schoolpass.server

import kr.co.schoolpass.server.Student
import org.springframework.data.jpa.repository.JpaRepository

interface StudentRepository : JpaRepository<Student, Long>