
public class NewYorkPizzaStore extends PizzaStore {
	
	Pizza createPizza(String item) {
          	if (item.equals("cheese")) {
              		return new NewYorkStyleCheesePizza();
          	} else if (item.equals("veggie")) {
          	    	return new NewYorkStyleVeggiePizza();
          	} else if (item.equals("clam")) {
          	    	return new NewYorkStyleClamPizza();
          	} else if (item.equals("pepperoni")) {
              		return new NewYorkStylePepperoniPizza();
          	} else return null;
  	}
	  

}
