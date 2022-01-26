package appprueba

import org.springframework.context.annotation.Configuration
import spock.mock.DetachedMockFactory

@Configuration
class ControllerConfiguration {
    def mockFactory = new DetachedMockFactory()
}
