package com.example.myrecipeapp

import android.os.Parcelable
import kotlinx.parcelize.Parcelize

@Parcelize
data class Category(val idCategory:String,
                    val strCategory:String,
                    val strCategoryThumb:String,
                    val strCategoryDescription:String
                    ):Parcelable

data class categoriesResponse(val categories:List<Category>)


/*
1-data class lel members
2-data class fe list btgeb el members
3-interface api fe get w suspend function btrg3 el data class ele byrg3 el list of members
4- b3ml request api b retrofit-> Retrofit.build().baseUrl("").addConvertFactory(GsonConvertFctory.create).build
5-retrofit.create(appi::class)
6-main view model->
 */
