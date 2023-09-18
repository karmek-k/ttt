package game.board

class Board {
    private val board: List<List<CellState>> = listOf(
        listOf(CellState.NONE, CellState.NONE, CellState.NONE),
        listOf(CellState.NONE, CellState.NONE, CellState.NONE),
        listOf(CellState.NONE, CellState.NONE, CellState.NONE),
    )

    override fun toString(): String {
        // TODO: improve this
        return  " ${this.board[0][0]} | ${this.board[0][1]} | ${this.board[0][2]}" + "\n" +
                "---.---.---" + "\n" +
                " ${this.board[1][0]} | ${this.board[1][1]} | ${this.board[1][2]}" + "\n" +
                "---.---.---" + "\n" +
                " ${this.board[2][0]} | ${this.board[2][1]} | ${this.board[2][2]}"
    }
}