package com.example.tz_meidasoft.data.entity.apiModel

data class City(
    val id: Int,
    val name: String,
    val coord: Coord,
    val country: String,
    val population: Int,
    val timezone: Int
)