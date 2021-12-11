package edu.sjsu.android.countriescapitalsquiz.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.navigation.findNavController
import androidx.recyclerview.widget.RecyclerView
import edu.sjsu.android.countriescapitalsquiz.R
import edu.sjsu.android.countriescapitalsquiz.data.DataSource
import edu.sjsu.android.countriescapitalsquiz.ui.main.ChooseRegionFragmentDirections


/**
 * Adapter that handle displaying each continent and image on ChooseRegionFragment
 */
class ChooseRegionAdapter : RecyclerView.Adapter<ChooseRegionAdapter.RegionViewHolder>() {

    private val dataset = DataSource().loadContinents()


    class RegionViewHolder(val view: View) : RecyclerView.ViewHolder(view) {
        val textView: TextView = view.findViewById(R.id.region_title)
        val imageView: ImageView = view.findViewById(R.id.region_image)
    }

    /**
     * Create new views (invoked by the layout manager)
     */
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RegionViewHolder {
        // create a new view
        val adapterLayout = LayoutInflater.from(parent.context)
            .inflate(R.layout.region_item, parent, false)
        return RegionViewHolder(adapterLayout)
    }

    /**
     * Replace the contents of a region item with data from dataset current position
     */
    override fun onBindViewHolder(holder: RegionViewHolder, position: Int) {
        val item = dataset[position]
        val context = holder.view.context
        holder.textView.text = context.resources.getString(item.stringResourceId)
        holder.imageView.setImageResource(item.imageResourceId)

        // Navigate to the Question Fragment when item is clicked
        holder.view.setOnClickListener {
            val action =
                ChooseRegionFragmentDirections.actionChooseRegionFragmentToQuestionFragment(
                    continent = holder.textView.text.toString().lowercase()
                )
            holder.view.findNavController().navigate(action)
        }
    }

    /**
     * Return the size of your dataset (invoked by the layout manager)
     */
    override fun getItemCount() = dataset.size
}