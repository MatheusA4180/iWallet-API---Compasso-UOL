package com.example.iwallet.iwalletAPI.controller

import com.example.iwallet.iwalletAPI.controller.ExtractController.Companion.PATH_EXTRACT
import com.example.iwallet.iwalletAPI.dto.NewExtractForm
import com.example.iwallet.iwalletAPI.model.Extract
import com.example.iwallet.iwalletAPI.service.ExtractService
import org.springframework.http.HttpStatus
import org.springframework.http.ResponseEntity
import org.springframework.transaction.annotation.Transactional
import org.springframework.web.bind.annotation.*
import org.springframework.web.util.UriComponentsBuilder
import javax.validation.Valid

@RestController
@RequestMapping(PATH_EXTRACT)
class ExtractController(private val extractService: ExtractService) {

    @GetMapping
    fun returnAllExtracts(): List<Extract> {
        return extractService.returnAllExtracts()
    }

    @PostMapping
    @Transactional
    fun registerExtract(
            @RequestBody @Valid form: NewExtractForm,
            uriBuilder: UriComponentsBuilder
    ): ResponseEntity<Extract> {
        val extract = extractService.registerExtract(form)
        return ResponseEntity
                .created(uriBuilder.path(PATH_EXTRACT + "/${extract.id}").build().toUri())
                .body(extract)
    }

    @DeleteMapping
    @ResponseStatus(HttpStatus.NO_CONTENT)
    @Transactional
    fun deleteAllExtracts() {
        extractService.deleteAllExtracts()
    }

    companion object {
        const val PATH_EXTRACT = "/extract"
    }

}
