package factorymethod;

import java.util.concurrent.atomic.AtomicMarkableReference;

public class FactoryMethod {
   public static Iimposto getImposto(EImposto imposto) {
	   if(imposto == EImposto.ICMS) {
		   return new Icms();
	   } 
	   else if(imposto == EImposto.IPI) {
		   return new Ipi();
	   }	   
	   
	   return null;
   }
}
