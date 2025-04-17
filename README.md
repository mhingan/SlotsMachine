# 🎰 Java Slots Machine

A simple command-line Slot Machine game built in Java using Object-Oriented Programming principles.

The game simulates a classic 3x3 slot board with symbols of various weights and payout multipliers. Players spin the board, and if symbols align on winning lines, they earn money.

## 🧩 Features

- 🎲 Random symbol generation with weights
- 💸 Payouts based on symbol multipliers
- 💼 Wallet system with balance tracking
- ✅ Win detection across rows, columns, and diagonals
- ❌ Handles insufficient balance
- 🔁 Unlimited spins until user exits

## 🧠 Game Logic

- Each spin costs a fixed bet (e.g. 1.0)
- Symbols: `A, B, C, D, 7, *` with different weights and payouts
- Winning combinations:
  - 3 matching symbols on any row, column, or diagonal
  - Payout = bet × symbol multiplier

## 🔧 Tech Stack

- Java 17+
- Console I/O
- Object-Oriented Design (`Symbol`, `Board`, `User`, `Spin`)

## 🏁 How to Run

1. Clone the repository:
   ```bash
   git clone https://github.com/mhingan/SlotsMachine.git
   cd SlotsMachine
   ```

2. Compile the project:
   ```bash
   javac org/example/*.java
   ```

3. Run the game:
   ```bash
   java org.example.Main
   ```

> Make sure to create a `Main.java` file that initializes a `User` and calls `Spin.generateSpin()`.

## 📄 Example Gameplay

```
Press ENTER to spin or X to exit:

=== Slot Board ===
A B C
C A A
A A A
==================
Linia 3 castigatoare! Castig: 1.0
=== Total Win: 1.0 ===
=================== Balance: 100.0 ===
```

## 📁 Project Structure

```
├── org/
│   └── example/
│       ├── Symbol.java
│       ├── Board.java
│       ├── User.java
│       ├── Spin.java
│       └── Main.java
```
