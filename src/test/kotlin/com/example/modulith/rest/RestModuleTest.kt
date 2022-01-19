package com.example.modulith.rest

import com.example.modulith.data.RepositoryClass
import org.junit.jupiter.api.Test
import org.moduliths.test.ModuleTest
import org.springframework.boot.test.mock.mockito.MockBean

@ModuleTest
//@ExtendWith(SpringExtension::class)
class RestModuleTest {

    @MockBean
    val repositoryClass: RepositoryClass? = null

    @Test
    fun checkModule() {

    }

}