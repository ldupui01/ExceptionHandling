/**add new pateint in list
 * Age has to be sup or equal to zero and inferior to 130
 * 
 * @throws IllegalArgumentException
 */

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MorePatient {
	Patient head = null;
	
	public void addPatient(Patient newPatient){
		if (head == null){
			head = newPatient;
		}else{
			Patient auxPat = head;
			while (auxPat.getNext() != null){
				auxPat = auxPat.getNext();
			}
			auxPat.setNext(newPatient);
		}
	}
	
	public void printList(){
		if (head == null){
			System.out.println("empty");;
		}else{
			Patient auxPat = head;
				//System.out.println(auxPat.getName());
			while (auxPat.getNext() != null) {
				System.out.println(auxPat.getName());
				auxPat = auxPat.getNext();
			}
			System.out.println(auxPat.getName());
		}
	}
	
	public void launch(){
		//create the queue
		ArrayList<Patient> patientList = new ArrayList();
		//Map<String, Integer> patientList = new HashMap<String, Integer>();
		
		patientList.add(new Patient ("John", 12));
		patientList.add(new Patient ("Bob", 15));
		patientList.add(new Patient ("Georges", 160));
		patientList.add(new Patient ("Richard", 17));
		
		for (int i=0;i<patientList.size();i++){
			//try{
				int age = patientList.get(i).getAge();
				if (age< 0 || age >130){
					throw new IllegalArgumentException ("the age is not between 0 and 130");
				}
			//}
			this.addPatient(patientList.get(i));
			
		}
		this.printList();
	}
	
	public static void main(String[] args) {
		MorePatient mp = new MorePatient();
		mp.launch();
	}
	
}
