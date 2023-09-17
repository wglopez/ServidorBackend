package com.example.demo

import com.example.demo.com.example.demo.InformacionApp
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Service
import org.springframework.web.client.RestTemplate


@Service
class InformacionService {

    @Autowired
    lateinit var restTemplate: RestTemplate
    val uri="www.example.com"

    fun postInformacion(informacion: InformacionApp): InformacionAPI? {

        //SE DEBE CONVERTIR LA INFORMACION DE LA APP EN INFORMACION DE LA API

        return restTemplate.postForObject(uri, informacion, InformacionAPI::class.java)
    }

}