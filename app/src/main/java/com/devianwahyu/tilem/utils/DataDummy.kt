package com.devianwahyu.tilem.utils

import com.devianwahyu.tilem.R
import com.devianwahyu.tilem.data.ModelEntity

object DataDummy {
    fun generateDummyMovies(): List<ModelEntity> {

        val movies = ArrayList<ModelEntity>()

        movies.add(
            ModelEntity(
            "1",
            "Aladdin",
            "Aladdin, seorang anak jalanan yang jatuh cinta pada seorang putri. Dengan perbedaan kasta dan harta, Aladdin pun berusaha mencari jalan agar bisa mejadi seorang pangeran, tak disangka ia menemukan lampu dengan jin di dalamnya. Aladdin pun menggunakan lampu untuk mengubah dirinya menjadi seorang pangeran untuk memenangkan hatiPutri Jasmine, tapi Wazir jahat juga mengejar lampu tersebut untuk menguasai kerajaan.",
            4,
            R.drawable.aladdin,
            "24 May 2019")
        )

        movies.add(
            ModelEntity(
            "2",
            "Avenger",
            "After Thanos, an intergalactic warlord, disintegrates half of the universe, the Avengers must reunite and assemble again to reinvigorate their trounced allies and restore balance.",
            5,
            R.drawable.avenger,
            "24 April 2019")
        )

        movies.add(
            ModelEntity("3",
            "Bohemian Rhapsody",
            "With his impeccable vocal abilities, Freddie Mercury and his rock band, Queen, achieve superstardom. However, amidst his skyrocketing success, he grapples with his ego, sexuality and a fatal illness.",
            4,
            R.drawable.bohemian,
            "27 October 2018")
        )

        movies.add(
            ModelEntity("4",
            "Covid 19",
            "Coronavirus disease (COVID-19) is an infectious disease caused by a newly discovered coronavirus.Most people who fall sick with COVID-19 will experience mild to moderate symptoms and recover without special treatment.",
            5,
            R.drawable.covid,
            "12 December 2018")
        )

        movies.add(
            ModelEntity("5",
            "Guardian Galaxy",
            "Peter escapes from the planet Morag with a valuable orb that Ronan the Accuser wants. He eventually forms a group with unwilling heroes to stop Ronan.",
            5,
            R.drawable.guardian,
            "24 July 2014")
        )

        movies.add(
            ModelEntity("6",
                "The Hill",
                "The Hill is an American digital media company, based in Washington, D.C. which began as a newspaper publisher in 1994. It is the largest independent political news site.",
                3,
                R.drawable.hill,
                "24 June 2017")
        )

        movies.add(
            ModelEntity("7",
                "Joker",
                "Forever alone in a crowd, failed comedian Arthur Fleck seeks connection as he walks the streets of Gotham City. Arthur wears two masks -- the one he paints for his day job as a clown.",
                5,
                R.drawable.joker,
                "2 October 2019")
        )

        movies.add(
            ModelEntity("8",
                "Spiderman",
                "Spider-Man is a fictional superhero created by writer-editor Stan Lee and writer-artist Steve Ditko. He first appeared in the anthology comic book Amazing Fantasy #15 in the Silver Age of Comic Books.",
                4,
                R.drawable.spiderman,
                "10 October 2019")
        )

        movies.add(
            ModelEntity("9",
                "Star Wars",
                "The original film (Star Wars), retroactively subtitled Episode IV: A New Hope (1977), was followed by the sequels Episode V: The Empire Strikes Back (1980) and Episode VI: Return of the Jedi (1983).",
                5,
                R.drawable.starwar,
                "17 August 2000")
        )

        movies.add(
            ModelEntity("10",
                "Tesla",
                "Visionary scientist Nikola Tesla struggles to realise his dreams of revolutionizing the electrical system. But he finds that he has many more opposers than supporters.",
                5,
                R.drawable.tesla,
                "20 August 2020")
        )

        return movies
    }

    fun generateDummyTvShows(): List<ModelEntity> {

        val tvShows = ArrayList<ModelEntity>()

        tvShows.add(
            ModelEntity(
                "1",
                "Digimons",
                "Digimon adalah anjing",
                4,
                R.drawable.tv_digimon,
                "24 May 2010")
        )

        tvShows.add(
            ModelEntity(
                "2",
                "Catatan Hati Istri",
                "Catatan Hati Istri sinetron hoaks",
                1,
                R.drawable.tv_hati,
                "24 April 2019")
        )

        tvShows.add(
            ModelEntity("3",
                "Heirs of the Night",
                "gaeroh pakde",
                4,
                R.drawable.tv_heirs,
                "27 October 2018")
        )

        tvShows.add(
            ModelEntity("4",
                "Hercal",
                "Penuh dusta",
                5,
                R.drawable.tv_hercal,
                "12 December 2018")
        )

        tvShows.add(
            ModelEntity("5",
                "In The Kost",
                "maksiat",
                5,
                R.drawable.tv_inthekost,
                "24 July 2014")
        )

        tvShows.add(
            ModelEntity("6",
                "Kemuliaan Hati",
                "assalamualaikum mamang",
                3,
                R.drawable.tv_mulia,
                "24 June 2017")
        )

        tvShows.add(
            ModelEntity("7",
                "Padi Reborn",
                "panen pari",
                5,
                R.drawable.tv_padi,
                "2 October 2019")
        )

        tvShows.add(
            ModelEntity("8",
                "Peristawa",
                "acara aneh.",
                4,
                R.drawable.tv_peristawa,
                "10 October 2019")
        )

        tvShows.add(
            ModelEntity("9",
                "Tonight Show",
                "asik",
                5,
                R.drawable.tv_tns,
                "17 August 2000")
        )

        tvShows.add(
            ModelEntity("10",
                "Zalim",
                "sinetron firaun",
                5,
                R.drawable.tv_zalim,
                "20 August 2020")
        )

        return tvShows
    }
}