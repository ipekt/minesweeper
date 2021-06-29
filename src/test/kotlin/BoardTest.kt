import minesweeper.Board
import org.junit.After
import org.junit.Assert.assertEquals
import org.junit.Before
import org.junit.Test
import java.io.ByteArrayOutputStream
import java.io.PrintStream


class BoardTest {

    private val outContent = ByteArrayOutputStream()
    private val errContent = ByteArrayOutputStream()
    private val originalOut = System.out
    private val originalErr = System.err


    @Before
    fun setUpStreams() {
        System.setOut(PrintStream(outContent))
        System.setErr(PrintStream(errContent))
    }

    @Test
    fun testPrintStreamWorks() {
        print("hello")
        assertEquals("hello", outContent.toString())
    }

    @Test
    fun testDefaultBoard() {
        Board(9).renderDefaultBoard()
        assertEquals(
            ".........\n" +
                    ".........\n" +
                    ".........\n" +
                    ".........\n" +
                    ".........\n" +
                    ".........\n" +
                    ".........\n" +
                    ".........\n" +
                    ".........\n", outContent.toString()
        )
    }

    @Test
    fun testBoardWithMinesVisible() {
        Board(9, 10).renderBoardWithMinesVisible();
        assertEquals(10, outContent.toString().count { it == 'X' })
    }


    @After
    fun restoreStreams() {
        System.setOut(originalOut)
        System.setErr(originalErr)
    }
}

