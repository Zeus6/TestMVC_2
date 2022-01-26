package appprueba

import org.springframework.boot.test.autoconfigure.core.AutoConfigureCache
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc
import org.springframework.boot.test.context.SpringBootTest
import org.springframework.context.annotation.Import
import org.springframework.test.context.TestPropertySource
import org.springframework.test.web.servlet.MockMvc
import spock.lang.Specification
import org.springframework.beans.factory.annotation.Autowired

//@RunWith(SpringRunner.class)
//@SpringBootTest(classes = Application.class)
//@PropertySource("classpath:application.properties")
@SpringBootTest
@AutoConfigureMockMvc
@Import([IntegrationTestMockingConfig])
@AutoConfigureCache
@TestPropertySource(properties="spring.main.allow-bean-definition-overriding=true")
class Test extends Specification {
    @Autowired
    MockMvc mockMvc

    def 'El get devuelve ok'() {
        given: "un mockMvc"
        def elMockMvc = mockMvc
        when: "al preguntar si es nulo"
        def esNulo = (elMockMvc == null)
        then: "no es nulo"
        !esNulo
    }

}
