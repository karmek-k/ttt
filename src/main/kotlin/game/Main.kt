package game

import game.board.Board
import game.board.CellState
import java.lang.Exception

fun main() {
    println("Tic-Tac-Toe")
    println()

    val p1 = getPlayerSymbol("Player 1")
    val p2 = getPlayerSymbol("Player 2")

    val board = Board()
    println(board)
}

fun getPlayerSymbol(playerName: String): CellState {
    var symbol: String
    var hasFailed = false

    do {
        if (hasFailed) {
            println()
            println("Invalid symbol!")
        }

        print("Select symbol for $playerName (x or o): ")
        symbol = readln()

        hasFailed = true
    } while (!isSymbolValid(symbol))

    return when (symbol) {
        "x", "X" -> CellState.X
        "o", "O" -> CellState.O
        else -> throw Exception("this shouldn't happen")
    }
}

fun isSymbolValid(symbol: String): Boolean {
    return symbol == "x" || symbol == "X" || symbol == "o" || symbol == "O"
}