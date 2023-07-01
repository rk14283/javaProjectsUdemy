module com.example.flightbookingsystem {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.desktop;


    opens com.example.flightbookingsystem to javafx.fxml;
    exports com.example.flightbookingsystem;
}