package com.example.quiz

object Constants{

    const val USER_NAME: String = "user_name"
    const val TOTAL_QUESTIONS: String = "total_questions"
    const val CORRECT_ANSWERS: String = "correct_answers"
    const val QUIZZ_TYPE: String = "quizz_type"
    const val QUIZZ_GROUP: String = "quizz_group"
    const val QUIZZ_SIZE: Int = 0
    const val QUIZZ_DIFFICULTY: String = "quizz_difficulty"
    const val QUIZZ_DIFFICULTY_MAX_EASY: Int = 10
    const val QUIZZ_DIFFICULTY_MAX_MEDIUM: Int = 25
    const val QUIZZ_DIFFICULTY_MAX_EASY_ALL: Int = 30
    const val QUIZZ_DIFFICULTY_MAX_MEDIUM_ALL: Int = 50

    fun getFlagQuestions(): ArrayList<FlagQuestion>{
        val questionsList = ArrayList<FlagQuestion>()

        //EUROPE

        //1
        val que01 = FlagQuestion(
            1, "What country does this flag belong to?",
            R.drawable.flag_albania,
            "Europe",
            "Albania", "Moldova",
            "Montenegro", "Kosovo", 1,
            3
        )
        questionsList.add(que01)

        //2
        val que02 = FlagQuestion(
            2, "What country does this flag belong to?",
            R.drawable.flag_andorra,
            "Europe",
            "Romania", "Andorra",
            "Bosnia and Herzegovina", "San Marino", 2,
            3
        )
        questionsList.add(que02)

        //3
        val que03 = FlagQuestion(
            3, "What country does this flag belong to?",
            R.drawable.flag_armenia,
            "Europe",
            "Romania", "Lithuania",
            "Armenia", "Latvia", 3,
            3
        )
        questionsList.add(que03)

        //4
        val que04 = FlagQuestion(
            4, "What country does this flag belong to?",
            R.drawable.flag_austria,
            "Europe",
            "Germany", "Denmark",
            "Luxembourg", "Austria", 4,
            2
        )
        questionsList.add(que04)

        //5
        val que05 = FlagQuestion(
            5, "What country does this flag belong to?",
            R.drawable.flag_azerbaijan,
            "Europe",
            "Turkey", "Cyprus",
            "Azerbaijan", "Armenia", 3,
            3
        )
        questionsList.add(que05)

        //6
        val que06 = FlagQuestion(
            6, "What country does this flag belong to?",
            R.drawable.flag_belarus,
            "Europe",
            "Estonia", "Azerbaijan",
            "Belarus", "Ukraine", 3,
            2
        )
        questionsList.add(que06)

        //7
        val que07 = FlagQuestion(
            7, "What country does this flag belong to?",
            R.drawable.flag_belgium,
            "Europe",
            "Germany", "Monaco",
            "Belgium", "Hungary", 3,
            1
        )
        questionsList.add(que07)

        //8
        val que08 = FlagQuestion(
            8, "What country does this flag belong to?",
            R.drawable.flag_bosnia_herzegovina,
            "Europe",
            "Croatia", "Greece",
            "Georgia", "Bosnia and Herzegovina", 4,
            3
        )
        questionsList.add(que08)

        //9
        val que09 = FlagQuestion(
            9, "What country does this flag belong to?",
            R.drawable.flag_bulgaria,
            "Europe",
            "Serbia", "Russia",
            "Hungary", "Bulgaria", 4,
            2
        )
        questionsList.add(que09)

        //10
        val que10 = FlagQuestion(
            10, "What country does this flag belong to?",
            R.drawable.flag_croatia,
            "Europe",
            "North Macedonia", "Netherlands",
            "Slovenia", "Croatia", 4,
            2
        )
        questionsList.add(que10)

        //11
        val que11 = FlagQuestion(
            11, "What country does this flag belong to?",
            R.drawable.flag_cyprus,
            "Europe",
            "Malta", "Vatican City",
            "Andorra", "Cyprus", 4,
            3
        )
        questionsList.add(que11)

        //12
        val que12 = FlagQuestion(
            12, "What country does this flag belong to?",
            R.drawable.flag_czech_republic,
            "Europe",
            "Poland", "Czech Republic",
            "Slovakia", "Croatia", 2,
            2
        )
        questionsList.add(que12)

        //13
        val que13 = FlagQuestion(
            13, "What country does this flag belong to?",
            R.drawable.flag_denmark,
            "Europe",
            "Iceland", "Denmark",
            "Sweden", "Finland", 2,
            1
        )
        questionsList.add(que13)

        //14
        val que14 = FlagQuestion(
            14, "What country does this flag belong to?",
            R.drawable.flag_estonia,
            "Europe",
            "Lithuania", "Estonia",
            "Slovenia", "Finland", 2,
            3
        )
        questionsList.add(que14)

        //15
        val que15 = FlagQuestion(
            15, "What country does this flag belong to?",
            R.drawable.flag_finland,
            "Europe",
            "Belarus", "Finland",
            "Slovakia", "Iceland", 2,
            1
        )
        questionsList.add(que15)

        //16
        val que16 = FlagQuestion(
            16, "What country does this flag belong to?",
            R.drawable.flag_france,
            "Europe",
            "Netherlands", "France",
            "Belgium", "Italy", 2,
            1
        )
        questionsList.add(que16)

        //17
        val que17 = FlagQuestion(
            17, "What country does this flag belong to?",
            R.drawable.flag_georgia,
            "Europe",
            "Georgia", "Moldova",
            "Denmark", "Latvia", 1,
            3
        )
        questionsList.add(que17)

        //18
        val que18 = FlagQuestion(
            18, "What country does this flag belong to?",
            R.drawable.flag_germany,
            "Europe",
            "Germany", "Belgium",
            "Czech Republic", "United Kingdom", 1,
            1
        )
        questionsList.add(que18)

        //19
        val que19 = FlagQuestion(
            19, "What country does this flag belong to?",
            R.drawable.flag_greece,
            "Europe",
            "Greece", "Montenegro",
            "Malta", "Portugal", 1,
            1
        )
        questionsList.add(que19)

        //20
        val que20 = FlagQuestion(
            20, "What country does this flag belong to?",
            R.drawable.flag_hungary,
            "Europe",
            "Bulgaria", "Czech Republic",
            "Hungary", "Lithuania", 3,
            2
        )
        questionsList.add(que20)

        //21
        val que21 = FlagQuestion(
            21, "What country does this flag belong to?",
            R.drawable.flag_iceland,
            "Europe",
            "Ireland", "Sweden",
            "Iceland", "United Kingdom", 3,
            2
        )
        questionsList.add(que21)

        //22
        val que22 = FlagQuestion(
            22, "What country does this flag belong to?",
            R.drawable.flag_ireland,
            "Europe",
            "Romania", "Ireland",
            "Belgium", "Liechtenstein", 2,
            1
        )
        questionsList.add(que22)

        //23
        val que23 = FlagQuestion(
            23, "What country does this flag belong to?",
            R.drawable.flag_italy,
            "Europe",
            "Ireland", "Italy",
            "Croatia", "Austria", 2,
            1
        )
        questionsList.add(que23)

        //24
        val que24 = FlagQuestion(
            24, "What country does this flag belong to?",
            R.drawable.flag_kosovo,
            "Europe",
            "Liechtenstein", "Kosovo",
            "Bosnia and Herzegovina", "Cyprus", 2,
            3
        )
        questionsList.add(que24)

        //25
        val que25 = FlagQuestion(
            25, "What country does this flag belong to?",
            R.drawable.flag_latvia,
            "Europe",
            "Turkey", "North Macedonia",
            "Germany", "Latvia", 4,
            3
        )
        questionsList.add(que25)

        //26
        val que26 = FlagQuestion(
            26, "What country does this flag belong to?",
            R.drawable.flag_liechtenstein,
            "Europe",
            "San Marino", "Switzerland",
            "Malta", "Liechtenstein", 4,
            3
        )
        questionsList.add(que26)

        //27
        val que27 = FlagQuestion(
            27, "What country does this flag belong to?",
            R.drawable.flag_lithuania,
            "Europe",
            "Bulgaria", "Spain",
            "Romania", "Lithuania", 4,
            3
        )
        questionsList.add(que27)

        //28
        val que28 = FlagQuestion(
            28, "What country does this flag belong to?",
            R.drawable.flag_luxembourg,
            "Europe",
            "Belgium", "Norway",
            "Austria", "Luxembourg", 4,
            2
        )
        questionsList.add(que28)

        //29
        val que29 = FlagQuestion(
            29, "What country does this flag belong to?",
            R.drawable.flag_malta,
            "Europe",
            "Monaco", "Armenia",
            "Malta", "Belarus", 3,
            3
        )
        questionsList.add(que29)

        //30
        val que30 = FlagQuestion(
            30, "What country does this flag belong to?",
            R.drawable.flag_moldova,
            "Europe",
            "Azerbaijan", "Vatican City",
            "Moldova", "North Macedonia", 3,
            3
        )
        questionsList.add(que30)

        //31
        val que31 = FlagQuestion(
            31, "What country does this flag belong to?",
            R.drawable.flag_monaco,
            "Europe",
            "Andorra", "Austria",
            "Monaco", "Italy", 3,
            3
        )
        questionsList.add(que31)

        //32
        val que32 = FlagQuestion(
            32, "What country does this flag belong to?",
            R.drawable.flag_montenegro,
            "Europe",
            "Montenegro", "Turkey",
            "Spain", "Serbia", 1,
            3
        )
        questionsList.add(que32)

        //33
        val que33 = FlagQuestion(
            33, "What country does this flag belong to?",
            R.drawable.flag_netherlands,
            "Europe",
            "Netherlands", "France",
            "Russia", "Norway", 1,
            1
        )
        questionsList.add(que33)

        //34
        val que34 = FlagQuestion(
            34, "What country does this flag belong to?",
            R.drawable.flag_north_macedonia,
            "Europe",
            "North Macedonia", "Albania",
            "Croatia", "Greece", 1,
            3
        )
        questionsList.add(que34)

        //35
        val que35 = FlagQuestion(
            35, "What country does this flag belong to?",
            R.drawable.flag_norway,
            "Europe",
            "Norway", "Iceland",
            "France", "Latvia", 1,
            1
        )
        questionsList.add(que35)

        //36
        val que36 = FlagQuestion(
            36, "What country does this flag belong to?",
            R.drawable.flag_poland,
            "Europe",
            "Czech Republic", "Poland",
            "Switzerland", "Denmark", 2,
            1
        )
        questionsList.add(que36)

        //37
        val que37 = FlagQuestion(
            37, "What country does this flag belong to?",
            R.drawable.flag_portugal,
            "Europe",
            "Spain", "Portugal",
            "Italy", "Andorra", 2,
            1
        )
        questionsList.add(que37)

        //38
        val que38 = FlagQuestion(
            38, "What country does this flag belong to?",
            R.drawable.flag_romania,
            "Europe",
            "Poland", "Romania",
            "Ukraine", "Hungary", 2,
            2
        )
        questionsList.add(que38)

        //39
        val que39 = FlagQuestion(
            39, "What country does this flag belong to?",
            R.drawable.flag_russia,
            "Europe",
            "Finland", "Russia",
            "Serbia", "Slovakia", 2,
            1
        )
        questionsList.add(que39)

        //40
        val que40 = FlagQuestion(
            40, "What country does this flag belong to?",
            R.drawable.flag_san_marino,
            "Europe",
            "Greece", "Luxembourg",
            "San Marino", "Ukraine", 3,
            3
        )
        questionsList.add(que40)

        //41
        val que41 = FlagQuestion(
            41, "What country does this flag belong to?",
            R.drawable.flag_serbia,
            "Europe",
            "Slovenia", "Russia",
            "Albania", "Serbia", 4,
            2
        )
        questionsList.add(que41)

        //42
        val que42 = FlagQuestion(
            42, "What country does this flag belong to?",
            R.drawable.flag_slovakia,
            "Europe",
            "Slovakia", "Poland",
            "Russia", "Netherlands", 1,
            2
        )
        questionsList.add(que42)

        //43
        val que43 = FlagQuestion(
            43, "What country does this flag belong to?",
            R.drawable.flag_slovenia,
            "Europe",
            "Iceland", "Slovenia",
            "Croatia", "Belgium", 2,
            2
        )
        questionsList.add(que43)

        //44
        val que44 = FlagQuestion(
            44, "What country does this flag belong to?",
            R.drawable.flag_spain,
            "Europe",
            "Austria", "Spain",
            "Ireland", "Germany", 2,
            1
        )
        questionsList.add(que44)

        //45
        val que45 = FlagQuestion(
            45, "What country does this flag belong to?",
            R.drawable.flag_sweden,
            "Europe",
            "Finland", "Estonia",
            "Sweden", "Lithuania", 3,
            1
        )
        questionsList.add(que45)

        //46
        val que46 = FlagQuestion(
            46, "What country does this flag belong to?",
            R.drawable.flag_switzerland,
            "Europe",
            "Spain", "Denmark",
            "Turkey", "Switzerland", 4,
            1
        )
        questionsList.add(que46)

        //47
        val que47 = FlagQuestion(
            47, "What country does this flag belong to?",
            R.drawable.flag_turkey,
            "Europe",
            "Turkey", "Azerbaijan",
            "Georgia", "Albania", 1,
            1
        )
        questionsList.add(que47)

        //48
        val que48 = FlagQuestion(
            48, "What country does this flag belong to?",
            R.drawable.flag_ukraine,
            "Europe",
            "Ukraine", "Armenia",
            "Bulgaria", "Poland", 1,
            2
        )
        questionsList.add(que48)

        //49
        val que49 = FlagQuestion(
            49, "What country does this flag belong to?",
            R.drawable.flag_united_kingdom,
            "Europe",
            "Iceland", "United Kingdom",
            "France", "Sweden", 2,
            1
        )
        questionsList.add(que49)

        //50
        val que50 = FlagQuestion(
            50, "What country does this flag belong to?",
            R.drawable.flag_vatican_city,
            "Europe",
            "Malta", "San Marino",
            "Vatican City", "Cyprus", 3,
            2
        )
        questionsList.add(que50)

        //AFRICA

        //51
        val que51 = FlagQuestion(
            51, "What country does this flag belong to?",
            R.drawable.flag_algeria,
            "Africa",
            "Libya", "Tunisia",
            "Algeria", "Morocco", 3,
            1
        )
        questionsList.add(que51)

        //52
        val que52 = FlagQuestion(
            52, "What country does this flag belong to?",
            R.drawable.flag_angola,
            "Africa",
            "Mozambique", "Botswana",
            "Angola", "Namibia", 3,
            2
        )
        questionsList.add(que52)

        //53
        val que53 = FlagQuestion(
            53, "What country does this flag belong to?",
            R.drawable.flag_benin,
            "Africa",
            "Togo", "Liberia",
            "Benin", "Madagascar", 3,
            3
        )
        questionsList.add(que53)

        //54
        val que54 = FlagQuestion(
            54, "What country does this flag belong to?",
            R.drawable.flag_botswana,
            "Africa",
            "South Africa", "Eswatini",
            "Botswana", "Equatorial Guinea", 3,
            2
        )
        questionsList.add(que54)

        //55
        val que55 = FlagQuestion(
            55, "What country does this flag belong to?",
            R.drawable.flag_burkina_faso,
            "Africa",
            "Burkina Faso", "Mali",
            "Mauritania", "Morocco", 1,
            3
        )
        questionsList.add(que55)

        //56
        val que56 = FlagQuestion(
            56, "What country does this flag belong to?",
            R.drawable.flag_burundi,
            "Africa",
            "Burundi", "Rwanda",
            "Malawi", "Tanzania", 1,
            3
        )
        questionsList.add(que56)

        //57
        val que57 = FlagQuestion(
            57, "What country does this flag belong to?",
            R.drawable.flag_cabo_verde,
            "Africa",
            "Cape Verde", "Comoros",
            "Gambia", "Liberia", 1,
            2
        )
        questionsList.add(que57)

        //58
        val que58 = FlagQuestion(
            58, "What country does this flag belong to?",
            R.drawable.flag_cameroon,
            "Africa",
            "Cameroon", "Senegal",
            "Niger", "Chad", 1,
            2
        )
        questionsList.add(que58)

        //59
        val que59 = FlagQuestion(
            59, "What country does this flag belong to?",
            R.drawable.flag_central_african_republic,
            "Africa",
            "Democratic Republic of the Congo", "Ivory Coast",
            "Ethiopia", "Central African Republic", 4,
            2
        )
        questionsList.add(que59)

        //60
        val que60 = FlagQuestion(
            60, "What country does this flag belong to?",
            R.drawable.flag_chad,
            "Africa",
            "Cameroon", "Republic of the Congo",
            "Sudan", "Chad", 4,
            2
        )
        questionsList.add(que60)

        //61
        val que61 = FlagQuestion(
            61, "What country does this flag belong to?",
            R.drawable.flag_comoros,
            "Africa",
            "Seychelles", "Rwanda",
            "Sao Tome and Principe", "Comoros", 4,
            2
        )
        questionsList.add(que61)

        //62
        val que62 = FlagQuestion(
            62, "What country does this flag belong to?",
            R.drawable.flag_congo_democratic_republic_of,
            "Africa",
            "Equatorial Guinea", "Gabon",
            "Kenya", "Democratic Republic of the Congo", 4,
            1
        )
        questionsList.add(que62)

        //63
        val que63 = FlagQuestion(
            63, "What country does this flag belong to?",
            R.drawable.flag_congo,
            "Africa",
            "Central African Republic", "Republic of the Congo",
            "Nigeria", "Mali", 2,
            2
        )
        questionsList.add(que63)

        //64
        val que64 = FlagQuestion(
            64, "What country does this flag belong to?",
            R.drawable.flag_cote_d_ivoire,
            "Africa",
            "Mauritius", "Ivory Coast",
            "Guinea-Bissau", "Ethiopia", 2,
            2
        )
        questionsList.add(que64)

        //65
        val que65 = FlagQuestion(
            65, "What country does this flag belong to?",
            R.drawable.flag_djibouti,
            "Africa",
            "Equatorial Guinea", "Djibouti",
            "Somalia", "Eritrea", 2,
            3
        )
        questionsList.add(que65)

        //66
        val que66 = FlagQuestion(
            66, "What country does this flag belong to?",
            R.drawable.flag_egypt,
            "Africa",
            "Algeria", "South Sudan",
            "Egypt", "Libya", 3,
            1
        )
        questionsList.add(que66)

        //67
        val que67 = FlagQuestion(
            67, "What country does this flag belong to?",
            R.drawable.flag_equatorial_guinea,
            "Africa",
            "Gambia", "Ghana",
            "Equatorial Guinea", "Lesotho", 3,
            3
        )
        questionsList.add(que67)

        //68
        val que68 = FlagQuestion(
            68, "What country does this flag belong to?",
            R.drawable.flag_eritrea,
            "Africa",
            "Burundi", "Djibouti",
            "Sierra Leone", "Eritrea", 4,
            2
        )
        questionsList.add(que68)

        //69
        val que69 = FlagQuestion(
            69, "What country does this flag belong to?",
            R.drawable.flag_eswatini,
            "Africa",
            "Seychelles", "Lesotho",
            "Mozambique", "Eswatini", 4,
            2
        )
        questionsList.add(que69)

        //70
        val que70 = FlagQuestion(
            70, "What country does this flag belong to?",
            R.drawable.flag_ethiopia,
            "Africa",
            "Ethiopia", "Nigeria",
            "Mauritania", "Egypt", 1,
            1
        )
        questionsList.add(que70)

        //71
        val que71 = FlagQuestion(
            71, "What country does this flag belong to?",
            R.drawable.flag_gabon,
            "Africa",
            "Gabon", "Comoros",
            "Republic of the Congo", "Botswana", 1,
            3
        )
        questionsList.add(que71)

        //72
        val que72 = FlagQuestion(
            72, "What country does this flag belong to?",
            R.drawable.flag_gambia,
            "Africa",
            "Tanzania", "Uganda",
            "Gambia", "South Sudan", 3,
            2
        )
        questionsList.add(que72)

        //73
        val que73 = FlagQuestion(
            73, "What country does this flag belong to?",
            R.drawable.flag_guinea,
            "Africa",
            "Sierra Leone", "Kenya",
            "Guinea", "Cameroon", 3,
            1
        )
        questionsList.add(que73)

        //74
        val que74 = FlagQuestion(
            74, "What country does this flag belong to?",
            R.drawable.flag_guinea_bissau,
            "Africa",
            "Togo", "Guinea-Bissau",
            "Zambia", "South Africa", 2,
            2
        )
        questionsList.add(que74)

        //75
        val que75 = FlagQuestion(
            75, "What country does this flag belong to?",
            R.drawable.flag_kenya,
            "Africa",
            "Libya", "Kenya",
            "Egypt", "Uganda", 2,
            1
        )
        questionsList.add(que75)

        //76
        val que76 = FlagQuestion(
            76, "What country does this flag belong to?",
            R.drawable.flag_lesotho,
            "Africa",
            "Burundi", "Botswana",
            "Kenya", "Lesotho", 4,
            2
        )
        questionsList.add(que76)

        //77
        val que77 = FlagQuestion(
            77, "What country does this flag belong to?",
            R.drawable.flag_liberia,
            "Africa",
            "Ghana", "Madagascar",
            "Mauritius", "Liberia", 4,
            2
        )
        questionsList.add(que77)

        //78
        val que78 = FlagQuestion(
            78, "What country does this flag belong to?",
            R.drawable.flag_libya,
            "Africa",
            "Libya", "Sudan",
            "Mauritania", "Chad", 1,
            1
        )
        questionsList.add(que78)

        //79
        val que79 = FlagQuestion(
            79, "What country does this flag belong to?",
            R.drawable.flag_madagascar,
            "Africa",
            "Madagascar", "Somalia",
            "Cape Verde", "Comoros", 1,
            1
        )
        questionsList.add(que79)

        //80
        val que80 = FlagQuestion(
            80, "What country does this flag belong to?",
            R.drawable.flag_malawi,
            "Africa",
            "Malawi", "Angola",
            "Kenya", "South Africa", 1,
            2
        )
        questionsList.add(que80)

        //81
        val que81 = FlagQuestion(
            81, "What country does this flag belong to?",
            R.drawable.flag_mali,
            "Africa",
            "Ghana", "Tanzania",
            "Mali", "South Sudan", 3,
            2
        )
        questionsList.add(que81)

        //82
        val que82 = FlagQuestion(
            82, "What country does this flag belong to?",
            R.drawable.flag_mauritania,
            "Africa",
            "Senegal", "Tunisia",
            "Mauritania", "Morocco", 3,
            2
        )
        questionsList.add(que82)

        //83
        val que83 = FlagQuestion(
            83, "What country does this flag belong to?",
            R.drawable.flag_mauritius,
            "Africa",
            "Malawi", "Mauritius",
            "Sao Tome and Principe", "Zimbabwe", 2,
            3
        )
        questionsList.add(que83)

        //84
        val que84 = FlagQuestion(
            84, "What country does this flag belong to?",
            R.drawable.flag_morocco,
            "Africa",
            "Mali", "Morocco",
            "Somalia", "Tunisia", 2,
            1
        )
        questionsList.add(que84)

        //85
        val que85 = FlagQuestion(
            85, "What country does this flag belong to?",
            R.drawable.flag_mozambique,
            "Africa",
            "Namibia", "Mozambique",
            "Zimbabwe", "Tanzania", 2,
            2
        )
        questionsList.add(que85)

        //86
        val que86 = FlagQuestion(
            86, "What country does this flag belong to?",
            R.drawable.flag_namibia,
            "Africa",
            "Democratic Republic of the Congo", "Lesotho",
            "Zambia", "Namibia", 4,
            2
        )
        questionsList.add(que86)

        //87
        val que87 = FlagQuestion(
            87, "What country does this flag belong to?",
            R.drawable.flag_niger,
            "Africa",
            "Djibouti", "Sierra Leone",
            "Guinea-Bissau", "Niger", 4,
            2
        )
        questionsList.add(que87)

        //88
        val que88 = FlagQuestion(
            88, "What country does this flag belong to?",
            R.drawable.flag_nigeria,
            "Africa",
            "Nigeria", "Uganda",
            "Central African Republic", "Zambia", 1,
            1
        )
        questionsList.add(que88)

        //89
        val que89 = FlagQuestion(
            89, "What country does this flag belong to?",
            R.drawable.flag_rwanda,
            "Africa",
            "Rwanda", "Tanzania",
            "Zimbabwe", "Eritrea", 1,
            3
        )
        questionsList.add(que89)

        //90
        val que90 = FlagQuestion(
            90, "What country does this flag belong to?",
            R.drawable.flag_sao_tome_and_principe,
            "Africa",
            "Benin", "Niger",
            "Sao Tome and Principe", "Togo", 3,
            2
        )
        questionsList.add(que90)

        //91
        val que91 = FlagQuestion(
            91, "What country does this flag belong to?",
            R.drawable.flag_senegal,
            "Africa",
            "Ethiopia", "Guinea",
            "Senegal", "Ivory Coast", 3,
            2
        )
        questionsList.add(que91)

        //92
        val que92 = FlagQuestion(
            92, "What country does this flag belong to?",
            R.drawable.flag_seychelles,
            "Africa",
            "Comoros", "Seychelles",
            "Burundi", "Madagascar", 2,
            2
        )
        questionsList.add(que92)

        //93
        val que93 = FlagQuestion(
            93, "What country does this flag belong to?",
            R.drawable.flag_sierra_leone,
            "Africa",
            "Guinea-Bissau", "Sierra Leone",
            "Gabon", "South Sudan", 2,
            2
        )
        questionsList.add(que93)

        //94
        val que94 = FlagQuestion(
            94, "What country does this flag belong to?",
            R.drawable.flag_somalia,
            "Africa",
            "Algeria", "Somalia",
            "Sudan", "Nigeria", 2,
            1
        )
        questionsList.add(que94)

        //95
        val que95 = FlagQuestion(
            95, "What country does this flag belong to?",
            R.drawable.flag_south_africa,
            "Africa",
            "Uganda", "Kenya",
            "Tanzania", "South Africa", 4,
            1
        )
        questionsList.add(que95)

        //96
        val que96 = FlagQuestion(
            96, "What country does this flag belong to?",
            R.drawable.flag_south_sudan,
            "Africa",
            "Niger", "Mali",
            "Chad", "South Sudan", 4,
            3
        )
        questionsList.add(que96)

        //97
        val que97 = FlagQuestion(
            97, "What country does this flag belong to?",
            R.drawable.flag_sudan,
            "Africa",
            "Sudan", "Egypt",
            "Algeria", "Mauritania", 1,
            2
        )
        questionsList.add(que97)

        //98
        val que98 = FlagQuestion(
            98, "What country does this flag belong to?",
            R.drawable.flag_tanzania,
            "Africa",
            "Tanzania", "Equatorial Guinea",
            "Republic of the Congo", "Lesotho", 1,
            2
        )
        questionsList.add(que98)

        //99
        val que99 = FlagQuestion(
            99, "What country does this flag belong to?",
            R.drawable.flag_togo,
            "Africa",
            "Ghana", "Guinea-Bissau",
            "Togo", "Benin", 3,
            3
        )
        questionsList.add(que99)

        //100
        val que100 = FlagQuestion(
            100, "What country does this flag belong to?",
            R.drawable.flag_tunisia,
            "Africa",
            "Senegal", "Morocco",
            "Tunisia", "Egypt", 3,
            1
        )
        questionsList.add(que100)

        //101
        val que101 = FlagQuestion(
            101, "What country does this flag belong to?",
            R.drawable.flag_uganda,
            "Africa",
            "Zimbabwe", "Uganda",
            "Eswatini", "Angola", 2,
            1
        )
        questionsList.add(que101)

        //102
        val que102 = FlagQuestion(
            102, "What country does this flag belong to?",
            R.drawable.flag_zambia,
            "Africa",
            "Nigeria", "Zambia",
            "Rwanda", "Mozambique", 2,
            2
        )
        questionsList.add(que102)

        //103
        val que103 = FlagQuestion(
            103, "What country does this flag belong to?",
            R.drawable.flag_zimbabwe,
            "Africa",
            "Burkina Faso", "Chad",
            "Uganda", "Zimbabwe", 4,
            2
        )
        questionsList.add(que103)

        //104
        val que104 = FlagQuestion(
            104, "What country does this flag belong to?",
            R.drawable.flag_ghana,
            "Africa",
            "Niger", "Cape Verde",
            "Ethiopia", "Ghana", 4,
            2
        )
        questionsList.add(que104)

        //ASIA

        //105
        val que105 = FlagQuestion(
            105, "What country does this flag belong to?",
            R.drawable.flag_afghanistan,
            "Asia",
            "Kuwait", "Yemen",
            "Iraq", "Afghanistan", 4,
            1
        )
        questionsList.add(que105)

        //106
        val que106 = FlagQuestion(
            106, "What country does this flag belong to?",
            R.drawable.flag_bangladesh,
            "Asia",
            "Maldives", "Malaysia",
            "Sri Lanka", "Bangladesh", 4,
            2
        )
        questionsList.add(que106)

        //107
        val que107 = FlagQuestion(
            107, "What country does this flag belong to?",
            R.drawable.flag_bhutan,
            "Asia",
            "China", "Bhutan",
            "Mongolia", "Nepal", 2,
            2
        )
        questionsList.add(que107)

        //108
        val que108 = FlagQuestion(
            108, "What country does this flag belong to?",
            R.drawable.flag_brunei,
            "Asia",
            "Bhutan", "Brunei",
            "Timor-Leste", "Laos", 2,
            3
        )
        questionsList.add(que108)

        //109
        val que109 = FlagQuestion(
            109, "What country does this flag belong to?",
            R.drawable.flag_cambodia,
            "Asia",
            "Cambodia", "Laos",
            "Thailand", "Mongolia", 1,
            2
        )
        questionsList.add(que109)

        //110
        val que110 = FlagQuestion(
            110, "What country does this flag belong to?",
            R.drawable.flag_china,
            "Asia",
            "China", "Vietnam",
            "Singapore", "Indonesia", 1,
            1
        )
        questionsList.add(que110)

        //111
        val que111 = FlagQuestion(
            111, "What country does this flag belong to?",
            R.drawable.flag_india,
            "Asia",
            "Indonesia", "Iran",
            "India", "Nepal", 3,
            1
        )
        questionsList.add(que111)

        //112
        val que112 = FlagQuestion(
            112, "What country does this flag belong to?",
            R.drawable.flag_indonesia,
            "Asia",
            "Thailand", "Malaysia",
            "Indonesia", "Brunei", 3,
            1
        )
        questionsList.add(que112)

        //113
        val que113 = FlagQuestion(
            113, "What country does this flag belong to?",
            R.drawable.flag_iran,
            "Asia",
            "Pakistan", "India",
            "Iran", "Oman", 3,
            1
        )
        questionsList.add(que113)

        //114
        val que114 = FlagQuestion(
            114, "What country does this flag belong to?",
            R.drawable.flag_iraq,
            "Asia",
            "Jordan", "Syria",
            "Saudi Arabia", "Iraq", 4,
            1
        )
        questionsList.add(que114)

        //115
        val que115 = FlagQuestion(
            115, "What country does this flag belong to?",
            R.drawable.flag_israel,
            "Asia",
            "Iran", "Lebanon",
            "Jordan", "Israel", 4,
            1
        )
        questionsList.add(que115)

        //116
        val que116 = FlagQuestion(
            116, "What country does this flag belong to?",
            R.drawable.flag_japan,
            "Asia",
            "South Korea", "China",
            "Philippines", "Japan", 4,
            1
        )
        questionsList.add(que116)

        //117
        val que117 = FlagQuestion(
            117, "What country does this flag belong to?",
            R.drawable.flag_jordan,
            "Asia",
            "United Arab Emirates", "Jordan",
            "Saudi Arabia", "Iraq", 2,
            3
        )
        questionsList.add(que117)

        //118
        val que118 = FlagQuestion(
            118, "What country does this flag belong to?",
            R.drawable.flag_kazakhstan,
            "Asia",
            "Kyrgyzstan", "Kazakhstan",
            "Bhutan", "Mongolia", 2,
            2
        )
        questionsList.add(que118)

        //119
        val que119 = FlagQuestion(
            119, "What country does this flag belong to?",
            R.drawable.flag_kuwait,
            "Asia",
            "Jordan", "Kuwait",
            "Yemen", "Qatar", 2,
            3
        )
        questionsList.add(que119)

        //120
        val que120 = FlagQuestion(
            120, "What country does this flag belong to?",
            R.drawable.flag_kyrgyzstan,
            "Asia",
            "Turkmenistan", "Kyrgyzstan",
            "Qatar", "Afghanistan", 2,
            3
        )
        questionsList.add(que120)

        //121
        val que121 = FlagQuestion(
            121, "What country does this flag belong to?",
            R.drawable.flag_laos,
            "Asia",
            "Laos", "Thailand",
            "Cambodia", "Myanmar", 1,
            3
        )
        questionsList.add(que121)

        //122
        val que122 = FlagQuestion(
            122, "What country does this flag belong to?",
            R.drawable.flag_lebanon,
            "Asia",
            "Lebanon", "Israel",
            "Oman", "Saudi Arabia", 1,
            2
        )
        questionsList.add(que122)

        //123
        val que123 = FlagQuestion(
            123, "What country does this flag belong to?",
            R.drawable.flag_malaysia,
            "Asia",
            "Malaysia", "Brunei",
            "Philippines", "Maldives", 1,
            2
        )
        questionsList.add(que123)

        //124
        val que124 = FlagQuestion(
            124, "What country does this flag belong to?",
            R.drawable.flag_maldives,
            "Asia",
            "Brunei", "Bangladesh",
            "Maldives", "Singapore", 3,
            2
        )
        questionsList.add(que124)

        //125
        val que125 = FlagQuestion(
            125, "What country does this flag belong to?",
            R.drawable.flag_mongolia,
            "Asia",
            "China", "North Korea",
            "Mongolia", "Cambodia", 3,
            2
        )
        questionsList.add(que125)

        //126
        val que126 = FlagQuestion(
            126, "What country does this flag belong to?",
            R.drawable.flag_myanmar,
            "Asia",
            "India", "Bangladesh",
            "Myanmar", "Tajikistan", 3,
            2
        )
        questionsList.add(que126)

        //127
        val que127 = FlagQuestion(
            127, "What country does this flag belong to?",
            R.drawable.flag_nepal,
            "Asia",
            "Uzbekistan", "Bhutan",
            "Nepal", "Vietnam", 3,
            1
        )
        questionsList.add(que127)

        //128
        val que128 = FlagQuestion(
            128, "What country does this flag belong to?",
            R.drawable.flag_korea_north,
            "Asia",
            "Mongolia", "China",
            "Cambodia", "North Korea", 4,
            1
        )
        questionsList.add(que128)

        //129
        val que129 = FlagQuestion(
            129, "What country does this flag belong to?",
            R.drawable.flag_oman,
            "Asia",
            "Bahrain", "Kazakhstan",
            "Iran", "Oman", 4,
            2
        )
        questionsList.add(que129)

        //130
        val que130 = FlagQuestion(
            130, "What country does this flag belong to?",
            R.drawable.flag_pakistan,
            "Asia",
            "Bangladesh", "Uzbekistan",
            "Saudi Arabia", "Pakistan", 4,
            1
        )
        questionsList.add(que130)

        //131
        val que131 = FlagQuestion(
            131, "What country does this flag belong to?",
            R.drawable.flag_palestine,
            "Asia",
            "United Arab Emirates", "Jordan",
            "Syria", "Palestine", 4,
            3
        )
        questionsList.add(que131)

        //132
        val que132 = FlagQuestion(
            132, "What country does this flag belong to?",
            R.drawable.flag_qatar,
            "Asia",
            "Palestine", "Qatar",
            "Yemen", "Kuwait", 2,
            2
        )
        questionsList.add(que132)

        //133
        val que133 = FlagQuestion(
            133, "What country does this flag belong to?",
            R.drawable.flag_saudi_arabia,
            "Asia",
            "Pakistan", "Saudi Arabia",
            "Lebanon", "Iraq", 2,
            1
        )
        questionsList.add(que133)

        //134
        val que134 = FlagQuestion(
            134, "What country does this flag belong to?",
            R.drawable.flag_singapore,
            "Asia",
            "Japan", "Singapore",
            "Philippines", "Sri Lanka", 2,
            2
        )
        questionsList.add(que134)

        //135
        val que135 = FlagQuestion(
            135, "What country does this flag belong to?",
            R.drawable.flag_korea_south,
            "Asia",
            "South Korea", "Japan",
            "Sri Lanka", "Taiwan", 1,
            1
        )
        questionsList.add(que135)

        //136
        val que136 = FlagQuestion(
            136, "What country does this flag belong to?",
            R.drawable.flag_sri_lanka,
            "Asia",
            "Sri Lanka", "Brunei",
            "Bhutan", "Maldives", 1,
            2
        )
        questionsList.add(que136)

        //137
        val que137 = FlagQuestion(
            137, "What country does this flag belong to?",
            R.drawable.flag_syria,
            "Asia",
            "Syria", "Yemen",
            "Jordan", "Iraq", 1,
            2
        )
        questionsList.add(que137)

        //138
        val que138 = FlagQuestion(
            138, "What country does this flag belong to?",
            R.drawable.flag_taiwan,
            "Asia",
            "Taiwan", "China",
            "Cambodia", "Timor-Leste", 1,
            2
        )
        questionsList.add(que138)

        //139
        val que139 = FlagQuestion(
            139, "What country does this flag belong to?",
            R.drawable.flag_tajikistan,
            "Asia",
            "Turkmenistan", "Iran",
            "Tajikistan", "Qatar", 3,
            3
        )
        questionsList.add(que139)

        //140
        val que140 = FlagQuestion(
            140, "What country does this flag belong to?",
            R.drawable.flag_thailand,
            "Asia",
            "Bangladesh", "Cambodia",
            "Thailand", "Laos", 3,
            2
        )
        questionsList.add(que140)

        //141
        val que141 = FlagQuestion(
            141, "What country does this flag belong to?",
            R.drawable.flag_timor_leste,
            "Asia",
            "Indonesia", "Vietnam",
            "Timor-Leste", "Pakistan", 3,
            3
        )
        questionsList.add(que141)

        //142
        val que142 = FlagQuestion(
            142, "What country does this flag belong to?",
            R.drawable.flag_turkmenistan,
            "Asia",
            "Uzbekistan", "Kazakhstan",
            "Turkmenistan", "Tajikistan", 3,
            3
        )
        questionsList.add(que142)

        //143
        val que143 = FlagQuestion(
            143, "What country does this flag belong to?",
            R.drawable.flag_united_arab_emirates,
            "Asia",
            "Iraq", "Palestine",
            "Lebanon", "United Arab Emirates", 4,
            1
        )
        questionsList.add(que143)

        //144
        val que144 = FlagQuestion(
            144, "What country does this flag belong to?",
            R.drawable.flag_uzbekistan,
            "Asia",
            "Nepal", "Kazakhstan",
            "Iran", "Uzbekistan", 4,
            3
        )
        questionsList.add(que144)

        //145
        val que145 = FlagQuestion(
            145, "What country does this flag belong to?",
            R.drawable.flag_vietnam,
            "Asia",
            "Tajikistan", "China",
            "Laos", "Vietnam", 4,
            2
        )
        questionsList.add(que145)

        //146
        val que146 = FlagQuestion(
            146, "What country does this flag belong to?",
            R.drawable.flag_yemen,
            "Asia",
            "Afghanistan", "Iraq",
            "Kuwait", "Yemen", 4,
            2
        )
        questionsList.add(que146)

        //147
        val que147 = FlagQuestion(
            147, "What country does this flag belong to?",
            R.drawable.flag_philippines,
            "Asia",
            "Japan", "Philippines",
            "Bangladesh", "Tajikistan", 2,
            2
        )
        questionsList.add(que147)

        //148
        val que148 = FlagQuestion(
            148, "What country does this flag belong to?",
            R.drawable.flag_bahrain,
            "Asia",
            "United Arab Emirates", "Qatar",
            "Kuwait", "Bahrain", 4,
            2
        )
        questionsList.add(que148)

        //149
        val que149 = FlagQuestion(
            149, "What country does this flag belong to?",
            R.drawable.flag_antigua,
            "America",
            "Barbados", "Bahamas",
            "Jamaica", "Antigua and Barbuda", 4,
            3
        )
        questionsList.add(que149)

        //150
        val que150 = FlagQuestion(
            150, "What country does this flag belong to?",
            R.drawable.flag_bahamas,
            "America",
            "Belize", "Dominica",
            "Guatemala", "Bahamas", 4,
            2
        )
        questionsList.add(que150)

        //151
        val que151 = FlagQuestion(
            151, "What country does this flag belong to?",
            R.drawable.flag_barbados,
            "America",
            "Costa Rica", "Antigua and Barbuda",
            "Saint Lucia", "Barbados", 4,
            2
        )
        questionsList.add(que151)

        //152
        val que152 = FlagQuestion(
            152, "What country does this flag belong to?",
            R.drawable.flag_belize,
            "America",
            "Honduras", "Grenada",
            "Belize", "Haiti", 3,
            3
        )
        questionsList.add(que152)

        //153
        val que153 = FlagQuestion(
            153, "What country does this flag belong to?",
            R.drawable.flag_canada,
            "America",
            "Brazil", "United States",
            "Canada", "Mexico", 3,
            1
        )
        questionsList.add(que153)

        //154
        val que154 = FlagQuestion(
            154, "What country does this flag belong to?",
            R.drawable.flag_costa_rica,
            "America",
            "Saint Vincent and the Grenadines", "El Salvador",
            "Costa Rica", "Nicaragua", 3,
            2
        )
        questionsList.add(que154)

        //155
        val que155 = FlagQuestion(
            155, "What country does this flag belong to?",
            R.drawable.flag_cuba,
            "America",
            "United States of America", "Cuba",
            "Dominican Republic", "Costa Rica", 2,
            1
        )
        questionsList.add(que155)

        //156
        val que156 = FlagQuestion(
            156, "What country does this flag belong to?",
            R.drawable.flag_dominica,
            "America",
            "Cuba", "Dominica",
            "Grenada", "Haiti", 2,
            3
        )
        questionsList.add(que156)

        //157
        val que157 = FlagQuestion(
            157, "What country does this flag belong to?",
            R.drawable.flag_dominican_republic,
            "America",
            "El Salvador", "Dominican Republic",
            "Panama", "Mexico", 2,
            3
        )
        questionsList.add(que157)

        //158
        val que158 = FlagQuestion(
            158, "What country does this flag belong to?",
            R.drawable.flag_el_salvador,
            "America",
            "El Salvador", "Guatemala",
            "Mexico", "Panama", 1,
            2
        )
        questionsList.add(que158)

        //159
        val que159 = FlagQuestion(
            159, "What country does this flag belong to?",
            R.drawable.flag_grenada,
            "America",
            "Grenada", "Bahamas",
            "Antigua and Barbuda", "Belize", 1,
            3
        )
        questionsList.add(que159)

        //160
        val que160 = FlagQuestion(
            160, "What country does this flag belong to?",
            R.drawable.flag_guatemala,
            "America",
            "Guatemala", "Saint Kitts and Nevis",
            "United States of America", "Honduras", 1,
            2
        )
        questionsList.add(que160)

        //161
        val que161 = FlagQuestion(
            161, "What country does this flag belong to?",
            R.drawable.flag_haiti,
            "America",
            "Trinidad and Tobago", "Dominican Republic",
            "Saint Lucia", "Haiti", 4,
            2
        )
        questionsList.add(que161)

        //162
        val que162 = FlagQuestion(
            162, "What country does this flag belong to?",
            R.drawable.flag_honduras,
            "America",
            "Panama", "Dominica",
            "Belize", "Honduras", 4,
            2
        )
        questionsList.add(que162)

        //163
        val que163 = FlagQuestion(
            163, "What country does this flag belong to?",
            R.drawable.flag_jamaica,
            "America",
            "El Salvador", "Jamaica",
            "Cuba", "Costa Rica", 2,
            1
        )
        questionsList.add(que163)

        //164
        val que164 = FlagQuestion(
            164, "What country does this flag belong to?",
            R.drawable.flag_mexico,
            "America",
            "Barbados", "Mexico",
            "Jamaica", "Dominica", 2,
            1
        )
        questionsList.add(que164)

        //165
        val que165 = FlagQuestion(
            165, "What country does this flag belong to?",
            R.drawable.flag_nicaragua,
            "America",
            "Antigua and Barbuda", "El Salvador",
            "Nicaragua", "Saint Lucia", 3,
            2
        )
        questionsList.add(que165)

        //166
        val que166 = FlagQuestion(
            166, "What country does this flag belong to?",
            R.drawable.flag_panama,
            "America",
            "Guatemala", "Saint Kitts and Nevis",
            "Panama", "Costa Rica", 3,
            1
        )
        questionsList.add(que166)

        //167
        val que167 = FlagQuestion(
            167, "What country does this flag belong to?",
            R.drawable.flag_st_kitts_nevis,
            "America",
            "Haiti", "Trinidad and Tobago",
            "Saint Kitts and Nevis", "Bahamas", 3,
            3
        )
        questionsList.add(que167)

        //168
        val que168 = FlagQuestion(
            168, "What country does this flag belong to?",
            R.drawable.flag_st_lucia,
            "America",
            "Grenada", "Nicaragua",
            "Saint Lucia", "Panama", 3,
            3
        )
        questionsList.add(que168)

        //169
        val que169 = FlagQuestion(
            169, "What country does this flag belong to?",
            R.drawable.flag_st_vincent_the_grenadines,
            "America",
            "Saint Vincent and the Grenadines", "Mexico",
            "Bahamas", "Barbados", 1,
            3
        )
        questionsList.add(que169)

        //170
        val que170 = FlagQuestion(
            170, "What country does this flag belong to?",
            R.drawable.flag_trinidad_and_tobago,
            "America",
            "Trinidad and Tobago", "Saint Vincent and the Grenadines",
            "Haiti", "Cuba", 1,
            2
        )
        questionsList.add(que170)

        //171
        val que171 = FlagQuestion(
            171, "What country does this flag belong to?",
            R.drawable.flag_united_states_of_america,
            "America",
            "United States of America", "Canada",
            "Mexico", "Panama", 1,
            1
        )
        questionsList.add(que171)

        //172
        val que172 = FlagQuestion(
            172, "What country does this flag belong to?",
            R.drawable.flag_argentina,
            "America",
            "Argentina", "Chile",
            "Brazil", "Uruguay", 1,
            1
        )
        questionsList.add(que172)

        //173
        val que173 = FlagQuestion(
            173, "What country does this flag belong to?",
            R.drawable.flag_bolivia,
            "America",
            "Bolivia", "Guyana",
            "Ecuador", "Colombia", 1,
            2
        )
        questionsList.add(que173)

        //174
        val que174 = FlagQuestion(
            174, "What country does this flag belong to?",
            R.drawable.flag_brazil,
            "America",
            "Bolivia", "Argentina",
            "Colombia", "Brazil", 4,
            1
        )
        questionsList.add(que174)

        //175
        val que175 = FlagQuestion(
            175, "What country does this flag belong to?",
            R.drawable.flag_chile,
            "America",
            "Paraguay", "Argentina",
            "Uruguay", "Chile", 4,
            1
        )
        questionsList.add(que175)

        //176
        val que176 = FlagQuestion(
            176, "What country does this flag belong to?",
            R.drawable.flag_colombia,
            "America",
            "Bolivia", "Venezuela",
            "Ecuador", "Colombia", 4,
            2
        )
        questionsList.add(que176)

        //177
        val que177 = FlagQuestion(
            177, "What country does this flag belong to?",
            R.drawable.flag_ecuador,
            "America",
            "Peru", "Venezuela",
            "Suriname", "Ecuador", 4,
            2
        )
        questionsList.add(que177)

        //178
        val que178 = FlagQuestion(
            178, "What country does this flag belong to?",
            R.drawable.flag_guyana,
            "America",
            "Suriname", "Guyana",
            "Paraguay", "Brazil", 2,
            2
        )
        questionsList.add(que178)

        //179
        val que179 = FlagQuestion(
            179, "What country does this flag belong to?",
            R.drawable.flag_paraguay,
            "America",
            "Bolivia", "Paraguay",
            "Peru", "Chile", 2,
            2
        )
        questionsList.add(que179)

        //180
        val que180 = FlagQuestion(
            180, "What country does this flag belong to?",
            R.drawable.flag_peru,
            "America",
            "Uruguay", "Peru",
            "Colombia", "Guyana", 2,
            2
        )
        questionsList.add(que180)

        //181
        val que181 = FlagQuestion(
            181, "What country does this flag belong to?",
            R.drawable.flag_suriname,
            "America",
            "Guyana", "Suriname",
            "Paraguay", "Brazil", 2,
            3
        )
        questionsList.add(que181)

        //182
        val que182 = FlagQuestion(
            182, "What country does this flag belong to?",
            R.drawable.flag_uruguay,
            "America",
            "Chile", "Bolivia",
            "Uruguay", "Argentina", 3,
            1
        )
        questionsList.add(que182)

        //183
        val que183 = FlagQuestion(
            183, "What country does this flag belong to?",
            R.drawable.flag_venezuela,
            "America",
            "Suriname", "Ecuador",
            "Venezuela", "Peru", 3,
            2
        )
        questionsList.add(que183)

        //OTHER

        //184
        val que184 = FlagQuestion(
            184, "What country does this flag belong to?",
            R.drawable.flag_australia,
            "Other",
            "Fiji", "New Zealand",
            "Australia", "Micronesia", 3,
            1
        )
        questionsList.add(que184)

        //185
        val que185 = FlagQuestion(
            185, "What country does this flag belong to?",
            R.drawable.flag_fiji,
            "Other",
            "New Zealand", "Kiribati",
            "Fiji", "Tuvalu", 3,
            3
        )
        questionsList.add(que185)

        //186
        val que186 = FlagQuestion(
            186, "What country does this flag belong to?",
            R.drawable.flag_kiribati,
            "Other",
            "Samoa", "Marshall Islands",
            "Kiribati", "Vanuatu", 3,
            3
        )
        questionsList.add(que186)

        //187
        val que187 = FlagQuestion(
            187, "What country does this flag belong to?",
            R.drawable.flag_marshall_islands,
            "Other",
            "Papua New Guinea", "Marshall Islands",
            "Micronesia", "Australia", 2,
            3
        )
        questionsList.add(que187)

        //188
        val que188 = FlagQuestion(
            188, "What country does this flag belong to?",
            R.drawable.flag_micronesia,
            "Other",
            "Palau", "Micronesia",
            "Tuvalu", "Nauru", 2,
            2
        )
        questionsList.add(que188)

        //189
        val que189 = FlagQuestion(
            189, "What country does this flag belong to?",
            R.drawable.flag_nauru,
            "Other",
            "Marshall Islands", "Nauru",
            "Solomon Islands", "Fiji", 2,
            3
        )
        questionsList.add(que189)

        //190
        val que190 = FlagQuestion(
            190, "What country does this flag belong to?",
            R.drawable.flag_new_zealand,
            "Other",
            "New Zealand", "Australia",
            "Nauru", "Solomon Islands", 1,
            1
        )
        questionsList.add(que190)

        //191
        val que191 = FlagQuestion(
            191, "What country does this flag belong to?",
            R.drawable.flag_palau,
            "Other",
            "Palau", "Samoa",
            "Tonga", "Papua New Guinea", 1,
            2
        )
        questionsList.add(que191)

        //192
        val que192 = FlagQuestion(
            192, "What country does this flag belong to?",
            R.drawable.flag_papua_new_guinea,
            "Other",
            "Papua New Guinea", "Samoa",
            "Kiribati", "Vanuatu", 1,
            3
        )
        questionsList.add(que192)

        //193
        val que193 = FlagQuestion(
            193, "What country does this flag belong to?",
            R.drawable.flag_samoa,
            "Other",
            "Samoa", "Tuvalu",
            "Palau", "Tonga", 1,
            3
        )
        questionsList.add(que193)

        //194
        val que194 = FlagQuestion(
            194, "What country does this flag belong to?",
            R.drawable.flag_solomon_islands,
            "Other",
            "Micronesia", "New Zealand",
            "Fiji", "Solomon Islands", 4,
            3
        )
        questionsList.add(que194)

        //195
        val que195 = FlagQuestion(
            195, "What country does this flag belong to?",
            R.drawable.flag_tonga,
            "Other",
            "Samoa", "Tuvalu",
            "Palau", "Tonga", 4,
            3
        )
        questionsList.add(que195)

        //196
        val que196 = FlagQuestion(
            196, "What country does this flag belong to?",
            R.drawable.flag_tuvalu,
            "Other",
            "Nauru", "Marshall Islands",
            "Vanuatu", "Tuvalu", 4,
            3
        )
        questionsList.add(que196)

        //197
        val que197 = FlagQuestion(
            197, "What country does this flag belong to?",
            R.drawable.flag_vanuatu,
            "Other",
            "Papua New Guinea", "Samoa",
            "Kiribati", "Vanuatu", 4,
            3
        )
        questionsList.add(que197)

        return questionsList
    }

    fun getCapitalQuestions(): ArrayList<CapitalQuestion>{
        val questionsList = ArrayList<CapitalQuestion>()

        //EUROPE

        //1
        val que01 = CapitalQuestion(
            1, "What is the capital of Albania?",
            R.drawable.flag_albania,
            "Europe",
            "Tirana", "Chisinau",
            "Podgorica", "Pristina", 1,
            3
        )
        questionsList.add(que01)

        //2
        val que02 = CapitalQuestion(
            2, "What is the capital of Andorra?",
            R.drawable.flag_andorra,
            "Europe",
            "Bucharest", "Andorra la Vella",
            "Sarajevo", "San Marino", 2,
            3
        )
        questionsList.add(que02)

        //3
        val que03 = CapitalQuestion(
            3, "What is the capital of Armenia?",
            R.drawable.flag_armenia,
            "Europe",
            "Bucharest", "Vilnius",
            "Yerevan", "Riga", 3,
            3
        )
        questionsList.add(que03)

        //4
        val que04 = CapitalQuestion(
            4, "What is the capital of Austria?",
            R.drawable.flag_austria,
            "Europe",
            "Berlin", "Copenhagen",
            "Luxembourg", "Vienna", 4,
            2
        )
        questionsList.add(que04)

        //5
        val que05 = CapitalQuestion(
            5, "What is the capital of Azerbaijan?",
            R.drawable.flag_azerbaijan,
            "Europe",
            "Ankara", "Nicosia",
            "Baku", "Yerevan", 3,
            3
        )
        questionsList.add(que05)

        //6
        val que06 = CapitalQuestion(
            6, "What is the capital of Belarus?",
            R.drawable.flag_belarus,
            "Europe",
            "Tallinn", "Baku",
            "Minsk", "Kiev", 3,
            2
        )
        questionsList.add(que06)

        //7
        val que07 = CapitalQuestion(
            7, "What is the capital of Belgium?",
            R.drawable.flag_belgium,
            "Europe",
            "Berlin", "Monaco",
            "Brussels", "Budapest", 3,
            1
        )
        questionsList.add(que07)

        //8
        val que08 = CapitalQuestion(
            8, "What is the capital of Bosnia and Herzegovina?",
            R.drawable.flag_bosnia_herzegovina,
            "Europe",
            "Zagreb", "Athens",
            "Tbilisi", "Sarajevo", 4,
            3
        )
        questionsList.add(que08)

        //9
        val que09 = CapitalQuestion(
            9, "What is the capital of Bulgaria?",
            R.drawable.flag_bulgaria,
            "Europe",
            "Belgrade", "Moscow",
            "Budapest", "Sofia", 4,
            2
        )
        questionsList.add(que09)

        //10
        val que10 = CapitalQuestion(
            10, "What is the capital of Croatia?",
            R.drawable.flag_croatia,
            "Europe",
            "Skopje", "Amsterdam",
            "Ljubljana", "Zagreb", 4,
            2
        )
        questionsList.add(que10)

        //11
        val que11 = CapitalQuestion(
            11, "What is the capital of Cyprus?",
            R.drawable.flag_cyprus,
            "Europe",
            "Valletta", "Vatican City",
            "Andorra la Vella", "Nicosia", 4,
            3
        )
        questionsList.add(que11)

        //12
        val que12 = CapitalQuestion(
            12, "What is the capital of Czech Republic?",
            R.drawable.flag_czech_republic,
            "Europe",
            "Warsaw", "Prague",
            "Bratislava", "Zagreb", 2,
            1
        )
        questionsList.add(que12)

        //13
        val que13 = CapitalQuestion(
            13, "What is the capital of Denmark?",
            R.drawable.flag_denmark,
            "Europe",
            "Reykjavik", "Copenhagen",
            "Stockholm", "Helsinki", 2,
            1
        )
        questionsList.add(que13)

        //14
        val que14 = CapitalQuestion(
            14, "What is the capital of Estonia?",
            R.drawable.flag_estonia,
            "Europe",
            "Vilnius", "Tallinn",
            "Ljubljana", "Helsinki", 2,
            3
        )
        questionsList.add(que14)

        //15
        val que15 = CapitalQuestion(
            15, "What is the capital of Finland?",
            R.drawable.flag_finland,
            "Europe",
            "Minsk", "Helsinki",
            "Bratislava", "Reykjavik", 2,
            1
        )
        questionsList.add(que15)

        //16
        val que16 = CapitalQuestion(
            16, "What is the capital of France?",
            R.drawable.flag_france,
            "Europe",
            "Amsterdam", "Paris",
            "Brussels", "Rome", 2,
            1
        )
        questionsList.add(que16)

        //17
        val que17 = CapitalQuestion(
            17, "What is the capital of Georgia?",
            R.drawable.flag_georgia,
            "Europe",
            "Tbilisi", "Chisinau",
            "Copenhagen", "Riga", 1,
            3
        )
        questionsList.add(que17)

        //18
        val que18 = CapitalQuestion(
            18, "What is the capital of Germany?",
            R.drawable.flag_germany,
            "Europe",
            "Berlin", "Brussels",
            "Prague", "London", 1,
            1
        )
        questionsList.add(que18)

        //19
        val que19 = CapitalQuestion(
            19, "What is the capital of Greece?",
            R.drawable.flag_greece,
            "Europe",
            "Athens", "Podgorica",
            "Valetta", "Lisbon", 1,
            1
        )
        questionsList.add(que19)

        //20
        val que20 = CapitalQuestion(
            20, "What is the capital of Hungary?",
            R.drawable.flag_hungary,
            "Europe",
            "Sofia", "Prague",
            "Budapest", "Vilnius", 3,
            2
        )
        questionsList.add(que20)

        //21
        val que21 = CapitalQuestion(
            21, "What is the capital of Iceland?",
            R.drawable.flag_iceland,
            "Europe",
            "Dublin", "Stockholm",
            "Reykjavik", "London", 3,
            2
        )
        questionsList.add(que21)

        //22
        val que22 = CapitalQuestion(
            22, "What is the capital of Ireland?",
            R.drawable.flag_ireland,
            "Europe",
            "Bucharest", "Dublin",
            "Brussels", "Vaduz", 2,
            1
        )
        questionsList.add(que22)

        //23
        val que23 = CapitalQuestion(
            23, "What is the capital of Italy?",
            R.drawable.flag_italy,
            "Europe",
            "Dublin", "Rome",
            "Zagreb", "Vienna", 2,
            1
        )
        questionsList.add(que23)

        //24
        val que24 = CapitalQuestion(
            24, "What is the capital of Kosovo?",
            R.drawable.flag_kosovo,
            "Europe",
            "Vaduz", "Pristina",
            "Sarajevo", "Nicosia", 2,
            3
        )
        questionsList.add(que24)

        //25
        val que25 = CapitalQuestion(
            25, "What is the capital of Latvia?",
            R.drawable.flag_latvia,
            "Europe",
            "Ankara", "Skopje",
            "Berlin", "Riga", 4,
            3
        )
        questionsList.add(que25)

        //26
        val que26 = CapitalQuestion(
            26, "What is the capital of Liechtenstein?",
            R.drawable.flag_liechtenstein,
            "Europe",
            "San Marino", "Bern",
            "Valletta", "Vaduz", 4,
            3
        )
        questionsList.add(que26)

        //27
        val que27 = CapitalQuestion(
            27, "What is the capital of Lithuania?",
            R.drawable.flag_lithuania,
            "Europe",
            "Sofia", "Madrid",
            "Bucharest", "Vilnius", 4,
            3
        )
        questionsList.add(que27)

        //28
        val que28 = CapitalQuestion(
            28, "What is the capital of Luxembourg?",
            R.drawable.flag_luxembourg,
            "Europe",
            "Brussels", "Oslo",
            "Vienna", "Luxembourg", 4,
            2
        )
        questionsList.add(que28)

        //29
        val que29 = CapitalQuestion(
            29, "What is the capital of Malta?",
            R.drawable.flag_malta,
            "Europe",
            "Monaco", "Yerevan",
            "Valletta", "Minsk", 3,
            3
        )
        questionsList.add(que29)

        //30
        val que30 = CapitalQuestion(
            30, "What is the capital of Moldova?",
            R.drawable.flag_moldova,
            "Europe",
            "Baku", "Vatican City",
            "Chisinau", "Skopje", 3,
            3
        )
        questionsList.add(que30)

        //31
        val que31 = CapitalQuestion(
            31, "What is the capital of Monaco?",
            R.drawable.flag_monaco,
            "Europe",
            "Andorra la Vella", "Vienna",
            "Monaco", "Rome", 3,
            2
        )
        questionsList.add(que31)

        //32
        val que32 = CapitalQuestion(
            32, "What is the capital of Montenegro?",
            R.drawable.flag_montenegro,
            "Europe",
            "Podgorica", "Ankara",
            "Madrid", "Belgrade", 1,
            3
        )
        questionsList.add(que32)

        //33
        val que33 = CapitalQuestion(
            33, "What is the capital of the Netherlands?",
            R.drawable.flag_netherlands,
            "Europe",
            "Amsterdam", "Paris",
            "Moscow", "Oslo", 1,
            1
        )
        questionsList.add(que33)

        //CapitalQuestion
        val que34 = CapitalQuestion(
            34, "What is the capital of North Macedonia?",
            R.drawable.flag_north_macedonia,
            "Europe",
            "Skopje", "Tirana",
            "Zagreb", "Athens", 1,
            3
        )
        questionsList.add(que34)

        //35
        val que35 = CapitalQuestion(
            35, "What is the capital of Norway?",
            R.drawable.flag_norway,
            "Europe",
            "Oslo", "Reykjavik",
            "Paris", "Riga", 1,
            1
        )
        questionsList.add(que35)

        //36
        val que36 = CapitalQuestion(
            36, "What is the capital of Poland?",
            R.drawable.flag_poland,
            "Europe",
            "Prague", "Warsaw",
            "Bern", "Copenhagen", 2,
            1
        )
        questionsList.add(que36)

        //37
        val que37 = CapitalQuestion(
            37, "What is the capital of Portugal?",
            R.drawable.flag_portugal,
            "Europe",
            "Madrid", "Lisbon",
            "Rome", "Andorra la Vella", 2,
            1
        )
        questionsList.add(que37)

        //38
        val que38 = CapitalQuestion(
            38, "What is the capital of Romania?",
            R.drawable.flag_romania,
            "Europe",
            "Warsaw", "Bucharest",
            "Kiev", "Budapest", 2,
            2
        )
        questionsList.add(que38)

        //39
        val que39 = CapitalQuestion(
            39, "What is the capital of Russia?",
            R.drawable.flag_russia,
            "Europe",
            "Helsinki", "Moscow",
            "Belgrade", "Bratislava", 2,
            1
        )
        questionsList.add(que39)

        //40
        val que40 = CapitalQuestion(
            40, "What is the capital of San Marino?",
            R.drawable.flag_san_marino,
            "Europe",
            "Athens", "Luxembourg",
            "San Marino", "Kiev", 3,
            2
        )
        questionsList.add(que40)

        //41
        val que41 = CapitalQuestion(
            41, "What is the capital of Serbia?",
            R.drawable.flag_serbia,
            "Europe",
            "Ljubljana", "Moscow",
            "Tirana", "Belgrade", 4,
            2
        )
        questionsList.add(que41)

        //42
        val que42 = CapitalQuestion(
            42, "What is the capital of Slovakia?",
            R.drawable.flag_slovakia,
            "Europe",
            "Bratislava", "Warsaw",
            "Moscow", "Amsterdam", 1,
            2
        )
        questionsList.add(que42)

        //43
        val que43 = CapitalQuestion(
            43, "What is the capital of Slovenia?",
            R.drawable.flag_slovenia,
            "Europe",
            "Reykjavik", "Ljubljana",
            "Zagreb", "Brussels", 2,
            2
        )
        questionsList.add(que43)

        //44
        val que44 = CapitalQuestion(
            44, "What is the capital of Spain?",
            R.drawable.flag_spain,
            "Europe",
            "Vienna", "Madrid",
            "Dublin", "Berlin", 2,
            1
        )
        questionsList.add(que44)

        //45
        val que45 = CapitalQuestion(
            45, "What is the capital of Sweden?",
            R.drawable.flag_sweden,
            "Europe",
            "Helsinki", "Tallinn",
            "Stockholm", "Vilnius", 3,
            1
        )
        questionsList.add(que45)

        //46
        val que46 = CapitalQuestion(
            46, "What is the capital of Switzerland?",
            R.drawable.flag_switzerland,
            "Europe",
            "Madrid", "Copenhagen",
            "Ankara", "Bern", 4,
            1
        )
        questionsList.add(que46)

        //47
        val que47 = CapitalQuestion(
            47, "What is the capital of Turkey?",
            R.drawable.flag_turkey,
            "Europe",
            "Ankara", "Baku",
            "Tbilisi", "Tirana", 1,
            1
        )
        questionsList.add(que47)

        //48
        val que48 = CapitalQuestion(
            48, "What is the capital of Ukraine?",
            R.drawable.flag_ukraine,
            "Europe",
            "Kiev", "Yerevan",
            "Sofia", "Warsaw", 1,
            1
        )
        questionsList.add(que48)

        //49
        val que49 = CapitalQuestion(
            49, "What is the capital of the United Kingdom?",
            R.drawable.flag_united_kingdom,
            "Europe",
            "Reykjavik", "London",
            "Paris", "Stockholm", 2,
            1
        )
        questionsList.add(que49)

        //50
        val que50 = CapitalQuestion(
            50, "What is the capital of Vatican City?",
            R.drawable.flag_vatican_city,
            "Europe",
            "Valletta", "San Marino",
            "Vatican City", "Nicosia", 3,
            2
        )
        questionsList.add(que50)

        //AFRICA

        //51
        val que51 = CapitalQuestion(
            51, "What is the capital of Algeria?",
            R.drawable.flag_algeria,
            "Africa",
            "Tripoli", "Tunis",
            "Algiers", "Rabat", 3,
            1
        )
        questionsList.add(que51)

        //52
        val que52 = CapitalQuestion(
            52, "What is the capital of Angola?",
            R.drawable.flag_angola,
            "Africa",
            "Maputo", "Gaborone",
            "Luanda", "Windhoek", 3,
            2
        )
        questionsList.add(que52)

        //53
        val que53 = CapitalQuestion(
            53, "What is the capital of Benin?",
            R.drawable.flag_benin,
            "Africa",
            "Lomé", "Monrovia",
            "Porto-Novo", "Antananarivo", 3,
            3
        )
        questionsList.add(que53)

        //54
        val que54 = CapitalQuestion(
            54, "What is the capital of Botswana?",
            R.drawable.flag_botswana,
            "Africa",
            "Pretoria", "Mbabane",
            "Gaborone", "Malabo", 3,
            2
        )
        questionsList.add(que54)

        //55
        val que55 = CapitalQuestion(
            55, "What is the capital of Burkina Faso?",
            R.drawable.flag_burkina_faso,
            "Africa",
            "Ouagadougou", "Bamako",
            "Nouakchott", "Rabat", 1,
            3
        )
        questionsList.add(que55)

        //56
        val que56 = CapitalQuestion(
            56, "What is the capital of Burundi?",
            R.drawable.flag_burundi,
            "Africa",
            "Gitega", "Kigali",
            "Lilongwe", "Dodoma", 1,
            3
        )
        questionsList.add(que56)

        //57
        val que57 = CapitalQuestion(
            57, "What is the capital of Cape Verde?",
            R.drawable.flag_cabo_verde,
            "Africa",
            "Praia", "Moroni",
            "Banjul", "Monrovia", 1,
            2
        )
        questionsList.add(que57)

        //58
        val que58 = CapitalQuestion(
            58, "What is the capital of Cameroon?",
            R.drawable.flag_cameroon,
            "Africa",
            "Yaounde", "Dakar",
            "Niamey", "N'Djamena", 1,
            2
        )
        questionsList.add(que58)

        //59
        val que59 = CapitalQuestion(
            59, "What is the capital of the Central African Republic?",
            R.drawable.flag_central_african_republic,
            "Africa",
            "Kinshasa", "Yamoussoukro",
            "Addis Ababa", "Bangui", 4,
            2
        )
        questionsList.add(que59)

        //60
        val que60 = CapitalQuestion(
            60, "What is the capital of Chad?",
            R.drawable.flag_chad,
            "Africa",
            "Yaounde", "Brazzaville",
            "Khartoum", "N'Djamena", 4,
            2
        )
        questionsList.add(que60)

        //61
        val que61 = CapitalQuestion(
            61, "What is the capital of Comoros?",
            R.drawable.flag_comoros,
            "Africa",
            "Victoria", "Kigali",
            "São Tomé", "Moroni", 4,
            3
        )
        questionsList.add(que61)

        //62
        val que62 = CapitalQuestion(
            62, "What is the capital of the Democratic Republic of the Congo?",
            R.drawable.flag_congo_democratic_republic_of,
            "Africa",
            "Malabo", "Libreville",
            "Nairobi", "Kinshasa", 4,
            2
        )
        questionsList.add(que62)

        //63
        val que63 = CapitalQuestion(
            63, "What is the capital of the Republic of the Congo?",
            R.drawable.flag_congo,
            "Africa",
            "Bangui", "Brazzaville",
            "Abuja", "Bamako", 2,
            3
        )
        questionsList.add(que63)

        //64
        val que64 = CapitalQuestion(
            64, "What is the capital of Ivory Coast?",
            R.drawable.flag_cote_d_ivoire,
            "Africa",
            "Port Louis", "Yamoussoukro",
            "Bissau", "Addis Ababa", 2,
            2
        )
        questionsList.add(que64)

        //65
        val que65 = CapitalQuestion(
            65, "What is the capital of Djibouti?",
            R.drawable.flag_djibouti,
            "Africa",
            "Malabo", "Djibouti",
            "Mogadishu", "Asmara", 2,
            2
        )
        questionsList.add(que65)

        //66
        val que66 = CapitalQuestion(
            66, "What is the capital of Egypt?",
            R.drawable.flag_egypt,
            "Africa",
            "Algiers", "Juba",
            "Cairo", "Tripoli", 3,
            1
        )
        questionsList.add(que66)

        //67
        val que67 = CapitalQuestion(
            67, "What is the capital of Equatorial Guinea?",
            R.drawable.flag_equatorial_guinea,
            "Africa",
            "Banjul", "Accra",
            "Malabo", "Maseru", 3,
            3
        )
        questionsList.add(que67)

        //68
        val que68 = CapitalQuestion(
            68, "What is the capital of Eritrea?",
            R.drawable.flag_eritrea,
            "Africa",
            "Gitega", "Djibouti",
            "Freetown", "Asmara", 4,
            3
        )
        questionsList.add(que68)

        //69
        val que69 = CapitalQuestion(
            69, "What is the capital of Eswatini?",
            R.drawable.flag_eswatini,
            "Africa",
            "Victoria", "Maseru",
            "Maputo", "Mbabane", 4,
            3
        )
        questionsList.add(que69)

        //70
        val que70 = CapitalQuestion(
            70, "What is the capital of Ethiopia?",
            R.drawable.flag_ethiopia,
            "Africa",
            "Addis Ababa", "Abuja",
            "Nouakchott", "Cairo", 1,
            2
        )
        questionsList.add(que70)

        //71
        val que71 = CapitalQuestion(
            71, "What is the capital of Gabon?",
            R.drawable.flag_gabon,
            "Africa",
            "Libreville", "Moroni",
            "Brazzaville", "Gaborone", 1,
            3
        )
        questionsList.add(que71)

        //72
        val que72 = CapitalQuestion(
            72, "What is the capital of the Gambia?",
            R.drawable.flag_gambia,
            "Africa",
            "Dodoma", "Kampala",
            "Banjul", "Juba", 3,
            3
        )
        questionsList.add(que72)

        //73
        val que73 = CapitalQuestion(
            73, "What is the capital of Guinea?",
            R.drawable.flag_guinea,
            "Africa",
            "Freetown", "Nairobi",
            "Conakry", "Yaounde", 3,
            2
        )
        questionsList.add(que73)

        //74
        val que74 = CapitalQuestion(
            74, "What is the capital of Guinea-Bissau?",
            R.drawable.flag_guinea_bissau,
            "Africa",
            "Lomé", "Bissau",
            "Lusaka", "Pretoria", 2,
            2
        )
        questionsList.add(que74)

        //75
        val que75 = CapitalQuestion(
            75, "What is the capital of Kenya?",
            R.drawable.flag_kenya,
            "Africa",
            "Tripoli", "Nairobi",
            "Cairo", "Kampala", 2,
            1
        )
        questionsList.add(que75)

        //76
        val que76 = CapitalQuestion(
            76, "What is the capital of Lesotho?",
            R.drawable.flag_lesotho,
            "Africa",
            "Gitega", "Gaborone",
            "Nairobi", "Maseru", 4,
            3
        )
        questionsList.add(que76)

        //77
        val que77 = CapitalQuestion(
            77, "What is the capital of Liberia?",
            R.drawable.flag_liberia,
            "Africa",
            "Accra", "Antananarivo",
            "Port Louis", "Monrovia", 4,
            3
        )
        questionsList.add(que77)

        //78
        val que78 = CapitalQuestion(
            78, "What is the capital of Libya?",
            R.drawable.flag_libya,
            "Africa",
            "Tripoli", "Khartoum",
            "Nouakchott", "N'Djamena", 1,
            1
        )
        questionsList.add(que78)

        //79
        val que79 = CapitalQuestion(
            79, "What is the capital of Madagascar?",
            R.drawable.flag_madagascar,
            "Africa",
            "Antananarivo", "Mogadishu",
            "Praia", "Moroni", 1,
            2
        )
        questionsList.add(que79)

        //80
        val que80 = CapitalQuestion(
            80, "What is the capital of Malawi?",
            R.drawable.flag_malawi,
            "Africa",
            "Lilongwe", "Luanda",
            "Nairobi", "Pretoria", 1,
            3
        )
        questionsList.add(que80)

        //81
        val que81 = CapitalQuestion(
            81, "What is the capital of Mali?",
            R.drawable.flag_mali,
            "Africa",
            "Accra", "Dodoma",
            "Bamako", "Juba", 3,
            2
        )
        questionsList.add(que81)

        //82
        val que82 = CapitalQuestion(
            82, "What is the capital of Mauritania?",
            R.drawable.flag_mauritania,
            "Africa",
            "Dakar", "Tunis",
            "Nouakchott", "Rabat", 3,
            2
        )
        questionsList.add(que82)

        //83
        val que83 = CapitalQuestion(
            83, "What is the capital of Mauritius?",
            R.drawable.flag_mauritius,
            "Africa",
            "Lilongwe", "Port Louis",
            "São Tomé", "Harare", 2,
            3
        )
        questionsList.add(que83)

        //84
        val que84 = CapitalQuestion(
            84, "What is the capital of Morocco?",
            R.drawable.flag_morocco,
            "Africa",
            "Bamako", "Rabat",
            "Mogadishu", "Tunis", 2,
            1
        )
        questionsList.add(que84)

        //85
        val que85 = CapitalQuestion(
            85, "What is the capital of Mozambique?",
            R.drawable.flag_mozambique,
            "Africa",
            "Windhoek", "Maputo",
            "Harare", "Dodoma", 2,
            2
        )
        questionsList.add(que85)

        //86
        val que86 = CapitalQuestion(
            86, "What is the capital of Namibia?",
            R.drawable.flag_namibia,
            "Africa",
            "Kinshasa", "Maseru",
            "Lusaka", "Windhoek", 4,
            2
        )
        questionsList.add(que86)

        //87
        val que87 = CapitalQuestion(
            87, "What is the capital of Niger?",
            R.drawable.flag_niger,
            "Africa",
            "Djibouti", "Freetown",
            "Bissau", "Niamey", 4,
            3
        )
        questionsList.add(que87)

        //88
        val que88 = CapitalQuestion(
            88, "What is the capital of Nigeria?",
            R.drawable.flag_nigeria,
            "Africa",
            "Abuja", "Kampala",
            "Bangui", "Lusaka", 1,
            1
        )
        questionsList.add(que88)

        //89
        val que89 = CapitalQuestion(
            89, "What is the capital of Rwanda?",
            R.drawable.flag_rwanda,
            "Africa",
            "Kigali", "Dodoma",
            "Harare", "Asmara", 1,
            3
        )
        questionsList.add(que89)

        //90
        val que90 = CapitalQuestion(
            90, "What is the capital of Sao Tome and Principe?",
            R.drawable.flag_sao_tome_and_principe,
            "Africa",
            "Porto-Novo", "Niamey",
            "São Tomé", "Lomé", 3,
            1
        )
        questionsList.add(que90)

        //91
        val que91 = CapitalQuestion(
            91, "What is the capital of Senegal?",
            R.drawable.flag_senegal,
            "Africa",
            "Addis Ababa", "Conakry",
            "Dakar", "Yamoussoukro", 3,
            1
        )
        questionsList.add(que91)

        //92
        val que92 = CapitalQuestion(
            92, "What is the capital of Seychelles?",
            R.drawable.flag_seychelles,
            "Africa",
            "Moroni", "Victoria",
            "Gitega", "Antananarivo", 2,
            3
        )
        questionsList.add(que92)

        //93
        val que93 = CapitalQuestion(
            93, "What is the capital of Sierra Leone?",
            R.drawable.flag_sierra_leone,
            "Africa",
            "Bissau", "Freetown",
            "Libreville", "Juba", 2,
            3
        )
        questionsList.add(que93)

        //94
        val que94 = CapitalQuestion(
            94, "What is the capital of Somalia?",
            R.drawable.flag_somalia,
            "Africa",
            "Algiers", "Mogadishu",
            "Khartoum", "Abuja", 2,
            1
        )
        questionsList.add(que94)

        //95
        val que95 = CapitalQuestion(
            95, "What is the capital of South Africa?",
            R.drawable.flag_south_africa,
            "Africa",
            "Kampala", "Nairobi",
            "Dodoma", "Pretoria", 4,
            1
        )
        questionsList.add(que95)

        //96
        val que96 = CapitalQuestion(
            96, "What is the capital of South Sudan?",
            R.drawable.flag_south_sudan,
            "Africa",
            "Niamey", "Bamako",
            "N'Djamena", "Juba", 4,
            3
        )
        questionsList.add(que96)

        //97
        val que97 = CapitalQuestion(
            97, "What is the capital of Sudan?",
            R.drawable.flag_sudan,
            "Africa",
            "Khartoum", "Cairo",
            "Algiers", "Nouakchott", 1,
            1
        )
        questionsList.add(que97)

        //98
        val que98 = CapitalQuestion(
            98, "What is the capital of Tanzania?",
            R.drawable.flag_tanzania,
            "Africa",
            "Dodoma", "Malabo",
            "Brazzaville", "Maseru", 1,
            1
        )
        questionsList.add(que98)

        //99
        val que99 = CapitalQuestion(
            99, "What is the capital of Togo?",
            R.drawable.flag_togo,
            "Africa",
            "Accra", "Bissau",
            "Lomé", "Porto-Novo", 3,
            3
        )
        questionsList.add(que99)

        //100
        val que100 = CapitalQuestion(
            100, "What is the capital of Tunisia?",
            R.drawable.flag_tunisia,
            "Africa",
            "Dakar", "Rabat",
            "Tunis", "Cairo", 3,
            1
        )
        questionsList.add(que100)

        //101
        val que101 = CapitalQuestion(
            101, "What is the capital of Uganda?",
            R.drawable.flag_uganda,
            "Africa",
            "Harare", "Kampala",
            "Mbabane", "Luanda", 2,
            1
        )
        questionsList.add(que101)

        //102
        val que102 = CapitalQuestion(
            102, "What is the capital of Zambia?",
            R.drawable.flag_zambia,
            "Africa",
            "Abuja", "Lusaka",
            "Kigali", "Maputo", 2,
            2
        )
        questionsList.add(que102)

        //103
        val que103 = CapitalQuestion(
            103, "What is the capital of Zimbabwe?",
            R.drawable.flag_zimbabwe,
            "Africa",
            "Ouagadougou", "N'Djamena",
            "Kampala", "Harare", 4,
            2
        )
        questionsList.add(que103)

        //104
        val que104 = CapitalQuestion(
            104, "What is the capital of Ghana?",
            R.drawable.flag_ghana,
            "Africa",
            "Niamey", "Praia",
            "Addis Ababa", "Accra", 4,
            2
        )
        questionsList.add(que104)

        //ASIA

        //105
        val que105 = CapitalQuestion(
            105, "What is the capital of Afghanistan?",
            R.drawable.flag_afghanistan,
            "Asia",
            "Kuwait City", "Sana'a",
            "Baghdad", "Kabul", 4,
            2
        )
        questionsList.add(que105)

        //106
        val que106 = CapitalQuestion(
            106, "What is the capital of Bangladesh?",
            R.drawable.flag_bangladesh,
            "Asia",
            "Male", "Kuala Lumpur",
            "Kotte", "Dhaka", 4,
            3
        )
        questionsList.add(que106)

        //107
        val que107 = CapitalQuestion(
            107, "What is the capital of Bhutan?",
            R.drawable.flag_bhutan,
            "Asia",
            "Beijing", "Thimphu",
            "Ulaanbaatar", "Kathmandu", 2,
            3
        )
        questionsList.add(que107)

        //108
        val que108 = CapitalQuestion(
            108, "What is the capital of Brunei?",
            R.drawable.flag_brunei,
            "Asia",
            "Thimphu", "Bandar Seri Begawan",
            "Dili", "Vientiane", 2,
            3
        )
        questionsList.add(que108)

        //109
        val que109 = CapitalQuestion(
            109, "What is the capital of Cambodia?",
            R.drawable.flag_cambodia,
            "Asia",
            "Phnom Penh", "Vientiane",
            "Bangkok", "Ulaanbaatar", 1,
            2
        )
        questionsList.add(que109)

        //110
        val que110 = CapitalQuestion(
            110, "What is the capital of China?",
            R.drawable.flag_china,
            "Asia",
            "Beijing", "Hanoi",
            "Singapore", "Jakarta", 1,
            1
        )
        questionsList.add(que110)

        //111
        val que111 = CapitalQuestion(
            111, "What is the capital of India?",
            R.drawable.flag_india,
            "Asia",
            "Jakarta", "Tehran",
            "New Delhi", "Kathmandu", 3,
            1
        )
        questionsList.add(que111)

        //112
        val que112 = CapitalQuestion(
            112, "What is the capital of Indonesia?",
            R.drawable.flag_indonesia,
            "Asia",
            "Bangkok", "Kuala Lumpur",
            "Jakarta", "Bandar Seri Begawan", 3,
            1
        )
        questionsList.add(que112)

        //113
        val que113 = CapitalQuestion(
            113, "What is the capital of Iran?",
            R.drawable.flag_iran,
            "Asia",
            "Islamabad", "New Delhi",
            "Tehran", "Muscat", 3,
            1
        )
        questionsList.add(que113)

        //114
        val que114 = CapitalQuestion(
            114, "What is the capital of Iraq?",
            R.drawable.flag_iraq,
            "Asia",
            "Amman", "Damascus",
            "Riyadh", "Baghdad", 4,
            1
        )
        questionsList.add(que114)

        //115
        val que115 = CapitalQuestion(
            115, "What is the capital of Israel?",
            R.drawable.flag_israel,
            "Asia",
            "Tehran", "Beirut",
            "Amman", "Jerusalem", 4,
            1
        )
        questionsList.add(que115)

        //116
        val que116 = CapitalQuestion(
            116, "What is the capital of Japan?",
            R.drawable.flag_japan,
            "Asia",
            "Seoul", "Beijing",
            "Manila", "Tokyo", 4,
            1
        )
        questionsList.add(que116)

        //117
        val que117 = CapitalQuestion(
            117, "What is the capital of Jordan?",
            R.drawable.flag_jordan,
            "Asia",
            "Abu Dhabi", "Amman",
            "Riyadh", "Baghdad", 2,
            3
        )
        questionsList.add(que117)

        //118
        val que118 = CapitalQuestion(
            118, "What is the capital of Kazakhstan?",
            R.drawable.flag_kazakhstan,
            "Asia",
            "Bishkek", "Nur-Sultan",
            "Thimphu", "Ulaanbaatar", 2,
            3
        )
        questionsList.add(que118)

        //119
        val que119 = CapitalQuestion(
            119, "What is the capital of Kuwait?",
            R.drawable.flag_kuwait,
            "Asia",
            "Amman", "Kuwait City",
            "Sana'a", "Doha", 2,
            2
        )
        questionsList.add(que119)

        //120
        val que120 = CapitalQuestion(
            120, "What is the capital of Kyrgyzstan?",
            R.drawable.flag_kyrgyzstan,
            "Asia",
            "Ashgabat", "Bishkek",
            "Doha", "Kabul", 2,
            3
        )
        questionsList.add(que120)

        //121
        val que121 = CapitalQuestion(
            121, "What is the capital of Laos?",
            R.drawable.flag_laos,
            "Asia",
            "Vientiane", "Bangkok",
            "Phnom Penh", "Naypydaw", 1,
            3
        )
        questionsList.add(que121)

        //122
        val que122 = CapitalQuestion(
            122, "What is the capital of Lebanon?",
            R.drawable.flag_lebanon,
            "Asia",
            "Beirut", "Jerusalem",
            "Muscat", "Riyadh", 1,
            1
        )
        questionsList.add(que122)

        //123
        val que123 = CapitalQuestion(
            123, "What is the capital of Malaysia?",
            R.drawable.flag_malaysia,
            "Asia",
            "Kuala Lumpur", "Bandar Seri Begawan",
            "Manila", "Male", 1,
            2
        )
        questionsList.add(que123)

        //124
        val que124 = CapitalQuestion(
            124, "What is the capital of Maldives?",
            R.drawable.flag_maldives,
            "Asia",
            "Bandar Seri Begawan", "Dhaka",
            "Male", "Singapore", 3,
            3
        )
        questionsList.add(que124)

        //125
        val que125 = CapitalQuestion(
            125, "What is the capital of Mongolia?",
            R.drawable.flag_mongolia,
            "Asia",
            "Beijing", "Pyongyang",
            "Ulaanbaatar", "Phnom Penh", 3,
            2
        )
        questionsList.add(que125)

        //126
        val que126 = CapitalQuestion(
            126, "What is the capital of Myanmar?",
            R.drawable.flag_myanmar,
            "Asia",
            "New Delhi", "Dhaka",
            "Naypydaw", "Dushanbe", 3,
            2
        )
        questionsList.add(que126)

        //127
        val que127 = CapitalQuestion(
            127, "What is the capital of Nepal?",
            R.drawable.flag_nepal,
            "Asia",
            "Tashkent", "Thimphu",
            "Kathmandu", "Hanoi", 3,
            2
        )
        questionsList.add(que127)

        //128
        val que128 = CapitalQuestion(
            128, "What is the capital of North Korea?",
            R.drawable.flag_korea_north,
            "Asia",
            "Ulaanbaatar", "Beijing",
            "Phnom Penh", "Pyongyang", 4,
            1
        )
        questionsList.add(que128)

        //129
        val que129 = CapitalQuestion(
            129, "What is the capital of Oman?",
            R.drawable.flag_oman,
            "Asia",
            "Manama", "Nur-Sultan",
            "Tehran", "Muscat", 4,
            3
        )
        questionsList.add(que129)

        //130
        val que130 = CapitalQuestion(
            130, "What is the capital of Pakistan?",
            R.drawable.flag_pakistan,
            "Asia",
            "Dhaka", "Tashkent",
            "Riyadh", "Islamabad", 4,
            2
        )
        questionsList.add(que130)

        //131
        val que131 = CapitalQuestion(
            131, "What is the capital of Palestine?",
            R.drawable.flag_palestine,
            "Asia",
            "Abu Dhabi", "Amman",
            "Damascus", "Ramallah", 4,
            3
        )
        questionsList.add(que131)

        //132
        val que132 = CapitalQuestion(
            132, "What is the capital of Qatar?",
            R.drawable.flag_qatar,
            "Asia",
            "Ramallah", "Doha",
            "Sana'a", "Kuwait City", 2,
            2
        )
        questionsList.add(que132)

        //133
        val que133 = CapitalQuestion(
            133, "What is the capital of Saudi Arabia?",
            R.drawable.flag_saudi_arabia,
            "Asia",
            "Islamabad", "Riyadh",
            "Beirut", "Baghdad", 2,
            1
        )
        questionsList.add(que133)

        //134
        val que134 = CapitalQuestion(
            134, "What is the capital of Singapore?",
            R.drawable.flag_singapore,
            "Asia",
            "Tokyo", "Singapore",
            "Manila", "Kotte", 2,
            1
        )
        questionsList.add(que134)

        //135
        val que135 = CapitalQuestion(
            135, "What is the capital of South Korea?",
            R.drawable.flag_korea_south,
            "Asia",
            "Seoul", "Tokyo",
            "Kotte", "Taipei", 1,
            1
        )
        questionsList.add(que135)

        //136
        val que136 = CapitalQuestion(
            136, "What is the capital of Sri Lanka?",
            R.drawable.flag_sri_lanka,
            "Asia",
            "Kotte", "Bandar Seri Begawan",
            "Thimphu", "Male", 1,
            3
        )
        questionsList.add(que136)

        //137
        val que137 = CapitalQuestion(
            137, "What is the capital of Syria?",
            R.drawable.flag_syria,
            "Asia",
            "Damascus", "Sana'a",
            "Amman", "Baghdad", 1,
            2
        )
        questionsList.add(que137)

        //138
        val que138 = CapitalQuestion(
            138, "What is the capital of Taiwan?",
            R.drawable.flag_taiwan,
            "Asia",
            "Taipei", "Beijing",
            "Phnom Penh", "Dili", 1,
            2
        )
        questionsList.add(que138)

        //139
        val que139 = CapitalQuestion(
            139, "What is the capital of Tajikistan?",
            R.drawable.flag_tajikistan,
            "Asia",
            "Ashgabat", "Tehran",
            "Dushanbe", "Doha", 3,
            3
        )
        questionsList.add(que139)

        //140
        val que140 = CapitalQuestion(
            140, "What is the capital of Thailand?",
            R.drawable.flag_thailand,
            "Asia",
            "Dhaka", "Phnom Penh",
            "Bangkok", "Vientiane", 3,
            1
        )
        questionsList.add(que140)

        //141
        val que141 = CapitalQuestion(
            141, "What is the capital of Timor-Leste?",
            R.drawable.flag_timor_leste,
            "Asia",
            "Jakarta", "Hanoi",
            "Dili", "Islamabad", 3,
            3
        )
        questionsList.add(que141)

        //142
        val que142 = CapitalQuestion(
            142, "What is the capital of Turkmenistan?",
            R.drawable.flag_turkmenistan,
            "Asia",
            "Tashkent", "Nur-Sultan",
            "Ashgabat", "Dushanbe", 3,
            3
        )
        questionsList.add(que142)

        //143
        val que143 = CapitalQuestion(
            143, "What is the capital of the United Arab Emirates?",
            R.drawable.flag_united_arab_emirates,
            "Asia",
            "Baghdad", "Ramallah",
            "Beirut", "Abu Dhabi", 4,
            2
        )
        questionsList.add(que143)

        //144
        val que144 = CapitalQuestion(
            144, "What is the capital of Uzbekistan?",
            R.drawable.flag_uzbekistan,
            "Asia",
            "Kathmandu", "Nur-Sultan",
            "Tehran", "Tashkent", 4,
            3
        )
        questionsList.add(que144)

        //145
        val que145 = CapitalQuestion(
            145, "What is the capital of Vietnam?",
            R.drawable.flag_vietnam,
            "Asia",
            "Dushanbe", "Beijing",
            "Vientiane", "Hanoi", 4,
            2
        )
        questionsList.add(que145)

        //146
        val que146 = CapitalQuestion(
            146, "What is the capital of Yemen?",
            R.drawable.flag_yemen,
            "Asia",
            "Kabul", "Baghdad",
            "Kuwait City", "Sana'a", 4,
            2
        )
        questionsList.add(que146)

        //147
        val que147 = CapitalQuestion(
            147, "What is the capital of the Philippines?",
            R.drawable.flag_philippines,
            "Asia",
            "Tokyo", "Manila",
            "Dhaka", "Dushanbe", 2,
            2
        )
        questionsList.add(que147)

        //148
        val que148 = CapitalQuestion(
            148, "What is the capital of Bahrain?",
            R.drawable.flag_bahrain,
            "Asia",
            "Abu Dhabi", "Doha",
            "Kuwait City", "Manama", 4,
            2
        )
        questionsList.add(que148)

        //149
        val que149 = CapitalQuestion(
            149, "What is the capital of Antigua and Barbuda?",
            R.drawable.flag_antigua,
            "America",
            "Bridgetown", "Nassau",
            "Kingston", "Saint John's", 4,
            3
        )
        questionsList.add(que149)

        //150
        val que150 = CapitalQuestion(
            150, "What is the capital of Bahamas?",
            R.drawable.flag_bahamas,
            "America",
            "Belmoopan", "Roseau",
            "Guatemala City", "Nassau", 4,
            2
        )
        questionsList.add(que150)

        //151
        val que151 = CapitalQuestion(
            151, "What is the capital of Barbados?",
            R.drawable.flag_barbados,
            "America",
            "San Jose", "Saint John's",
            "Castries", "Bridgetown", 4,
            3
        )
        questionsList.add(que151)

        //152
        val que152 = CapitalQuestion(
            152, "What is the capital of Belize?",
            R.drawable.flag_belize,
            "America",
            "Tegucigalpa", "Saint George's",
            "Belmopan", "Port-au-Prince", 3,
            3
        )
        questionsList.add(que152)

        //153
        val que153 = CapitalQuestion(
            153, "What is the capital of Canada?",
            R.drawable.flag_canada,
            "America",
            "Kingston", "Washington D.C.",
            "Ottawa", "Mexico City", 3,
            1
        )
        questionsList.add(que153)

        //154
        val que154 = CapitalQuestion(
            154, "What is the capital of Costa Rica?",
            R.drawable.flag_costa_rica,
            "America",
            "Kingstown", "San Salvador",
            "San Jose", "Managua", 3,
            2
        )
        questionsList.add(que154)

        //155
        val que155 = CapitalQuestion(
            155, "What is the capital of Cuba?",
            R.drawable.flag_cuba,
            "America",
            "Washington D.C.", "Havana",
            "Santo Domingo", "San Jose", 2,
            1
        )
        questionsList.add(que155)

        //156
        val que156 = CapitalQuestion(
            156, "What is the capital of Dominica?",
            R.drawable.flag_dominica,
            "America",
            "Havana", "Roseau",
            "Saint George's", "Port-au-Prince", 2,
            3
        )
        questionsList.add(que156)

        //157
        val que157 = CapitalQuestion(
            157, "What is the capital of the Dominican Republic?",
            R.drawable.flag_dominican_republic,
            "America",
            "San Salvador", "Santo Domingo",
            "Panama City", "Mexico City", 2,
            2
        )
        questionsList.add(que157)

        //158
        val que158 = CapitalQuestion(
            158, "What is the capital of El Salvador?",
            R.drawable.flag_el_salvador,
            "America",
            "San Salvador", "Havana",
            "Port-au-Prince", "Panama City", 1,
            2
        )
        questionsList.add(que158)

        //159
        val que159 = CapitalQuestion(
            159, "What is the capital of Grenada?",
            R.drawable.flag_grenada,
            "America",
            "Saint George's", "Nassau",
            "Saint John's", "Belmopan", 1,
            3
        )
        questionsList.add(que159)

        //160
        val que160 = CapitalQuestion(
            160, "What is the capital of Guatemala?",
            R.drawable.flag_guatemala,
            "America",
            "Guatemala City", "Basseterre",
            "Washington D.C.", "Tegucigalpa", 1,
            1
        )
        questionsList.add(que160)

        //161
        val que161 = CapitalQuestion(
            161, "What is the capital of Haiti?",
            R.drawable.flag_haiti,
            "America",
            "Port of Spain", "Santo Domingo",
            "Castries", "Port-au-Prince", 4,
            2
        )
        questionsList.add(que161)

        //162
        val que162 = CapitalQuestion(
            162, "What is the capital of Honduras?",
            R.drawable.flag_honduras,
            "America",
            "Panama city", "Roseau",
            "Belmopan", "Tegucigalpa", 4,
            2
        )
        questionsList.add(que162)

        //163
        val que163 = CapitalQuestion(
            163, "What is the capital of Jamaica?",
            R.drawable.flag_jamaica,
            "America",
            "San Salvador", "Kingston",
            "Havana", "San Jose", 2,
            1
        )
        questionsList.add(que163)

        //164
        val que164 = CapitalQuestion(
            164, "What is the capital of Mexico?",
            R.drawable.flag_mexico,
            "America",
            "Bridgetown", "Mexico City",
            "Kingston", "Roseau", 2,
            1
        )
        questionsList.add(que164)

        //165
        val que165 = CapitalQuestion(
            165, "What is the capital of Nicaragua?",
            R.drawable.flag_nicaragua,
            "America",
            "Saint John's", "San Salvador",
            "Managua", "Castries", 3,
            2
        )
        questionsList.add(que165)

        //166
        val que166 = CapitalQuestion(
            166, "What is the capital of Panama?",
            R.drawable.flag_panama,
            "America",
            "Guatemala City", "Basseterre",
            "Panama City", "San Jose", 3,
            2
        )
        questionsList.add(que166)

        //167
        val que167 = CapitalQuestion(
            167, "What is the capital of St. Kitts and Nevis?",
            R.drawable.flag_st_kitts_nevis,
            "America",
            "Port-au-Prince", "Port of Spain",
            "Basseterre", "Nassau", 3,
            3
        )
        questionsList.add(que167)

        //168
        val que168 = CapitalQuestion(
            168, "What is the capital of St. Lucia?",
            R.drawable.flag_st_lucia,
            "America",
            "Saint George's", "Managua",
            "Castries", "Panama City", 3,
            3
        )
        questionsList.add(que168)

        //169
        val que169 = CapitalQuestion(
            169, "What is the capital of St. Vincent and the Grenadines?",
            R.drawable.flag_st_vincent_the_grenadines,
            "America",
            "Kingstown", "Mexico City",
            "Nassau", "Bridgetown", 1,
            3
        )
        questionsList.add(que169)

        //170
        val que170 = CapitalQuestion(
            170, "What is the capital of Trinidad and Tobago?",
            R.drawable.flag_trinidad_and_tobago,
            "America",
            "Port of Spain", "Kingstown",
            "Port-au-Prince", "Havana", 1,
            2
        )
        questionsList.add(que170)

        //171
        val que171 = CapitalQuestion(
            171, "What is the capital of the United States of America?",
            R.drawable.flag_united_states_of_america,
            "America",
            "Washington D.C.", "Ottawa",
            "Mexico City", "Panama City", 1,
            1
        )
        questionsList.add(que171)

        //172
        val que172 = CapitalQuestion(
            172, "What is the capital of Argentina?",
            R.drawable.flag_argentina,
            "America",
            "Buenos Aires", "Santiago",
            "Brasilia", "Montevideo", 1,
            1
        )
        questionsList.add(que172)

        //173
        val que173 = CapitalQuestion(
            173, "What is the capital of Bolivia?",
            R.drawable.flag_bolivia,
            "America",
            "Sucre", "Georgetown",
            "Quito", "Bogotá", 1,
            2
        )
        questionsList.add(que173)

        //174
        val que174 = CapitalQuestion(
            174, "What is the capital of Brazil?",
            R.drawable.flag_brazil,
            "America",
            "Sucre", "Buenos Aires",
            "Bogotá", "Brasilia", 4,
            1
        )
        questionsList.add(que174)

        //175
        val que175 = CapitalQuestion(
            175, "What is the capital of Chile?",
            R.drawable.flag_chile,
            "America",
            "Asunción", "Buenos Aires",
            "Montevideo", "Santiago", 4,
            1
        )
        questionsList.add(que175)

        //176
        val que176 = CapitalQuestion(
            176, "What is the capital of Colombia?",
            R.drawable.flag_colombia,
            "America",
            "Sucre", "Caracas",
            "Quito", "Bogotá", 4,
            1
        )
        questionsList.add(que176)

        //177
        val que177 = CapitalQuestion(
            177, "What is the capital of Ecuador?",
            R.drawable.flag_ecuador,
            "America",
            "Lima", "Caracas",
            "Paramaribo", "Quito", 4,
            2
        )
        questionsList.add(que177)

        //178
        val que178 = CapitalQuestion(
            178, "What is the capital of Guyana?",
            R.drawable.flag_guyana,
            "America",
            "Paramaribo", "Georgetown",
            "Asunción", "Brasilia", 2,
            3
        )
        questionsList.add(que178)

        //179
        val que179 = CapitalQuestion(
            179, "What is the capital of Paraguay?",
            R.drawable.flag_paraguay,
            "America",
            "Sucre", "Asunción",
            "Lima", "Santiago", 2,
            2
        )
        questionsList.add(que179)

        //180
        val que180 = CapitalQuestion(
            180, "What is the capital of Peru?",
            R.drawable.flag_peru,
            "America",
            "Montevideo", "Lima",
            "Bogotá", "Georgetown", 2,
            2
        )
        questionsList.add(que180)

        //181
        val que181 = CapitalQuestion(
            181, "What is the capital of Suriname?",
            R.drawable.flag_suriname,
            "America",
            "Georgetown", "Paramaribo",
            "Asunción", "Brasilia", 2,
            3
        )
        questionsList.add(que181)

        //182
        val que182 = CapitalQuestion(
            182, "What is the capital of Uruguay?",
            R.drawable.flag_uruguay,
            "America",
            "Santiago", "Sucre",
            "Montevideo", "Buenos Aires", 3,
            1
        )
        questionsList.add(que182)

        //183
        val que183 = CapitalQuestion(
            183, "What is the capital of Venezuela?",
            R.drawable.flag_venezuela,
            "America",
            "Paramaribo", "Quito",
            "Caracas", "Lima", 3,
            1
        )
        questionsList.add(que183)

        //OTHER

        //184
        val que184 = CapitalQuestion(
            184, "What is the capital of Australia?",
            R.drawable.flag_australia,
            "Other",
            "Suva", "Wellington",
            "Canberra", "Palikir", 3,
            1
        )
        questionsList.add(que184)

        //185
        val que185 = CapitalQuestion(
            185, "What is the capital of Fiji?",
            R.drawable.flag_fiji,
            "Other",
            "Wellington", "Tarawa",
            "Suva", "Funafuti", 3,
            3
        )
        questionsList.add(que185)

        //186
        val que186 = CapitalQuestion(
            186, "What is the capital of Kiribati?",
            R.drawable.flag_kiribati,
            "Other",
            "Apia", "Majuro",
            "Tarawa", "Port Vila", 3,
            3
        )
        questionsList.add(que186)

        //187
        val que187 = CapitalQuestion(
            187, "What is the capital of the Marshall Islands?",
            R.drawable.flag_marshall_islands,
            "Other",
            "Port Moresby", "Majuro",
            "Palikir", "Canberra", 2,
            3
        )
        questionsList.add(que187)

        //188
        val que188 = CapitalQuestion(
            188, "What is the capital of Micronesia?",
            R.drawable.flag_micronesia,
            "Other",
            "Ngerulmud", "Palikir",
            "Funafuti", "Yaren", 2,
            2
        )
        questionsList.add(que188)

        //189
        val que189 = CapitalQuestion(
            189, "What is the capital of Nauru?",
            R.drawable.flag_nauru,
            "Other",
            "Majuro", "Yaren",
            "Honiara", "Suva", 2,
            3
        )
        questionsList.add(que189)

        //190
        val que190 = CapitalQuestion(
            190, "What is the capital of New Zealand?",
            R.drawable.flag_new_zealand,
            "Other",
            "Wellington", "Canberra",
            "Yaren", "Honiara", 1,
            1
        )
        questionsList.add(que190)

        //191
        val que191 = CapitalQuestion(
            191, "What is the capital of Palau?",
            R.drawable.flag_palau,
            "Other",
            "Ngerulmud", "Apia",
            "Nuku'alofa", "Port Moresby", 1,
            3
        )
        questionsList.add(que191)

        //192
        val que192 = CapitalQuestion(
            192, "What is the capital of Papua New Guinea?",
            R.drawable.flag_papua_new_guinea,
            "Other",
            "Port Moresby", "Apia",
            "Tarawa", "Port Vila", 1,
            3
        )
        questionsList.add(que192)

        //193
        val que193 = CapitalQuestion(
            193, "What is the capital of Samoa?",
            R.drawable.flag_samoa,
            "Other",
            "Apia", "Funafuti",
            "Ngerulmud", "Nuku'alofa", 1,
            3
        )
        questionsList.add(que193)

        //194
        val que194 = CapitalQuestion(
            194, "What is the capital of the Solomon Islands?",
            R.drawable.flag_solomon_islands,
            "Other",
            "Palikir", "Wellington",
            "Suva", "Honiara", 4,
            3
        )
        questionsList.add(que194)

        //195
        val que195 = CapitalQuestion(
            195, "What is the capital of Tonga?",
            R.drawable.flag_tonga,
            "Other",
            "Apia", "Funafuti",
            "Ngerulmud", "Nuku'alofa", 4,
            3
        )
        questionsList.add(que195)

        //196
        val que196 = CapitalQuestion(
            196, "What is the capital of Tuvalu?",
            R.drawable.flag_tuvalu,
            "Other",
            "Yaren", "Majuro",
            "Port Vila", "Funafuti", 4,
            3
        )
        questionsList.add(que196)

        //197
        val que197 = CapitalQuestion(
            197, "What is the capital of Vanuatu?",
            R.drawable.flag_vanuatu,
            "Other",
            "Port Moresby", "Apia",
            "Tarawa", "Port Vila", 4,
            3
        )
        questionsList.add(que197)

        return questionsList
    }

    fun getDifficulty(diff: Int): Int{
        if (diff == 1)
            return QUIZZ_DIFFICULTY_MAX_EASY
        return QUIZZ_DIFFICULTY_MAX_MEDIUM
    }

    fun getDifficultyAll(diff: Int): Int{
        if (diff == 1)
            return QUIZZ_DIFFICULTY_MAX_EASY_ALL
        return QUIZZ_DIFFICULTY_MAX_MEDIUM_ALL
    }
}