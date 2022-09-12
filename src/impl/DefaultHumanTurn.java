package Gomoku.impl;

import Gomoku.Cell;
import Gomoku.CellValue;
import Gomoku.GameTable;
import Gomoku.HumanTurn;

import java.util.Objects;

public class DefaultHumanTurn implements HumanTurn {
    private GameTable gameTable;

    @Override
    public void setGameTable(GameTable gameTable) {
        Objects.requireNonNull(gameTable, "Game table can't be null");
        this.gameTable = gameTable;
    }

    @Override
    public Cell makeTurn(int row, int col) {
        gameTable.setValue(row, col, CellValue.HUMAN);
        return new Cell(row, col);
    }
}
