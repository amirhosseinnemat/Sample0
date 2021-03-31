package com.dialogBox;

import javax.swing.*;

public class Main {

    public static void main(String[] args) {

        String name = JOptionPane.showInputDialog("Tell me your name : ");
        String message = String.format("Hello %s, Welcome to the class", name);
        JOptionPane.showMessageDialog(null, message);
    }
}
