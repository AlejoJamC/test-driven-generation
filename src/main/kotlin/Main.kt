package com.alejojamc

import com.alejojamc.clients.ollama.OllamaClient

fun main() {
    val client = OllamaClient()

    try {
        // TODO: Move this properties to a local config file
        val response = client.generateCompletion(
            model = "llama3.2",
            prompt = "What is the capital of Colombia?"
        )
        println("Response: $response")
    } catch (e: Exception) {
        println("Error: ${e.message}")
    }
}