package example;

import java.util.Scanner;

public class Spin {
    private final double spinValue = 1.0;
    private Board board;
    private User user;

    public Spin(User user) {
        this.user = user;
    }

    public void generateSpin(double value) {
        Scanner scanner = new Scanner(System.in);
        String input = "";

        while (!input.equalsIgnoreCase("X")) {
            System.out.print("\n\nPress ENTER to spin or X to exit: ");
            input = scanner.nextLine();

            if (!input.equalsIgnoreCase("X")) {
                if (user.getWallet() >= spinValue) {
                    user.setWallet(user.getWallet() - spinValue);
                    board = new Board();
                    board.generateBoard();
                    board.checkLines(value, user);
                } else {
                    System.out.println("You don't have enough money to spin it!");
                }
            }
        }

        System.out.println("Exiting the slot machine. Bye!");
    }
}