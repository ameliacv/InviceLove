package com.example.kliklabs.appkotlin.global

import android.content.Context
import android.content.Intent

public class publicfun{

    public fun openActivitiy(classOpen : Class<*>, context: Context){
        context.startActivity(Intent(context, classOpen))
    }

}