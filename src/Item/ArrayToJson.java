package Item;

import groovy.json.JsonOutput;
import org.json.simple.JSONObject;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;

public class ArrayToJson {

    //배열 값을 받은 값을 json 으로 변환
    public JSONObject getJSON(String[] key, Object[]... value) {
        JSONObject json = null;

        List<Object> list = Arrays.asList(value);
        list.forEach(o -> {
            if (o instanceof String) {

            } else if (o instanceof Integer) {

            } else if (o instanceof Long) {

            } else if (o instanceof Character) {

            } else if (o instanceof Boolean) {

            } else if (o instanceof Byte) {

            } else if (o instanceof Short) {

            } else if (o instanceof Float) {

            } else if (o instanceof Double) {

            } else {

            }
        });

        return json;
    }
}
