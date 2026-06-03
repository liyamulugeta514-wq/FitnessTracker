package exercises

class CardioExercise(

    name: String,
    duration: Int

) : Exercise(name, duration) {

    override fun calculateCalories(): Int {
        return duration * 10
    }
}