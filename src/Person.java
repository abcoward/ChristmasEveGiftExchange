
public class Person {
	
	private String first_name;
	private String family_name;
	
	public Person(String first_name, String family_name){
		this.family_name = family_name;
		this.first_name = first_name;
	}

	public String getFirst_name() {
		return first_name;
	}
	
	public void setFirst_name(String first_name) {
		this.first_name = first_name;
	}
	
	public String getFamily_name() {
		return family_name;
	}
	
	public void setFamily_name(String family_name) {
		this.family_name = family_name;
	}
	
	
}
