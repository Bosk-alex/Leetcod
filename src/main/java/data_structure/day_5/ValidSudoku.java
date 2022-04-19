package data_structure.day_5;

import java.util.*;

public class ValidSudoku {
    public boolean isValidSudoku(char[][] board) {
        List<Set<Character>> listOfRows = getListOfRows(board);
        List<Set<Character>> listOfColumns = getListOfCols(board);
        List<Set<Character>> listOfSquares = getListOfSquares(board);
        Set<Character> numbers = new HashSet<>(List.of('1', '2', '3', '4', '5', '6', '7', '8', '9'));

        for (int round = 0; round < 10; round++) {
            int emptyCells = 0;
            for (int row = 0; row < 9; row++) {
                for (int col = 0; col < 9; col++) {
                    if (board[row][col] != '.') continue;

                    int sets = getSetsIndex(row, col);
                    Set<Character> cellSet = new HashSet<>(listOfRows.get(sets / 100));
                    cellSet.addAll(listOfColumns.get(sets % 100 / 10));
                    cellSet.addAll(listOfSquares.get(sets % 10));
                    if (cellSet.size() == 9) return false;
                    if (cellSet.size() < 8) {
                        emptyCells++;
                        continue;
                    }

                    for (Character number : numbers) {
                        if (!cellSet.contains(number)) {
                            board[row][col] = number;
                            emptyCells--;
                        }
                    }
                }
            }
            System.out.println(emptyCells);
            System.out.println(Arrays.deepToString(board));
        }

        return false;
    }

    List<Set<Character>> getListOfRows(char[][] board) {
        List<Set<Character>> listOfRows = new ArrayList<>(9);
        for (int row = 0; row < 9; row++) {
            Set<Character> newRow = new HashSet<>();
            for (int col = 0; col < 9; col++) {
                newRow.add(board[row][col]);
            }
            newRow.remove('.');
            listOfRows.add(newRow);
        }

        return listOfRows;
    }

    List<Set<Character>> getListOfCols(char[][] board) {
        List<Set<Character>> listOfColumns = new ArrayList<>(9);

        for (int col = 0; col < 9; col++) {
            Set<Character> newColumn = new HashSet<>();
            for (int row = 0; row < 9; row++) {
                newColumn.add(board[row][col]);
            }
            newColumn.remove('.');
            listOfColumns.add(newColumn);
        }
        return listOfColumns;
    }

    List<Set<Character>> getListOfSquares(char[][] board) {
        List<Set<Character>> listOfSquares = new ArrayList<>(9);

        for (int square = 0; square < 9; square++) {
            Set<Character> newSquare = new HashSet<>();
            int rowOffset = square / 3 * 3;
            int colOffset = square * 3 % 9;
            for (int row = 0; row < 3; row++) {
                for (int col = 0; col < 3; col++) {
                    newSquare.add(board[row + rowOffset][col + colOffset]);
                }
            }
            newSquare.remove('.');
            listOfSquares.add(newSquare);
        }
        return listOfSquares;
    }

    int getSetsIndex(int row, int col) {
        return row * 100 + col * 10 + row / 3 * 3 + col / 3;
    }
}
