module org.example.module02_pt3_advance_prog {
    requires javafx.controls;
    requires javafx.fxml;


    opens org.example.module02_pt3_advance_prog to javafx.fxml;
    exports org.example.module02_pt3_advance_prog;
}