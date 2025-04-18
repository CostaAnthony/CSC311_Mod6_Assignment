module edu.farmingdale.csc311_mod6_assignment {
    requires javafx.controls;
    requires javafx.fxml;


    opens edu.farmingdale.csc311_mod6_assignment to javafx.fxml;
    exports edu.farmingdale.csc311_mod6_assignment;
}