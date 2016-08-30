package com.github.sfwn

import org.springframework.boot.SpringApplication
import org.springframework.boot.autoconfigure.SpringBootApplication
import java.util.*

/**
 * Created by sfwn on 8/30/16.
 */

@SpringBootApplication
open class Application

fun main(vararg args: String) {
    val ctx = SpringApplication.run(Application::class.java, *args)
    println("Let's inspect the beans provided by Spring Boot:")
    val beanNames = ctx.beanDefinitionNames
    Arrays.sort(beanNames)
    beanNames.forEach { println(it) }
}