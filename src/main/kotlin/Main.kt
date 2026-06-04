import exercises.CardioExercise
import exercises.StrengthExercise

fun main() {
    val liya = User("Liya", 20, 60.0, 1.65, "Weight Loss")
    val abel = User("Abel", 23, 90.0, 1.75, "Weight Loss")
    val selam = User("Selam", 21, 45.0, 1.70, "Muscle Gain")
    val yonas = User("Yonas", 26, 78.0, 1.80, "General Fitness")

    val liyaRunning = CardioExercise("Running", 30, 5.0)
    val liyaCycling = CardioExercise("Cycling", 25, 7.0)

    val abelSwimming = CardioExercise("Swimming", 40, 3.0)
    val abelWalking = CardioExercise("Walking", 45, 4.0)

    val selamStrength = StrengthExercise("Strength Training", 35, 4)
    val selamYoga = StrengthExercise("Yoga", 30, 2)

    val yonasRunning = CardioExercise("Running", 35, 6.0)
    val yonasCycling = CardioExercise("Cycling", 30, 8.0)

    println("=== Users and Suggested Exercises ===\n")

    liya.displayUser()
    println()

    abel.displayUser()
    println()

    selam.displayUser()
    println()

    yonas.displayUser()

    println("\n\n=== Workout Summary ===\n")

    println("Liya:")
    println("${liyaRunning.name} - ${liyaRunning.duration} min - ${liyaRunning.calculateCalories()} calories")
    println("${liyaCycling.name} - ${liyaCycling.duration} min - ${liyaCycling.calculateCalories()} calories")

    println("\nAbel:")
    println("${abelSwimming.name} - ${abelSwimming.duration} min - ${abelSwimming.calculateCalories()} calories")
    println("${abelWalking.name} - ${abelWalking.duration} min - ${abelWalking.calculateCalories()} calories")

    println("\nSelam:")
    println("${selamStrength.name} - ${selamStrength.duration} min - ${selamStrength.calculateCalories()} calories")
    println("${selamYoga.name} - ${selamYoga.duration} min - ${selamYoga.calculateCalories()} calories")

    println("\nYonas:")
    println("${yonasRunning.name} - ${yonasRunning.duration} min - ${yonasRunning.calculateCalories()} calories")
    println("${yonasCycling.name} - ${yonasCycling.duration} min - ${yonasCycling.calculateCalories()} calories")
}