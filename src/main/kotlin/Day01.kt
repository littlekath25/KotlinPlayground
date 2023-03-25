package aoc.day01

import java.io.File
import java.io.BufferedReader
fun main() {
    val bufferedReader: BufferedReader = File("src/main/resources/Day01.txt").bufferedReader()
    val input: List<Int> = bufferedReader.readText().split("\n\n").map{it.split("\n").map{it.toInt()}.sum()}

    val part1 = input.max()
    val part2 = input.sorted().reversed().take(3).sum()

    println("Part 1: $part1")
    println("Part 2: $part2")
}