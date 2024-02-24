package com.mehdisekoba.motionlayout.ui.main

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import coil.load
import com.mehdisekoba.motionlayout.R
import com.mehdisekoba.motionlayout.data.imageUrlList
import com.mehdisekoba.motionlayout.databinding.FragmentMainBinding
import com.mehdisekoba.motionlayout.ui.main.adapter.ImageDataAdapter

@Suppress("ktlint:standard:property-naming")
class MainFragment : Fragment() {
    // Binding
    private var _binding: FragmentMainBinding? = null
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?,
    ): View {
        _binding = FragmentMainBinding.inflate(layoutInflater)
        return binding.root
    }

    override fun onViewCreated(
        view: View,
        savedInstanceState: Bundle?,
    ) {
        super.onViewCreated(view, savedInstanceState)
        // initViews
        binding.apply {
            bgImage.load(R.drawable.taj_mahal)
            val adapterData = ImageDataAdapter(requireContext(), imageUrlList)

            viewpager.apply {
                adapter = adapterData
                offscreenPageLimit = 3
                setPageTransformer(SliderTransformer(3))
            }
            adapterData.setOnItemClickListener { id, data ->
                val direction = MainFragmentDirections.actionMainFragmentToDetailsFragment(id, data)
                findNavController().navigate(direction)
            }
        }
    }

    override fun onDestroy() {
        super.onDestroy()
        _binding = null
    }
}
