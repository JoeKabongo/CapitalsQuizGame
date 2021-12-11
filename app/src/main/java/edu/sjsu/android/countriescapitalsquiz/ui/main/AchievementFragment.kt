package edu.sjsu.android.countriescapitalsquiz.ui.main

import android.content.Context
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import edu.sjsu.android.countriescapitalsquiz.databinding.FragmentAchievementBinding

/**
 * Fragment that display user high score for each continent
 */
class AchievementFragment : Fragment() {
    private var _binding: FragmentAchievementBinding? = null
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        _binding = FragmentAchievementBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        updateHighScore()
    }


    /* Update high score each time the tab high score tab become visible */
    override fun setUserVisibleHint(visible: Boolean) {
        if (visible) {
            updateHighScore()
        }
    }

    private fun updateHighScore() {
        val sharedPref = context?.getSharedPreferences("myPref", Context.MODE_PRIVATE) ?: return
        binding.africaScore.text =
            sharedPref.getInt(ChooseRegionFragment.AFRICA, 0).toString() + "/10"
        binding.americaScore.text =
            sharedPref.getInt(ChooseRegionFragment.AMERICA, 0).toString() + "/10"
        binding.asiaScore.text = sharedPref.getInt(ChooseRegionFragment.ASIA, 0).toString() + "/10"
        binding.oceaniaScore.text =
            sharedPref.getInt(ChooseRegionFragment.EUROPE, 0).toString() + "/10"
        binding.europeScore.text =
            sharedPref.getInt(ChooseRegionFragment.OCEANIA, 0).toString() + "/10"
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }


}