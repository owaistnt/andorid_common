package com.artsman.common

import kotlinx.serialization.encodeToString
import kotlinx.serialization.json.Json

class ModuleVerifier {
    operator fun invoke(): Boolean{
        val result = Json.encodeToString(Sample())
        print("Json Serialization: $result")
        return true
    }
}

@kotlinx.serialization.Serializable
data class Sample(val name: String= "XYZ")