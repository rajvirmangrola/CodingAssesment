import java.util.LinkedList;
import java.util.List;

public class LinkListSum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		LinkedList<Integer> list1 = new LinkedList<Integer>();
		list1.add(2);
		list1.add(3);
		list1.add(5);

		LinkedList<Integer> list2 = new LinkedList<Integer>();

		list2.add(4);
		list2.add(6);
		list2.add(7);
		

		System.out.println(new LinkListSum().addition(list1, list2));
	}

	public List<Integer> addition(LinkedList<Integer> list1, LinkedList<Integer> list2) {

		LinkedList<Integer> result = new LinkedList<>();
		if (list1.size() == list2.size()) {
			for (int i = 0; i < list1.size(); i++) {
				result.add(list1.get(i) + list2.get(i));

			}
			return result;
		} else {

			return null;
		}

	}

}
