package com.example.admin.appshadist.model;

/**
 * Created by admin on 08/10/2018.
 */

public class Doa {

    private String nama;
    private String arti;
    private String surah;

    public Doa(String nama, String arti, String surah) {
        this.nama = nama;
        this.arti = arti;
        this.surah = surah;
    }

    public String getNama() {

        return nama;

    }

    public String getArti() {

        return arti;
    }

    public String getSurah() {

        return surah;
    }


}
