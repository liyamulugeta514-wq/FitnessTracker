import exercises.CardioExercise
import exercises.StrengthExercise
import kotlin.test.Test
import kotlin.test.assertEquals

class ExerciseTest {

    @Test
    fun testCardioCalories() {
        val running = CardioExercise(
            "Running",
            30,
            5.0
        )

        assertEquals(
            300,
            running.calculateCalories()
        )
    }

    @Test
    fun testStrengthCalories() {
        val strength = StrengthExercise(
            "Strength Training",
            35,
            4
        )

        assertEquals(
            700,
            strength.calculateCalories()
        )
    }
}