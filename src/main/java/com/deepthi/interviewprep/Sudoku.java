package com.deepthi.interviewprep;

import java.util.HashSet;
import java.util.Set;

public class Sudoku {
    //Determine if a 9 x 9 Sudoku board is valid. Only the filled cells need to be validated according to the following rules:
    //
    //Each row must contain the digits 1-9 without repetition.
    //Each column must contain the digits 1-9 without repetition.
    //Each of the nine 3 x 3 sub-boxes of the grid must contain the digits 1-9 without repetition.
    public boolean isValidSudoku(char[][] board) {
        //board.length = 9
        //board[i].length = 9
        //board[i][j]  is a digit 1-9 or '.'.


        Set<String> seen = new HashSet<>();

        for(int row = 0; row < 9 ; row ++ ){
            for(int col = 0; col < 9 ; col ++){

                char num = board[row][col];
                if(num == '.'){
                    continue;
                }

                int box = (row/3)*3 + col/3;

                if((!seen.add(num + "in row" + row))||
                        (!seen.add(num + "in col" + col))||
                        (!seen.add(num + "in box" + box))){
                    return false;
                }
            }
        }

        return true;
    }

}
