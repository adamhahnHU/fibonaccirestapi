package hu.obuda.devops.fibonaccirestapi

import hu.obuda.devops.fibonaccirestapi.service.FibonacciService
import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.assertThrows
import org.springframework.boot.test.context.SpringBootTest

@SpringBootTest
class FibonaccirestapiApplicationTests {

    private val fibonacciService = FibonacciService()

    @Test
    fun `fibonacci of 0 should be 0`() {
        assertEquals(0, fibonacciService.fibonacci(0))
    }

    @Test
    fun `fibonacci of 1 should be 1`() {
        assertEquals(1, fibonacciService.fibonacci(1))
    }

    @Test
    fun `fibonacci of 5 should be 5`() {
        assertEquals(5, fibonacciService.fibonacci(5))
    }

    @Test
    fun `fibonacci of 10 should be 55`() {
        assertEquals(55, fibonacciService.fibonacci(10))
    }

    @Test
    fun `negative input should throw IllegalArgumentException`() {
        assertThrows<IllegalArgumentException> {
            fibonacciService.fibonacci(-1)
        }
    }

}