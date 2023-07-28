package lab2p2_lloydcooperr;

public class Chefs {
    private String nombre;
    private int edad;
    private String turno;
    private int numeroEstrellasMichelin;
    private String sueldo;

    public Chefs() {
    }

    public Chefs(String nombre, int edad, String turno, int numeroEstrellasMichelin, String sueldo) {
        this.nombre = nombre;
        this.edad = edad;
        this.turno = turno;
        this.numeroEstrellasMichelin = numeroEstrellasMichelin;
        this.sueldo = sueldo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getTurno() {
        return turno;
    }

    public void setTurno(String turno) {
        this.turno = turno;
    }

    public int getNumeroEstrellasMichelin() {
        return numeroEstrellasMichelin;
    }

    public void setNumeroEstrellasMichelin(int numeroEstrellasMichelin) {
        this.numeroEstrellasMichelin = numeroEstrellasMichelin;
    }

    public String getSueldo() {
        return sueldo;
    }

    public void setSueldo(String sueldo) {
        this.sueldo = sueldo;
    }

    @Override
    public String toString() {
        return "Chefs{" + "nombre=" + nombre + ", edad=" + edad + ", turno=" + turno + ", numeroEstrellasMichelin=" + numeroEstrellasMichelin + ", sueldo=" + sueldo + '}';
    }
    
    
}
