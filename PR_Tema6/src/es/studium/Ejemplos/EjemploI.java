package es.studium.Ejemplos;

public class EjemploI
{

	public static void main(String[] args)
	{

		int a,b;
		a=7;	  //Exception in thread "main" java.lang.ArithmeticException: / by zero
		b=0;	  //at es.studium.Ejemplos.EjemploI.main(EjemploI.java:13) Produciria este error. 
	    try 
	    {
			System.out.println(a/b); //Intenta la funcion y si no coge (catch) la excepcion de abajo.
			System.out.println("Tarea finalizada con éxito");
	    }
		catch(ArithmeticException ae) //ae es el objeto para las excepciones. 
		{
			
			System.out.println("Error:"+ae.getMessage()); //No se puede dividir entre cero
			
		}
		
	}

}
