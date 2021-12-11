package edu.sjsu.android.countriescapitalsquiz.ui.main

import android.content.Context
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import edu.sjsu.android.countriescapitalsquiz.R
import edu.sjsu.android.countriescapitalsquiz.databinding.FragmentResultBinding

/**
 * Fragment that display user score after they completed a quiz
 */
class ResultFragment : Fragment() {

    companion object {
        const val SCORE = "score"
        const val CONTINENT = "continent"
    }

    private var _binding: FragmentResultBinding? = null
    private val binding get() = _binding!!
    private var score: Int = 0
    private var continent: String = ""

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        // Grab the score and continent arguments
        arguments?.let {
            score = it.getInt(SCORE)
            continent = it.getString(CONTINENT, ChooseRegionFragment.AFRICA)
        }

        // Update high score of a continent if this score is bigger than current high score
        val sharedPref = context?.getSharedPreferences("myPref", Context.MODE_PRIVATE) ?: return
        val highestScore = sharedPref.getInt(continent, 0)
        if (highestScore < score) {
            with(sharedPref.edit()) {
                putInt(continent, score)
                apply()
            }
        }
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        _binding = FragmentResultBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        // Set emoji image based on the user score
        when (score) {
            in 0..2 -> {
                binding.emoji.setImageResource(R.drawable.very_bad)
            }
            3, 4 -> {
                binding.emoji.setImageResource(R.drawable.bad)
            }
            5, 6 -> {
                binding.emoji.setImageResource(R.drawable.okay)
            }
            7, 8 -> {
                binding.emoji.setImageResource(R.drawable.good)
            }
            else -> {
                binding.emoji.setImageResource(R.drawable.excellent)
            }
        }
        // Updating text with the user score
        binding.resultText.text = resources.getString(R.string.score_result, score)

        // Go back to the first page when user click finish
        binding.finishButton.setOnClickListener {
            val action = ResultFragmentDirections.actionResultFragmentToChooseRegionFragment()
            findNavController().navigate(action)
        }

    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}