package com.example.pockemonapp.model;


import androidx.room.Entity;
import androidx.room.PrimaryKey;

@Entity(tableName = "fav_table")

public class Pockemon {

    @PrimaryKey(autoGenerate = true)
    private int id ;
    private String name  ;
     private String url;

    public Pockemon(String name, String url) {
        this.name = name;
        this.url = url;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }
}
