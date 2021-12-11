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

    /* Return list of 10 questions for Africa */
    fun loadAfricaQuestions(): List<Question> {
        return listOf(
            Question(1, "Malia", "Windhoek", "Antananarivo", "Nairobi", "Bamako", 4),
            Question(2, "Eritrea ", "Asmara", "Dodoma", "Algiers", "Bangui", 1),
            Question(3, "Equatorial Guinea", "Proto-Novo", "Luanda", "Kinshasa", "Malabo", 4),
            Question(4, "South Sudan", "Harare", "Juba", "Cairo", "Pretoria", 2),
            Question(5, "Gambia", "Brazzaville", "Juba", "Banjul", "Nouakchott", 3),
            Question(6, "Egypt", "Gaborone", "Cairo", "Yamoussoukro", "Windhoek", 2),
            Question(7, "Morocco", "Banjul", "Rabat", "Bissau", "Lilongwe", 2),
            Question(8, "Algeria", "Algiers", "Monrovia", "Kigali", "Nouakchott", 1),
            Question(9, "Mozambique", "Kampala", "Conakry", "Maputo", "Pretoria", 3),
            Question(
                10,
                "Central African Republic",
                "Bangui",
                "Nouakchott",
                "Pretoria",
                "Addis Ababa",
                1
            ),
        )
    }


    /* Return list of 10 questions for America */
    fun loadAmericaQuestions(): List<Question> {
        return listOf(
            Question(1, "USA", "Mexico", "NYC", "San Jose", "Washington, DC", 4),
            Question(2, "Canada", "Bogota", "Ottawa", "Kingston", "Castries", 2),
            Question(3, "Brazil", "Brasilia", "Asuncion", "Paramaribo", "Havana", 1),
            Question(4, "Cuba", "Washington, DC", "Havana", "Belmopan", "Bridgetown", 2),
            Question(5, "Ecuador", "Quito", "Port-au-Prince", "Roseau", "Santa Domingo", 1),
            Question(6, "Belize", "Kingstown", "Port-au-Prince", "Roseau", "Belmopan", 4),
            Question(
                7,
                "Saint Kitts and Nevis",
                "Havana",
                "Basseterre",
                "Ottawa",
                "Panama City",
                2
            ),
            Question(8, "Suriname", "Montevideo", "Paramaribo", "Caracas", "Roseau", 2),
            Question(9, "Argentina", "Buenos Aires", "Havana", "Paramaribo", "Bridgetown", 1),
            Question(10, "St. George's", "Haiti", "Mexico", "Ottawa", "Grenada", 4)

        )
    }


    /* Return list of 10 questions for Asia */
    fun loadAsiaQuestions(): List<Question> {
        return listOf(
            Question(1, "Congo", "Kinshasa", "Lisbon", "Paris", "DC", 1),
            Question(2, "France", "Paris", "Lisbon", "NYC", "DC", 1),
            Question(3, "Portugal", "San Jose", "Lisbon", "Paris", "DC", 2),
            Question(4, "USA", "Kin", "NYC", "San Jose", "DC", 4),
            Question(5, "Canada", "Kin", "OTTAWA", "Paris", "DC", 2),
            Question(6, "Brazil", "Kin", "Brasília", "Paris", "DC", 2),
            Question(7, "Japan", "Tokyo", "Lisbon", "Paris", "DC", 1),
            Question(8, "China", "Beijing", "NYC", "Paris", "DC", 1),
            Question(9, "India", "Kin", "New Delhi", "Mumbai", "DC", 2),
            Question(10, "Ghana", "Kin", "Accra", "Lumbubashi", "DC", 2),
        )
    }


    /* Return list of 10 questions for Europe*/
    fun loadEuropeQuestions(): List<Question> {
        return listOf(
            Question(1, "Congo", "Kinshasa", "Lisbon", "Paris", "DC", 1),
            Question(2, "France", "Paris", "Lisbon", "NYC", "DC", 1),
            Question(3, "Portugal", "San Jose", "Lisbon", "Paris", "DC", 2),
            Question(4, "USA", "Kin", "NYC", "San Jose", "DC", 4),
            Question(5, "Canada", "Kin", "OTTAWA", "Paris", "DC", 2),
            Question(6, "Brazil", "Kin", "Brasília", "Paris", "DC", 2),
            Question(7, "Japan", "Tokyo", "Lisbon", "Paris", "DC", 1),
            Question(8, "China", "Beijing", "NYC", "Paris", "DC", 1),
            Question(9, "India", "Kin", "New Delhi", "Mumbai", "DC", 2),
            Question(10, "Ghana", "Kin", "Accra", "Lumbubashi", "DC", 2),
        )
    }


    /* Return list of 10 questions for Oceania */
    fun loadOceaniaQuestions(): List<Question> {
        return listOf(
            Question(1, "Congo", "Kinshasa", "Lisbon", "Paris", "DC", 1),
            Question(2, "France", "Paris", "Lisbon", "NYC", "DC", 1),
            Question(3, "Portugal", "San Jose", "Lisbon", "Paris", "DC", 2),
            Question(4, "USA", "Kin", "NYC", "San Jose", "DC", 4),
            Question(5, "Canada", "Kin", "OTTAWA", "Paris", "DC", 2),
            Question(6, "Brazil", "Kin", "Brasília", "Paris", "DC", 2),
            Question(7, "Japan", "Tokyo", "Lisbon", "Paris", "DC", 1),
            Question(8, "China", "Beijing", "NYC", "Paris", "DC", 1),
            Question(9, "India", "Kin", "New Delhi", "Mumbai", "DC", 2),
            Question(10, "Ghana", "Kin", "Accra", "Lumbubashi", "DC", 2),
        )
    }


}