
public class AmericanPizzaFactory implements PizzaFactory{

	@Override
	public PDough addPDough() {
		// TODO Auto-generated method stub
		return new ThickCrustDough();
	}

	@Override
	public PCheese addPCheese() {
		// TODO Auto-generated method stub
		return new PlasticCheese();
	}


}
