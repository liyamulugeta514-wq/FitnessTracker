class User(
    val name: String,
    val age: Int,
    val weight: Double,
    val height: Double,
    val goal: String
) {

    fun calculateBMI(): Double {
        return weight / (height * height)
    }

    fun getBMICategory(): String {
        val bmi = calculateBMI()

        return when {
            bmi < 18.5 -> "Underweight"
            bmi < 25 -> "Normal Weight"
            bmi < 30 -> "Overweight"
            else -> "Obese"
        }
    }

    fun waterRecommendation(): Double {
        return weight * 0.033
    }

    fun suggestExercise(): String {
        val bmi = calculateBMI()

        return when {
            bmi < 18.5 -> "Strength Training and Yoga"
            bmi < 25 -> "Running and Cycling"
            bmi < 30 -> "Swimming and Walking"
            else -> "Light Walking and Stretching"
        }
    }

    fun displayUser() {
        println("Name: $name")
        println("Age: $age")
        println("Goal: $goal")
        println("BMI: %.2f".format(calculateBMI()))
        println("BMI Category: ${getBMICategory()}")
        println("Recommended Water Intake: %.2f liters/day".format(waterRecommendation()))
        println("Suggested Exercises: ${suggestExercise()}")
    }
}