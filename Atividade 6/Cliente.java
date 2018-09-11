
public class Cliente {
	
	public static void main(String[] args) {
		Pizzaria pizzaria = new Pizzaria(new NewYorkPizzaBuilder());
	 
	    pizzaria.fazerPizza();
	    PizzaProduct pizzaNY = pizzaria.getPizza();
	    
	    System.out.println(
	    		"Pizza|NY: "
	    				+ "Dough: "+ pizzaNY.dough
		    		    + "Cheese: "+ pizzaNY.cheese
		    		    + "Clams: "+ pizzaNY.clams
		    		    + "Pepperonni" + pizzaNY.pepperoni
		    		    + "Sauce" + pizzaNY.sauce
		    		    + "Veggies" + pizzaNY.veggies
	    		    );
	 
	    System.out.println();
	 
	    pizzaria = new Pizzaria(new ChicagoPizzaBuilder());
	    
	    pizzaria.fazerPizza();
	    PizzaProduct pizzaChicago = pizzaria.getPizza();
	    
	    System.out.println(
	    		"Pizza|Chicago "
	    			+ "Dough: "+ pizzaChicago.dough
	    		    + "Cheese: "+ pizzaChicago.cheese
	    		    + "Clams: "+ pizzaChicago.clams
	    		    + "Pepperonni" + pizzaChicago.pepperoni
	    		    + "Sauce" + pizzaChicago.sauce
	    		    + "Veggies" + pizzaChicago.veggies
	    		    );
		}
	}
