package appprueba

import org.springframework.mock.web.MockHttpServletResponse
import org.springframework.test.web.servlet.MockMvc
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders

class IntegrationTestRequestHelper {
    static MockHttpServletResponse get(MockMvc mockMvc, String path, String canal, String usuario) {
        def requestBuilder = MockMvcRequestBuilders.get(path)
        mockMvc.perform(requestBuilder).andReturn().response
    }

    static MockHttpServletResponse postWithoutBody(MockMvc mockMvc, String path, String canal, String usuario) {
        def requestBuilder = MockMvcRequestBuilders.post(path)
        mockMvc.perform(requestBuilder).andReturn().response
    }
}
