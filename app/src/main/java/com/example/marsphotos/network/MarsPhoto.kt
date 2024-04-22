package com.example.marsphotos.network

import com.squareup.moshi.Json
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

// Use a data class to map with JSON data response
// To make data class serializable
@Serializable
data class MarsPhoto(
    val id: String,
    @field:Json(name = "img_src") // to match same name as json
    val imgSrc: String // assigned name to data class for kotlin
)
