package Item;

import org.json.simple.JSONObject;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ArrayToJson {

    //instanceof
    //배열 값을 받은 값을 json 으로 변환
    public JSONObject getJSON(Object[] key, Object[] value) {
        assert key.length == value.length;
        Map<Object, Object> map = new HashMap<>();
        for (int i = 0; i<key.length; i++) map.put(key[i], value[i]);
        return new JSONObject(map);
    }

    public JSONObject getJSON(Object[] key, Object[]... value) {
        assert key.length == value.length;
        Map<Object, Object[]> map = new HashMap<>();
        for (int i = 0; i<key.length; i++) map.put(key[i], value[i]);
        return new JSONObject(map);
    }
}
