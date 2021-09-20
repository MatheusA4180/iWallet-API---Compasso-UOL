package com.example.iwallet.iwalletAPI.mapper

import com.example.iwallet.iwalletAPI.dto.NewExtractForm
import com.example.iwallet.iwalletAPI.model.Extract
import org.springframework.stereotype.Component

@Component
class ExtractFormMapper : Mapper<NewExtractForm, Extract> {

    override fun map(t: NewExtractForm): Extract {
        return Extract(
                broker = t.broker,
                name = t.name,
                category = t.category,
                balance = t.balance,
                date = t.date,
                type = t.type
        )
    }

}
