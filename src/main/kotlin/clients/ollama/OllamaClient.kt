package com.alejojamc.clients.ollama

import com.google.gson.Gson
import okhttp3.MediaType.Companion.toMediaType
import okhttp3.OkHttpClient
import okhttp3.Request
import okhttp3.RequestBody.Companion.toRequestBody
import okio.IOException

class OllamaClient(
    // TODO: move all this params to a local properties file.
    private val baseUrl: String = "http://localhost:11434",
    private val client: OkHttpClient = OkHttpClient(),
    private val gson: Gson = Gson()
) {
    fun generateCompletion(model: String, prompt: String): String {
        val request = OllamaRequest(model, prompt)
        val jsonBody = gson.toJson(request)

        val httpRequest = Request.Builder()
            .url("$baseUrl/api/generate")
            .post(jsonBody.toRequestBody("application/json".toMediaType()))
            .build()

        client.newCall(httpRequest).execute().use { response ->
            if (!response.isSuccessful) throw IOException("Unexpected response: ${response.code}")

            val ollamaResponse = gson.fromJson(response.body?.string(), OllamaResponse::class.java)
            return ollamaResponse.response
        }
    }
}