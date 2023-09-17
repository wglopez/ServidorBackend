package com.example.demo
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController


@RestController
@RequestMapping("/api")
class HelloController{
    @GetMapping("/saludo")
    fun saludar(): String {
        return "Hola, mundo!"
    }
}

