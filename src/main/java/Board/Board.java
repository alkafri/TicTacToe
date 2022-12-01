package Board;

import javafx.geometry.Insets;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.FlowPane;

import java.util.HashMap;


public class Board {

    private ImageView boxes[] = new ImageView[9];
    private HashMap<Integer, Box> fullBoxes = new HashMap<>();

    //private User user = new User();
    //private Computer computer = new Computer();
    //private WinnerPicker picker = new WinnerPicker();

    public FlowPane getBoard() {

        FlowPane flow = new FlowPane();
        flow.setPadding(new Insets(50, 0, 0, 30));
        flow.setVgap(0);
        flow.setHgap(0);
        flow.setPrefWrapLength(255);
        flow.setStyle("-fx-background-color: DAE6F3");

        //for (int i = 0; i < 9; i++) {
            //boxes[i] = new ImageView(new Image(Board.class.getResourceAsStream("blank.png")));
            //flow.getChildren().add(boxes[i]);
        //}



        return flow;
    }


}