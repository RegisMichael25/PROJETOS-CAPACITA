module com.nucleo4dev.introduction.javafx {
    requires javafx.controls;
    requires javafx.fxml;
    requires javafx.base;
    requires javafx.graphics;

    opens com.nucleo4dev.introduction.javafx to javafx.fxml;
    exports com.nucleo4dev.introduction.javafx;
}
