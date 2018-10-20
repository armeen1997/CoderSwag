package com.example.armee.coderswag.Services

import com.example.armee.coderswag.Modeel.Category
import com.example.armee.coderswag.Modeel.Product

object DataService {

    val categories = listOf(
            Category("SHIRTS","shirtimage"),
            Category("HOODIES", "hoodieimage"),
            Category("HATS", "hatimage"),
            Category("DIGITAl", "digitalgoodsimage")
    )

    val hats = listOf(
            Product("Devslopes Graphic Beanie", "$18", "hat01"),
            Product("Devslopes Graphic Black", "$20", "hat02"),
            Product("Devslopes Graphic White", "$18", "hat03"),
            Product("Devslopes Hat Snapback", "$22", "hat04")

            )

    val hoodies = listOf(
            Product("Devslopes Hoodie Grey","$28","hoodie01"),
            Product("Devslopes Hoodie Red","$32","hoodie02"),
            Product("Devslopes Gray Hoodie","$28","hoodie03"),
            Product("Devslopes Black Hoodie","$32","hoodie04")

    )

    val shirts = listOf(
            Product("Devslopes Shirt Black","$18","shirt01"),
            Product("Devslopes Badge Light Gray","$20","shirt02"),
            Product("Devslopes Logo Shirt Read","$22","shirt03"),
            Product("Devslopes Hustle","$22","shirt04"),
            Product("KickFlip Studios", "18","shirt05")

    )
}