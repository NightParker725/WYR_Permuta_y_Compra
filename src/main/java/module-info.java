module com.example.wyr {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.wyr to javafx.fxml;
    exports com.example.wyr;
}