package es.studium.Ejemplos;

public class EjemploII
{

	public static void main(String[] args) throws InterruptedException
	{
		final int TAM = 5;
		int tabla[] = new int[TAM];

		System.out.println("Calculando..... \n");
		Thread.sleep(2 * 3000); // Tiempo de espera
		for (int i = 0; i <= TAM; i++)
		{
			try
			{
				tabla[i] = i * 2;
				// M�s instrucciones
				// M�s todav�a
				// A�n m�s
				// ....
			} catch (IndexOutOfBoundsException ioobe)
			{
				// Instrucciones de la excepci�n.
				

			} catch (ArithmeticException ae) // ae es el objeto para las excepciones.
			{

				System.out.println("Error:" + ae.getMessage()); // No se puede dividir entre cero.

			} catch (Exception e)
			{

				System.out.println("Error:" + e.getMessage()); // Cuando no hay ninguna de las anteriores lo capta aqu�.
				throw(e); //Se lo lanza al sistema operativo
			} finally
			{
				// Instrucci�n que siempre se ejecutan tras el Try sin error o tras el Try con
				// error y el catch correspondiente.
			}

		}

		for (int elemento : tabla)
		{

			System.out.println(elemento);
		}

	}

}
