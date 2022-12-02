package PACKAGE_NAME;

import javafx.scene.layout.StackPane;
import javafx.scene.text.Text;
import javafx.scene.input.MouseButton;

public class TicTacToe {

    private boolean turnX = true;

    private boolean playable = true;



    private class Tile extends StackPane { // Guess stackpane?
        private Text text = new Text();

        public Tile() {
            setOnMouseClicked(event -> {
                if (!playable)
                    return;

                if (event.getButton() == MouseButton.PRIMARY) {
                    if (turnX) {
                        drawX();
                        turnX=false;
                    } else if (!turnX){
                        drawO();
                        turnX=true;
                    }

                    // Some form of check to se if it was a winner move?
                }
            });
        }
        private void drawX() {
            text.setText("X");
        }

        private void drawO() {
            text.setText("O");
        }

    }


}
