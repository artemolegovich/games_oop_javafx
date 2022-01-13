package ru.job4j.puzzle;

public class Win {
    public static boolean check(int[][] board) {
        boolean result = false;
        for (int i = 0; i < board.length; i++) {
            if (board[i][i] == 1 && (checkHorisontal(board, i) || checkVertical(board, i))) {
                result = true;
                break;
            }
        }
        return result;
    }

    public static boolean checkHorisontal(int[][] board, int row) {
        boolean rsl = true;
        for (int cells = 0; cells < board[row].length; cells++) {
            if (board[row][cells] != 1) {
                rsl = false;
                break;
            }
        }
        return rsl;
    }

    public static boolean checkVertical(int[][] board, int column) {
        boolean rsl = true;
        for (int[] elements : board) {
            if (elements[column] != 1) {
                rsl = false;
                break;
            }
        }
        return rsl;
    }
}
