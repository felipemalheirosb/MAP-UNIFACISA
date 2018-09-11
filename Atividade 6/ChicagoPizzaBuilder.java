

public class ChicagoPizzaBuilder extends PizzaBuilder {

	    	public void createDough() {
	    		pizza.dough = new ThinCrustDough();
	    	}

	    	public void createSauce() {
	    		pizza.sauce = new MarinaraSauce();
	    	}

	    	public void createCheese() {
	    		pizza.cheese = new ReggianoCheese();
	    	}

	    	
	    	public void createPepperoni() {
	    		pizza.pepperoni = new SlicedPepperoni();
	    	}

	    	public void createClam() {
	    		pizza.clams =  new FreshClams();
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

			@Override
			public void createVeggies() {
				// TODO Auto-generated method stub
				
			}

	  
}
