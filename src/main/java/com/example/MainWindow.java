package com.example;

import javax.swing.*;


public class MainWindow extends JFrame{

    public MainWindow() {

        setTitle("Змейка");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setSize(350, 374);
        setLocation(400, 200);
        add(new GameField());
        setVisible(true);
    }


    public static void main(String[] args) {

        MainWindow mw = new MainWindow();
        MusicManager mn = new MusicManager();

        Runnable runnable = () -> {mn.playSounds1();};
        Thread thread = new Thread(runnable);
        thread.start();
    }
}
