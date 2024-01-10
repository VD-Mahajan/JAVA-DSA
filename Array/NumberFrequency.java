package Array;

import java.util.HashMap;
import java.util.Map;

public class NumberFrequency {
	
	public static void main(String[] args) {
		int[] arr = new int[] {1,2,3,4,1,2,3,4,2,3,4,5,6};
		
		HashMap<Integer,Integer> hm = new HashMap<Integer, Integer>();
		
		for (int i = 0; i < arr.length; i++) {
			if(!hm.containsKey(arr[i])) {
				hm.put(arr[i],1);
			}else {
				hm.put(arr[i],hm.get(arr[i])+1);
			}
		}
		
		for(Map.Entry<Integer,Integer> entry : hm.entrySet()) {
			System.out.println(entry.getKey()+"   :   "+entry.getValue());
		}
	}
}
