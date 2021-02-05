package Data;

public class Coffee extends IngrendientDecorator {
DrinkType d;
	
	public  Coffee (DrinkType d) {
		this.d = d;
	}

	@Override
	public String getRecipe() {
		// TODO Auto-generated method stub
		return d.getRecipe() + " + Coffee Ing";
	}

}
