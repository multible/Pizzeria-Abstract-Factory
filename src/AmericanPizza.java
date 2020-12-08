
public class AmericanPizza extends Pizza{

	PizzaFactory pizzaFactory;
	
	
	public AmericanPizza(PizzaFactory pizzaFactory) {
		this.pizzaFactory = pizzaFactory;
	}
	
	@Override
	void makePizza() {
		System.out.println("Making pizza " + getName());
		
		dough = pizzaFactory.addPDough();
		cheese = pizzaFactory.addPCheese();
		
	}

	
}
