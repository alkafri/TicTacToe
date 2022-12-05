package com.example.tictactoe;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.FlowPane;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

import java.io.IOException;
import java.util.EventObject;

public class HelloController {
    @FXML
    private Label welcomeText;
    @FXML
    private Button startButton;

    private Stage oldStage;

    Stage primaryStage = new Stage();

    @FXML
    protected void onHelloButtonClick() throws IOException {
        if (welcomeText != null) {
            welcomeText.setVisible(false);
            startButton.setVisible(false);

            oldStage = (Stage) startButton.getScene().getWindow();
            oldStage.close();
        }

        if (primaryStage != null){
            primaryStage.close();
        }


        BorderPane border = new BorderPane();
        Board board = new Board();
        FlowPane grid = board.getBoard();
        border.setCenter(grid);

        FXMLLoader fxmlLoader = new FXMLLoader(com.example.tictactoe.TicTacToe.class.getResource("tictactoe.fxml"));
        Scene scene = new Scene(border, 650, 700, Color.AQUAMARINE);

        //Stage primaryStage = new Stage();
        primaryStage.setTitle("Smart Monkeys TicTacToe!");
        primaryStage.getIcons().add(new Image("/icon.png"));
        primaryStage.setScene(scene);
        primaryStage.setResizable(false);
        primaryStage.show();

    }

    public void restart() {
        HelloController newGame = new HelloController();
        try {
            newGame.onHelloButtonClick();
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}