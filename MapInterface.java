import java.util.HashMap;
import java.util.Map;

public class MapInterface {
    public static void main(String[] args) {
        Map<String,Integer> obj=new HashMap<String,Integer>();
        obj.put("Sai”,32);
        obj.put("Bhaskar", 12);
        obj.put("Aruna", 56);
        obj.put("Sridevi", 64);
        for(Map.Entry<String,Integer> m:obj.entrySet()){
            System.out.println(m.getKey()+" = "+m.getValue());
        }
    }
}
