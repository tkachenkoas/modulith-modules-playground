package com.example.modulith.rest

import com.example.modulith.service.ServiceBean
import org.junit.jupiter.api.Test
import org.moduliths.test.ModuleTest
import org.springframework.boot.test.mock.mockito.MockBean

@ModuleTest
//@ExtendWith(SpringExtension::class)
class RestModuleTest {

    @MockBean
    val serviceBean: ServiceBean? = null

    @Test
    fun checkModule() {

    }

}