package lab2p2_lloydcooperr;

import java.util.*;


public class Lab2P2_LloydCooperr {
    
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);

        // Usuario y contraseña correctos
        String user = "";
        String password = "";
        int opcion = 0;

        while (!user.equals("gerente") && !password.equals("g3r$nt0")) {            
            System.out.println("Ingrese el nombre de usuario: ");
            user = read.next();
            System.out.println("Ingrese la contraseña: ");
            password = read.next();
            if (!user.equals("gerente") && !password.equals("g3r$nt0")) {
                System.out.println("Contraseña o usuario incorrecto");
            } else {
                System.out.println("Bienvenido, gerente");
            }
        } 
        do{
            System.out.println("--------MENU--------");
            System.out.println("1. Crear");
            System.out.println("2. Listar");
            System.out.println("3. Modificar");
            System.out.println("4. Eliminar");
            System.out.println("5. Salir");
            opcion = read.nextInt();
            
            switch(opcion){
                case 1:
                    
                    break;
                case 2:
                    break;
                case 3:
                    break;
                case 4:
                    break;
            }
        }while (opcion != 5);
    }
}
    
