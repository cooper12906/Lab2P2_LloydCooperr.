package lab2p2_lloydcooperr;

public class Mesero {
    private String nombreMesero;
    private int edadMesero;
    private String turnoMesero;
    private int sueldo;
    private int propina;

    public Mesero(String nombreMesero, int edadMesero, String turnoMesero, int sueldo, int propina) {
        this.nombreMesero = nombreMesero;
        this.edadMesero = edadMesero;
        this.turnoMesero = turnoMesero;
        this.sueldo = sueldo;
        this.propina = propina;
    }

    public String getNombreMesero() {
        return nombreMesero;
    }

    public void setNombreMesero(String nombreMesero) {
        this.nombreMesero = nombreMesero;
    }

    public int getEdadMesero() {
        return edadMesero;
    }

    public void setEdadMesero(int edadMesero) {
        this.edadMesero = edadMesero;
    }

    public String getTurnoMesero() {
        return turnoMesero;
    }

    public void setTurnoMesero(String turnoMesero) {
        this.turnoMesero = turnoMesero;
    }

    public int getSueldo() {
        return sueldo;
    }

    public void setSueldo(int sueldo) {
        this.sueldo = sueldo;
    }

    public int getPropina() {
        return propina;
    }

    public void setPropina(int propina) {
        this.propina = propina;
    }

    @Override
    public String toString() {
        return "Meseros:\n" +
               "Nombre: " + nombreMesero + "\n" +
               "Edad: " + edadMesero + "\n" +
               "Turno: " + turnoMesero + "\n" +
               "Sueldo: " + sueldo + "\n" +
               "Propina: " + propina + "\n";
    }  
}
