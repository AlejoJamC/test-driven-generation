import org.junit.jupiter.api.Assertions.assertTrue
import org.junit.jupiter.api.Test

class LlmServiceTest {

    @Test
    fun `should generate response for valid prompt`() {
        // Arrange
        val prompt = "What is the capital of France?"

        // Act
        val result = service.generateResponse(prompt)

        // Assert
        assertTrue(result.isSuccess)
        assertTrue(result.getOrNull()?.contains("Mock response") == true)
    }

}