package com.example.hotelpos1.Dao

import android.content.ContentValues
import android.content.Context
import android.database.sqlite.SQLiteDatabase
import com.example.hotelpos1.DataModel.Users
import com.example.hotelpos1.Database.DatabaseHelper

class UserDao (context: Context){
    private val database: SQLiteDatabase
    init {
        val dbHelper = DatabaseHelper(context)
        database = dbHelper.writableDatabase
    }
    fun addUser(user: Users): Long {
        val values = ContentValues()
        values.put("email", user.email)
        values.put("password", user.password)

        // Insert the user into the database
        return database.insert("User", null, values)
    }
}