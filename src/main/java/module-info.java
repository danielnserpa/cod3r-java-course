module org.example.exercises {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.kordamp.bootstrapfx.core;

    opens org.example.exercises to javafx.fxml;
    exports org.example.exercises;
}