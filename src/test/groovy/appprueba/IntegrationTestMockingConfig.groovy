package appprueba

import org.springframework.context.annotation.Configuration
import spock.mock.DetachedMockFactory

@Configuration
class IntegrationTestMockingConfig {
    def mockFactory = new DetachedMockFactory()
}
