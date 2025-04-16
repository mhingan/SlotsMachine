package example;

public class Game {
    public static void main(String[] args) {

        User user = new User(200);
        Spin spin = new Spin(user);
        spin.generateSpin(1);

    }
}

