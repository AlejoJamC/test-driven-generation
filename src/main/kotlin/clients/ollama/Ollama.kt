package com.alejojamc.clients.ollama

data class OllamaRequest(
    val model: String,
    val prompt: String,
    val stream: Boolean = false
)

data class OllamaResponse(
    val model: String,
    val response: String,
    val stream: Boolean = false
)

