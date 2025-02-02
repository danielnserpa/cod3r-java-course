module org.example.exercises {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.kordamp.bootstrapfx.core;
    requires java.desktop;

    opens org.example.standard to javafx.fxml;
    exports org.example.standard;
}