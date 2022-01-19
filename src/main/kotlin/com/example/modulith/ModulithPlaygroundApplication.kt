package com.example.modulith

import org.moduliths.Modulithic
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
@Modulithic
class ModulithPlaygroundApplication

fun main(args: Array<String>) {
	runApplication<ModulithPlaygroundApplication>(*args)
}
