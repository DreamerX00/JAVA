package practicals;

import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.SwingUtilities;

public class p17_game {
    private final JFrame frame;
    private final JTextField rangeTextField;
    private final JButton startButton;
    private final JTextArea outputTextArea;
    private final JTextField guessTextField;
    private final JButton guessButton;
    private final int[] levelValues = {0, 10, 50, 100, 250, 500, 750, 1000, 20000, 50000, 100000};

    private int range;
    private int level;
    private int targetNumber;
    private int attempts;

    public p17_game() {
        frame = new JFrame("Number Guessing Game");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 400);
        frame.setLayout(new FlowLayout()); // Change the layout manager to FlowLayout

        JLabel titleLabel = new JLabel("Number Guessing Game");
        titleLabel.setFont(new Font("Arial", Font.BOLD, 18));
        titleLabel.setHorizontalAlignment(JLabel.CENTER);

        JLabel levelLabel = new JLabel("Enter the level of difficulty range (1-10):");
        rangeTextField = new JTextField(10);
        startButton = new JButton("Start Game");

        JPanel inputPanel = new JPanel();
        inputPanel.setLayout(new GridLayout(3, 1));
        inputPanel.add(levelLabel);
        inputPanel.add(rangeTextField);
        inputPanel.add(startButton);

        outputTextArea = new JTextArea(10, 30);
        outputTextArea.setEditable(false);

        guessTextField = new JTextField(10);
        guessButton = new JButton("Guess");

        JPanel guessPanel = new JPanel();
        guessPanel.setLayout(new GridLayout(2, 1));
        guessPanel.add(guessTextField);
        guessPanel.add(guessButton);

        frame.add(titleLabel);
        frame.add(inputPanel);
        frame.add(outputTextArea);
        frame.add(guessPanel);

        startButton.addActionListener(e -> {
            String inputRange = rangeTextField.getText();
            try {
                range = Integer.parseInt(inputRange);
                if (range >= 1 && range <= 10) {
                    level = levelValues[range];
                    targetNumber = (int) (Math.random() * level + 1);
                    attempts = 0;
                    outputTextArea.setText("A random number between 1 to " + level + " is generated.\n" +
                            "Can you guess the number? Enter your guess:");
                    rangeTextField.setEnabled(false);
                    startButton.setEnabled(false);
                    guessTextField.setEnabled(true);
                    guessButton.setEnabled(true);
                } else {
                    outputTextArea.setText("Please enter a valid range between 1 and 10.");
                }
            } catch (NumberFormatException ex) {
                outputTextArea.setText("Please enter a valid range between 1 and 10.");
            }
        });

        guessButton.addActionListener(e -> {
            String inputGuess = guessTextField.getText();
            try {
                int guess = Integer.parseInt(inputGuess);
                attempts++;

                if (guess == targetNumber) {
                    outputTextArea.setText("Congrats! You guessed the number. (Attempt Count: " + attempts + ")\n");
                    if (attempts == 1) {
                        outputTextArea.append("You are too good for this level.");
                    } else if (attempts <= 5) {
                        outputTextArea.append("You are good for this level.");
                    } else if (attempts <= 10) {
                        outputTextArea.append("You are average on this level.");
                    } else if (attempts <= 50) {
                        outputTextArea.append("Bro, stop! You are a noob. Try an easier level.");
                    } else if (attempts <= 100) {
                        outputTextArea.append("You should stop using your brain because you don't have one.");
                    }
                    guessTextField.setEnabled(false);
                    guessButton.setEnabled(false);
                } else if (guess < 0) {
                    outputTextArea.setText("Lol! Noob. It was: " + targetNumber + "\n");
                    outputTextArea.append("And you literally can't even find that after " + attempts + " attempts.\n");
                    guessTextField.setEnabled(false);
                    guessButton.setEnabled(false);
                } else if (guess < targetNumber) {
                    outputTextArea.setText("Bro, you typed a lesser number. (Attempt Count: " + attempts + ")\n");
                } else {
                    outputTextArea.setText("Bro, you typed a greater number. (Attempt Count: " + attempts + ")\n");
                }
            } catch (NumberFormatException ex) {
                outputTextArea.setText("Please enter a valid integer guess.");
            }
        });

        guessTextField.setEnabled(false);
        guessButton.setEnabled(false);
    }

    public void show() {
        frame.setVisible(true);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            p17_game game = new p17_game();
            game.show();
        });
    }
}