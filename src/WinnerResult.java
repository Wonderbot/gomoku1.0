package Gomoku;

import Gomoku.home.DataSet;

public interface WinnerResult {
    boolean winnerExists();

    DataSet<Cell> getWinnerCells();
}
