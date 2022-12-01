package com.example.tictactoe;


import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;

import javafx.stage.Stage;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.FlowPane;



import java.awt.*;
import java.io.IOException;

public class TicTacToe extends Application {
    @Override
    public void start(Stage stage) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(TicTacToe.class.getResource("tictactoe.fxml"));

        //BorderPane border = new BorderPane();
        //Board board = new Board();
        //FlowPane grid = board.getBoard();
        //border.setCenter(grid);


        Scene scene = new Scene(fxmlLoader.load(), 500, 600);
        stage.setTitle("TicTacToe!");
        stage.setScene(scene);
        stage.setResizable(false);


        stage.show();

    }

    public static void main(String[] args) {
        launch();
    }
}