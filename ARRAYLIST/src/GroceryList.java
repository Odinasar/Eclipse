//import java.util.List;
//import java.util.ArrayList;
import java.util.*;

public class GroceryList {
	
//	List GroceryList=new ArrayList();
	List<String>groceryList = new ArrayList<String>();
	//List<Integer>groceryList = new ArrayList<Integer>();

	public void addGroceryItem(String item) {
		
		groceryList.add(item);
		
	}
	
	public void printGroceryList() {
		
		System.out.println("You have "+ groceryList.size()+" item in your grocery list");
		for (int i=0;i<groceryList.size();i++) {
			System.out.println((i+1)+ "."+ groceryList.get(i));
		}
	}
	
	public void modifyGroceryItem(int position,String newItem) {
		groceryList.set(position, newItem);
	}
	
	public void removeGroceryItem(int position) {
		//String theItem=groceryList.get(position);
		groceryList.remove(position);
		
	}
	
	public String findItem(String SearchItem) {
		//boolean exists=groceryList.contains(SearchItem);
		int position =groceryList.indexOf(SearchItem);
		if(position>=0) {
			return groceryList.get(position);
		}
		return null;
		
	}
	
	
	
}
