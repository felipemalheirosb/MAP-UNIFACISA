
public abstract class PizzaBuilder {
		
		protected PizzaProduct pizza = new PizzaProduct();
		
		public abstract void createDough();
		public abstract void createSauce();
		public abstract void createCheese();
		public abstract void createVeggies();
		public abstract void createPepperoni();
		public abstract void createClam();
		
		public PizzaProduct getPizza(){
			return pizza;
		};
}
