module com.dev.osorio.todofront {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.controlsfx.controls;
    requires com.dlsc.formsfx;
    requires org.kordamp.ikonli.javafx;
    requires org.kordamp.bootstrapfx.core;

    opens com.dev.osorio.todofront.controller to javafx.fxml;
    exports com.dev.osorio.todofront;
}