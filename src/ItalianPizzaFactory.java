
public class ItalianPizzaFactory implements PizzaFactory{

	@Override
	public PDough addPDough() {
		// TODO Auto-generated method stub
		return new ThinCrustDough();
	}

	@Override
	public PCheese addPCheese() {
		// TODO Auto-generated method stub
		return new RealCheese();
	}


}
