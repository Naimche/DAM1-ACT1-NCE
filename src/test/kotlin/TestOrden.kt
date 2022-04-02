import org.junit.jupiter.api.AfterEach
import org.junit.jupiter.api.BeforeEach
import org.junit.jupiter.api.Order
import org.junit.jupiter.api.Test
import kotlin.test.assertEquals

class TestOrden {
    @BeforeEach
    internal fun setUp() {
        println("Comienzo test")
    }

    @Test
    @Order(1)
    internal fun suma() {
        val array = ArrayFunciones(arrayOf(5,6))
        assertEquals(array.sumaNumerosArray(), 12, "La suma no es correcta")
    }

    @Test
    @Order(3)
    internal fun numeroMayor() {
        val array = ArrayFunciones(arrayOf(5,6))
        assertEquals(array.numeroMayor(), 8, "El numero mayor no es correcto")
    }

    @Test
    @Order(2)
    internal fun ordenar() {
        val array = ArrayFunciones(arrayOf(5,6))
        assertEquals(array.sumaNumerosArray(), 12, "La suma no es correcta")
    }

    @Test
    @Order(4)
    internal fun numeroMenor() {
        val array = ArrayFunciones(arrayOf(5,6))
        assertEquals(array.numeroMenor(), 8, "El numero menor no es correcto")
    }

    @AfterEach
    internal fun tearDown() {
        println("Fin de test")
    }
}