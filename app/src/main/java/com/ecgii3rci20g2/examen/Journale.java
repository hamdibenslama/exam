package com.ecgii3rci20g2.examen;

import androidx.annotation.NonNull;
import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.PrimaryKey;

import java.util.Date;


@Entity(tableName = "Journale_table")
public class Journale {
    @PrimaryKey
    @NonNull
    @ColumnInfo(name = "id")
    private int mid;
    private String mtitle;
    private String mcontent;
    private Date mpublishedOn;


    //constructor
    public Journale(String mtitle) {
        this.mid = id;
        this.mtitle = mtitle;
        this.mcontent = mcontent;
        this.mpublishedOn = mpublishedOn;
    }

    public int getMid(){return this.mid;}
    public String getMtitle(){return this.mtitle;}
    public String getMcontent(){return this.mcontent;}
    public Date getMpublishedOn(){return this.mpublishedOn;}

    public void setMid(int mid) {
        this.mid = mid;
    }

    public void setMtitle(String mtitle) {
        this.mtitle = mtitle;
    }

    public void setMcontent(String mcontent) {
        this.mcontent = mcontent;
    }

    public void setMpublishedOn(Date mpublishedOn) {
        this.mpublishedOn = mpublishedOn;
    }

}
