public class ItalianPizza extends Pizza{

	PizzaFactory pizzaFactory;
	
	
	public ItalianPizza(PizzaFactory pizzaFactory) {
		this.pizzaFactory = pizzaFactory;
	}
	
	@Override
	void makePizza() {
		System.out.println("Making pizza " + getName());
		
		dough = pizzaFactory.addPDough();
		cheese = pizzaFactory.addPCheese();
		
	}

	
}
