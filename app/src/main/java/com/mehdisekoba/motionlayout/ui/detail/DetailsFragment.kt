package com.mehdisekoba.motionlayout.ui.detail

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import androidx.navigation.fragment.navArgs
import coil.load
import com.mehdisekoba.motionlayout.databinding.FragmentDetailsBinding

@Suppress("ktlint:standard:property-naming")
class DetailsFragment : Fragment() {
    // Binding
    private var _binding: FragmentDetailsBinding? = null
    private val binding get() = _binding!!

    // other
    private val args by navArgs<DetailsFragmentArgs>()

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?,
    ): View {
        _binding = FragmentDetailsBinding.inflate(layoutInflater)
        return binding.root
    }

    override fun onViewCreated(
        view: View,
        savedInstanceState: Bundle?,
    ) {
        super.onViewCreated(view, savedInstanceState)
        binding.apply {
            imgBack.setOnClickListener { findNavController().popBackStack() }
            args.let { data ->
                data.data.also {
                    CoverImg.load(it.remoteImageUrl)
                    PosterImg.load(it.remoteImage)
                    nameTxt.text = it.name
                    txtDesc.text = it.description
                    locationTxt.text = it.location
                }
            }
        }
    }

    override fun onDestroy() {
        super.onDestroy()
        _binding = null
    }
}
