import java.util.Arrays;
import java.util.Collections;

public class CollectionsClass {

	public static void main(String[] args) {
		
		String text = "SKY IS BLUE";
		String[] textList = text.split(" ");
		Collections.reverse(Arrays.asList(textList));
		System.out.println(Arrays.toString(textList));

	}

}
