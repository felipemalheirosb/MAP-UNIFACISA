package AbstractFactory;

import AbstractFactory.ChicagoPizzaIngredientFactory.Pepperoni;

public class SlicedPepperoni implements Pepperoni, AbstractFactory.Pepperoni {
	
	public String toString() {
	      return "Sliced Pepperoni";
	    }
}
