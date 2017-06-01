package bridge.drink;

import java.util.List;

public class GreenTea extends HotDrink {

	public GreenTea(String tr) {
		super(tr);
	}
	
	public List<String> displayDrink(){
		System.out.println("Green Tea.");
		
		return super.displayDrink();
		
	}

}
