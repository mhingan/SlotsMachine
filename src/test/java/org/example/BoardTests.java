package org.example;

import example.Board;
import example.Symbol;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

public class BoardTests {

    @Test
    public void testBoardGeneration() {
        Board board = new Board();
        Symbol[][] symbols = new Symbol[3][3];
        assertEquals(symbols, board.getBoard());
    }

    @Test
    public void testBoardGeneration2() {
        Board board = new Board();
        board.generateBoard();
        Symbol[][] generated = board.getBoard();

        assertEquals(3, generated.length);
        for (Symbol[] row : generated) {
            assertEquals(3, row.length);
            for (Symbol s : row) {
                assertNotNull(s);
            }
        }
    }

}
