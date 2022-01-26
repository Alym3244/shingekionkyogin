package com.example.shingekionkyogin.data.romote;



import com.example.shingekionkyogin.data.models.Film;

import java.util.List;

public interface OnFilmReadyCallBack {
    void success (List<Film> films);
    void onServerError();
    void failure(String msg);

}
