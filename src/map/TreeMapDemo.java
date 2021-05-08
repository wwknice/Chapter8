package map;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class TreeMapDemo {
    public static void main(String[] args) {
        TreeMap<String, String> map = new TreeMap<>();
        map.put("henan","河南"); //entry 实例
        map.put("henbei","河北");
        map.put("hubei","湖北");
        map.put("hubei","湖北1"); // 键重复会覆盖掉原有的值
       /* map.put("null" ,"空1");
        map.put(null ,"空2");
        map.put(null,null);*/
        System.out.println(map);

        for (Map.Entry<String,String > m : map.entrySet()){
            System.out.println(m);
        }
        for (String k : map.keySet()){
            System.out.println( k + "=" + map.get(k));
        }

        for ( String v : map.values()){
            System.out.println(v);
        }
    }
}


