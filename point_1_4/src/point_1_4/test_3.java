package point_1_4;

import java.util.ArrayList;
import java.util.Arrays;


public class test_3 {
	public static void main(String[] args) {
		String buscar = "soh";
		
		String nombreEmpresa = "Heinsohn";
		int index = nombreEmpresa.indexOf(buscar);
		if(index > -1) {
			String data = nombreEmpresa.substring(index, index+3);
			if(data.equals(buscar)) {
				System.out.print("texto: " + buscar + " existe en la cadena entregada" );
			}else {
				System.out.print("texto: " + buscar + " NO existe en la cadena entregada" );
			}			
		}	
    }	
	
}
