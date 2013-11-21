import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class CodeFlow {
	public static void launch(int userInput) {
		List<Integer> intList = new ArrayList<Integer>();
		intList.add(1);
		intList.add(2);
		intList.add(3);
		intList.add(4);
		intList.add(5);
		intList.add(6);
		
		try {
			intList.add(intList.get(userInput));
			intList.add(intList.get("string"));
		} catch (Exception ex) { // Not specific enough, does not catch all the error
			ex.printStackTrace();
		} catch (NullPointerException ex){ // error already handle by Java
			ex.printStackTrace();
		}
	}

	public static void main(String[] args) {
		CodeFlow cf = new CodeFlow();
		Scanner sc = new Scanner(System.in);
		System.out.println("enter a number : ");
		int myInt = sc.nextInt();
		cf.launch(myInt);
	}
}
