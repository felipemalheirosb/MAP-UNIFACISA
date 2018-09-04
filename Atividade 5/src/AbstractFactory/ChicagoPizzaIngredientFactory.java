package AbstractFactory;

public class ChicagoPizzaIngredientFactory implements PizzaIngredientFactory {

	    	public Dough createDough() {
	    		return new ThinCrustDough();
	    	}

	    	public Sauce createSauce() {
	    		return new MarinaraSauce();
	    	}

	    	public Cheese createCheese() {
	    		return new ReggianoCheese();
	    	}

	    	public Veggies[] createVeggies() {
	    		Veggies veggies[] = { new BlackOlives(),
	    		                      new Spinach(),
	    		                      new Eggplant() };
	    		return veggies;
	    	}

	    	public Pepperoni createPepperoni() {
	    		return new SlicedPepperoni();
	    	}

	    	public Clams createClam() {
	    		return new FreshClams();
	    	}
	    	
			public interface Clams {
				   public String toString();
			}
			
			public interface Cheese {
				   public String toString();
			}
			
			public interface Sauce {
				    public String toString();
			}
			
			public interface Dough {
			  	public String toString();
			}
			
			public interface Pepperoni {
			  	public String toString();
			}

	  
}
