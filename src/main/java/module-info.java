module com.miguel.workshopjavafx {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.controlsfx.controls;

    opens com.miguel.workshopjavafx to javafx.fxml;
    exports com.miguel.workshopjavafx;
    exports gui;
    opens gui to javafx.fxml;
}