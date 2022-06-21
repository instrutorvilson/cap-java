package singleton;

public class Monitor {
	private static Monitor monitor;
	
     private Monitor() {
    	 
     }
     
     public static Monitor getInstance() {
    	if(monitor == null) {
    		monitor = new Monitor();
    	}
    	return monitor; 
     }
}
