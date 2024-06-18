module org.example.fx_openweatherapi {
    requires javafx.controls;
    requires javafx.fxml;


    opens org.example.fx_openweatherapi to javafx.fxml;
    exports org.example.fx_openweatherapi;
}