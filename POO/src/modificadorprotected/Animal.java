package modificadorprotected;

public class Animal {
    public String especie;
    protected int numeropatas;
    
	@Override
	public String toString() {
		return "Animal [especie=" + especie + ", numeropatas=" + numeropatas + "]";
	}
    
    
}
