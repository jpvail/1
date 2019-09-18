package assignment03;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class ClassRoom{
	private List<Student> roster = new ArrayList<>();
	
	public List<Student> getRoster(){
		return this.roster;
	}

	public void addStudent(Student s){
		this.roster.add(s); 
	} 

	public void dropStudent(int id){
		for(int i =0; i < roster.size(); i++){
			if(roster.get(i).getId() == id){
				roster.remove(i); 
			}
		}
	}

	public String toString(){
		return roster.toString(); 

	}


	public void sortById(){
		for(int i = 0; i < roster.size(); i++){
			for(int j = 1; j < (roster.size()-i); j++){
					if(roster.get(j-1).getId() > roster.get(j).getId()){
						Student temp = roster.get(j-1);  
						this.roster.set(j-1, roster.get(j)); 
						this.roster.set(j, temp); 
 					}
		 	}
		}

	}


	public static void sortById(List<Student> list){
		for(int i = 0; i < list.size(); i++){
			for(int j = 1; j < (list.size()-i); j++){
					if(list.get(j-1).getId() > list.get(j).getId()){
						Student temp = list.get(j-1);  
						list.set(j-1, list.get(j)); 
						list.set(j, temp); 
 					}
		 	}
		}

	}
	

	public boolean isRegistered(int id){
		for(int i = 0; i < roster.size(); i++){
			if(roster.get(i).getId() == id){
				return true; 			
			}
		}
		return false; 
	}


	public List<Student> alsoRegisteredIn(ClassRoom... others){
		List<Student> roster3 = new ArrayList<>(); 
		if(others != null && others.length > 0){
			for (var c : others){
				List<Student> roster2 = c.getRoster();
				for(int i = 0; i < this.roster.size(); i++){
					Student temp = this.roster.get(i);  
					for(int j = 0; j < roster2.size(); j++){
						if(temp.getId() == roster2.get(j).getId() && !roster3.contains(temp)){
							roster3.add(temp); 
						}
					}		
				}
			}
			return roster3; 
		}
		return roster; 
	}

	public static List<Student> registeredInAll(ClassRoom... others){
		List<Student> roster2 = new ArrayList<>(); 
		if(others != null && others.length > 0){
			List<Student> tempRoster = others[0].getRoster();  
			Student tempStudent = null; 
			for(var k : tempRoster){
				int tempid = k.getId(); 
				int counter = 0; 
				for (var m : others){
					if(m.isRegistered(tempid)){
						counter++; 
					}
				}
				if(counter == others.length){
					tempStudent = k;  
				}
			}
			if(tempStudent != null && !roster2.contains(tempStudent)){
					roster2.add(tempStudent); 
			}
			return roster2; 
		}
		return roster2; 
	}

	
	
	public static List<Student> registeredInOne(ClassRoom... others){
		List<Student> returnList = new ArrayList<>();
		if(others != null && others.length > 0){
			for (var c : others){
				for(var k : c.getRoster()){
					returnList.add(k); 
				}
			}
			sortById(returnList);
			for(int i = 0; i < returnList.size(); i++){
				for(int j = 1; j < (returnList.size()-i); j++){
					if(returnList.get(j).getId() == returnList.get(j-1).getId()){
						returnList.remove(j); 
 					}
		 		}
			}
			return returnList; 
		}
		return returnList; 
	}

	
}
