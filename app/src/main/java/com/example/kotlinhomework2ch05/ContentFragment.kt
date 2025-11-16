package com.example.kotlinhomework2ch05

import android.content.Context
import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.annotation.LayoutRes
import androidx.fragment.app.Fragment
import java.sql.RowId

class ContentFragment(
    private val logTag: String,
    @LayoutRes private val layoutId: Int
) : Fragment() {
    override fun onAttach(context: Context) {
        super.onAttach(context)
        Log.e(logTag,"onAttach")
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        Log.e(logTag,"onCreate")
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        Log.e(logTag,"onCreateView")
        // 填充 Layout 佈局，返回 View 對象
        return inflater.inflate(layoutId, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        Log.e(logTag,"onViewCreated")
    }

    override fun onStart() {
        super.onStart()
        Log.e(logTag,"onStart")
    }

    override fun onResume() {
        super.onResume()
        Log.e(logTag,"onResume")
    }

    override fun onPause() {
        super.onPause()
        Log.e(logTag,"onPause")
    }

    override fun onStop() {
        super.onStop()
        Log.e(logTag,"onStop")
    }

    override fun onDestroyView() {
        super.onDestroyView()
        Log.e(logTag,"onDestroyView")
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.e(logTag,"onDestroy")
    }

    override fun onDetach() {
        super.onDetach()
        Log.e(logTag,"onDetach")
    }
}