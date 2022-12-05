package com.example.tictactoe;

import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.FlowPane;

import java.util.HashMap;
import java.util.Random;
import java.util.Set;
import java.util.stream.Collectors;

public class UserO {

    public void userMove(HashMap<Integer,Box> fullBoxes, FlowPane flow) {

        Board board = new Board();
        Random random = new Random();
        int computerChose = random.nextInt(9);

        Set<Integer> impossibleMove = fullBoxes.entrySet().stream()
                .map(entry -> entry.getKey())
                .filter(key -> key.equals(computerChose))
                .collect(Collectors.toSet());

        if (impossibleMove.size() == 0) {
            flow.getChildren().remove(computerChose);
            flow.getChildren().add(computerChose, new ImageView(new Image(Board.class.getResourceAsStream("/O.png"))));
            fullBoxes.put(computerChose, new Box('O', computerChose));
        } else if (!board.isOver()){
            userMove(fullBoxes, flow);
        }

    }
}
