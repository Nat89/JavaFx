package controller;

import Model.Participant;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;


public class DetailsCourseController {

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
    private TableView<Participant> tbl_particip;

    @FXML
    private TableColumn<Participant, String> tbl_particip_name;

    @FXML
    private TableColumn<Participant, String> tbl_particip_lastname;

    @FXML
    private TextField tf_particip_name;

    @FXML
    private TextField tf_particip_lastname;

    void saveParticipant (ActionEvent event) {

    }
    public void initialize() {
        // ustawienie danych wybranego kursu
        lbl_course_name.setText(CourseController.c_selected.getCourse_name());
        lbl_course_category.setText(CourseController.c_selected.getCourse_category());
        lbl_course_date.setText(CourseController.c_selected.getCourse_date().toString());
        lbl_course_trener.setText(CourseController.c_selected.getTrener_name());
        lbl_course_participants.setText(String.valueOf(CourseController.c_selected.getNoParticipants()));

    }
}
