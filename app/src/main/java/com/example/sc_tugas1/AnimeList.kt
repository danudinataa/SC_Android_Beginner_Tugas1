package com.example.sc_tugas1

import android.os.Parcelable
import kotlinx.parcelize.Parcelize

@Parcelize
data class AnimeList(
    var image : Int, var heading : String
) : Parcelable
