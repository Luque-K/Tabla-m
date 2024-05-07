package Taab;
import java.io.FileWriter;
public class tabla {
 
	
		public void Imprimir_tabla(int num)
		{
		 try {
			 FileWriter archivo_out = new FileWriter("C:\\Users\\luque\\eclipse-workspace\\Tablas\\Tablas.txt");
			 archivo_out.append("Tablas de multiplicar del "+ num + '\n');
			 for(int i=0;i<=20;i++)
			{
				int r = num*i;
				System.out.println(r);
				archivo_out.append(num + " X " + i + " = "+r + '\n' );
			}
			archivo_out.close();
		    }
		    catch (Exception e)
			{
		    	System.out.println("Error: "+e.getMessage());
			}	
			}
		}




