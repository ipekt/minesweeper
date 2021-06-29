import minesweeper.Board
import java.util.*

fun main() {
    print("How many mines do you want on the field? > ")
    val scanner = Scanner(System.`in`)
    val mineCount = scanner.nextInt()
    Board(9, mineCount).renderBoardWithMinesVisible()
}