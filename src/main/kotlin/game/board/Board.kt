package game.board

class Board {
    private val board: List<List<CellState>> = listOf(
        listOf(CellState.NONE, CellState.NONE, CellState.NONE),
        listOf(CellState.NONE, CellState.NONE, CellState.NONE),
        listOf(CellState.NONE, CellState.NONE, CellState.NONE),
    )

    override fun toString(): String {
        return  "   |   |   " + "\n" +
                "---.---.---" + "\n" +
                "   |   |   " + "\n" +
                "---.---.---" + "\n" +
                "   |   |   "
    }
}