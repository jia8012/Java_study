import java.util.HashMap;
import java.util.Map;

public class MapDemo {
    public static void main(String[] args) {
        Map<String,String> map = new HashMap<>();
        map.put("writer", "Tom");
        map.put("title", "Cat And Mouse");
        map.put("Publication time", "2008");
        for (Map.Entry<String, String> entry : map.entrySet()) {
            System.out.println(entry.getKey() + "--->" + entry.getValue());
        }
        map.put("Publication time","2000");
        map.put("Pages","200");
        for (Map.Entry<String,String> entry : map.entrySet()) {
            System.out.println(entry.getKey() + "--->" + entry.getValue() );
        }
        System.out.println(map.size());
        System.out.println(map.isEmpty());
        System.out.println(map.containsKey("writer"));
        System.out.println(map.containsValue("weiter"));
        System.out.println(map.containsValue("Tom"));
        map.put("num",null);
        System.out.println("-------------");
        System.out.println(map.getOrDefault("title",""));
        System.out.println(map.getOrDefault("sd","asdf"));
        System.out.println(map.get("writer"));
        for (Map.Entry<String,String> entry : map.entrySet()) {
            System.out.println(entry.getKey() + "--->" + entry.getValue() );
        }
        map.clear();
        System.out.println(map.size());
        System.out.println(map.isEmpty());



    }
}
