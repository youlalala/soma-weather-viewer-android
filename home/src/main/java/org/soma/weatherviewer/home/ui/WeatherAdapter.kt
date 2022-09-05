package org.soma.weatherviewer.home.ui

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.recyclerview.widget.DiffUtil
import androidx.recyclerview.widget.ListAdapter
import androidx.recyclerview.widget.RecyclerView
import org.soma.weatherviewer.home.R
import org.soma.weatherviewer.home.databinding.ItemWeatherBinding
import org.soma.weatherviewer.home.domain.model.WeatherModel

class WeatherAdapter: ListAdapter<WeatherModel, RecyclerView.ViewHolder>(WeatherDiffCallback()) {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerView.ViewHolder {
        val binding = DataBindingUtil.inflate<ItemWeatherBinding>(LayoutInflater.from(parent.context), R.layout.item_weather, parent, false)
        return WeatherViewHolder(binding)
    }

    override fun onBindViewHolder(holder: RecyclerView.ViewHolder, position: Int) {
        val weatherModel = getItem(position)
        (holder as WeatherViewHolder).bind(weatherModel)
    }

    class WeatherViewHolder(private val binding: ItemWeatherBinding): RecyclerView.ViewHolder(binding.root) {
        fun bind(weatherModel: WeatherModel) {
            binding.weatherModel = weatherModel
            binding.executePendingBindings()
        }
    }
}

private class WeatherDiffCallback: DiffUtil.ItemCallback<WeatherModel>() {
    override fun areItemsTheSame(oldItem: WeatherModel, newItem: WeatherModel): Boolean {
        return oldItem == newItem
    }

    override fun areContentsTheSame(oldItem: WeatherModel, newItem: WeatherModel): Boolean {
        return oldItem == newItem
    }
}