package lab2p2_lloydcooperr;

public class Mesa {
    private int numeroPlatos;
    private int numeroUtensilios;
    private int precioTotal;

    public Mesa(int numeroPlatos, int numeroUtensilios, int precioTotal) {
        this.numeroPlatos = numeroPlatos;
        this.numeroUtensilios = numeroUtensilios;
        this.precioTotal = precioTotal;
    }

    public int getNumeroPlatos() {
        return numeroPlatos;
    }

    public void setNumeroPlatos(int numeroPlatos) {
        this.numeroPlatos = numeroPlatos;
    }

    public int getNumeroUtensilios() {
        return numeroUtensilios;
    }

    public void setNumeroUtensilios(int numeroUtensilios) {
        this.numeroUtensilios = numeroUtensilios;
    }

    public int getPrecioTotal() {
        return precioTotal;
    }

    public void setPrecioTotal(int precioTotal) {
        this.precioTotal = precioTotal;
    }

    @Override
    public String toString() {
        return "Mesas:" + 
                numeroPlatos + 
                numeroUtensilios + 
                precioTotal;
    }
     
}
