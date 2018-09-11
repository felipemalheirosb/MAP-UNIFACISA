
public class Pizzaria {
	
	protected PizzaBuilder pizzaria;
	 
    public Pizzaria(PizzaBuilder pizzaria) {
        this.pizzaria = pizzaria;
    }
 
    public void fazerPizza() {
    	pizzaria.createDough();
    	pizzaria.createSauce();
    	pizzaria.createCheese();
    	pizzaria.createVeggies();
    	pizzaria.createPepperoni();
    	pizzaria.createClam();
    }
 
    public PizzaProduct getPizza() {
        return pizzaria.getPizza();
    }
    
}
