import org.junit.jupiter.api.Test
import org.junit.jupiter.api.assertAll
import kotlin.test.*


class TestAserciones {
    @Test
    internal fun testAserciones() {
        val array = ArrayFunciones(arrayOf(1,10,9))
        assertAll("Testing",
            { assertTrue (array.sumaNumerosArray()>50,"La suma no es mayor que 50") },
            { assertTrue (array.arrayfun.contains(6),"Hay un número 10")},
            { assertNotNull(array,"Es null")},
            { assertFalse (array.numeroMenor()!=5,"El menor no es igual a 5")}
        )
    }
}
