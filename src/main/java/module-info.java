module com.example.newtest {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.newtest to javafx.fxml;
    exports com.example.newtest;
}