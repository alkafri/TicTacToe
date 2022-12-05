package com.example.tictactoe;

import javafx.event.EventTarget;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.FlowPane;

import java.util.HashMap;
import java.util.Objects;

public class UserX {

    public void userMove(HashMap<Integer, Box> fullBoxes, FlowPane flow, MouseEvent event) {

        if (fullBoxes.get(flow.getChildren().indexOf(event.getTarget())) == null) {



            int i = flow.getChildren().indexOf(event.getTarget());
            flow.getChildren().add(i, new ImageView(new Image(Objects.requireNonNull(Board.class.getResourceAsStream("/X.png")))));
            flow.getChildren().remove(event.getTarget());

            fullBoxes.put(i, new Box('X', i));
        }
    }
}
