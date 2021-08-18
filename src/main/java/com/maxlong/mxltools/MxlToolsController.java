package com.maxlong.mxltools;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.alibaba.fastjson.serializer.SerializerFeature;
import com.maxlong.mxltools.utils.DateFormat;
import com.maxlong.mxltools.utils.DateUtil;
import javafx.fxml.FXML;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import org.apache.commons.lang3.StringUtils;

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
        String pretty = "";
        if(StringUtils.isNotBlank(vaule)){
            try {
                Object object = JSONObject.parse(vaule);
                pretty = JSON.toJSONString(object, SerializerFeature.PrettyFormat, SerializerFeature.WriteMapNullValue,
                        SerializerFeature.WriteDateUseDateFormat);
            } catch (Exception e) {
                System.err.println(e);
            }
        }
        aftJsonArea.setText(pretty);
    }
}
