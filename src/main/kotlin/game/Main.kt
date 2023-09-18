package game

fun main(args: Array<String>) {
    println("Tic-Tac-Toe")

    println(boardAsString())
}

fun boardAsString(): String {
    return  "   |   |   " + "\n" +
            "---.---.---" + "\n" +
            "   |   |   " + "\n" +
            "---.---.---" + "\n" +
            "   |   |   "
}