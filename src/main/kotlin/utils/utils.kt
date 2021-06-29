package minesweeper.utils

import kotlin.random.Random

// Generates random set of unique numbers for the given size
fun generateUniqueNumbers(limit: Int, size: Int): Set<Int> {
    var uniqueNumbers = emptySet<Int>()
    for (i in 0 until size) {
        uniqueNumbers = generateUniqueNumber(uniqueNumbers, limit)
    }
    return uniqueNumbers;
}

fun generateUniqueNumber(uniqueNumbers: Set<Int>, limit: Int): Set<Int> {
    val randomNumber = Random.Default.nextInt(0, limit)
    if (!uniqueNumbers.contains(randomNumber)) {
        return uniqueNumbers + randomNumber
    }
    return generateUniqueNumber(uniqueNumbers, limit)
}