package com.reiscompquizapp.quizapp

object Constants {

    const val USER_NAME : String= "user_name"
    const val TOTAL_QUESTIONS : String= "total_questions"
    const val CORRECT_ANSWERS : String= "correct_answers"

    fun getQuestions():ArrayList<Question>{

        val questionsList= ArrayList<Question>()

        val que1=Question (
            1,
            "Who painted this ?",
            R.drawable.img1,
            "David Teniers",
            "Charles Dewolf Brownell",
            "Anne Frank" ,
            "Edgar Degas",//dn
            4
                )


        val que2=Question (
            2,
            "Who painted this ?",
            R.drawable.img2,
            "Angelica Kauffmann",//dn
            "Jacob van Ruisdael",
            "Thomas Alva Edison" ,
            "Watanabe Seitei",
            1
        )

        val que3=Question (
            3,
            "Who painted this ?",
            R.drawable.img3,
            "Alfred Sysley",
            "Gilber Stuart",
            "Rembrandt " ,//dn
            "Steve Jobs",
            3



                )

        val que4=Question (
            4,
            "Who painted this ?",
            R.drawable.img4,
            "Duccio di Buoninsegna ",//dn
            "Jacob van Ruisdael",
            "William Bonner" ,
            "William Merritt Chase",
            1
                )

        val que5=Question (
            5,
            "Who painted this ?",
            R.drawable.img5,
            "Gregory House",
            "William Oliver Stone ",//
            "Anton Mauve" ,
            "Bartolomeo degli Erri",
            2
                )

        val que6=Question (
            6,
            "Who painted this ?",
            R.drawable.img6,
            "Hubert Robert",
            "Thomas A. Anderson",
            " Ioannes Mokos " ,//dn
            "John Lewis Krimmel",
            3
                )

        val que7=Question (
            7,
            "Who painted this ?",
            R.drawable.img7,
            "Wolfgang Amadeus Mozart ",
            "John William Hill",
            "Charles Frederick Ulrich" ,
            "Camille Pissarro ",//
            4
                )

        val que8=Question (
            8,
            "Who painted this ?",
            R.drawable.img8,
            "Pierre-Paul-Léon Glaize ",//dn
            "Han Solo",
            "John White Alexender" ,
            "Fritz von Uhde",
            1
                )

        val que9=Question (
            9,
            "Who painted this ?",
            R.drawable.img9,
            "George Inness",
            "Gustave Doré ",//dn
            "Tony Soprano" ,
            "Antoine Watteau",
            2
                )

        val que10=Question (
            10,
            "Who painted this ?",
            R.drawable.img10,
            "Thomas Sully",
            "Andrea del Verrocchio ",//dn
            "Albert Pinkham Ryder" ,
            "Eric Cartman",
            2
                )

        val que11=Question (
            11,
            "Who painted this ?",
            R.drawable.img11,
            "Bernardo Daddi",
            "Jesse Pinkman",
            "Edouard Manet " ,//dn
            "Carlo Innocenzo Carloni",
            3
                )

        val que12=Question (
            12,
            "Who painted this ?",
            R.drawable.img12,
            "Hyacinthe Rigaud ",//dn
            "Oberin Martell",
            "Jasper Francis Cropsey" ,
            "John Sigleto Copley",
            1
                )

        val que13=Question (
            13,
            "Who painted this ?",
            R.drawable.img13,
            "William P. Chappel",
            "Matthew Harris Jouett",
            "Rustin Cohle" ,
            "George Romney ",//
            4
                )

        val que14=Question (
            14,
            "Who painted this ?",
            R.drawable.img14,
            "Gerard David",//dn
            "Henri Fantin-Latour",
            "Carlo Saraceni" ,
            "Marshal Ericksen",
            1
                )

        val que15=Question (
            15,
            "Who painted this ?",
            R.drawable.img15,
            "Patrick Jane",
            "Thomas Hovenden",
            "Philippe de Champaigne " ,//dn
            "George Henry Smillies",
            3
                )

        val que16=Question (
            16,
            "Who painted this ?",
            R.drawable.img16,
            "William Henry Gates",
            "Willem Kalf ",//dn
            "Francisque Millet" ,
            "Ricky Lafleur",
            2
                )

        val que17=Question (
            17,
            "Who painted this ?",
            R.drawable.img17,
            "Jacob Eichholtz",
            "Auguste Renoir ",//dn
            "Francescuccio Ghissi" ,
            "Dwight Schrute",
            2
                )

        val que18=Question (
            18,
            "Who painted this ?",
            R.drawable.img18,
            "Jules Breton ",//dn
            "Jacopo di Arcangelo",
            "Brian moser" ,
            "Camille Pissarro ",
            1
                )

        val que19=Question (
            19,
            "Who painted this ?",
            R.drawable.img19,
            "Adriaen Hanneman",
            "Andy Dwyer",
            "Marco d’Oggiono" ,
            "Henri Fantin-Latour ",//dn
            4
                )

        val que20=Question (
            20,
            "Who painted this ?",
            R.drawable.img20,
            "Francesco Francia",
            "Charles Dewolf Brownell",
            "François de Jullienne " ,//dn
            "Sasuke Uchiha",
            3
                )

        val que21=Question (
            21,
            "Who painted this ?",
            R.drawable.img21,
            "Jan Provost",
            "Henri-Joseph Harpignies ",//dn
            "James Peale" ,
            "Harry Ambrose",
            2
                )

        val que22=Question (
            22,
            "Who painted this ?",
            R.drawable.img22,
            "Jean-Léon Gérôme ",//dn
            "Carlo Crivelli",
            "Maurice Moss" ,
            "Benjamin Trott",
            1
                )

        val que23=Question (
            23,
            "Who painted this ?",
            R.drawable.img23,
            "Joos van Cleve",
            "Auguste Renoir ",//dn
            "Gustave Courbet" ,
            "Miguel Diaz",
            2
                )

        val que24=Question (
            24,
            "Who painted this ?",
            R.drawable.img24,
            "John Wesley Jarvis",
            "Charles Dewolf Brownell",
            "Bobby Singer" ,
            "Juan de Flandes ",//dn
            4
                )

        val que25=Question (
            25,
            "Who painted this ?",
            R.drawable.img25,
            " Jacob van Ruisdael",
            "Barent Fabritius ",//dn
            "Watanabe Seitei" ,
            "Michael Scott",
            2
                )

        val que26=Question (
            26,
            "Who painted this ?",
            R.drawable.img26,
            "Jean-Léon Gérôme",
            "Domingo Ram",
            "John Wesley Jarvis " ,//dn
            "Sheldon Cooper",
            3
                )

        val que27=Question (
            27,
            "Who painted this ?",
            R.drawable.img27,
            "Sir Joshua Reynolds",//dn
            "Alfred Sisley",
            "Gilbert Stuart" ,
            "Earl Hickey",
            1
                )

        val que28=Question (
            28,
            "Who painted this ?",
            R.drawable.img28,
            "Joseph Steward",
            "John Wollaston ",//dn
            "Dustin Handerson" ,
            "Anton Mauve",
            2
                )

        val que29=Question (
            29,
            "Who painted this ?",
            R.drawable.img29,
            "Hubert Robert",
            "John William Hill",
            "Carlos Castaneda" ,
            "Thomas Eakins ",//dn
            4
                )

        val que30=Question (
            1,
            "Who painted this ?",
            R.drawable.img30,
            "Fritz von Uhde",
            "Antoine Watteau",
            "Juan Rodríguez Juárez " ,//
            "Rick Grimes",
            3
                )


        questionsList.add(que1)
        questionsList.add(que2)
        questionsList.add(que3)
        questionsList.add(que4)
        questionsList.add(que5)
        questionsList.add(que6)
        questionsList.add(que7)
        questionsList.add(que8)
        questionsList.add(que9)
        questionsList.add(que10)
        questionsList.add(que11)
        questionsList.add(que12)
        questionsList.add(que13)
        questionsList.add(que14)
        questionsList.add(que15)
        questionsList.add(que16)
        questionsList.add(que17)
        questionsList.add(que18)
        questionsList.add(que19)
        questionsList.add(que20)
        questionsList.add(que21)
        questionsList.add(que22)
        questionsList.add(que23)
        questionsList.add(que24)
        questionsList.add(que25)
        questionsList.add(que26)
        questionsList.add(que27)
        questionsList.add(que28)
        questionsList.add(que29)
        questionsList.add(que30)
        return questionsList
    }
}