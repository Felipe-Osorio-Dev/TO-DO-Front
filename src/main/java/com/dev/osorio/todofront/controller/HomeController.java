package com.dev.osorio.todofront.controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.ListView;
import javafx.scene.control.TextField;

public class HomeController {

    @FXML
    private ListView<String> listView;

    @FXML
    private Button button;

    @FXML
    private TextField search;

    @FXML
    public void setList() {
        String txt = search.getText();
        listView.getItems().add(txt);
    }
}
