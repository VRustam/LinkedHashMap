package Section12;

import java.util.LinkedHashMap;
import java.util.Map;

public class LinkedHashMap_ders {

    public static void main(String[] args) {
        LinkedHashMap<String,Integer> linkedHashMap = new LinkedHashMap<>();
        linkedHashMap.put("Rustem",1);
        linkedHashMap.put("aydin",2);
        linkedHashMap.put("Emilia",3);
        linkedHashMap.put("Emil",4);

        for(String keys:linkedHashMap.keySet()){
            System.out.println(keys);
        }
        for(Integer values : linkedHashMap.values()){
            System.out.println(values);
        }

        for (Map.Entry <String,Integer> mueyyen : linkedHashMap.entrySet()){
            System.out.println(mueyyen);
        }

    }



}
