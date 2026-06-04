package exercises

class CardioExercise(
    name: String,
    duration: Int,
    private val distance: Double
) : Exercise(name, duration) {

    override fun calculateCalories(): Int {
        return (distance * 60).toInt()
    }
}