package com.example.demo
import com.example.demo.com.example.demo.InformacionApp
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.web.bind.annotation.*



//Ver como reenviar la firma digital a la app movil
@RestController
@RequestMapping("/api")
class AdministradorFirmaDigital{

    @Autowired
    lateinit var service: FirmaService
    //Ver como como enviarla a la APP Movil

    @PostMapping
    fun enviarInformacion(@RequestBody firmaDigital: FirmaDigital) {


    }
}






