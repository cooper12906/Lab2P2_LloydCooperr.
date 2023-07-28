package lab2p2_lloydcooperr;

public class Bartender {
    private String nombreBartender;
    private int edadBartender;
    private String turnoBartender;
    private int sueldoBartender;
    private int numeroLicores;

    public Bartender(String nombreBartender, int edadBartender, String turnoBartender, int sueldoBartender, int numeroLicores) {
        this.nombreBartender = nombreBartender;
        this.edadBartender = edadBartender;
        this.turnoBartender = turnoBartender;
        this.sueldoBartender = sueldoBartender;
        this.numeroLicores = numeroLicores;
    }

    public String getNombreBartender() {
        return nombreBartender;
    }

    public void setNombreBartender(String nombreBartender) {
        this.nombreBartender = nombreBartender;
    }

    public int getEdadBartender() {
        return edadBartender;
    }

    public void setEdadBartender(int edadBartender) {
        this.edadBartender = edadBartender;
    }

    public String getTurnoBartender() {
        return turnoBartender;
    }

    public void setTurnoBartender(String turnoBartender) {
        this.turnoBartender = turnoBartender;
    }

    public int getSueldoBartender() {
        return sueldoBartender;
    }

    public void setSueldoBartender(int sueldoBartender) {
        this.sueldoBartender = sueldoBartender;
    }

    public int getNumeroLicores() {
        return numeroLicores;
    }

    public void setNumeroLicores(int numeroLicores) {
        this.numeroLicores = numeroLicores;
    }

    @Override
    public String toString() {
        return "Bartenders:" + 
                nombreBartender + 
                edadBartender + 
                turnoBartender + 
                sueldoBartender + 
                numeroLicores;
    }
    
    
    
}
