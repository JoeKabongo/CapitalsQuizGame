package edu.sjsu.android.countriescapitalsquiz.data

import edu.sjsu.android.countriescapitalsquiz.R
import edu.sjsu.android.countriescapitalsquiz.model.Question
import edu.sjsu.android.countriescapitalsquiz.model.Region


class DataSource {

    /* Return list of continents  */
    fun loadContinents(): List<Region> {
        return listOf(
            Region(R.string.africa, R.drawable.africa),
            Region(R.string.america, R.drawable.america),
            Region(R.string.asia, R.drawable.asia),
            Region(R.string.europe, R.drawable.europe),
            Region(R.string.oceania, R.drawable.oceania),
        )
    }

    /* Return list of 10 questions */
    fun loadQuestions(): List<Question> {
        return listOf<Question>(
            Question(1, "What is the capital of Congo?", "Kinshasa", "Lisbon", "Paris", "DC", 1),
            Question(2, "What is the capital of France?", "Paris", "Lisbon", "NYC", "DC", 1),
            Question(3, "What is the capital of Portugal?", "San Jose", "Lisbon", "Paris", "DC", 2),
            Question(4, "What is the capital of USA?", "Kin", "NYC", "San Jose", "DC", 4),
            Question(5, "What is the capital of Canada?", "Kin", "OTTAWA", "Paris", "DC", 2),
            Question(6, "What is the capital of Brazil", "Kin", "Brasília", "Paris", "DC", 2),
            Question(7, "What is the capital of Japan", "Tokyo", "Lisbon", "Paris", "DC", 1),
            Question(8, "What is the capital of China", "Beijing", "NYC", "Paris", "DC", 1),
            Question(9, "What is the capital of India", "Kin", "New Delhi", "Mumbai", "DC", 2),
            Question(10, "What is the capital of Ghana", "Kin", "Accra", "Lumbubashi", "DC", 2),
        )
    }

}