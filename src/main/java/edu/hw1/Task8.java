package edu.hw1;

class Task8 {

    private Task8() {}

    private final static int[][] KNIGHT_MOVES =
        new int[][] {{-1, -2}, {-1, 2}, {1, -2}, {1, 2}, {-2, -1}, {-2, 1}, {2, -1}, {2, 1}};
    private final static int DIM = 8;

    public static boolean knightBoardCapture(int[][] board) {
        for (int i = 0; i < Task8.DIM; i++) {
            for (int j = 0; j < Task8.DIM; j++) {
                if (board[i][j] == 0 || Task8.checkMoves(board, new int[] {i, j})) {
                    continue;
                }
                return false;
            }
        }
        return true;
    }

    public static boolean checkMoves(int[][] board, int[] position) {

        for (int[] knightMove : Task8.KNIGHT_MOVES) {

            int[] square = {position[0] + knightMove[0], position[1] + knightMove[1]};

                 if (square[0] < 0 || square[1] < 0 || square[0] >= Task8.DIM || square[1] >= Task8.DIM) {
                     continue;
                 }
                 if (board[square[0]][square[1]] == 1) {
                     return false;
                 }
             }

        return true;
    }
}
