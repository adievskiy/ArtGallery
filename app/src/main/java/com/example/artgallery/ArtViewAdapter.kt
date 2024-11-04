package com.example.artgallery

import androidx.core.os.bundleOf
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentActivity
import androidx.viewpager2.adapter.FragmentStateAdapter
import com.example.artgallery.fragments.ArtFragment

class ArtViewAdapter(fragment: FragmentActivity, private val artsViewList: MutableList<ArtData>) :
FragmentStateAdapter(fragment){
    override fun getItemCount(): Int {
        return artsViewList.size
    }

    override fun createFragment(position: Int): Fragment {
        val fragment = ArtFragment()
        fragment.arguments = bundleOf("arts" to artsViewList[position])
        return fragment
    }
}