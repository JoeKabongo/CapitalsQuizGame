package edu.sjsu.android.countriescapitalsquiz.ui.main

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import edu.sjsu.android.countriescapitalsquiz.adapter.ChooseRegionAdapter
import edu.sjsu.android.countriescapitalsquiz.databinding.FragmentChooseRegionBinding

/**
 * Fragment where user choose which continent they want to be tested on
 */
class ChooseRegionFragment : Fragment() {

    private var _binding: FragmentChooseRegionBinding? = null
    private val binding get() = _binding!!
    private lateinit var recyclerView: RecyclerView

    companion object {
        const val AFRICA = "africa"
        const val ASIA = "asia"
        const val AMERICA = "america"
        const val EUROPE = "europe"
        const val OCEANIA = "oceania"
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        _binding = FragmentChooseRegionBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        // Setup the recycler view
        recyclerView = binding.recyclerView
        recyclerView.layoutManager = LinearLayoutManager(context)
        recyclerView.adapter = ChooseRegionAdapter()
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}