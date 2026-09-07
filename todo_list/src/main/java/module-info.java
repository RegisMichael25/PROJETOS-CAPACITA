module com.nucleo4dev.todo_list {
    requires javafx.controls;
    requires javafx.fxml;

    opens com.nucleo4dev.todo_list to javafx.fxml;
    exports com.nucleo4dev.todo_list;
}
