

package aula7;
import java.util.*;
import java.util.Scanner;
public class Exerc724 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Scanner entradaTeclado = new Scanner(System.in);
		
		String [] fruta =  {"papaia", "couve", "alface", "laranja", "morango","uva","folha de aborbora"};
		
		
		
		for (int contador = 0; contador < fruta.length; contador++) {	
			
			for ( contador = 0; contador < fruta.length; contador++) {
			
				if (fruta[contador].equals("laranja")) {
					fruta[contador]= "goiaba";
				
			}
				 System.out.println( fruta[contador] );
		
				 
				 // outras metodologia para resolcao do mesmo problema
				//fruta[3] ="goiaba";
				
			//	for (int i = 0; i < fruta.length; i++) {
				//	System.out.println(fruta[i]);
			//	}
				
}
}
}
}