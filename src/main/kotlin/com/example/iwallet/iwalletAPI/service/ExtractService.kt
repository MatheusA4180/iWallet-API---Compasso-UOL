package com.example.iwallet.iwalletAPI.service

import com.example.iwallet.iwalletAPI.dto.NewExtractForm
import com.example.iwallet.iwalletAPI.mapper.ExtractFormMapper
import com.example.iwallet.iwalletAPI.model.Extract
import com.example.iwallet.iwalletAPI.repository.ExtractRepository
import org.springframework.stereotype.Service

@Service
class ExtractService(
        private val extractRepository: ExtractRepository,
        private val extractFormMapper: ExtractFormMapper
) {

    fun returnAllExtracts(): List<Extract> = extractRepository.findAll()

    fun registerExtract(form: NewExtractForm): Extract {
        val extract = extractFormMapper.map(form)
        extractRepository.save(extract)
        return extract
    }

    fun deleteAllExtracts() {
        extractRepository.deleteAll()
    }

}
