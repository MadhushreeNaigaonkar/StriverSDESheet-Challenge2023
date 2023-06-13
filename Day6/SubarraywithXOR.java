import java.util.ArrayList;
import java.util.HashMap;

public class SubarraywithXOR {
    public int solve(ArrayList<Integer> A, int B) {
        HashMap<Integer,Integer> hm = new HashMap<>();
        int count =0;
        int val =0;
        hm.put(0,1);
        for(int i=0;i<A.size();i++){
          val = val ^ A.get(i);
                if(hm.containsKey(val^B)){
                    count+=hm.get(val^B);
                }  
                hm.put(val,hm.getOrDefault(val,0)+1);
        }
        return count;
    }
}