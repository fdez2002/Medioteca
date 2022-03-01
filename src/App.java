import java.util.ArrayList;
import java.util.Scanner;

public class App {

	public static void main(String[] args) {
		
		ArrayList <Usuario> listaUsuarios = new ArrayList<Usuario>();
		
		listaUsuarios.add(new Usuario("111111B", "Antonio", "Fernández", "Villa", 20));
		
		listaUsuarios.add(new Usuario("222222C", "Antonio", "Fernández", "Villa", 20));
		
		listaUsuarios.add(new Usuario("133333B", "Antonio", "Fernández", "Villa", 20));
		
		listaUsuarios.add(new Usuario("1444444B", "Antonio", "Fernández", "Villa", 20));
		
		try (Scanner datos = new Scanner(System.in)){
			
		Usuario usuario = new Usuario();
		
		System.out.println("Bienvenidoa a la Medioteca");
		System.out.println("¿Que desea realizar?" + "\n" + "1--> Creacion de cuenta");
		
		int opcionesMenu = datos.nextInt();
		
		switch(opcionesMenu) {
			case 1:
				usuario.nuevoUsuario();
				listaUsuarios.add(new Usuario());
		}
		
		
		
		
		
		
		
		
		
		
		}
		

	}

}
