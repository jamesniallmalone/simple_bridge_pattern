package bridge.drink;

import java.util.List;

public class Tea extends HotDrink {

	public Tea(String tr) {
		super(tr);
	}
	
	public List<String> displayDrink(){
		System.out.println("Tea.");
		
		return super.displayDrink();
		
	}

}
