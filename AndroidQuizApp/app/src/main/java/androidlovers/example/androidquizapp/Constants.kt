package androidlovers.example.androidquizapp

import androidlovers.example.androidquizapp.R
import androidlovers.example.androidquizapp.Question

object Constants {

    // TODO (STEP 1: Create a constant variables which we required in the result screen.)
    // START
    const val USER_NAME: String = "user_name"
    const val TOTAL_QUESTIONS: String = "total_questions"
    const val CORRECT_ANSWERS: String = "correct_answers"
    // END
    
    fun getQuestions(): ArrayList<Question> {
        val questionsList = ArrayList<Question>()

        // 1
        val que1 = Question(
            1, "What iconic meal did McDonald’s introduce in 1968?",
            R.drawable.mcdo,
            "Filet-O-Fish", "Big Mac",
            "Cheeseburger", "McChicken", 2
        )

        questionsList.add(que1)

        // 2
        val que2 = Question(
            2, "How many herbs and spices are in Colonel Harland Sanders’ original KFC recipe?",
            R.drawable.kfc,
            "13", "12",
            "14", "9", 3
        )

        questionsList.add(que2)

        // 3
        val que3 = Question(
            3, "Which fast food restaurant still boards the slogan “Have it your way”?",
            R.drawable.urway,
            "Wendy's", "Taco Bell",
            "Chipotle", "Burger King", 4
        )

        questionsList.add(que3)

        // 4
        val que4 = Question(
            4, "Which fast-food franchise is credited with creating the very first, modern drive-thru window?",
            R.drawable.drivethru,
            "Subway", "Wendy's",
            "McDonald's", "In-N-Out", 2
        )

        questionsList.add(que4)

        // 5
        val que5 = Question(
            5, "What were chicken nuggets called when they were first invented?",
            R.drawable.chickennuggets,
            "Chicken Breasts", "Nuggies",
            "Chicken Crispies", "Chicken Popcorn", 3
        )

        questionsList.add(que5)

        // 6
        val que6 = Question(
            6, "Which food chain has the most locations in the world?",
            R.drawable.world,
            "Subway", "McDonald's",
            "Dunkin Donuts", "Starbucks", 1
        )

        questionsList.add(que6)

        // 7
        val que7 = Question(
            7, "What popular drink advertises as being “sports fuel”?",
            R.drawable.energy,
            "Mountain Dew", "Pocari Sweat",
            "Gatorade", "Powerade", 3
        )

        questionsList.add(que7)

        // 8
        val que8 = Question(
            8, "What is the world’s most expensive spice?",
            R.drawable.spices,
            "Pure Vanilla", "Cardamom",
            "Cumin", "Saffron", 4
        )

        questionsList.add(que8)

        // 9
        val que9 = Question(
            9, "Venison comes from which animal?",
            R.drawable.venision,
            "Ox", "Deer",
            "Sheep", "Rabbit", 2
        )

        questionsList.add(que9)

        // 10
        val que10 = Question(
            10, "What’s the largest selling vodka brand in the world?",
            R.drawable.vodka,
            "Smirnoff", "Absolut Vodka",
            "Skyy Vodka", "Ciroc Vodka", 1
        )

        questionsList.add(que10)

        return questionsList
    }
}