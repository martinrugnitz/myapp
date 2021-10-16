package com.example.myapplication.ui.main.ext

import android.app.Activity
import android.os.Bundle
import androidx.annotation.NavigationRes
import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.FragmentContainerView
import androidx.navigation.fragment.NavHostFragment

fun AppCompatActivity.setNavGraphId(
    fragment: FragmentContainerView,
    @NavigationRes navId: Int,
    bundle: Bundle? = null,
    startDestination: Int? = null,
) {
    //Setup the navGraph for this activity
    val navHostFragment = supportFragmentManager.findFragmentById(fragment.id) as NavHostFragment
    val inflater = navHostFragment.navController.navInflater
    val graph = inflater.inflate(navId)
    startDestination?.let {
        graph.startDestination = it
    }
    navHostFragment.navController.setGraph(graph, bundle)
}