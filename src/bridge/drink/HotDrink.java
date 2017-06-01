package bridge.drink;

import java.util.List;

import bridge.brew.IBrew;

public class HotDrink {
	
	protected IBrew brewingInstruction;//reference to implementer... instantiated at runtime
	
	protected String drinklabel;
	
	public void setBrew(IBrew b){
		brewingInstruction = b;
	}
	
	public HotDrink(String tr){
		this.drinklabel = tr;
	}
	
	public List<String> displayDrink(){
		System.out.println("What we do: " + drinklabel);
		return brewingInstruction.showAllSteps();
	}
}
