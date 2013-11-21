import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

public class ErrorHandlingOnUserInput {
	
	public int average(ArrayList<Integer> myList, int iteration){
		int result=0;
		for (int i=0;i<iteration;i++){
			result += myList.get(i);
		}
		result = result/iteration;
		return result;
	}
	
	public void launcher(){
		Scanner sc = new Scanner(System.in);
		boolean check = false;
		int myNumb = 0;
		ArrayList<Integer> myIntList =  new ArrayList<>();
		System.out.println("enter the number of value to enter : ");
		try{
			myNumb = sc.nextInt();
		} catch(InputMismatchException ex){
			System.out.println("this was not an integer, you must enter an integer");
			this.launcher();
		}
		
		
		
		while(!check){
			System.out.println("enter a number : ");
			String myString = sc.next();
			try{
				myIntList.add(Integer.parseInt(myString));
				myIntList.get(myNumb-1);
				check = true;
			}catch (NumberFormatException ex){
				System.out.println("this was not an integer, please enter an integer");
			}catch (IndexOutOfBoundsException ex){
				System.out.println("not finished");
				check = false; // better to do an iterator checker than to use error handler for that
			}
		}
		System.out.println("result: " + this.average(myIntList, myNumb));
	}
	
	public static void main(String[] args) {
		ErrorHandlingOnUserInput ehoui = new ErrorHandlingOnUserInput();
		ehoui.launcher();

	}

}
