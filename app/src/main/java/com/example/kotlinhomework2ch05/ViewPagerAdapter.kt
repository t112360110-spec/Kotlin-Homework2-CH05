package com.example.kotlinhomework2ch05

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentActivity
import androidx.fragment.app.FragmentManager
import androidx.lifecycle.Lifecycle
import androidx.viewpager2.adapter.FragmentStateAdapter


// ViewPagerAdapter 繼承 FragmentStateAdapter 類別
// 傳遞 FragmentManager 和 Lifecycle 物件
class ViewPagerAdapter(activity: FragmentActivity) : FragmentStateAdapter(activity){

    private val fragments = listOf(
        // 第一次呼叫 SOP，指定紅茶的原料
        ContentFragment("FirstFragment", R.layout.fragment_first),
        // 第二次呼叫 SOP，指定綠茶的原料
        ContentFragment("SecondFragment", R.layout.fragment_second),
        // 第三次呼叫 SOP，指定奶茶的原料
        ContentFragment("ThirdFragment", R.layout.fragment_third)
    )

    // 回傳 Fragment 的數量
    override fun getItemCount(): Int = fragments.size

    override fun createFragment(position: Int): Fragment {
        return  fragments[position]
    }
}

