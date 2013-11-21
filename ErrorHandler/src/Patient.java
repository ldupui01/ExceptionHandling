public class Patient {
	private String name;
	private int age;
	private Patient nextPatient;
	private Patient prevPatient;

	public Patient(String name, int age) {
		this.name = name;
		this.age = age;
		this.nextPatient = null;
		this.prevPatient = null;
	}

	public String getName() {
		return name;
	}

	public int getAge() {
		return age;
	}

	public Patient getNext() {
		return nextPatient;
	}

	public Patient getPrev() {
		return prevPatient;
	}

	public void setNext(Patient newPatient) {
		this.nextPatient = newPatient;
	}

	public void setPrev(Patient oldPatient) {
		this.prevPatient = oldPatient;
	}

	public void delPatient() {
		if (this.nextPatient == null) {
			this.prevPatient.setNext(null);
		} else if (this.prevPatient == null) {
			this.nextPatient.setPrev(null);
		} else {
			this.prevPatient.setNext(this.nextPatient);
			this.nextPatient.setPrev(this.prevPatient);
		}
	}

}
