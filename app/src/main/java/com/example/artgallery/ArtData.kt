package com.example.artgallery

import java.io.Serializable

class ArtData(val name: String, val image: Int, val author: String) : Serializable {

    companion object {
        val viewArts = mutableListOf(
            ArtData("Крик", (R.drawable.munk), "Эдвард Мунк"),
            ArtData("Мона Лиза", (R.drawable.monaliza), "Леонардо Да Винчи"),
            ArtData("Любящий Винсент", (R.drawable.lovingvincent),"Ван Гог"),
            ArtData("Мария Магдалина", (R.drawable.tizian),"Тициан"),
            ArtData("Крик", (R.drawable.munk), "Эдвард Мунк"),
            ArtData("Мона Лиза", (R.drawable.monaliza), "Леонардо Да Винчи"),
            ArtData("Любящий Винсент", (R.drawable.lovingvincent),"Ван Гог"),
            ArtData("Мария Магдалина", (R.drawable.tizian),"Тициан"),
            ArtData("Крик", (R.drawable.munk), "Эдвард Мунк"),
            ArtData("Мона Лиза", (R.drawable.monaliza), "Леонардо Да Винчи"),
            ArtData("Любящий Винсент", (R.drawable.lovingvincent),"Ван Гог"),
            ArtData("Мария Магдалина", (R.drawable.tizian),"Тициан")
        )
    }
}