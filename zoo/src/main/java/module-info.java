module com.example.zoo {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.zoo to javafx.fxml;
    exports com.example.zoo;
}