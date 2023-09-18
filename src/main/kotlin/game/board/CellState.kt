package game.board

enum class CellState {
    NONE, X, O;

    override fun toString(): String {
        return when (this) {
            X -> "x"
            O -> "o"
            NONE -> " "
        }
    }
}