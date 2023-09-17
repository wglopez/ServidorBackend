package com.example.demo
import org.springframework.web.bind.annotation.*


@RestController
@RequestMapping("/api")
class TokenRa{

    //Ver como recibir el Token y como convertirlo en variable del SO

    private val listaDeElementos = mutableListOf<String>()

    @PostMapping("/recibirTokenRA")
    fun agregarElemento(@RequestBody elemento: String) {
        listaDeElementos.add(elemento)
    }

    @GetMapping("/enviarTokenRA")
    fun obtenerElementos(): List<String> {
        return listaDeElementos
    }
}


