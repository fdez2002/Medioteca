import java.util.ArrayList;

public class Prueba {
	
	

	public static void main(String[] args) {
		
		System.out.println(validarNombre("200"));
		
		

	}
	
	
	
	public static boolean validarNombre(String nombre) {

        return nombre.matches("^[12-99]{2}$");

    }
	public static ArrayList<Discos> listaDiscos = new ArrayList<Discos>();;//Array de discos
	public static Discos disco = new Discos();
	listaDiscos.add(new Discos("12345678910111213", 1991, "Nevermind", "Nirvana", "Rock", "Cancion1-Cancion2", "CD", 577, "12/08/2019", 5.2));//Disco 1
	listaDiscos.add(new Discos("22345678910111213", 1996, "Ramours", "Fleetwood", "Rock", "Cancion1-Cancion2", "CD", 568, "13/08/2019", 9.2));//Disco 2
	listaDiscos.add(new Discos("32345678910111213", 1999, "Revolver", "The Beatles", "Rock", "Cancion1-Cancion2", "CD", 577, "14/08/2019", 7.2));//Disco 3
}
