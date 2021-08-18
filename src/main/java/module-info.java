module com.maxlong.mxltools {

    requires javafx.controls;
    requires javafx.fxml;
    requires javafx.web;

    requires org.controlsfx.controls;
    requires com.dlsc.formsfx;
    requires validatorfx;
    requires org.kordamp.ikonli.javafx;
    requires org.kordamp.bootstrapfx.core;
    requires eu.hansolo.tilesfx;
    requires org.apache.commons.lang3;
    requires fastjson;
    requires java.sql;

    opens com.maxlong.mxltools to javafx.fxml;
    exports com.maxlong.mxltools;
}