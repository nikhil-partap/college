import java.util.HashMap;
import java.util.Map;

public class HashMapDemo {
    public static void main(String[] args) {

        HashMap<String, Integer> hm = new HashMap<>();

        hm.put("Aman", 78);
        hm.put("Riya", 91);
        hm.put("Karan", 66);
        hm.put("Neha", 88);

        // System.out.println(hm.get(102));
        // System.out.println(hm.containsKey(104));
        // System.out.println(hm.remove(101));
        // System.out.println(hm);

        // for (String key : hm.keySet()) {
        // if (hm.get(key) >= 80) {
        // System.out.println(key + " " + "->" + " " + hm.get(key));
        // }
        // }
        for (Map.Entry<String, Integer> entry : hm.entrySet()) {
            String key = entry.getKey();
            int value = entry.getValue();

            if (value >= 80) {
                System.out.println(key + " " + "->" + " " + value);
            }

        }
    }
}