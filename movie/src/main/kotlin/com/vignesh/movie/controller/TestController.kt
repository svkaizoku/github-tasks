package com.vignesh.movie.controller

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController

@RestController
class TestController {

    @GetMapping("/hi")
    fun hello() : String {
        return "Hello Test"
    }

    @GetMapping("/")
    fun default() : String {
        return  "default"
    }

    @GetMapping("/bye")
    fun bye() : String {
        return  "bye"
    }
}