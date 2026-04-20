package kr.co.schoolpass.server.data

data class BoardingRequest(
    val qrCode: String,
    val schoolId: Long
)