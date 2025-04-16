package example;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Board {
    private Symbol[][] boards;
    private final int ROWS = 3;
    private final int COLS = 3;
    private double totalWin = 0;

    public Board() {
        boards = new Symbol[ROWS][COLS];
    }

    public void generateBoard() {
        List<Symbol> symbolPool = new ArrayList<>();
        addSymbol(symbolPool, new Symbol('A', 40, 1.2));
        addSymbol(symbolPool, new Symbol('B', 30, 2.1));
        addSymbol(symbolPool, new Symbol('C', 15, 3.3));
        addSymbol(symbolPool, new Symbol('D', 10, 4.5));
        addSymbol(symbolPool, new Symbol('7', 4, 10.9));
        addSymbol(symbolPool, new Symbol('*', 1, 15.6));

        Random random = new Random();
        for (int i = 0; i < ROWS; i++) {
            for (int j = 0; j < COLS; j++) {
                boards[i][j] = symbolPool.get(random.nextInt(symbolPool.size()));
            }
        }

        printBoard();
    }

    private void addSymbol(List<Symbol> list, Symbol symbol) {
        for (int i = 0; i < symbol.getWeight(); i++) {
            list.add(symbol);
        }
    }

    public void checkLines(double betPerLine, User user) {
        totalWin = 0;
        if (same(0, 0, 1, 0, 2, 0))
            addWin(0, 0, betPerLine, "Coloana 1", user);
        if (same(0, 1, 1, 1, 2, 1))
            addWin(0, 1, betPerLine, "Coloana 2", user);
        if (same(0, 2, 1, 2, 2, 2))
            addWin(0, 2, betPerLine, "Coloana 3", user);
        if (same(0, 0, 1, 1, 0, 2))
            addWin(0, 0, betPerLine, "V win - 1", user);
        if(same(2, 0, 1, 1, 2, 2))
            addWin(2, 0, betPerLine, "V win - 2", user);

        if (same(0, 0, 0, 1, 0, 2))
            addWin(0, 0, betPerLine, "Linia 1", user);
        if (same(1, 0, 1, 1, 1, 2))
            addWin(1, 0, betPerLine, "Linia 2", user);
        if (same(2, 0, 2, 1, 2, 2))
            addWin(2, 0, betPerLine, "Linia 3", user);

        if (same(0, 0, 1, 1, 2, 2))
            addWin(0, 0, betPerLine, "Diagonala principala", user);
        if (same(0, 2, 1, 1, 2, 0))
            addWin(0, 2, betPerLine, "Diagonala secundara", user);

        if (totalWin == 0) {
            System.out.println("Nicio linie castigatoare.");
        }

        System.out.println("=== Total Win: " + totalWin + " ===");
        System.out.println("=================== Balance: " + user.getWallet() + " ===");
    }

    private void addWin(int r, int c, double betPerLine, String lineName, User user) {
        double win = betPerLine * boards[r][c].getMultiplier();
        totalWin += win;
        System.out.println(lineName + " castigatoare! Castig: " + win);
        user.setWallet(user.getWallet() + win);
    }

    private boolean same(int r1, int c1, int r2, int c2, int r3, int c3) {
        char s1 = boards[r1][c1].getValue();
        char s2 = boards[r2][c2].getValue();
        char s3 = boards[r3][c3].getValue();
        return s1 == s2 && s2 == s3;
    }

    public void printBoard() {
        System.out.println("=== Slot Board ===");
        for (int i = 0; i < boards.length; i++) {
            for (int j = 0; j < boards[i].length; j++) {
                System.out.print(boards[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println("==================");
    }

    public Symbol[][] getBoard() {
        return boards;
    }
}