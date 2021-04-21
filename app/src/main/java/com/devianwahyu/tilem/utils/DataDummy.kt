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
                "But I must explain to you how all this mistaken idea of denouncing pleasure and praising pain was born and I will give you a complete account of the system, ",
                4,
                R.drawable.tv_digimon,
                "24 May 2010")
        )

        tvShows.add(
            ModelEntity(
                "2",
                "Catatan Hati Istri",
                "And expound the actual teachings of the great explorer of the truth, the master-builder of human happiness. No one rejects, dislikes, or avoids pleasure itself",
                1,
                R.drawable.tv_hati,
                "24 April 2019")
        )

        tvShows.add(
            ModelEntity("3",
                "Heirs of the Night",
                "because it is pleasure, but because those who do not know how to pursue pleasure rationally encounter consequences that are extremely",
                4,
                R.drawable.tv_heirs,
                "27 October 2018")
        )

        tvShows.add(
            ModelEntity("4",
                "Hercal",
                "Nor again is there anyone who loves or pursues or desires to obtain pain of itself, because it is pain, but because occasionally circumstances occur in which toil ",
                5,
                R.drawable.tv_hercal,
                "12 December 2018")
        )

        tvShows.add(
            ModelEntity("5",
                "In The Kost",
                "To take a trivial example, which of us ever undertakes laborious physical exercise, except to obtain some advantage from it? But who has any right to find fault",
                5,
                R.drawable.tv_inthekost,
                "24 July 2014")
        )

        tvShows.add(
            ModelEntity("6",
                "Kemuliaan Hati",
                "who chooses to enjoy a pleasure that has no annoying consequences, or one who avoids a pain that produces no resultant pleasure? On the other hand, we denounce with righteous",
                3,
                R.drawable.tv_mulia,
                "24 June 2017")
        )

        tvShows.add(
            ModelEntity("7",
                "Padi Reborn",
                "dislike men who are so beguiled and demoralized by the charms of pleasure of the moment, so blinded by desire, that they cannot foresee",
                5,
                R.drawable.tv_padi,
                "2 October 2019")
        )

        tvShows.add(
            ModelEntity("8",
                "Peristawa",
                "The quick, brown fox jumps over a lazy dog. DJs flock by when MTV ax quiz prog. Junk MTV quiz graced by fox whelps. Bawds jog, flick quartz, vex nymphs.",
                4,
                R.drawable.tv_peristawa,
                "10 October 2019")
        )

        tvShows.add(
            ModelEntity("9",
                "Tonight Show",
                "Waltz, bad nymph, for quick jigs vex! Fox nymphs grab quick-jived waltz. Brick quiz whangs jumpy veldt fox. Bright vixens jump; dozy fowl quack",
                5,
                R.drawable.tv_tns,
                "17 August 2000")
        )

        tvShows.add(
            ModelEntity("10",
                "Zalim",
                "Quick wafting zephyrs vex bold Jim. Quick zephyrs blow, vexing daft Jim. Sex-charged fop blew my junk TV quiz. How quickly daft jumping zebras",
                5,
                R.drawable.tv_zalim,
                "20 August 2020")
        )

        return tvShows
    }
}