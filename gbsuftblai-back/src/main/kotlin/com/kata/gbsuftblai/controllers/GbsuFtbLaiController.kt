package com.kata.gbsuftblai.controllers

import com.kata.gbsuftblai.services.GbsuFtbLaiService
import org.springframework.http.MediaType
import org.springframework.web.bind.annotation.*

@RestController
@RequestMapping("/gbsu-ftb-lai")
class GbsuFtbLaiController(private val gbsuFtbLaiService: GbsuFtbLaiService) {

    @GetMapping("/{inputNumber}", produces = [MediaType.APPLICATION_JSON_VALUE])
    @CrossOrigin(origins = ["http://localhost:8080", "http://localhost:4200"])
    fun convertNumber(@PathVariable(name = "inputNumber") inputNumber: String): ResultDto {
        return ResultDto(gbsuFtbLaiService.convertNumber(inputNumber))
    }

    data class ResultDto(val result: String)

}
