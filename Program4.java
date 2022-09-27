import java.util.HashMap;
import java.util.Map;

public class Program4 {
	public static void main(String[] args) {
		try {
			HashMap<Integer, Integer> hashMap = new HashMap<>();
			int arr1[] = { 1, 2, 3, 4, 5, 6, 7, 8, 9 };
			int arr2[] = { 1, 2, 8, 9, 12, 46, 76, 82, 15, 20, 30 };
			int count = 0;
			for (int i = 0; i < arr1.length; i++) {
				count = 0;
				for (int j = 0; j < arr2.length; j++) {
					if (arr2[j] % arr1[i] == 0) {
						count++;

					}

				}
				hashMap.put(arr1[i], count);
			}
			for (Map.Entry m : hashMap.entrySet()) {
				System.out.print(m.getKey() + ":" + m.getValue() + ",");
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
