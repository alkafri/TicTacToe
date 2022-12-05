package com.example.tictactoe;

import javafx.application.Platform;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.scene.control.Alert;
import javafx.scene.control.ButtonType;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.FlowPane;

import java.io.IOException;
import java.util.HashMap;
import java.util.Optional;

public class Board {

    private ImageView boxes[] = new ImageView[9];
    private HashMap<Integer, Box> fullBoxes = new HashMap<>();

    private UserX userx = new UserX();

    private UserO usero = new UserO();
    private WinnerPicker picker = new WinnerPicker();


    public FlowPane getBoard() throws IOException {


        FlowPane flow = new FlowPane();
        flow.setPadding(new Insets(50, 0, 0, 30));
        flow.setVgap(0);
        flow.setHgap(0);
        flow.setPrefWrapLength(255);
        flow.setStyle("-fx-background-color: DAE6F3");

        for (int i = 0; i < 9; i++) {
            boxes[i] = new ImageView(new Image(Board.class.getResourceAsStream("/box.png")));
            flow.getChildren().add(boxes[i]);
        }
        flow.setOnMouseClicked(new EventHandler<MouseEvent>() {
            @Override
            public void handle(MouseEvent event) {
                if(!isOver()) {
                    userx.userMove(fullBoxes, flow, event);
                    picker.pickWinner(fullBoxes);
                    if (!isOver()) {
                        usero.userMove(fullBoxes, flow);
                        picker.pickWinner(fullBoxes);
                    }
                }
            }
        });

        return flow;
    }

    public boolean isOver() {

        if(picker.getWinner() != ' ') {
            return true;

        } else if(fullBoxes.size() == 9) {
            Alert fullBoard = new Alert(Alert.AlertType.CONFIRMATION);
            fullBoard.setTitle("NO MORE MOVES");
            fullBoard.setHeaderText("Bad Luck.... No Winner!!  Play again?");
            Optional<ButtonType> result = fullBoard.showAndWait();
            if(result.get() == ButtonType.OK) {
                HelloController newGame = new HelloController();
                newGame.restart();
            } else {
                Platform.exit();
            }
            return true;

        }  return false;
    }

}