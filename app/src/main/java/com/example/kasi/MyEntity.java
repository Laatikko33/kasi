package com.example.kasi;

import androidx.room.Entity;
import androidx.room.PrimaryKey;

import java.io.Serializable;

@Entity
public class MyEntity implements Serializable {
    @PrimaryKey(autoGenerate = true)
    public int id;
    public String teksti;

}