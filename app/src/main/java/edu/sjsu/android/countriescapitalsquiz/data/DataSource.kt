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
            Question(1, "Vietnam", "Hanoi", "Mexico City", "Port Moresby", "Banjul", 1),
            Question(2, "Malaysia", "Helsinki", "Lilongwe", "Caracas", "Kuala Lumpur", 4),
            Question(
                3,
                "United Arab Emirates",
                "Guatemala City",
                "Abu Dhabi",
                "Tashkent",
                "Yamoussoukro",
                2
            ),
            Question(
                4,
                "Brunei",
                "Ljubljana",
                "Bamako",
                "Bandar Seri Begawan",
                "Saint George's",
                3
            ),
            Question(5, "Turkey", "Ankara", "Kin", "Helsinki", "Ouagadougou", 1),
            Question(6, "Tajikistan", "Montevideo", "Maseru", "Baghdad", "Dushanbe", 4),
            Question(7, "Japan", "Tokyo", "Lisbon", "Paris", "Manama", 1),
            Question(8, "China", "Beijing", "NYC", "Paris", "DC", 1),
            Question(9, "India", "Abu Dhabi", "New Delhi", "Mumbai", "DC", 2),
            Question(10, "Bangladesh", "Manama", "Dhaka", "Lumbubashi", "Monaco", 2),
        )
    }


    /* Return list of 10 questions for Europe*/
    fun loadEuropeQuestions(): List<Question> {
        return listOf(
            Question(1, "Slovenia", "Nicosia", "Beirut", "San Marino", "Ljubljana", 4),
            Question(2, "France", "Paris", "Lisbon", "NYC", "DC", 1),
            Question(3, "Portugal", "San Jose", "Lisbon", "Paris", "Doha", 2),
            Question(4, "Lithuania", "Doha", "Vilnius", "Saint George's", "Islamabad", 2),
            Question(5, "Romania", "Yaounde", "Kyiv", "Manama", "Bucharest", 4),
            Question(6, "Estonia", "Dushanbe", "Monrovia", "Tallinn", "Lomé", 3),
            Question(7, "Russia", "Moscow", "Baghdad", "Reykjavik", "Kingston", 1),
            Question(8, "Poland", "Djibouti", "Sanaa", "Warsaw", "Amsterdam", 3),
            Question(9, "Ukraine", "Damascus", "New Delhi", "Kyiv", "DC", 3),
            Question(10, "Sweden", "Kin", "Accra", "Stockholm", "Port-au-Prince", 3),
        )
    }


    /* Return list of 10 questions for Oceania */
    fun loadOceaniaQuestions(): List<Question> {
        return listOf(
            Question(1, "Vanuatu", "Kinshasa", "Port-Vila", "Santa Domingo", "Algiers", 2),
            Question(2, "Tonga", "Nukuʿalofa", "Skopje", "Oslo", "N'Djamena", 1),
            Question(
                3,
                "Kiribati",
                "Yamoussoukro",
                "Tallinn",
                "Bairiki, Ambo, and Betio",
                "Asmara",
                3
            ),
            Question(
                4,
                "Palau",
                "Ngerulmud capitol complex in Melekeok on Babelthuap",
                "Tehrān",
                "Bangkok",
                "Moroni",
                1
            ),
            Question(5, "Fiji", "Reykjavík", "Bratislava", "Suva", "Asunción", 3),
            Question(6, "Solomon Islands", "San José", "Honiara", "Jakarta", "Majuro", 2),
            Question(7, "Papua New Guinea", "Warsaw", "Guatemala City", "Port Moresby", "Hanoi", 3),
            Question(8, "Samoa", "Apia", "London", "San Salvador", "Tripoli", 1),
            Question(9, "Nauru", "Brasilia", "Yaren district", "Dushanbe", "Brazzaville", 2),
            Question(10, "Micronesia", "Brussels", "Palikir", "Male", "Lima", 2),
        )
    }


}