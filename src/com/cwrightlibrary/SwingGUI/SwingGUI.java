package com.cwrightlibrary.SwingGUI;

import com.cwrightlibrary.SwingGUI.exampleGUI;

import javax.swing.*;

public class SwingGUI {
    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                exampleGUI example = new exampleGUI();
                example.setVisible(true);

                try {
                    UIManager.setLookAndFeel("com.sun.java.swing.plaf.windows.WindowsLookAndFeel");
                } catch (Exception e) {
                    System.out.println("Error: " + e);
                }
            }
        });
    }
}
