package controller;


import Model.Course;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.stage.Stage;

import java.io.IOException;
import java.time.LocalDate;

public class CourseController {
    // ---------------------------------------------------

    // obiekt listy kursow
    ObservableList<Course> courses = FXCollections.observableArrayList();
    public static  int id;
    // ---------------------------------------------------

    @FXML
    private TableView<Course> tbl_course;

    @FXML
    private TableColumn<Course, String> col_course_name;

    @FXML
    private TableColumn<Course, String> col_course_category;

    @FXML
    private TextField tf_course_name;

    @FXML
    private TextField tf_course_category;

    @FXML
    private DatePicker dp_course_date;

    @FXML
    private TextField tf_trener_name;

    @FXML
    void addCourse(ActionEvent event) {

        // walidacja danych
        if(!tf_course_name.getText().equals("") && !tf_course_category.getText().equals("") && dp_course_date.getValue() != null) {
            String course_name = tf_course_name.getText();
            String course_category = tf_course_category.getText();
            LocalDate course_date = dp_course_date.getValue();
            String trener_name = tf_trener_name.getText();
            // utworzenie obiektu klasy Course
            Course c = new Course(++id, course_name, course_category, course_date, trener_name);
            // wprowadzenie obiektu klasy Course do listy kursów
            courses.add(c);
            // odswiezenie TableView
            insertCoursesIntoTableView();
            tf_course_name.clear();
            tf_course_category.clear();
            dp_course_date.setValue(null);
            tf_trener_name.clear();
        } else {
               Alert a = new Alert (Alert.AlertType.ERROR);
               a.setTitle("Błąd");
               a.setHeaderText("Błąd dodawania nowego kursu");
               a.setContentText("Musisz podać wszystkie dane w celu dodania nowego kursu");
               a.show();
            }

    }

    @FXML
    void deleteCourse(ActionEvent event) {
    Course c_deleted = tbl_course.getSelectionModel().getSelectedItem();
    courses.remove(c_deleted);
    insertCoursesIntoTableView();
    // odczyt zaznaczonego rekordu z tabeli i przypisanie jego id do zmiennej

    }
    // przekazanie obiektu statycznego do innego widoku
    static Course c_selected;

    @FXML
    void getCourse(ActionEvent event) throws IOException {
        c_selected = tbl_course.getSelectionModel().getSelectedItem();
        // wywolanie nowego widoku
        Stage courseStage = new Stage();
        Parent root = FXMLLoader.load(getClass().getResource("/view/DetailController.fxml"));
        courseStage.setTitle("Wybrany kurs");
        courseStage.setScene(new Scene(root));
        courseStage.show();

    }
    // metoda do wprowadzanai zawartosci do listy kursow do tabelki
    private  void insertCoursesIntoTableView() {
        col_course_name.setCellValueFactory(new PropertyValueFactory<Course, String>("course_name"));
        col_course_category.setCellValueFactory(new PropertyValueFactory<Course, String>("course_category"));
        // wprowadzenia danych do tabeli z listy ObservableList\
        tbl_course.setItems(courses);
    }
    // metoda ktroa uruchamia sie po zaladowaniu widoku jako pierwsza
    public void initialize(){
        insertCoursesIntoTableView();
    }
}
