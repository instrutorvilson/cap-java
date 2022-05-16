package entidades;

public class Pessoa {
   private String nome;
   private String email; 
   
   public void setNome(String nome) {
	   this.nome = nome;
   }
   
   public void setEmail(String email) {
	   if(email.contains("@")) {
		   this.email = email;  
	   }
	   else {
		   System.out.println("Email inválido!");
	   }	   
   }
   
   public String getNome() {
	   return this.nome;
   }
   
   public String getEmail() {
	   return this.email;
   }
}

//modificador public -> fica visivel em todas as classes que instanciarem a classe
//modificador private -> fica visivel somente dentro da classe

