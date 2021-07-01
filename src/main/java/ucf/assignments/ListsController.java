package ucf.assignments;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.ListView;
import javafx.scene.control.MenuButton;
import javafx.scene.control.MenuItem;

public class ListsController {

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private MenuButton fileActionsMenu;

    @FXML
    private MenuItem saveListsButton;

    @FXML
    private MenuItem loadListsButton;

    @FXML
    private ListView<?> toDoListLists;

    @FXML
    private Button newToDoListButton;

    @FXML
    private Button deleteListsButton;

    @FXML
    void addListButtonPressed(ActionEvent event) {

        /* May help with switching between scenes:
           https://www.youtube.com/watch?v=hcM-R-YOKkQ
         */

        // Set scene to ToDoListController
            // Allow user to fill in information
        // Return to ListsController Scene
        // Only to do list's title should be displayed
    }

    @FXML
    void deleteListButtonPressed(ActionEvent event) {
        // User clicks on a list
        // User clicks on delete button
        // List is removed from the list of To Do Lists
            // The other lists should shift up to fill the empty spot
            // List's title and table should also be deleted
    }

    @FXML
    void loadListsButtonPressed(ActionEvent event) {
        // User clicks on load button
        // User can then view external files
        // User can choose appropriate file
        // File content is loaded into a new list
    }

    @FXML
    void saveListsButtonPressed(ActionEvent event) {
        // User clicks on save button
        // User saves externally
    }

    @FXML
    void initialize() {
        // List of to do lists should be initially empty

        assert fileActionsMenu != null : "fx:id=\"fileActionsMenu\" was not injected: check your FXML file 'ListsController.fxml'.";
        assert saveListsButton != null : "fx:id=\"saveListsButton\" was not injected: check your FXML file 'ListsController.fxml'.";
        assert loadListsButton != null : "fx:id=\"loadListsButton\" was not injected: check your FXML file 'ListsController.fxml'.";
        assert toDoListLists != null : "fx:id=\"toDoListLists\" was not injected: check your FXML file 'ListsController.fxml'.";
        assert newToDoListButton != null : "fx:id=\"newToDoListButton\" was not injected: check your FXML file 'ListsController.fxml'.";
        assert deleteListsButton != null : "fx:id=\"deleteListsButton\" was not injected: check your FXML file 'ListsController.fxml'.";
    }
}

