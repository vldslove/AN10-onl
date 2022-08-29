package lesson12;

import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;

public class MainClass {
    public static void main(String[] args) {

        WorkerCard worker = new WorkerCard("Ivan", 30, new Report(100,150,300,true), 123, "12.07", true);

        Map<String, WorkerCard> newMap = new LinkedHashMap<>();
        newMap.put("1", worker);
        newMap.put("2", new WorkerCard("Andrey", 25, new Report(500,1000, 600, true), 123, "12.08", true));
        printMap(newMap);



    }
    public static <K,V> void printMap(Map<K,V> map) {
        Iterator<Map.Entry<K, V>> iterator = map.entrySet().iterator();
        while (iterator.hasNext()) {
            Map.Entry<K, V> entry = iterator.next();
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
    }
}
