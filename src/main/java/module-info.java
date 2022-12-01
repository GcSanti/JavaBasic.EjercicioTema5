module com.example.javabasicejerciciotema5 {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.javabasicejerciciotema5 to javafx.fxml;
    exports com.example.javabasicejerciciotema5;
}