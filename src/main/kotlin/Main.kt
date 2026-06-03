fun main() {
    val liya = User("Liya", 20, 60.0, 1.65, "Weight Loss")
    val abel = User("Abel", 23, 90.0, 1.75, "Weight Loss")
    val selam = User("Selam", 21, 45.0, 1.70, "Muscle Gain")
    val yonas = User("Yonas", 26, 78.0, 1.80, "General Fitness")

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
    println("Running - 30 min - 300 calories")
    println("Cycling - 25 min - 250 calories")

    println("\nAbel:")
    println("Swimming - 40 min - 320 calories")
    println("Walking - 45 min - 225 calories")

    println("\nSelam:")
    println("Strength Training - 35 min - 280 calories")
    println("Yoga - 30 min - 120 calories")

    println("\nYonas:")
    println("Running - 35 min - 350 calories")
    println("Cycling - 30 min - 300 calories")
}