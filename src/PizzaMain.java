
public class PizzaMain {

	public static void main(String[] args) {
		
		PizzaBuilding MakePizzas = new PizzeriaPizzaBuilding();
		
		Pizza american = MakePizzas.orderPizza("American");
		System.out.println(american +"\n");

		Pizza italian = MakePizzas.orderPizza("Italian");
		System.out.println(italian +"\n");
	}

}
