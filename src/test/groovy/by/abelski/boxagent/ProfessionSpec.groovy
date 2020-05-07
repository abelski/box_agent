package by.abelski.boxagent


import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc
import org.springframework.boot.test.context.SpringBootTest

@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.MOCK,
        classes = Boxagent)
@AutoConfigureMockMvc
class ProfessionSpec extends ApiTest {

}

