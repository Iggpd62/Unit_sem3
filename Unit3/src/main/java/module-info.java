module com.example.unit3 {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.unit3 to javafx.fxml;
    exports com.example.unit3;
}