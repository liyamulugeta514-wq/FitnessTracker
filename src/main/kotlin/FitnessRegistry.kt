class FitnessRegistry {

    private val users = mutableListOf<User>()

    fun register(user: User) {
        users.add(user)
        println("Registered: ${user.name}")
    }

    fun listAll() {
        for (user in users) {
            println("\nName: ${user.name}")
            println("Age: ${user.age}")
            println("BMI: ${user.calculateBMI()}")
        }
    }
}