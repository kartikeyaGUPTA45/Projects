package board;

import java.util.*;
import triple.Triple;

public class Board {
    public int size ;
    public int matrix[][];
    public Board(int size) {
        this.size = size;
        this.matrix = new int[size][size];
    }


    public void printBoard() {
        for(int i=0;i<this.size;i++) {
            for(int j=0;j<this.size;j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }

    public void setUpBoardConfig(int row, int col, int val) {
        this.matrix[row][col] = val;
    }

    public void setUpColumnwise(int row, List<Integer> col, List<Integer> val) {
        for(int i=0;i<col.size();i++) {
            this.matrix[row][col.get(i)] = val.get(i); 
        }
    }

    public void setUpBoard(List<Triple> triple) {
        for(int i=0;i<triple.size();i++) {
            matrix[triple.get(i).row][triple.get(i).col] = triple.get(i).val;
        }
    }
}
