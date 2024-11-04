package com.example.artgallery.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import com.example.artgallery.ArtData
import com.example.artgallery.R

class ArtFragment : Fragment() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?,
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_art, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        val artNameTV = view.findViewById<TextView>(R.id.artNameTV)
        val artImageIV = view.findViewById<ImageView>(R.id.artImageIV)
        val artAuthorTV = view.findViewById<TextView>(R.id.artAuthorTV)
        val viewArts = arguments?.getSerializable("arts") as ArtData
        artNameTV.text = viewArts.name
        artImageIV.setImageResource(viewArts.image)
        artAuthorTV.text = viewArts.author
    }
}