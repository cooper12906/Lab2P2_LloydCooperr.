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
        String password = "g3r$nt0";
        int opcion = 0;
        int option = 0;
        int op = 0;
        int op1 = 0;
        int op2 = 0;

        while (!user.equals("gerente") || !password.equals("g3r$nt0")) {            
            System.out.println("Ingrese el nombre de usuario: ");
            user = read.next();
            System.out.println("Ingrese la contraseña: ");
            password = read.next();
            if (!user.equals("gerente") || !password.equals("g3r$nt0")) {
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
            System.out.println("--------------------");
            opcion = read.nextInt();
            read = new Scanner(System.in);
            
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
                            read.nextLine();
                            String nombre = read.nextLine();
                            read = new Scanner(System.in);
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
                                System.out.println("El numero máximo de chefs matutinos (7) ha sido alcanzado.");
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
                        int contadorMeserosMatutino = contadorMeseros(meseros, "matutino");
                        int contadorMeserosVespertino = contadorMeseros(meseros, "vespertino");

                        if (contadorMeserosMatutino >= 7) {
                            System.out.println("El número máximo de meseros matutinos (7) ha sido alcanzado.");
                        } else if (contadorMeserosVespertino >= 7) {
                            System.out.println("El número máximo de meseros vespertinos (7) ha sido alcanzado.");
                        } else {
                            System.out.println("Ingrese el nombre del mesero: ");
                            read.nextLine();
                            String nombreMesero = read.nextLine();
                            System.out.println("Ingrese la edad del mesero: ");
                            int edadMesero = read.nextInt();
                            System.out.println("Ingrese el turno del mesero (matutino/vespertino): ");
                            String turnoMesero = read.next();
                            System.out.println("Ingrese el sueldo del mesero: ");
                            int sueldoMesero = read.nextInt();
                            System.out.println("Ingrese la propina del mesero: ");
                            int propinaMesero = read.nextInt();

                            meseros.add(new Mesero(nombreMesero, edadMesero, turnoMesero, sueldoMesero, propinaMesero));
                            System.out.println("Mesero agregado correctamente");
                        }
                        break;

                        case 3:
                            int contadorBartendersMatutino = contadorBartenders(bartenders, "matutino");
                            int contadorBartendersVespertino = contadorBartenders(bartenders, "vespertino");
                            String turnoBartender = read.nextLine(); // Consumir la línea vacía después de seleccionar la opción del menú
                            if (turnoBartender.equalsIgnoreCase("matutino") && contadorBartendersMatutino >= 4) {
                                System.out.println("El número máximo de bartenders matutinos (4) ha sido alcanzado.");
                            } else if (turnoBartender.equalsIgnoreCase("vespertino") && contadorBartendersVespertino >= 4) {
                                System.out.println("El número máximo de bartenders vespertinos (4) ha sido alcanzado.");
                            } else {
                                System.out.println("Ingrese el nombre del bartender: ");
                                String nombreBartender = read.nextLine();

                                System.out.println("Ingrese la edad del bartender: ");
                                int edadBartender = read.nextInt();
                                System.out.println("Ingrese el turno del bartender (matutino/vespertino): ");
                                turnoBartender = read.next();
                                System.out.println("Ingrese el sueldo del bartender ");
                                int sueldoBartender = read.nextInt();
                                System.out.println("Ingrese el numero de licores: ");
                                int numeroLicores = read.nextInt();

                                bartenders.add(new Bartender(nombreBartender, edadBartender, turnoBartender, sueldoBartender, numeroLicores));
                                System.out.println("Bartender agregado correctamente");
                            }
                            break;

                        case 4:
                        if (mesas.size() >= 10) {
                            System.out.println("El numero máximo de mesas (10) ha sido alcanzado.");
                        } else {
                            System.out.println("Ingrese el numero de platos de la mesa: ");
                            int numeroPlatos = read.nextInt();
                            System.out.println("Ingrese el numero de utensilios de la mesa: ");
                            int numeroUtensilios = read.nextInt();
                            System.out.println("Ingrese el precio total de la mesa: ");
                            int precioTotal = read.nextInt();

                            mesas.add(new Mesa(numeroPlatos, numeroUtensilios, precioTotal));
                            System.out.println("Mesa agregada correctamente");
                        }
                        break;
                        default:
                            System.out.println("Opcion no valida");
                            break;
                    }
                    break;
                case 2:
                    System.out.println("Que desea listar?");
                    System.out.println("1. Chefs");
                    System.out.println("2. Meseros");
                    System.out.println("3. Bartenders");
                    System.out.println("4. Mesas");
                    op = read.nextInt();
                    switch(op){
                        case 1:
                            System.out.println("-------- Chefs --------");
                            for (Chef chef : chefs) {
                                System.out.println(chef.toString());
                            }
                            break;
                        case 2:
                            System.out.println("-------- Meseros --------");
                            for (Mesero mesero : meseros) {
                                System.out.println(mesero.toString());
                            }
                            break;
                        case 3:
                            System.out.println("-------- Bartenders --------");
                            for (Bartender bartender : bartenders) {
                                System.out.println(bartender.toString());
                            }
                            break;
                        case 4:
                            System.out.println("-------- Mesas --------");
                            for (Mesa mesa : mesas) {
                                System.out.println(mesa.toString());
                            }
                            break;
                    }
                    break;
                case 3:
                    System.out.println("Que desea modificar?");
                    System.out.println("1. Chefs");
                    System.out.println("2. Meseros");
                    System.out.println("3. Bartenders");
                    System.out.println("4. Mesas");
                    op1 = read.nextInt();
                    
                    switch(op1){
                        case 1:
                            System.out.println("Seleccione el numero del chef que desea modificar:");
                            for (int i = 0; i < chefs.size(); i++) {
                                System.out.println((i + 1) + ". " + chefs.get(i).getNombre());
                            }
                            int selectedChef = read.nextInt();
                            if (selectedChef >= 1 && selectedChef <= chefs.size()) {
                                Chef chefSeleccionado = chefs.get(selectedChef - 1);

                                System.out.println("Que atributo desea modificar?");
                                System.out.println("1. Numero de estrellas Michelin");
                                System.out.println("2. Sueldo");
                                int atributoAModificar = read.nextInt();

                                switch (atributoAModificar) {
                                    case 1:
                                        System.out.println("Ingrese el nuevo número de estrellas Michelin:");
                                        int nuevasEstrellasMichelin = read.nextInt();
                                        chefSeleccionado.setNumeroEstrellasMichelin(nuevasEstrellasMichelin);
                                        System.out.println("El numero de estrellas Michelin ha sido actualizado correctamente.");
                                        break;
                                    case 2:
                                        System.out.println("Ingrese el nuevo sueldo:");
                                        int nuevoSueldo = read.nextInt();
                                        chefSeleccionado.setSueldo(nuevoSueldo);
                                        System.out.println("El sueldo ha sido actualizado correctamente.");
                                        break;
                                    default:
                                        System.out.println("Opcion invalida.");
                                        break;
                                }
                            } else {
                                System.out.println("Numero de chef seleccionado invalido.");
                            }
                            break;
                        case 2:
                            System.out.println("Seleccione el numero del mesero que desea modificar:");
                            for (int i = 0; i < meseros.size(); i++) {
                                System.out.println((i + 1) + ". " + meseros.get(i).getNombreMesero());
                            }
                            int selectedMesero = read.nextInt();
                            if (selectedMesero >= 1 && selectedMesero <= meseros.size()) {
                                Mesero meseroSeleccionado = meseros.get(selectedMesero - 1);

                                System.out.println("Que atributo desea modificar?");
                                System.out.println("1. Propina");
                                System.out.println("2. Sueldo");
                                int atributoAModificar = read.nextInt();

                                switch (atributoAModificar) {
                                    case 1:
                                        System.out.println("Ingrese la nueva propina:");
                                        int nuevaPropina = read.nextInt();
                                        meseroSeleccionado.setPropina(nuevaPropina);
                                        System.out.println("La propina ha sido actualizada correctamente.");
                                        break;
                                    case 2:
                                        System.out.println("Ingrese el nuevo sueldo:");
                                        int nuevoSueldo = read.nextInt();
                                        meseroSeleccionado.setSueldo(nuevoSueldo);
                                        System.out.println("El sueldo ha sido actualizado correctamente.");
                                        break;
                                    default:
                                        System.out.println("Opcion invalida.");
                                        break;
                                }
                            } else {
                                System.out.println("Numero de mesero seleccionado invalido.");
                            }
                            break;
                        case 3:
                            System.out.println("Seleccione el numero del bartender que desea modificar:");
                            for (int i = 0; i < bartenders.size(); i++) {
                                System.out.println((i + 1) + ". " + bartenders.get(i).getNombreBartender());
                            }
                            int selectedBartender = read.nextInt();
                            if (selectedBartender >= 1 && selectedBartender <= bartenders.size()) {
                                Bartender bartenderSeleccionado = bartenders.get(selectedBartender - 1);

                                System.out.println("Que atributo desea modificar?");
                                System.out.println("1. Numero de licores");
                                System.out.println("2. Sueldo");
                                int atributoAModificar = read.nextInt();

                                switch (atributoAModificar) {
                                    case 1:
                                        System.out.println("Ingrese el nuevo número de licores:");
                                        int nuevosLicores = read.nextInt();
                                        bartenderSeleccionado.setNumeroLicores(nuevosLicores);
                                        System.out.println("El numero de licores ha sido actualizado correctamente.");
                                        break;
                                    case 2:
                                        System.out.println("Ingrese el nuevo sueldo:");
                                        int nuevoSueldo = read.nextInt();
                                        bartenderSeleccionado.setSueldoBartender(nuevoSueldo);
                                        System.out.println("El sueldo ha sido actualizado correctamente.");
                                        break;
                                    default:
                                        System.out.println("Opcion invalida.");
                                        break;
                                }
                            } else {
                                System.out.println("Numero de bartender seleccionado invalido.");
                            }
                            break;
                        case 4:
                            System.out.println("Seleccione el numero de la mesa que desea modificar:");
                            for (int i = 0; i < mesas.size(); i++) {
                                System.out.println((i + 1) + ". Mesa " + (i + 1));
                            }
                            int selectedMesa = read.nextInt();
                            if (selectedMesa >= 1 && selectedMesa <= mesas.size()) {
                                Mesa mesaSeleccionada = mesas.get(selectedMesa - 1);

                                System.out.println("Que atributo desea modificar?");
                                System.out.println("1. Numero de platos");
                                System.out.println("2. Numero de utensilios");
                                System.out.println("3. Precio total");
                                int atributoAModificar = read.nextInt();

                                switch (atributoAModificar) {
                                    case 1:
                                        System.out.println("Ingrese el nuevo numero de platos:");
                                        int nuevosPlatos = read.nextInt();
                                        mesaSeleccionada.setNumeroPlatos(nuevosPlatos);
                                        System.out.println("El numero de platos ha sido actualizado correctamente.");
                                        break;
                                    case 2:
                                        System.out.println("Ingrese el nuevo numero de utensilios:");
                                        int nuevosUtensilios = read.nextInt();
                                        mesaSeleccionada.setNumeroUtensilios(nuevosUtensilios);
                                        System.out.println("El numero de utensilios ha sido actualizado correctamente.");
                                        break;
                                    case 3:
                                        System.out.println("Ingrese el nuevo precio total:");
                                        int nuevoPrecioTotal = read.nextInt();
                                        mesaSeleccionada.setPrecioTotal(nuevoPrecioTotal);
                                        System.out.println("El precio total ha sido actualizado correctamente.");
                                        break;
                                    default:
                                        System.out.println("Opcion invalida.");
                                        break;
                                }
                            } else {
                                System.out.println("Numero de mesa seleccionado invalido.");
                            }
                            break;
                        default:
                            System.out.println("Opcion invalida");
                            break;
                    }
                    break;
                case 4:
                    System.out.println("Que desea eliminar?");
                    System.out.println("1. Chefs");
                    System.out.println("2. Meseros");
                    System.out.println("3. Bartenders");
                    System.out.println("4. Mesas");
                    op2 = read.nextInt();
                    
                    switch (op2){
                        case 1:
                            System.out.println("Seleccione el numero del chef que desea eliminar:");
                            for (int i = 0; i < chefs.size(); i++) {
                                System.out.println((i + 1) + ". " + chefs.get(i).getNombre());
                            }
                            int selectedChef = read.nextInt();
                            if (selectedChef >= 1 && selectedChef <= chefs.size()) {
                                chefs.remove(selectedChef - 1);
                                System.out.println("Chef eliminado correctamente.");
                            } else {
                                System.out.println("Numero de chef seleccionado invalido.");
                            }
                            break;
                        case 2:
                            System.out.println("Seleccione el numero del mesero que desea eliminar:");
                            for (int i = 0; i < meseros.size(); i++) {
                                System.out.println((i + 1) + ". " + meseros.get(i).getNombreMesero());
                            }
                            int selectedMesero = read.nextInt();
                            if (selectedMesero >= 1 && selectedMesero <= meseros.size()) {
                                meseros.remove(selectedMesero - 1);
                                System.out.println("Mesero eliminado correctamente.");
                            } else {
                                System.out.println("Numero de mesero seleccionado invalido.");
                            }
                            break;
                        case 3:
                            System.out.println("Seleccione el numero del bartender que desea eliminar:");
                            for (int i = 0; i < bartenders.size(); i++) {
                                System.out.println((i + 1) + ". " + bartenders.get(i).getNombreBartender());
                            }
                            int selectedBartender = read.nextInt();
                            if (selectedBartender >= 1 && selectedBartender <= bartenders.size()) {
                                bartenders.remove(selectedBartender - 1);
                                System.out.println("Bartender eliminado correctamente.");
                            } else {
                                System.out.println("Numero de bartender seleccionado invalido.");
                            }
                            break;
                        case 4:
                        System.out.println("Seleccione el numero de la mesa que desea eliminar:");
                        for (int i = 0; i < mesas.size(); i++) {
                            System.out.println((i + 1) + ". Mesa " + (i + 1));
                        }
                        int selectedMesa = read.nextInt();
                        if (selectedMesa >= 1 && selectedMesa <= mesas.size()) {
                            mesas.remove(selectedMesa - 1);
                            System.out.println("Mesa eliminada correctamente.");
                        } else {
                            System.out.println("Numero de mesa seleccionado invalido.");
                        }
                            break;
                        default:
                            System.out.println("Opcion invalida");
                            break;
                    }
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
    public static int contadorMeseros(List<Mesero> meseros, String turno) {
        int contador = 0;
        for (Mesero mesero : meseros) {
            if (mesero.getTurnoMesero().equalsIgnoreCase(turno)) {
                contador++;
            }
        }
        return contador;
    }

    public static int contadorBartenders(List<Bartender> bartenders, String turno) {
        int contador = 0;
        for (Bartender bartender : bartenders) {
            if (bartender.getTurnoBartender().equalsIgnoreCase(turno)) {
                contador++;
            }
        }
        return contador;
    }
}
    
