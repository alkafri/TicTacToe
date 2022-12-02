package com.example.tictactoe;

import Board.Board;
import javafx.fxml.FXML;
import javafx.geometry.Insets;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.FlowPane;
import javafx.scene.paint.Color;
import javafx.stage.Stage;
import javafx.stage.Window;

import javax.swing.*;
import java.io.IOException;
import java.util.EventObject;

public class HelloController {
    @FXML
    private Label welcomeText;
    @FXML
    private Button startButton;

    private Stage oldStage;

    @FXML
    protected void onHelloButtonClick() throws IOException {
        welcomeText.setVisible(false);
        startButton.setVisible(false);

        oldStage = (Stage) startButton.getScene().getWindow();
        oldStage.close();

        BorderPane border = new BorderPane();
        Board board = new Board();
        FlowPane grid = board.getBoard();
        border.setCenter(grid);

        Scene scene = new Scene(border, 650, 700, Color.AQUAMARINE);

        Stage primaryStage = new Stage();
        primaryStage.setTitle("Smart Monkeys TicTacToe!");
        primaryStage.getIcons().add(new Image("/icon.png"));
        primaryStage.setScene(scene);
        primaryStage.setResizable(false);
        primaryStage.show();

    }
}