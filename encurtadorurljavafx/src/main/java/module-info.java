module com.nucleo4dev.encurtadorurljavafx {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.base;

    opens com.nucleo4dev.encurtadorurljavafx to javafx.fxml;
    opens com.nucleo4dev.encurtadorurljavafx.controller to javafx.fxml;
    exports com.nucleo4dev.encurtadorurljavafx;
}
