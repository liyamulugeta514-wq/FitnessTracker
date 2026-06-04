package exercises

class StrengthExercise(
    name: String,
    duration: Int,
    private val sets: Int
) : Exercise(name, duration) {

    override fun calculateCalories(): Int {
        return duration * sets * 5
    }
}