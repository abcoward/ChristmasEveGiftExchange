
public class Person {
	
	private String first_name;
	private String family_name;
	
	public Person(String first_name, String family_name){
//s = Character.toUpperCase(family_name.charAt(0)) + family_name.substring(1);
		this.family_name = Character.toUpperCase(family_name.charAt(0)) + family_name.substring(1).toLowerCase().trim();
		this.first_name = Character.toUpperCase(first_name.charAt(0)) + first_name.substring(1).toLowerCase().trim();
	}

	public String getFirst_name() {
		return first_name;
	}
	
	public void setFirst_name(String first_name) {
		this.first_name = Character.toUpperCase(first_name.charAt(0)) + first_name.substring(1).toLowerCase().trim();
	}
	
	public String getFamily_name() {
		return family_name;
	}
	
	public void setFamily_name(String family_name) {
		this.family_name = Character.toUpperCase(family_name.charAt(0)) + family_name.substring(1).toLowerCase().trim();
	}
	
	
}
