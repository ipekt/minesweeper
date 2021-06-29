package minesweeper

import minesweeper.utils.generateUniqueNumbers

class Board(val fieldSize: Int = 9, val mineCount: Int = 10) {

    private var boardSize: Int = fieldSize * fieldSize
    private var board: CharArray


    init {
        board = CharArray(boardSize)
        board.fill('.')
        setMines()
    }

    fun renderDefaultBoard() {
        val defaultBoard = board
        defaultBoard.fill('.')
        renderBoard(defaultBoard)
    }

    fun renderBoardWithMinesVisible() {
        renderBoard(board)
    }

    private fun setMines() {
        generateUniqueNumbers(boardSize, mineCount).forEach {
            board[it] = 'X'
        }
    }

    private fun renderBoard(board: CharArray) {
        board.forEachIndexed { index, value ->
            if ((index + 1) % fieldSize == 0) {
                print("$value\n")
            } else {
                print("$value")
            }
        }
    }

}