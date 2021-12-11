package edu.sjsu.android.countriescapitalsquiz.ui.main

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import edu.sjsu.android.countriescapitalsquiz.R
import edu.sjsu.android.countriescapitalsquiz.data.DataSource
import edu.sjsu.android.countriescapitalsquiz.databinding.FragmentQuestionBinding
import edu.sjsu.android.countriescapitalsquiz.model.Question

/**
 * Question Fragment display question and manage user interaction
 */
class QuestionFragment : Fragment() {
    private var questions: List<Question> = DataSource().loadQuestions()
    private var questionNumber = 1
    private var correctAnswers = 0
    private var questionAnswered = false
    private var _binding: FragmentQuestionBinding? = null
    private val binding get() = _binding!!
    private lateinit var continent: String


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        // Grab continent argument
        arguments?.let {
            continent = it.getString("continent", ChooseRegionFragment.AFRICA)
        }

        // Inflate the layout for this fragment
        _binding = FragmentQuestionBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        setupUI()
        setQuestion()
    }


    /* Set up on click listeners and state for buttons and answer option */
    private fun setupUI() {

        binding.nextButton.setOnClickListener {
            nextButtonClicked()
        }
        binding.nextButton.isEnabled = false

        binding.exitButton.setOnClickListener {
            val action = QuestionFragmentDirections.actionQuestionFragmentToChooseRegionFragment()
            findNavController().navigate(action)
        }

        binding.optionOne.setOnClickListener {
            onAnswerOptionClicked(1, binding.optionOne)
        }
        binding.optionTwo.setOnClickListener {
            onAnswerOptionClicked(2, binding.optionTwo)
        }

        binding.optionThree.setOnClickListener {
            onAnswerOptionClicked(3, binding.optionThree)
        }

        binding.optionFour.setOnClickListener {
            onAnswerOptionClicked(4, binding.optionFour)
        }
    }

    /* Get current question and update the UI to show that question*/
    private fun setQuestion() {
        val currentQuestion = questions[questionNumber - 1]
        binding.question.text = currentQuestion.question
        binding.optionOne.text = currentQuestion.optionOne
        binding.optionTwo.text = currentQuestion.optionTwo
        binding.optionThree.text = currentQuestion.optionThree
        binding.optionFour.text = currentQuestion.optionFour
        binding.progressBar.progress = questionNumber
        binding.progressText.text = "$questionNumber/${binding.progressBar.max}"
        questionAnswered = false
        binding.nextButton.isEnabled = false
    }

    /* Update UI when an answer option is clicked */
    private fun onAnswerOptionClicked(answerNumber: Int, textView: TextView) {

        // User already answered the question before
        if (questionAnswered) return

        val currentQuestion = questions[questionNumber - 1]

        // Show the correct answer in green and if user got it wrong, also mark their response in red
        if (answerNumber == currentQuestion.correctAnswer) {
            textView.setBackgroundColor(resources.getColor(R.color.green))
            correctAnswers++
        } else {
            textView.setBackgroundColor(resources.getColor(R.color.red))
            showCorrectAnswer()
        }
        questionAnswered = true
        binding.nextButton.isEnabled = true

    }

    /* Handle when next button is clicked */
    private fun nextButtonClicked() {
        questionNumber++

        // If there is still more question, go to the next otherwise navigate to the result fragment
        if (questionNumber <= questions.size) {
            clearAnswerOption()
            setQuestion()
        } else {
            val action = QuestionFragmentDirections.actionQuestionFragmentToResultFragment(
                score = correctAnswers,
                continent = continent
            )
            findNavController().navigate(action)
        }
    }

    /* Mark the correct answer option in green */
    private fun showCorrectAnswer() {
        when (questions[questionNumber - 1].correctAnswer) {
            1 -> binding.optionOne.setBackgroundColor(resources.getColor(R.color.green))
            2 -> binding.optionTwo.setBackgroundColor(resources.getColor(R.color.green))
            3 -> binding.optionThree.setBackgroundColor(resources.getColor(R.color.green))
            else -> binding.optionFour.setBackgroundColor(resources.getColor(R.color.green))
        }
    }

    /* Mark all the answer options back to white color*/
    private fun clearAnswerOption() {
        binding.optionOne.setBackgroundColor(resources.getColor(R.color.white))
        binding.optionTwo.setBackgroundColor(resources.getColor(R.color.white))
        binding.optionThree.setBackgroundColor(resources.getColor(R.color.white))
        binding.optionFour.setBackgroundColor(resources.getColor(R.color.white))
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }

}