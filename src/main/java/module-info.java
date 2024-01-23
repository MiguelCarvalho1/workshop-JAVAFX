module com.miguel.workshopjavafx {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.controlsfx.controls;
    requires java.sql;

    opens com.miguel.workshopjavafx to javafx.fxml;
    exports com.miguel.workshopjavafx;
    exports gui.util;
    opens gui.util to javafx.fxml;
}