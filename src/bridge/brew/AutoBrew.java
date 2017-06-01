package bridge.brew;

import java.util.ArrayList;
import java.util.List;

public class AutoBrew implements IBrew {
	
	List<String> recipe;
	
	public AutoBrew() {
		recipe = new ArrayList<String>();
		
		recipe.add("Auto");
		recipe.add("boiler.heat(95)");
		recipe.add("sachet.insert(Tea)");
		recipe.add("cup.release");
		recipe.add("valve.open");
		recipe.add("valve.close");
	}

	@Override
	public List<String> showAllSteps() {
		return recipe;
	}

}
