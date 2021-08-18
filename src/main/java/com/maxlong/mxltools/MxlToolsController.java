package com.maxlong.mxltools;

import com.maxlong.mxltools.utils.DateFormat;
import com.maxlong.mxltools.utils.DateUtil;
import javafx.fxml.FXML;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

/**
 * Created on 2021/8/18.
 *
 * @author xxxx
 * @Email xxxx
 */
public class MxlToolsController {

    @FXML
    private TextArea oriJsonArea;

    @FXML
    private TextArea aftJsonArea;

    @FXML
    protected void formatButtonAction() {
        String vaule = oriJsonArea.getText();
//        aftJsonArea.setText(JSON);
    }
}
