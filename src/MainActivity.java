import Item.ArrayToJson;
import lombok.extern.slf4j.Slf4j;

public class MainActivity {
    /**
     * @TODO 데이터 타입 변환 시키기
     * Array(배열) <-> json
     * json <-> ArrayList
     * ArrayList <-> Map
     * Map <-> json
     */
    static ArrayToJson arrayToJson = new ArrayToJson();

    public static void main(String[] args) {
        Object[] key = {"asd", "adf", "sfa"};
        Object[] value = {"erfewr", 134, 1.34};
        System.out.println(arrayToJson.getJSON(key, value));

    }
}
