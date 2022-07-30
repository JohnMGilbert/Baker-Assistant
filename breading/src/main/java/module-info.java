module com.bake {
    requires javafx.controls;
    requires javafx.fxml;

    opens com.bake to javafx.fxml;
    exports com.bake;
}
