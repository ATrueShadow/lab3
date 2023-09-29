import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Tag
import org.junit.jupiter.api.Test


class MainLab3KtTest {
    @Test
    @Tag("var4")
    fun var4z2test() {
        assertFalse(var4z2(-1.0, -1.0))
        assertTrue(var4z2(1.0, -1.0))
        assertTrue(var4z2(-2.0, 2.0))
        assertFalse(var4z2(2.0, -3.0))
    }

    @Test
    @Tag("var4")
    fun var4z3test() {
        assertEquals(2.0, var4z3(-3.0))
        assertEquals(3.5, var4z3(-0.5))
        assertEquals(3.5, var4z3(0.5))
        assertEquals(0.0, var4z3(4.0))
        assertEquals(4.0, var4z3(0.0))
    }

}