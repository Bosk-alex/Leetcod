package data_structure.day_5;

import java.util.*;

public class ValidSudoku2 {
    public boolean isValidSudoku(char[][] board) {
        for (int row = 0; row < 9; row++) {
            Set<Character> newRow = new HashSet<>();
            for (int col = 0; col < 9; col++) {
                if (board[row][col] == '.') continue;
                if (!newRow.add(board[row][col])) return false;
            }
        }
        for (int col = 0; col < 9; col++) {
            Set<Character> newColumn = new HashSet<>();
            for (int row = 0; row < 9; row++) {
                if (board[row][col] == '.') continue;
                if (!newColumn.add(board[row][col])) return false;
            }
        }
        for (int square = 0; square < 9; square++) {
            Set<Character> newSquare = new HashSet<>();
            int rowOffset = square / 3 * 3;
            int colOffset = square * 3 % 9;
            for (int row = 0; row < 3; row++) {
                for (int col = 0; col < 3; col++) {
                    if (board[row + rowOffset][col + colOffset] == '.') continue;
                    if (!newSquare.add(board[row + rowOffset][col + colOffset])) return false;
                }
            }
        }

        return true;
    }
}
