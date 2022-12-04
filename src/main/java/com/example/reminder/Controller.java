package com.example.reminder;

import javafx.beans.Observable;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.Event;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.*;

import java.net.URL;
import java.time.LocalDate;
import java.util.ResourceBundle;

public class Controller implements Initializable {
    /*@FXML
    private Label welcomeText;

    @FXML
    protected void onHelloButtonClick() {
        welcomeText.setText("Welcome to JavaFX Application!");
    }*/
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        datePicker.setValue(LocalDate.now());
    }
    @FXML
    Button addButton;
    @FXML
    TextField descriptionTextField;
    @FXML
    DatePicker datePicker;
    @FXML
    ListView<LocalEvent> eventList;

    ObservableList<LocalEvent> list = FXCollections.observableArrayList();

    @FXML
    private void addEvent(Event e) {
        list.add(new LocalEvent(datePicker.getValue(), descriptionTextField.getText()));
        eventList.setItems(list);
        refresh();
    }

    private void refresh() {
        datePicker.setValue(LocalDate.now());
        descriptionTextField.setText(null);
    }

}