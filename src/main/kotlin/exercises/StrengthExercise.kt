package exercises

class StrengthExercise(

    name: String,
    duration: Int

) : Exercise(name, duration) {

    override fun calculateCalories(): Int {
        return duration * 8
    }
}