import java.util.ArrayList;


public class ListMaker {

	private ArrayList<Person> Family;
	
	public ListMaker(){
		this.Family = new ArrayList<Person>();
	}
	
	public void addPerson(Person person){
		this.Family.add(person);
	};
	
	public void addPerson(String first_name, String family_name){
		this.Family.add(new Person(first_name,family_name));
	};
	
	public void removePerson(int index){
		this.Family.remove(index);
	}
	
	public void removePerson(Person person){
		this.Family.remove(person);
	}
	
	public void removePerson(String first_name, String family_name){
		//this is more complex finish later
	}
	
	public String getCurrentList(){
		String result = "";
		for(int i = 0; i < this.Family.size(); i++){
			result += this.Family.get(i).getFirst_name() + ' ' + this.Family.get(i).getFamily_name() + '\n';
		}
		return result;
	}
	
	public String getFinalList(){
		try{
			ListChecker lc = new ListChecker(this.Family);
			return lc.getList();
		} catch(Exception e){
			return e.getMessage();
		}
	}
}
