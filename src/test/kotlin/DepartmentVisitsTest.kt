
import departmentVisits.DepartmentVisits
import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class DepartmentVisitsTest {

    private val solver = DepartmentVisits()

    private val departments = mapOf(
        "milk" to "dairy",
        "cheese" to "dairy",
        "yogurt" to "dairy",
        "apple" to "fruits",
        "banana" to "fruits",
        "orange" to "fruits",
        "bread" to "bakery",
        "croissant" to "bakery",
        "chicken" to "meat",
        "beef" to "meat"
    )

    @Test
    fun `example case`() {
        val products = listOf(
            "milk", "apple", "cheese",
            "bread", "banana"
        )

        assertEquals(2, solver.solution(products, departments))
    }

    @Test
    fun `empty shopping list`() {
        assertEquals(
            0,
            solver.solution(emptyList(), departments)
        )
    }

    @Test
    fun `single product`() {
        assertEquals(
            0,
            solver.solution(listOf("milk"), departments)
        )
    }

    @Test
    fun `same department`() {
        val products = listOf(
            "milk", "cheese", "yogurt"
        )

        assertEquals(0, solver.solution(products, departments))
    }

    @Test
    fun `all different departments`() {
        val products = listOf(
            "milk", "apple", "bread", "chicken"
        )

        assertEquals(0, solver.solution(products, departments))
    }

    @Test
    fun `alternating departments`() {
        val products = listOf(
            "milk", "apple", "cheese",
            "banana", "yogurt", "orange"
        )

        assertEquals(4, solver.solution(products, departments))
    }

    @Test
    fun `already optimized`() {
        val products = listOf(
            "milk", "cheese", "apple",
            "banana", "bread"
        )

        assertEquals(0, solver.solution(products, departments))
    }

    @Test
    fun `repeated products`() {
        val products = listOf(
            "milk", "apple", "milk",
            "apple", "milk"
        )

        assertEquals(3, solver.solution(products, departments))
    }

    @Test
    fun `complex shopping list`() {
        val products = listOf(
            "milk", "apple", "bread",
            "cheese", "chicken", "banana",
            "croissant", "beef", "yogurt"
        )

        assertEquals(5, solver.solution(products, departments))
    }
}
