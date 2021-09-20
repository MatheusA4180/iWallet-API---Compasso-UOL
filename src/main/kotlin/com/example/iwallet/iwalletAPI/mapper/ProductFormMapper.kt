package com.example.iwallet.iwalletAPI.mapper

import com.example.iwallet.iwalletAPI.dto.NewProductForm
import com.example.iwallet.iwalletAPI.model.Product
import org.springframework.stereotype.Component

@Component
class ProductFormMapper : Mapper<NewProductForm, Product> {

    override fun map(t: NewProductForm): Product {
        return Product(
                broker = t.broker,
                name = t.name,
                category = t.category,
                price = t.price,
                quantity = t.quantity,
                total = t.total,
                date = t.date,
                color = t.color
        )
    }

}
