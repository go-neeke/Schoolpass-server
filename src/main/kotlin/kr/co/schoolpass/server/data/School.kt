package kr.co.schoolpass.server.data

import jakarta.persistence.*

@Entity
data class School(
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    val id: Long? = null,

    val name: String
)