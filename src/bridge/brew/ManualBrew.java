package bridge.brew;

import java.util.ArrayList;
import java.util.List;

public class ManualBrew implements IBrew {
	
	private List<String> recipe = new ArrayList<String>();

	public ManualBrew() {
		recipe.add("Manual: ");
		recipe.add("Boil kettle ");
		recipe.add("Add tea to teapot ");
		recipe.add("Add boiling water to teapot ");
		recipe.add("Drink ");
		
	}
	
	@Override
	public List<String> showAllSteps() {
		return recipe;
	}

}
