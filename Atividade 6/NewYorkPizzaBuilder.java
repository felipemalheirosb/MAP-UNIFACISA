

public class NewYorkPizzaBuilder extends PizzaBuilder {

	    	public void createDough() {
	    		pizza.dough = new ThickCrustDough();
	    	}

	    	public void createSauce() {
	    		pizza.sauce = new PlumTomatoSauce();
	    	}

	    	public void createCheese() {
	    		pizza.cheese = new MozzarellaCheese();
	    	}

	       	public void createPepperoni() {
	    		pizza.pepperoni =  new SlicedPepperoni();
	    	}

	    	public void createClam() {
	    		pizza.clams = new FrozenClams();
	    	}

			@Override
			public void createVeggies() {
				// TODO Auto-generated method stub
				
			}
	  }