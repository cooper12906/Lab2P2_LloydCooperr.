package lab2p2_lloydcooperr;

import java.util.*;


public class Lab2P2_LloydCooperr {
    
    private static ArrayList<Chef> chefs = new ArrayList();
    private static ArrayList<Mesero> meseros = new ArrayList();
    private static ArrayList<Bartender> bartenders = new ArrayList();
    private static ArrayList<Mesa> mesas = new ArrayList();
    
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);

        String user = "";
        String password = "";
        int opcion = 0;
        int option = 0;

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
                    System.out.println("Que desea crear?");
                    System.out.println("1. Chef");
                    System.out.println("2. Mesero");
                    System.out.println("3. Bartender");
                    System.out.println("4. Mesa");
                    option = read.nextInt();
                    
                    switch(option){
                        case 1:
                            System.out.println("Ingrese el nombre del chef: ");
                            String nombre = read.next();
                            System.out.println("Ingrese la edad del chef: ");
                            int edad = read.nextInt();
                            if (edad <= 0) {
                                System.out.println("La edad no puede ser menor que 0");   
                                System.out.println("Ingrese la edad del chef: ");
                                edad = read.nextInt();
                            }
                            System.out.println("Ingrese el turno del chef (matutino/vespertino): ");
                            String turno = read.next();
                            if (turno.equalsIgnoreCase("matutino") && contadorMatutinos(chefs) >= 7) {
                                System.out.println("El número máximo de chefs matutinos (7) ha sido alcanzado.");
                                break;
                            } else if (turno.equalsIgnoreCase("vespertino") && contadorVespertinos(chefs) >= 7) {
                                System.out.println("El número máximo de chefs vespertinos (7) ha sido alcanzado.");
                                break;
                            }
                            System.out.println("Ingrese el numero de estrellas michelin del chef: ");
                            int numeroEstrellas = read.nextInt();
                            if (numeroEstrellas <= 0) {
                                System.out.println("El numero de estrellas Michelin no puede ser menor que 0");
                                System.out.println("Ingrese el numero de estrellas Michelin del chef: ");
                                numeroEstrellas = read.nextInt();
                            }
                            System.out.println("Ingrese el sueldo del chef: ");
                            int sueldo = read.nextInt();
                            if (sueldo <= 0) {
                                System.out.println("El sueldo no puede ser menor que 0");
                                System.out.println("Ingrese el sueldo del chef: ");
                                sueldo = read.nextInt();
                            }
                           
                            chefs.add(new Chef(nombre, edad, turno, numeroEstrellas, sueldo));
                            System.out.println("Chef agregado correctamente");
                            break;
                        case 2:
                            System.out.println("Ingrese el nombre del mesero: ");
                            String nombreMesero = read.next();
                            System.out.println("Ingrese la edad del mesero: ");
                            int edadMesero = read.nextInt();
                            System.out.println("Ingrese el turno del mesero (matutino/vespertino): ");
                            String turnoMesero = read.next();
                            System.out.println("Ingrese el sueldo del mesero: ");
                            int sueldoMesero = read.nextInt();
                            System.out.println("Ingrese la propina del mesero: ");
                            int propinaMesero = read.nextInt();
                            
                            meseros.add(new Mesero(nombreMesero, edadMesero,turnoMesero,sueldoMesero,propinaMesero));
                            System.out.println("Mesero agregado correctamente");
                            break;
                        case 3:
                            System.out.println("Ingrese el nombre del bartender: ");
                            String nombreBartender= read.next();
                            System.out.println("Ingrese la edad del bartender: ");
                            int edadBartender = read.nextInt();
                            System.out.println("Ingrese el turno del bartender (matutino/vespertino): ");
                            String turnoBartender = read.next();
                            System.out.println("Ingrese el sueldo del bartender ");
                            int sueldoBartender= read.nextInt();
                            System.out.println("Ingrese el numero de licores: ");
                            int numeroLicores = read.nextInt();
                            
                            bartenders.add(new Bartender(nombreBartender, edadBartender, turnoBartender, sueldoBartender, numeroLicores));
                            System.out.println("Bartender agregado correctamente");
                            break;
                        case 4:
                            System.out.println("Ingrese el numero de platos de la mesa: ");
                            int numeroPlatos = read.nextInt();
                            System.out.println("Ingrese el numero de utensilios de la mesa: ");
                            int numeroUtensilios = read.nextInt();
                            System.out.println("Ingrese el precio total de la mesa: ");
                            int precioTotal = read.nextInt();
                            
                            mesas.add(new Mesa(numeroPlatos, numeroUtensilios, precioTotal));
                            break;
                        default:
                            System.out.println("Opcion no valida");
                            break;
                    }
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
    
    private static int contadorMatutinos(ArrayList<Chef> chefs) {
        int contador = 0;
        for (Chef chef : chefs) {
            if (chef.getTurno().equalsIgnoreCase("matutino")) {
                contador++;
            }
        }
        return contador;
    }

    private static int contadorVespertinos(ArrayList<Chef> chefs) {
        int contador = 0;
        for (Chef chef : chefs) {
            if (chef.getTurno().equalsIgnoreCase("vespertino")) {
                contador++;
            }
        }
        return contador;
    }
}
    
