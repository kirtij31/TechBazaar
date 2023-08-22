package com.kirti.ecommerceapplication.data

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.Query
import com.kirti.ecommerceapplication.data.Image

@Dao
interface ImageDao {

    @Insert
    suspend fun insert(image : Image)
    @Query(value = "DELETE FROM image")
    suspend fun deleteAllRecords()
    @Query(value = "SELECT * FROM image")
    suspend fun getAllRecords(): List<Image>
    @Query("SELECT url FROM image WHERE product_id = :id")
    suspend fun getRecord(id : Int) : List<String>
}