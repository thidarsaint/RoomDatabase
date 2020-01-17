package com.tds.roomdatabase

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import androidx.room.Room
import com.tds.roomdatabase.database.BookDatabase
import com.tds.roomdatabase.entity.BookEntity
import kotlin.math.log

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var db = Room.databaseBuilder(applicationContext, BookDatabase::class.java,"localDB").build()

        Thread{
            var bookEntity = BookEntity()
            bookEntity.bookId = 1
            bookEntity.bookName = "Kotlin for Android Developer"

            db.bookDao().save(bookEntity)

            db.bookDao().getAllBooks().forEach(){
                Log.i("FetchDatabase", "id : ${it.bookId}")
                Log.i("FectchDatabase", "Name: ${it.bookName}")
            }
        }.start()

    }
}
