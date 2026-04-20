package kr.co.schoolpass.server

import kr.co.schoolpass.server.data.Student
import org.springframework.data.jpa.repository.JpaRepository

interface StudentRepository : JpaRepository<Student, Long> {
    fun findBySchoolId(schoolId: Long): List<Student>
}