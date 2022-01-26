package com.example.shingekionkyogin.data.romote;


import com.example.shingekionkyogin.data.models.Film;

public interface OnFilmDetailCallBack {
    void success(Film model);
    void error();
    void failure(String msg);


}
