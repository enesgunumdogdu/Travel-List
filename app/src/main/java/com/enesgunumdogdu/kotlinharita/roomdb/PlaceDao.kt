package com.enesgunumdogdu.kotlinharita.roomdb

import androidx.room.Delete
import androidx.room.Insert
import androidx.room.Query
import com.enesgunumdogdu.kotlinharita.model.Place
import io.reactivex.rxjava3.core.Completable
import io.reactivex.rxjava3.core.Flowable


@androidx.room.Dao // Data Access Object
interface PlaceDao {
    @Query("SELECT * FROM Place")
fun getAll() : Flowable<List<Place>>

    @Insert
    fun insert(place: Place) : Completable

    @Delete
    fun delete(place:Place) : Completable
}