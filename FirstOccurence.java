import java.util.LinkedHashMap;
import java.util.Map;

public class FirstOccurence {

	public static void main(String arg[]) {
	String s = arg[0];
	System.out.println(Duplicates(s));

}

public static char Duplicates(String s) {

	// Can the string print only lower case or even the uppercase
	char ch[] = s.toCharArray();

	Map<Character, Integer> hmap = new LinkedHashMap<>();
	for (Character c : ch) {
		if (hmap.containsKey(c)) {
			hmap.put(c, hmap.get(c) + 1); // a,i,r,p, l, a,n,e
		} else {
			hmap.put(c, 1);
		}

	}
	;
	for (Map.Entry<Character, Integer> entry : hmap.entrySet()) {
		if (entry.getValue() == 1) {
			return entry.getKey();
		}
	}
	try {
		return (Character) null;
	} catch (NullPointerException e) {
		System.out.println("null");
	}

	return 0;

}
	
}
