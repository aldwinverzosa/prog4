package util;

import java.awt.Font;
import javax.swing.JOptionPane;
import javax.swing.JTextArea;
import java.util.Scanner;

public class IO {

    public static void showMessage(String s) {
        System.out.println(s);
        JTextArea jta = new JTextArea(s);
        jta.setFont(new Font("Lucida Console", Font.ITALIC, 60));
        JOptionPane.showMessageDialog(null, jta);

    }

    public static Scanner getGuiInput(String prompt) {

        return new Scanner(JOptionPane.showInputDialog(prompt));

    }

    public static Scanner getConsoleInput(String prompt) {
        System.out.println(prompt);
        return new Scanner(System.in);
    }

    public static void showMessage(String s, String title) {
        System.out.println(title + "\n "+s);
        JTextArea jta = new JTextArea(s);
        jta.setFont(new Font("Lucida Console", Font.ITALIC, 60));
        JOptionPane.showMessageDialog(null, jta, title, JOptionPane.PLAIN_MESSAGE);

    }
}
