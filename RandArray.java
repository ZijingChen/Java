//random student order
//import java.util.Random;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class RandArray {
	public static void main(String[] args) {
		String[] arr={"1","cc","stella"};
		List<String> stringList = Arrays.asList(arr);
      	Collections.shuffle(stringList);
      	
      	stringList.toArray(arr);
      	
      	//System.out.println(Arrays.toString(arr));
      	for(String s : arr) {
      		System.out.println(s);
      	}
	}	

}
