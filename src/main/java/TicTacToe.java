package com.example.tictactoe;

import Board.Board;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.FlowPane;
import javafx.scene.paint.Color;
import javafx.stage.Stage;
import javafx.scene.control.Label;

import javafx.fxml.FXML;

import java.io.IOException;

public class TicTacToe extends Application {
    @Override
    public void start(Stage stage) throws IOException {

        BorderPane border = new BorderPane();
        Board board = new Board();
        FlowPane grid = board.getBoard();
        border.setCenter(grid);

        FXMLLoader fxmlLoader = new FXMLLoader(TicTacToe.class.getResource("tictactoe.fxml"));
        Scene scene = new Scene(fxmlLoader.load(), 500, 200, Color.AQUAMARINE);

        stage.setTitle("Smart Monkeys TicTacToe!");
        stage.getIcons().add(new Image("/icon.png"));
        stage.setScene(scene);
        stage.setResizable(false);
        stage.show();



    }
    public static void main(String[] args) {
        launch();
    }
}