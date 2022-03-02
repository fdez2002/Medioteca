
public class Prueba {
	
	

	public static void main(String[] args) {
		
		System.out.println(validarNombre("200"));
		
		

	}
	
	
	
	public static boolean validarNombre(String nombre) {

        return nombre.matches("^[12-99]{2}$");

    }

}
