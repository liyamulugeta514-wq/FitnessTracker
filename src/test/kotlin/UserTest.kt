import kotlin.test.Test
import kotlin.test.assertEquals

class UserTest {

    @Test
    fun testBMI() {
        val user = User(
            "Liya",
            20,
            60.0,
            1.65,
            "Weight Loss"
        )

        assertEquals(
            22.04,
            user.calculateBMI(),
            0.1
        )
    }

    @Test
    fun testUnderweightCategory() {
        val user = User(
            "Selam",
            21,
            45.0,
            1.70,
            "Muscle Gain"
        )

        assertEquals(
            "Underweight",
            user.getBMICategory()
        )
    }
}