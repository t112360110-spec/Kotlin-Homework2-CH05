package com.example.kotlinhomework2ch05

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentActivity
import androidx.viewpager2.adapter.FragmentStateAdapter


// ViewPagerAdapter 繼承 FragmentStateAdapter 類別
class ViewPagerAdapter(activity: FragmentActivity) : FragmentStateAdapter(activity){

    private val fragments = listOf(
        ContentFragment("FirstFragment", R.layout.fragment_first),
        ContentFragment("SecondFragment", R.layout.fragment_second),
        ContentFragment("ThirdFragment", R.layout.fragment_third)
    )

    // 回傳 Fragment 的數量
    override fun getItemCount(): Int = fragments.size

    override fun createFragment(position: Int): Fragment {
        return  fragments[position]
    }
}

