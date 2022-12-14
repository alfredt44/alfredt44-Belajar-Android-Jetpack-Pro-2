package com.dicoding.alfred.secondsubmission.utils

import com.dicoding.alfred.secondsubmission.data.DataModel
import com.dicoding.alfred.secondsubmission.data.source.remote.response.MovieResponse
import com.dicoding.alfred.secondsubmission.data.source.remote.response.TvShowResponse

object Dummy {
    fun generateDataMovieDummyResponse(): List<MovieResponse> {
        val listMovie  =  ArrayList<MovieResponse>()

        listMovie.add(
            MovieResponse(
                id  =  1,
                name  =  "Godzilla vs. Kong",
                desc  =  "n a time when monsters walk the Earth, humanity’s fight for its future sets Godzilla and Kong on a collision course that will see the two most powerful forces of nature on the planet collide in a spectacular battle for the ages.",
                poster  =  "https://www.themoviedb.org/t/p/w220_and_h330_face/pgqgaUx1cJb5oZQQ5v0tNARCeBp.jpg",
                img_preview  =  "https://www.themoviedb.org/t/p/w533_and_h300_bestv2/inJjDhCjfhh3RtrJWBmmDqeuSYC.jpg"
            )
        )

        listMovie.add(
            MovieResponse(
                id  =  2,
                name  =  "The Shawshank Redemption",
                desc  =  "Framed in the 1940s for the double murder of his wife and her lover, upstanding banker Andy Dufresne begins a new life at the Shawshank prison, where he puts his accounting skills to work for an amoral warden. During his long stretch in prison, Dufresne comes to be admired by the other inmates -- including an older prisoner named Red -- for his integrity and unquenchable sense of hope.",
                poster  =  "https://www.themoviedb.org/t/p/w220_and_h330_face/hBcY0fE9pfXzvVaY4GKarweriG2.jpg",
                img_preview  =  "https://www.themoviedb.org/t/p/w533_and_h300_bestv2/irlfhYtHfhZuYpsq2LAoh308NFe.jpg"
            )
        )

        listMovie.add(
            MovieResponse(
                id  =  3,
                name  =  "Gabriel's Inferno Part II",
                desc  =  "Professor Gabriel Emerson finally learns the truth about Julia Mitchell's identity, but his realization comes a moment too late. Julia is done waiting for the well-respected Dante specialist to remember her and wants nothing more to do with him. Can Gabriel win back her heart before she finds love in another's arms?",
                poster  =  "https://www.themoviedb.org/t/p/w220_and_h330_face/pci1ArYW7oJ2eyTo2NMYEKHHiCP.jpg",
                img_preview  =  "https://www.themoviedb.org/t/p/w533_and_h300_bestv2/jtAI6OJIWLWiRItNSZoWjrsUtmi.jpg"
            )
        )

        listMovie.add(
            MovieResponse(
                id  =  4,
                name  =  "The Godfather",
                desc  =  "Spanning the years 1945 to 1955, a chronicle of the fictional Italian-American Corleone crime family. When organized crime family patriarch, Vito Corleone barely survives an attempt on his life, his youngest son, Michael steps in to take care of the would-be killers, launching a campaign of bloody revenge.",
                poster  =  "https://www.themoviedb.org/t/p/w220_and_h330_face/3bhkrj58Vtu7enYsRolD1fZdja1.jpg",
                img_preview  =  "https://www.themoviedb.org/t/p/w533_and_h300_bestv2/rSPw7tgCH9c6NqICZef4kZjFOQ5.jpg"
            )
        )

        listMovie.add(
            MovieResponse(
                id  =  5,
                name  =  "Cold Pursuit",
                desc  =  "The quiet family life of Nels Coxman, a snowplow driver, is upended after his son\\'s murder. Nels begins a vengeful hunt for Viking, the drug lord he holds responsible for the killing, eliminating Viking\\'s associates one by one. As Nels draws closer to Viking, his actions bring even more unexpected and violent consequences, as he proves that revenge is all in the execution.",
                poster  =  "https://image.tmdb.org/t/p/w600_and_h900_bestv2/hXgmWPd1SuujRZ4QnKLzrj79PAw.jpg",
                img_preview  =  "https://image.tmdb.org/t/p/original/XAvFHWmWjBeJUQEHBbCcXvzdDZ.jpg"
            )
        )

        listMovie.add(
            MovieResponse(
                id  =  6,
                name  =  "Your Name",
                desc  =  "High schoolers Mitsuha and Taki are complete strangers living separate lives. But one night, they suddenly switch places. Mitsuha wakes up in Taki’s body, and he in hers. This bizarre occurrence continues to happen randomly, and the two must adjust their lives around each other",
                poster  =  "https://www.themoviedb.org/t/p/w220_and_h330_face/q719jXXEzOoYaps6babgKnONONX.jpg",
                img_preview  =  "https://www.themoviedb.org/t/p/w533_and_h300_bestv2/dIWwZW7dJJtqC6CgWzYkNVKIUm8.jpg"
            )
        )

        listMovie.add(
            MovieResponse(
                id  =  7,
                name  =  "Wrath of Man",
                desc  =  "Gellert Grindelwald has escaped imprisonment and has begun gathering followers to his cause—elevating wizards above all non-magical beings. The only one capable of putting a stop to him is the wizard he once called his closest friend, Albus Dumbledore. However, Dumbledore will need to seek help from the wizard who had thwarted Grindelwald once before, his former student Newt Scamander, who agrees to help, unaware of the dangers that lie ahead. Lines are drawn as love and loyalty are tested, even among the truest friends and family, in an increasingly divided wizarding world.",
                poster  =  "https://image.tmdb.org/t/p/w600_and_h900_bestv2/fMMrl8fD9gRCFJvsx0SuFwkEOop.jpg",
                img_preview  =  "https://image.tmdb.org/t/p/original/heyvaoVLGC8lcB4FFoz65EBI8xF.jpg"
            )
        )

        listMovie.add(
            MovieResponse(
                id  =  8,
                name  =  "Glass",
                desc  =  "In a series of escalating encounters, former security guard David Dunn uses his supernatural abilities to track Kevin Wendell Crumb, a disturbed man who has twenty-four personalities. Meanwhile, the shadowy presence of Elijah Price emerges as an orchestrator who holds secrets critical to both men.",
                poster  =  "https://image.tmdb.org/t/p/w600_and_h900_bestv2/svIDTNUoajS8dLEo7EosxvyAsgJ.jpg",
                img_preview  =  "https://image.tmdb.org/t/p/original/ngBFDOsx13sFXiMweDoL54XYknR.jpg"
            )
        )

        listMovie.add(
            MovieResponse(
                id  =  9,
                name  =  "Dilwale Dulhania Le Jayenge",
                desc  =  "Raj is a rich, carefree, happy-go-lucky second generation NRI. Simran is the daughter of Chaudhary Baldev Singh, who in spite of being an NRI is very strict about adherence to Indian values. Simran has left for India to be married to her childhood fiancé. Raj leaves for India with a mission at his hands, to claim his lady love under the noses of her whole family. Thus begins a saga.",
                poster  =  "https://www.themoviedb.org/t/p/w533_and_h300_bestv2/gNBCvtYyGPbjPCT1k3MvJuNuXR6.jpg",
                img_preview  =  "https://www.themoviedb.org/t/p/w220_and_h330_face/2CAL2433ZeIihfX1Hb2139CX0pW.jpg"
            )
        )

        listMovie.add(
            MovieResponse(
                id  =  10,
                name  =  "Wrath of Man",
                desc  =  "A cold and mysterious new security guard for a Los Angeles cash truck company surprises his co-workers when he unleashes precision skills during a heist. The crew is left wondering who he is and where he came from. Soon, the marksman's ultimate motive becomes clear as he takes dramatic and irrevocable steps to settle a score.",
                poster  =  "https://www.themoviedb.org/t/p/w220_and_h330_face/M7SUK85sKjaStg4TKhlAVyGlz3.jpg",
                img_preview  =  "https://www.themoviedb.org/t/p/w533_and_h300_bestv2/77tui163estZrQ78NBggqDB4n2C.jpg"
            )
        )

        return listMovie
    }

    fun generateDataTvShowDummyResponse(): List<TvShowResponse> {
        val listTvShow  =  ArrayList<TvShowResponse>()

        listTvShow.add(
            TvShowResponse(
                id  =  11,
                name  =  "Grey's Anatomy",
                desc  =  "Follows the personal and professional lives of a group of doctors at Seattle’s Grey Sloan Memorial Hospital.",
                poster  =  "https://www.themoviedb.org/t/p/w220_and_h330_face/clnyhPqj1SNgpAdeSS6a6fwE6Bo.jpg",
                img_preview  =  "https://www.themoviedb.org/t/p/w533_and_h300_bestv2/edmk8xjGBsYVIf4QtLY9WMaMcXZ.jpg"
            )
        )

        listTvShow.add(
            TvShowResponse(
                id  =  12,
                name  =  "Record of Ragnarok",
                desc  =  "Before eradicating humankind from the world, the gods give them one last chance to prove themselves worthy of survival. Let the Ragnarok battles begin.",
                poster  =  "https://www.themoviedb.org/t/p/w220_and_h330_face/kTs2WNZOukpWdNhoRlH94pSJ3xf.jpg",
                img_preview  =  "https://www.themoviedb.org/t/p/w533_and_h300_bestv2/iq5L971DFW1SwLJdvl7OpPI1QeZ.jpg"
            )
        )

        listTvShow.add(
            TvShowResponse(
                id  =  13,
                name  =  "Elite Short Stories: Guzmán Caye Rebe",
                desc  =  "Rebe hosts an intimate house warming party for her friends, but the situation takes a dramatic turn with the help of drugs and unexpected visitors.",
                poster  =  "https://www.themoviedb.org/t/p/w220_and_h330_face/4Y3jaO9schbo32WB2fGQv1en8ZB.jpg",
                img_preview  =  "https://www.themoviedb.org/t/p/w533_and_h300_bestv2/4EssuB087TiKNwOXMa0NiqTCRZx.jpg"
            )
        )

        listTvShow.add(
            TvShowResponse(
                id  =  14,
                name  =  "Fairy Tail",
                desc  =  "Lucy is a 17-year-old girl, who wants to be a full-fledged mage. One day when visiting Harujion Town, she meets Natsu, a young man who gets sick easily by any type of transportation. But Natsu isn\\'t just any ordinary kid, he\\'s a member of one of the world\\'s most infamous mage guilds: Fairy Tail.",
                poster  =  "https://image.tmdb.org/t/p/w600_and_h900_bestv2/lV07a5UwE75jVVuFN1GFEscN7if.jpg",
                img_preview  =  "https://image.tmdb.org/t/p/original/fANxNeH9JCXPrzNEfriGu1Y95dF.jpg"
            )
        )

        listTvShow.add(
            TvShowResponse(
                id  =  15,
                name  =  "Riverdale",
                desc  =  "Set in the present, the series offers a bold, subversive take on Archie, Betty, Veronica and their friends, exploring the surreality of small-town life, the darkness and weirdness bubbling beneath Riverdale’s wholesome facade.",
                poster  =  "https://www.themoviedb.org/t/p/w220_and_h330_face/6zBWSuYW3Ps1nTfeMS8siS4KUaA.jpg",
                img_preview  =  "https://www.themoviedb.org/t/p/w533_and_h300_bestv2/qZtAf4Z1lazGQoYVXiHOrvLr5lI.jpg"
            )
        )

        listTvShow.add(
            TvShowResponse(
                id  =  16,
                name  =  "The Flash",
                desc  =  "After a particle accelerator causes a freak storm, CSI Investigator Barry Allen is struck by lightning and falls into a coma. Months later he awakens with the power of super speed, granting him the ability to move through Central City like an unseen guardian angel. Though initially excited by his newfound powers, Barry is shocked to discover he is not the only \"meta-human\" who was created in the wake of the accelerator explosion — and not everyone is using their new powers for good. Barry partners with S.T.A.R. Labs and dedicates his life to protect the innocent. For now, only a few close friends and associates know that Barry is literally the fastest man alive, but it won\\'t be long before the world learns what Barry Allen has become…The Flash.",
                poster  =  "https://image.tmdb.org/t/p/w600_and_h900_bestv2/wHa6KOJAoNTFLFtp7wguUJKSnju.jpg",
                img_preview  =  "https://image.tmdb.org/t/p/original/rkRqvadAVWzdnrS6bdcUAyJtfpy.jpg"
            )
        )

        listTvShow.add(
            TvShowResponse(
                id  =  17,
                name  =  "Rick and Morty",
                desc  =  "Rick is a mentally-unbalanced but scientifically-gifted old man who has recently reconnected with his family. He spends most of his time involving his young grandson Morty in dangerous, outlandish adventures throughout space and alternate universes. Compounded with Morty's already unstable family life, these events cause Morty much distress at home and school.",
                poster  =  "https://www.themoviedb.org/t/p/w220_and_h330_face/8kOWDBK6XlPUzckuHDo3wwVRFwt.jpg",
                img_preview  =  "https://www.themoviedb.org/t/p/w533_and_h300_bestv2/eV3XnUul4UfIivz3kxgeIozeo50.jpg"
            )
        )

        listTvShow.add(
            TvShowResponse(
                id  =  18,
                name  =  "Superman & Lois",
                desc  =  "After years of facing megalomaniacal supervillains, monsters wreaking havoc on Metropolis, and alien invaders intent on wiping out the human race, The Man of Steel aka Clark Kent and Lois Lane come face to face with one of their greatest challenges ever: dealing with all the stress, pressures and complexities that come with being working parents in today's society.",
                poster  =  "https://www.themoviedb.org/t/p/w220_and_h330_face/gexsTq0ZHQ6ToI4v0NpJbpcnawm.jpg",
                img_preview  =  "https://www.themoviedb.org/t/p/w533_and_h300_bestv2/pPKiIJEEcV0E1hpVcWRXyp73ZpX.jpg"
            )
        )

        listTvShow.add(
            TvShowResponse(
                id  =  19,
                name  =  "Ragnarok",
                desc  =  "A small Norwegian town experiencing warm winters and violent downpours seems to be headed for another Ragnarök -- unless someone intervenes in time.",
                poster  =  "https://www.themoviedb.org/t/p/w220_and_h330_face/xUtOM1QO4r8w8yeE00QvBdq58N5.jpg",
                img_preview  =  "https://www.themoviedb.org/t/p/w533_and_h300_bestv2/wu444tM9YBllq9UcBv5TeidO3j3.jpg"
            )
        )

        listTvShow.add(
            TvShowResponse(
                id  =  20,
                name  =  "Hanna",
                desc  =  "This thriller and coming-of-age drama follows the journey of an extraordinary young girl as she evades the relentless pursuit of an off-book CIA agent and tries to unearth the truth behind who she is. Based on the 2011 Joe Wright film.",
                poster  =  "https://image.tmdb.org/t/p/w600_and_h900_bestv2/5nSSkcM3TgpllZ7yTyBOQEgAX36.jpg",
                img_preview  =  "https://image.tmdb.org/t/p/original/ofjZbud67zO2wxQ48VgMVnkECQu.jpg"
            )
        )

        return listTvShow
    }


    fun generateDataMovieDummy(): List<DataModel> {
        val listMovie  =  ArrayList<DataModel>()

        listMovie.add(
            DataModel(
                id  =  1,
                name  =  "Godzilla vs. Kong",
                desc  =  "n a time when monsters walk the Earth, humanity’s fight for its future sets Godzilla and Kong on a collision course that will see the two most powerful forces of nature on the planet collide in a spectacular battle for the ages.",
                poster  =  "https://www.themoviedb.org/t/p/w220_and_h330_face/pgqgaUx1cJb5oZQQ5v0tNARCeBp.jpg",
                img_preview  =  "https://www.themoviedb.org/t/p/w533_and_h300_bestv2/inJjDhCjfhh3RtrJWBmmDqeuSYC.jpg"
            )
        )

        listMovie.add(
            DataModel(
                id  =  2,
                name  =  "The Shawshank Redemption",
                desc  =  "Framed in the 1940s for the double murder of his wife and her lover, upstanding banker Andy Dufresne begins a new life at the Shawshank prison, where he puts his accounting skills to work for an amoral warden. During his long stretch in prison, Dufresne comes to be admired by the other inmates -- including an older prisoner named Red -- for his integrity and unquenchable sense of hope.",
                poster  =  "https://www.themoviedb.org/t/p/w220_and_h330_face/hBcY0fE9pfXzvVaY4GKarweriG2.jpg",
                img_preview  =  "https://www.themoviedb.org/t/p/w533_and_h300_bestv2/irlfhYtHfhZuYpsq2LAoh308NFe.jpg"
            )
        )

        listMovie.add(
            DataModel(
                id  =  3,
                name  =  "Gabriel's Inferno Part II",
                desc  =  "Professor Gabriel Emerson finally learns the truth about Julia Mitchell's identity, but his realization comes a moment too late. Julia is done waiting for the well-respected Dante specialist to remember her and wants nothing more to do with him. Can Gabriel win back her heart before she finds love in another's arms?",
                poster  =  "https://www.themoviedb.org/t/p/w220_and_h330_face/pci1ArYW7oJ2eyTo2NMYEKHHiCP.jpg",
                img_preview  =  "https://www.themoviedb.org/t/p/w533_and_h300_bestv2/jtAI6OJIWLWiRItNSZoWjrsUtmi.jpg"
            )
        )

        listMovie.add(
            DataModel(
                id  =  4,
                name  =  "The Godfather",
                desc  =  "Spanning the years 1945 to 1955, a chronicle of the fictional Italian-American Corleone crime family. When organized crime family patriarch, Vito Corleone barely survives an attempt on his life, his youngest son, Michael steps in to take care of the would-be killers, launching a campaign of bloody revenge.",
                poster  =  "https://www.themoviedb.org/t/p/w220_and_h330_face/3bhkrj58Vtu7enYsRolD1fZdja1.jpg",
                img_preview  =  "https://www.themoviedb.org/t/p/w533_and_h300_bestv2/rSPw7tgCH9c6NqICZef4kZjFOQ5.jpg"
            )
        )

        listMovie.add(
            DataModel(
                id  =  5,
                name  =  "Cold Pursuit",
                desc  =  "The quiet family life of Nels Coxman, a snowplow driver, is upended after his son\\'s murder. Nels begins a vengeful hunt for Viking, the drug lord he holds responsible for the killing, eliminating Viking\\'s associates one by one. As Nels draws closer to Viking, his actions bring even more unexpected and violent consequences, as he proves that revenge is all in the execution.",
                poster  =  "https://image.tmdb.org/t/p/w600_and_h900_bestv2/hXgmWPd1SuujRZ4QnKLzrj79PAw.jpg",
                img_preview  =  "https://image.tmdb.org/t/p/original/XAvFHWmWjBeJUQEHBbCcXvzdDZ.jpg"
            )
        )

        listMovie.add(
            DataModel(
                id  =  6,
                name  =  "Your Name",
                desc  =  "High schoolers Mitsuha and Taki are complete strangers living separate lives. But one night, they suddenly switch places. Mitsuha wakes up in Taki’s body, and he in hers. This bizarre occurrence continues to happen randomly, and the two must adjust their lives around each other",
                poster  =  "https://www.themoviedb.org/t/p/w220_and_h330_face/q719jXXEzOoYaps6babgKnONONX.jpg",
                img_preview  =  "https://www.themoviedb.org/t/p/w533_and_h300_bestv2/dIWwZW7dJJtqC6CgWzYkNVKIUm8.jpg"
            )
        )

        listMovie.add(
            DataModel(
                id  =  7,
                name  =  "Wrath of Man",
                desc  =  "Gellert Grindelwald has escaped imprisonment and has begun gathering followers to his cause—elevating wizards above all non-magical beings. The only one capable of putting a stop to him is the wizard he once called his closest friend, Albus Dumbledore. However, Dumbledore will need to seek help from the wizard who had thwarted Grindelwald once before, his former student Newt Scamander, who agrees to help, unaware of the dangers that lie ahead. Lines are drawn as love and loyalty are tested, even among the truest friends and family, in an increasingly divided wizarding world.",
                poster  =  "https://image.tmdb.org/t/p/w600_and_h900_bestv2/fMMrl8fD9gRCFJvsx0SuFwkEOop.jpg",
                img_preview  =  "https://image.tmdb.org/t/p/original/heyvaoVLGC8lcB4FFoz65EBI8xF.jpg"
            )
        )

        listMovie.add(
            DataModel(
                id  =  8,
                name  =  "Glass",
                desc  =  "In a series of escalating encounters, former security guard David Dunn uses his supernatural abilities to track Kevin Wendell Crumb, a disturbed man who has twenty-four personalities. Meanwhile, the shadowy presence of Elijah Price emerges as an orchestrator who holds secrets critical to both men.",
                poster  =  "https://image.tmdb.org/t/p/w600_and_h900_bestv2/svIDTNUoajS8dLEo7EosxvyAsgJ.jpg",
                img_preview  =  "https://image.tmdb.org/t/p/original/ngBFDOsx13sFXiMweDoL54XYknR.jpg"
            )
        )

        listMovie.add(
            DataModel(
                id  =  9,
                name  =  "Dilwale Dulhania Le Jayenge",
                desc  =  "Raj is a rich, carefree, happy-go-lucky second generation NRI. Simran is the daughter of Chaudhary Baldev Singh, who in spite of being an NRI is very strict about adherence to Indian values. Simran has left for India to be married to her childhood fiancé. Raj leaves for India with a mission at his hands, to claim his lady love under the noses of her whole family. Thus begins a saga.",
                poster  =  "https://www.themoviedb.org/t/p/w533_and_h300_bestv2/gNBCvtYyGPbjPCT1k3MvJuNuXR6.jpg",
                img_preview  =  "https://www.themoviedb.org/t/p/w220_and_h330_face/2CAL2433ZeIihfX1Hb2139CX0pW.jpg"
            )
        )

        listMovie.add(
            DataModel(
                id  =  10,
                name  =  "Wrath of Man",
                desc  =  "A cold and mysterious new security guard for a Los Angeles cash truck company surprises his co-workers when he unleashes precision skills during a heist. The crew is left wondering who he is and where he came from. Soon, the marksman's ultimate motive becomes clear as he takes dramatic and irrevocable steps to settle a score.",
                poster  =  "https://www.themoviedb.org/t/p/w220_and_h330_face/M7SUK85sKjaStg4TKhlAVyGlz3.jpg",
                img_preview  =  "https://www.themoviedb.org/t/p/w533_and_h300_bestv2/77tui163estZrQ78NBggqDB4n2C.jpg"
            )
        )

        return listMovie
    }

    fun generateDataTvShowDummy(): List<DataModel> {
        val listTvShow  =  ArrayList<DataModel>()

        listTvShow.add(
            DataModel(
                id  =  11,
                name  =  "Grey's Anatomy",
                desc  =  "Follows the personal and professional lives of a group of doctors at Seattle’s Grey Sloan Memorial Hospital.",
                poster  =  "https://www.themoviedb.org/t/p/w220_and_h330_face/clnyhPqj1SNgpAdeSS6a6fwE6Bo.jpg",
                img_preview  =  "https://www.themoviedb.org/t/p/w533_and_h300_bestv2/edmk8xjGBsYVIf4QtLY9WMaMcXZ.jpg"
            )
        )

        listTvShow.add(
            DataModel(
                id  =  12,
                name  =  "Record of Ragnarok",
                desc  =  "Before eradicating humankind from the world, the gods give them one last chance to prove themselves worthy of survival. Let the Ragnarok battles begin.",
                poster  =  "https://www.themoviedb.org/t/p/w220_and_h330_face/kTs2WNZOukpWdNhoRlH94pSJ3xf.jpg",
                img_preview  =  "https://www.themoviedb.org/t/p/w533_and_h300_bestv2/iq5L971DFW1SwLJdvl7OpPI1QeZ.jpg"
            )
        )

        listTvShow.add(
            DataModel(
                id  =  13,
                name  =  "Elite Short Stories: Guzmán Caye Rebe",
                desc  =  "Rebe hosts an intimate house warming party for her friends, but the situation takes a dramatic turn with the help of drugs and unexpected visitors.",
                poster  =  "https://www.themoviedb.org/t/p/w220_and_h330_face/4Y3jaO9schbo32WB2fGQv1en8ZB.jpg",
                img_preview  =  "https://www.themoviedb.org/t/p/w533_and_h300_bestv2/4EssuB087TiKNwOXMa0NiqTCRZx.jpg"
            )
        )

        listTvShow.add(
            DataModel(
                id  =  14,
                name  =  "Fairy Tail",
                desc  =  "Lucy is a 17-year-old girl, who wants to be a full-fledged mage. One day when visiting Harujion Town, she meets Natsu, a young man who gets sick easily by any type of transportation. But Natsu isn\\'t just any ordinary kid, he\\'s a member of one of the world\\'s most infamous mage guilds: Fairy Tail.",
                poster  =  "https://image.tmdb.org/t/p/w600_and_h900_bestv2/lV07a5UwE75jVVuFN1GFEscN7if.jpg",
                img_preview  =  "https://image.tmdb.org/t/p/original/fANxNeH9JCXPrzNEfriGu1Y95dF.jpg"
            )
        )

        listTvShow.add(
            DataModel(
                id  =  15,
                name  =  "Riverdale",
                desc  =  "Set in the present, the series offers a bold, subversive take on Archie, Betty, Veronica and their friends, exploring the surreality of small-town life, the darkness and weirdness bubbling beneath Riverdale’s wholesome facade.",
                poster  =  "https://www.themoviedb.org/t/p/w220_and_h330_face/6zBWSuYW3Ps1nTfeMS8siS4KUaA.jpg",
                img_preview  =  "https://www.themoviedb.org/t/p/w533_and_h300_bestv2/qZtAf4Z1lazGQoYVXiHOrvLr5lI.jpg"
            )
        )

        listTvShow.add(
            DataModel(
                id  =  16,
                name  =  "The Flash",
                desc  =  "After a particle accelerator causes a freak storm, CSI Investigator Barry Allen is struck by lightning and falls into a coma. Months later he awakens with the power of super speed, granting him the ability to move through Central City like an unseen guardian angel. Though initially excited by his newfound powers, Barry is shocked to discover he is not the only \"meta-human\" who was created in the wake of the accelerator explosion — and not everyone is using their new powers for good. Barry partners with S.T.A.R. Labs and dedicates his life to protect the innocent. For now, only a few close friends and associates know that Barry is literally the fastest man alive, but it won\\'t be long before the world learns what Barry Allen has become…The Flash.",
                poster  =  "https://image.tmdb.org/t/p/w600_and_h900_bestv2/wHa6KOJAoNTFLFtp7wguUJKSnju.jpg",
                img_preview  =  "https://image.tmdb.org/t/p/original/rkRqvadAVWzdnrS6bdcUAyJtfpy.jpg"
            )
        )

        listTvShow.add(
            DataModel(
                id  =  17,
                name  =  "Rick and Morty",
                desc  =  "Rick is a mentally-unbalanced but scientifically-gifted old man who has recently reconnected with his family. He spends most of his time involving his young grandson Morty in dangerous, outlandish adventures throughout space and alternate universes. Compounded with Morty's already unstable family life, these events cause Morty much distress at home and school.",
                poster  =  "https://www.themoviedb.org/t/p/w220_and_h330_face/8kOWDBK6XlPUzckuHDo3wwVRFwt.jpg",
                img_preview  =  "https://www.themoviedb.org/t/p/w533_and_h300_bestv2/eV3XnUul4UfIivz3kxgeIozeo50.jpg"
            )
        )

        listTvShow.add(
            DataModel(
                id  =  18,
                name  =  "Superman & Lois",
                desc  =  "After years of facing megalomaniacal supervillains, monsters wreaking havoc on Metropolis, and alien invaders intent on wiping out the human race, The Man of Steel aka Clark Kent and Lois Lane come face to face with one of their greatest challenges ever: dealing with all the stress, pressures and complexities that come with being working parents in today's society.",
                poster  =  "https://www.themoviedb.org/t/p/w220_and_h330_face/gexsTq0ZHQ6ToI4v0NpJbpcnawm.jpg",
                img_preview  =  "https://www.themoviedb.org/t/p/w533_and_h300_bestv2/pPKiIJEEcV0E1hpVcWRXyp73ZpX.jpg"
            )
        )

        listTvShow.add(
            DataModel(
                id  =  19,
                name  =  "Ragnarok",
                desc  =  "A small Norwegian town experiencing warm winters and violent downpours seems to be headed for another Ragnarök -- unless someone intervenes in time.",
                poster  =  "https://www.themoviedb.org/t/p/w220_and_h330_face/xUtOM1QO4r8w8yeE00QvBdq58N5.jpg",
                img_preview  =  "https://www.themoviedb.org/t/p/w533_and_h300_bestv2/wu444tM9YBllq9UcBv5TeidO3j3.jpg"
            )
        )

        listTvShow.add(
            DataModel(
                id  =  20,
                name  =  "Hanna",
                desc  =  "This thriller and coming-of-age drama follows the journey of an extraordinary young girl as she evades the relentless pursuit of an off-book CIA agent and tries to unearth the truth behind who she is. Based on the 2011 Joe Wright film.",
                poster  =  "https://image.tmdb.org/t/p/w600_and_h900_bestv2/5nSSkcM3TgpllZ7yTyBOQEgAX36.jpg",
                img_preview  =  "https://image.tmdb.org/t/p/original/ofjZbud67zO2wxQ48VgMVnkECQu.jpg"
            )
        )

        return listTvShow
    }
}