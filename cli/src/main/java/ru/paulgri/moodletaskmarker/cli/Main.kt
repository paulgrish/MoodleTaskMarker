package ru.paulgri.moodletaskmarker.cli

import ru.paulgri.moodletaskmarker.moodlecore.MoodleClient

fun main() {
    println("Hello from CLI module")
    println(MoodleClient.stubMessage())
}