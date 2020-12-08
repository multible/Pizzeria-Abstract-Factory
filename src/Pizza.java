
public abstract class Pizza {

	private String name;
	
	PDough dough;
	PCheese cheese;
	
	public String getName() { return name;}
	public void setName(String newName) { name = newName;}
	
	abstract void makePizza();
	
	public String toString() {
		
		String infoPizza = "The " + name + " has the dough " + dough + " and the cheese " + cheese;
		
		return infoPizza;
	}
	
}
