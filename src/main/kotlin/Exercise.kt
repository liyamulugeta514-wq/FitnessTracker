package exercises
open class Exercise(

    val name: String,
    val duration: Int

) {

    open fun calculateCalories(): Int {
        return 0
    }

    fun displayExercise() {

        println("Exercise: $name")
        println("Duration: $duration minutes")

    }
}