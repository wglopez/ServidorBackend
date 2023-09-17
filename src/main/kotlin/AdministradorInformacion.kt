package com.example.demo
import com.example.demo.com.example.demo.InformacionApp
import org.springframework.web.bind.annotation.*
import org.springframework.beans.factory.annotation.Autowired


@RestController
@RequestMapping("/recibirInformacion")
class AdministradorInformacion{
    @Autowired
    lateinit var service: InformacionService
    //Ver como recibir la informacion y como enviarla a la API REST de PFDR

    @PostMapping
    fun enviarInformacion(@RequestBody informacionApp: InformacionApp) {

        //Ver como llamar al servicio de AdministradorInformacionAPIREST
        val informacionAPI: InformacionAPI? = service.postInformacion(informacionApp)

    }

}


