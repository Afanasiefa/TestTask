package com.example.testtask.model.database

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "comments_table")
data class DatabaseComment(
    @PrimaryKey val commentId: Long,
    @ColumnInfo val postId: Long,
    @ColumnInfo val name: String,
    @ColumnInfo val body: String,
    @ColumnInfo val email: String
)