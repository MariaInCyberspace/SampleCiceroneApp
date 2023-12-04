package maria.incyberspace.test

object StringsSource {
    private val texts = listOf(
        "Whatever you are, be a good one.",
        "You talkin' to me?",
        "There's no place like home.",
        "To err is human; to forgive, divine.",
        "I haven’t failed. I’ve just found 10,000 ways that won’t work.",
        "Life shrinks or expands in proportion to one’s courage.",
        "Life has no limitations, except the ones you make.",
        "Believe you can and you’re halfway there.",
        "Happiness is not a goal; it is a by-product.",
        "Can February March? No, but April May.",
        "Need an ark to save two of every animal? I noah guy.",
        "Getting the ability to fly would be so uplifting.",
        "How did the picture end up in jail? It was framed!",
        "What did the buffalo say to his son? Bison.",
        "Time flies like an arrow. Fruit flies like a banana.",
        "Never trust an atom, they make up everything!",
        "I made a pun about the wind but it blows.",
        "Paper from trees can be recycled 6 times.",
        "A glass bottle can take up to 1 million years to decompose.",
        "Ants weigh more than humans",
        "The word \"atom\" comes from the Greek word for \"uncuttable\" or \"undivided.\"",
        "Atoms are very small. The average atom is about one-tenth of a billionth of a meter across.",
        "Wolves can go more than a week without eating."
    )

    fun randomText() = texts.random()
}