package modificadorprotected;

public class Animal {
    public String especie;
    protected int numeropatas;
    private String barulho;
    
	@Override
	public String toString() {
		return "Animal [especie=" + especie + ", numeropatas=" + numeropatas + "]";
	}
    
    
}
