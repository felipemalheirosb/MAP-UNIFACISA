
public class NewYorkStyleClamPizza extends Pizza {
  	
	public NewYorkStyleClamPizza() {
		name = "NewYork Style Clam Pizza";
  		dough = "Extra Thick Crust Dough";
  		sauce = "Plum Tomato Sauce";

  		toppings.add("Shredded Mozzarella Cheese");
  		toppings.add("Frozen Clams from Chesapeake Bay");
  	}

  	void cut() {
  		System.out.println("Cutting the pizza into square slices");
  	}

}
