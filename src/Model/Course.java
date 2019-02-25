package Model;

import java.time.LocalDate;

public class Course {
    private int id;
    private  String course_name;
    private  String course_category;
    private LocalDate course_date;
    private  String trener_name;


    public Course(int id, String course_name, String course_category, LocalDate course_date, String trener_name) {
        this.id = id;
        this.course_name = course_name;
        this.course_category = course_category;
        this.course_date = course_date;
        this.trener_name = trener_name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCourse_name() {
        return course_name;
    }

    public void setCourse_name(String course_name) {
        this.course_name = course_name;
    }

    public String getCourse_category() {
        return course_category;
    }

    public void setCourse_category(String course_category) {
        this.course_category = course_category;
    }

    public LocalDate getCourse_date() {
        return course_date;
    }

    public void setCourse_date(LocalDate course_date) {
        this.course_date = course_date;
    }

    public String getTrener_name() {
        return trener_name;
    }

    public void setTrener_name(String trener_name) {
        this.trener_name = trener_name;
    }
}
