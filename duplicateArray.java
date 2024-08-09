import java.util.HashMap;
import java.util.Map;

public class duplicateArray {
    public static void main(String[] args){
        HashMap<Integer, Integer> h = new HashMap<Integer, Integer>();
        int[] arr = new int[] {2, 4, 3, 2, 4, 2, 2, 1, 5};

        // this is also a way to store the frequency of elements in hashmap
        for (int i = 0; i < arr.length; i++) {
            h.put(arr[i], h.getOrDefault(arr[i], 0) + 1);
        }

         for (Map.Entry<Integer, Integer> entry : h.entrySet()) {
            if (entry.getValue() > 1) {
                System.out.println("Key: " + entry.getKey() + ", Value: " + entry.getValue());
            }
        }
    }
    
}
