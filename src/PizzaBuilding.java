
public abstract class PizzaBuilding {

	protected abstract Pizza makePizza(String typeOfPizza);
	
	public Pizza orderPizza(String typeOfPizza) {
		Pizza pizza = makePizza(typeOfPizza);
		
		pizza.makePizza();
		return pizza;
	}
	
}
