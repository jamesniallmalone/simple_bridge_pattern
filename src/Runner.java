import bridge.brew.AutoBrew;
import bridge.brew.ManualBrew;
import bridge.drink.GreenTea;
import bridge.drink.HotDrink;
import bridge.drink.Tea;

public class Runner {

	public static void main(String[] args){
		Tea makeTea = new Tea("Make tea");
		
		performAction(makeTea);
		
		GreenTea gt = new GreenTea("Make green tea");
		
		performAction(gt);
	}

	private static void performAction(HotDrink drink) {
		drink.setBrew(new ManualBrew());
		drink.displayDrink();
		
		for (String dr : drink.displayDrink()){
			System.out.println(dr);
		}
		
		drink.setBrew(new AutoBrew());
		drink.displayDrink();
		
		for (String dr : drink.displayDrink()){
			System.out.println(dr);
		}
	}

}
