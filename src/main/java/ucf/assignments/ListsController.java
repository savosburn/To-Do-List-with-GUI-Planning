package ucf.assignments;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.MenuItem;

public class ListsController {

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private MenuItem saveListsButtonClicked;

    @FXML
    private MenuItem loadListsButtonClicked;

    @FXML
    private Button newToDoListButtonClicked;

    @FXML
    private Button deleteListsButtonClicked;

    @FXML
    void initialize() {
        assert saveListsButtonClicked != null : "fx:id=\"saveListsButtonClicked\" was not injected: check your FXML file 'ListsController.fxml'.";
        assert loadListsButtonClicked != null : "fx:id=\"loadListsButtonClicked\" was not injected: check your FXML file 'ListsController.fxml'.";
        assert newToDoListButtonClicked != null : "fx:id=\"newToDoListButtonClicked\" was not injected: check your FXML file 'ListsController.fxml'.";
        assert deleteListsButtonClicked != null : "fx:id=\"deleteListsButtonClicked\" was not injected: check your FXML file 'ListsController.fxml'.";

    }
}

