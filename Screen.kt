package com.example.myrecipeapp

  sealed class Screen (val route:String){

      object recipeScreen:Screen("recipeScreen")
      object detailScreen:Screen("detailScreen")
}