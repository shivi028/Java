import java.util.HashMap;
public class elementFrequency {
    public static void main(String[] args){
        HashMap<Integer, Integer> h = new HashMap<Integer, Integer>();
        int[] arr = new int[] {2, 4, 3, 2, 4, 2, 2, 1, 5};

        for(int i=0; i<arr.length; i++){
            if(h.containsKey(arr[i])){
                h.put(arr[i], h.get(arr[i]) + 1);
            }
            else{
                h.put(arr[i], 1);
            }
        }
        System.out.println(h);
    }
}
