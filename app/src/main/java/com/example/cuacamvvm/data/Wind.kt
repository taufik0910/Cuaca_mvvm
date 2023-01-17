package com.example.cuacamvvm.data


import com.google.gson.annotations.SerializedName

class Wind(
    @SerializedName("deg")
    val deg: Int,
    @SerializedName("gust")
    val gust: Double,
    @SerializedName("speed")
    val speed: Double
)