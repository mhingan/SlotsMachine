package example;

public class RTPTester {
    public static void main(String[] args) {
        int spins = 1_000_000;
        double totalBet = 0;
        double totalWin = 0;

        User user = new User(2000000);
        double betPerLine = 1;

        for (int i = 0; i < spins; i++) {
            Board board = new Board();
            board.generateBoard();

            double balanceBefore = user.getWallet();
            board.checkLines(betPerLine, user);
            double balanceAfter = user.getWallet();

            totalBet += betPerLine; // 8 linii verificate în total
            totalWin += (balanceAfter - balanceBefore);
        }

        double rtp = (totalWin / totalBet) * 100;
        System.out.printf("Estimated RTP: %.2f%%\n", rtp);
    }
}

