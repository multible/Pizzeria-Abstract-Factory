
public class PizzeriaPizzaBuilding extends PizzaBuilding{

	@Override
	protected Pizza makePizza(String typeOfPizza) {

		Pizza thePizza = null;
		
		if(typeOfPizza.contentEquals("American")) {
			PizzaFactory pizzaIngredientsFactory = new AmericanPizzaFactory();
			thePizza = new AmericanPizza(pizzaIngredientsFactory);
			thePizza.setName("American Pizza");
		}
		else
			
	
		if(typeOfPizza.contentEquals("Italian")) {
			PizzaFactory pizzaIngredientsFactory = new ItalianPizzaFactory();
			thePizza = new AmericanPizza(pizzaIngredientsFactory);
			thePizza.setName("Italian Pizza");
		}
		
		return thePizza;
	}

}
