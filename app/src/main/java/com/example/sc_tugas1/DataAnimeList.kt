package com.example.sc_tugas1

object DataAnimeList {
    fun makelist(): ArrayList<AnimeList> {
        val list = ArrayList<AnimeList>()

        list.add(
            AnimeList(
                R.drawable.a_silent_voice,
                "A Silent Voice (Koe No Katachi) - Movie"
            )
        )
        list.add(
            AnimeList(
                R.drawable.attack_on_titan_s4,
                "Attack on Titan Final Season (Shingeki no Kyojin) - Season 4"
            )
        )
        list.add(
            AnimeList(
                R.drawable.death_note,
                "Death Note (Desu Noto) - 37 Episode"
            )
        )
        list.add(
            AnimeList(
                R.drawable.demon_slayer,
                "Demon Slayer (Kimetsu no Yaiba) - Season 2"
            )
        )
        list.add(
            AnimeList(
                R.drawable.hyouka,
                "Hyouka - 22 Episode"
            )
        )
        list.add(
            AnimeList(
                R.drawable.jujutsu_kaisen,
                "Jujutsu Kaisen (Season 1) - 24 Episode"
            )
        )
        list.add(
            AnimeList(
                R.drawable.naruto_shippuden,
                "Naruto Shippuden - 500 Episode"
            )
        )
        list.add(
            AnimeList(
                R.drawable.one_punch_man,
                "One Punch Man (Season 2) - 12 Episode"
            )
        )
        list.add(
            AnimeList(
                R.drawable.sword_art_online,
                "Sword Art Online (Season 1) - 25 Episode"
            )
        )
        list.add(
            AnimeList(
                R.drawable.your_name,
                "Your Name (Kimo no Nawa) - Movie"
            )
        )
        return list
    }
}