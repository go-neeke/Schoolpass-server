import kr.co.schoolpass.server.AdminRepository
import kr.co.schoolpass.server.data.Admin
import kr.co.schoolpass.server.data.LoginRequest
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/api/auth")
class AuthController(
    private val adminRepository: AdminRepository
) {

    @PostMapping("/login")
    fun login(@RequestBody req: LoginRequest): Admin {
        val admin = adminRepository.findByUsername(req.username)
            ?: throw RuntimeException("사용자 없음")

        if (admin.password != req.password) {
            throw RuntimeException("비밀번호 틀림")
        }

        return admin
    }
}