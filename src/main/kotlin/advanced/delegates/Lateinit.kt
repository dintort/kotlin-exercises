@file:JvmName("Mutable")

package advanced.delegates

import org.junit.Test
import kotlin.test.assertEquals
import kotlin.test.assertIs

class LateinitTest {

//    @Test
//    fun `Throws exception if accessed before initialization`() {
//        var value: Int by Lateinit()
//        val res = runCatching {
//            println(value)
//        }
//        val exception = assertIs<IllegalStateException>(res.exceptionOrNull())
//        assertEquals("Variable value must be set before it is initialized", exception.message)
//
//        var value2: Int by Lateinit()
//        val res2 = runCatching {
//            println(value)
//        }
//        val exception2 = assertIs<IllegalStateException>(res2.exceptionOrNull())
//        assertEquals("Variable value must be set before it is initialized", exception2.message)
//    }
//
//    @Test
//    fun `Behaves like a normal variable for Int`() {
//        var value: Int by Lateinit()
//        value = 10
//        assertEquals(10, value)
//        value = 20
//        assertEquals(20, value)
//    }
//
//    @Test
//    fun `Behaves like a normal variable for String`() {
//        var value: String by Lateinit()
//        value = "AAA"
//        assertEquals("AAA", value)
//        value = "BBB"
//        assertEquals("BBB", value)
//    }
//
//    @Test
//    fun `Behaves like a normal variable for nullable String`() {
//        var value: String? by Lateinit()
//        value = "AAA"
//        assertEquals("AAA", value)
//        value = null
//        assertEquals(null, value)
//        value = "BBB"
//        assertEquals("BBB", value)
//    }
}
