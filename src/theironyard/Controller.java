package theironyard;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.ListView;
import javafx.scene.control.TextField;
import java.net.URL;
import java.util.ResourceBundle;

public class Controller implements Initializable{

    ObservableList<ToDoItem> items = FXCollections.observableArrayList();

    //create a link to the items in the application
    @FXML
    ListView list;

    @FXML
    TextField text;


    @Override
    public void initialize(URL location, ResourceBundle resources) {
        list.setItems(items);  //link the list object in FX with the items array
    }


    public void addItem() {
        items.add(new ToDoItem(text.getText()));
        text.clear();
    }

    public void removeItem() {
        ToDoItem item = (ToDoItem) list.getSelectionModel().getSelectedItem();
        items.remove(item);
    }

    public void toggleItem() {
        ToDoItem item = (ToDoItem) list.getSelectionModel().getSelectedItem();
        if (item != null ) {
            item.isDone = !item.isDone;
            list.setItems(null);
            list.setItems(items);
        }
    }


}
