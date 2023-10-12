package Iterator;
import java.util.Iterator;
import java.util.List;
public class SimpleIterator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> intList = List.of(1,11,2,22,3,33,4,44,5,55);
		Iterator it = intList.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		

	}

}
