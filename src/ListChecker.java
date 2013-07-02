import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

public class ListChecker {
	
	private ArrayList<Person> FamilyOrdered;
	private ArrayList<Person> FamilyRandom;
	private int TimesListTried = 0;
	
	public ListChecker(ArrayList<Person> Family) throws Exception{
		
		if(!this.is_validList(Family)){
			throw new Exception("Mathimatically Impossible to return Valid List");		
		}
		
		this.FamilyOrdered = new ArrayList<Person>(Family);
		this.FamilyRandom = new ArrayList<Person>(Family);
		
		this.shuffle();
	}
	
	private boolean is_validList(ArrayList<Person> Family){
		int length = Family.size();
		Collections.sort(Family, new SortFamily());

		int lastIndex = 0;
		int firstIndex = 0;
		String current_name = "";

		for(int i = 0; i < length; i++){
			
			if(!Family.get(i).getFamily_name().equals(current_name)){
				current_name = Family.get(i).getFamily_name();
				firstIndex = i;
			}
			
			lastIndex = i;
			
			if( (lastIndex - firstIndex) >= (length / 2) ){
				return false;
			}
			
		}
		return true;

	}
	
	private void shuffle(){
		Collections.shuffle(this.FamilyRandom, new Random(System.nanoTime()));
	}
	
	public String getList(){
		this.TimesListTried++;
		
		int length = this.FamilyOrdered.size();
		String result = "";
		
		for(int i = 0; i < length; i++){
			if(this.FamilyOrdered.get(i).getFamily_name().equals(this.FamilyRandom.get(i).getFamily_name())){
				this.shuffle();
				return getList();
			}
			result += this.FamilyOrdered.get(i).getFirst_name() + " " +
					this.FamilyOrdered.get(i).getFamily_name() + " will give a gift to " +
					this.FamilyRandom.get(i).getFirst_name() + " " +
					this.FamilyRandom.get(i).getFamily_name() + '\n';
		}
			
		return result + '\n' + '\t' + "Function Called " + this.TimesListTried + " Times";
	}
	
}
