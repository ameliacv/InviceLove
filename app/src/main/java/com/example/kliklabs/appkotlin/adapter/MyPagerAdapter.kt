package com.example.kliklabs.appkotlin.adapter

import android.support.v4.app.Fragment
import android.support.v4.app.FragmentManager
import android.support.v4.app.FragmentPagerAdapter

class MyPagerAdapter ( val fm: FragmentManager) : FragmentPagerAdapter(fm) {

    val titleList : ArrayList<String> = ArrayList()
    val fragmentList : ArrayList<Fragment> = ArrayList()

    override fun getItem(position: Int): Fragment {
        return fragmentList[position]
    }

    override fun getCount(): Int {
        return fragmentList.size
    }

    fun addFragment(f : Fragment, title : String){
        fragmentList.add(f)
        titleList.add(title)
        notifyDataSetChanged()
    }

    fun removeFragment(p0 : Int){

        fm.beginTransaction().remove(fragmentList[p0]).commit()
        fragmentList.removeAt(p0)
        titleList.removeAt(p0)
    }

    override fun getPageTitle(p0: Int): String {
        return titleList[p0]
    }

}
