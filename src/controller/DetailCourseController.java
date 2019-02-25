package controller;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;

class DetailsCourseController {

    @FXML
    private Label lbl_course_name;

    @FXML
    private Label lbl_course_category;

    @FXML
    private Label lbl_course_date;

    @FXML
    private Label lbl_course_trener;

    @FXML
    private Label lbl_course_participants;

    @FXML
    private TableView<?> tbl_particip;

    @FXML
    private TableColumn<?, ?> tbl_particip_name;

    @FXML
    private TableColumn<?, ?> tbl_particip_lastname;

    @FXML
    private TextField tf_particip_name;

    @FXML
    private TextField tf_particip_lastname;

}
