import exercises.Exercise
class Workout {

    private val exercises = mutableListOf<Exercise>()

    fun addExercise(exercise: Exercise) {
        exercises.add(exercise)
    }

    fun showWorkout() {
        for (exercise in exercises) {
            exercise.displayExercise()
            println("Calories Burned: ${exercise.calculateCalories()}")
            println("----------------")
        }
    }

    fun totalCalories(): Int {
        var total = 0

        for (exercise in exercises) {
            total += exercise.calculateCalories()
        }

        return total
    }
}