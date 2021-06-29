package utils

import minesweeper.utils.generateUniqueNumbers
import org.junit.Assert
import org.junit.Test

class UtilsTest {

    @Test
    fun testGenerateUniqueNumbers_returnsCorrectSize() {
        Assert.assertEquals(generateUniqueNumbers(30, 10).size, 10)
    }
}