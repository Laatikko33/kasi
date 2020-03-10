package com.example.kasi;

import androidx.room.RoomDatabase;

@androidx.room.Database(entities = {MyEntity.class}, version = 1)
public abstract class Database extends RoomDatabase {
    public static final String NIMI = "NIMI";
    public abstract MyTableDao myTableDao();
}