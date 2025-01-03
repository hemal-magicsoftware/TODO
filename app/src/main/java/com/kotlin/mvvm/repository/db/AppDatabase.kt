package com.kotlin.mvvm.repository.db

import androidx.room.Database
import androidx.room.RoomDatabase
import com.kotlin.mvvm.repository.model.TodoModel

/**
 * App Database
 * Define all entities and access doa's here/ Each entity is a table.
 */
@Database(
    entities = [TodoModel::class],
    version = 2,
    exportSchema = false
)
abstract class AppDatabase : RoomDatabase() {

    abstract fun todoDao(): TodoDao
}