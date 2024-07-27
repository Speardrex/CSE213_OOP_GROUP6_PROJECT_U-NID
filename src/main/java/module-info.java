module com.example.cse213_oop_group6_project_unid {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.cse213_oop_group6_project_unid to javafx.fxml;
    exports com.example.cse213_oop_group6_project_unid;
}