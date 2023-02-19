package kt.harshsingh.quizie

object Constants {
    const val USER_NAME : String = "user_name"
    const val TOTAL_QUESTIONS: String = "total_questions"
    const val CORRECT_ANSWER: String = "correct_answers"
    fun getQuestion():ArrayList<Question>{
        val questionList = ArrayList<Question>()
        //1
        val que1 = Question(
            1,
            "What country does this flag belong to?",
            R.drawable.india,
            "Cote D'ivoire",
            "Republic Of Ireland",
            "India",
            "Niger",
            3
        )
        questionList.add(que1)
        //2
        val que2 = Question(
            2,
            "What country does this flag belong to?",
            R.drawable.japan,
            "Bangladesh",
            "Japan",
            "Palau",
            "South Korea",
            2
        )
        questionList.add(que2)
        //3
        val que3 = Question(
            3,
            "What country does this flag belong to?",
            R.drawable.america,
            "America",
            "Thailand",
            "Argentina",
            "Poland",
            1
        )
        questionList.add(que3)
        //4
        val que4 = Question(
            4,
            "What country does this flag belong to?",
            R.drawable.australia,
            "Austria",
            "Philippines",
            "New Zealand",
            "Australia",
            4
        )
        questionList.add(que4)
        //5
        val que5 = Question(
            5,
            "What country does this flag belong to?",
            R.drawable.canada,
            "Vietnam",
            "Canada",
            "Singapore",
            "Nepal",
            2
        )
        questionList.add(que5)
        //6
        val que6 = Question(
            6,
            "What country does this flag belong to?",
            R.drawable.france,
            "Denmark",
            "Kazakhstan",
            "Iceland",
            "France",
            4
        )
        questionList.add(que6)
        //7
        val que7 = Question(
            7,
            "What country does this flag belong to?",
            R.drawable.germany,
            "Romania",
            "Germany",
            "Switzerland",
            "Ireland",
            2
        )
        questionList.add(que7)
        //8
        val que8 = Question(
            8,
            "What country does this flag belong to?",
            R.drawable.russia,
            "Russia",
            "Mexico",
            "Israel",
            "Taiwan",
            1
        )
        questionList.add(que8)
        //9
        val que9 = Question(
            9,
            "What country does this flag belong to?",
            R.drawable.switzerland,
            "Yemen",
            "Kuwait",
            "Algeria",
            "Switzerland",
            4
        )
        questionList.add(que9)
        //10
        val que10 = Question(
            10,
            "What country does this flag belong to?",
            R.drawable.china,
            "Made In Japan",
            "Made In India",
            "Made In Mexico",
            "Made In China",
            4
        )
        questionList.add(que10)
        return questionList
    }
}