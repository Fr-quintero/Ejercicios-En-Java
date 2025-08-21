package mundopc.modelo;

public class DispositivoEntrada {

    private String marca;
    private String tipoDeEntrada;

    // Contructor
    public DispositivoEntrada(String tipoDeEntrada, String marca){
        this.tipoDeEntrada = tipoDeEntrada;
        this.marca = marca;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getTipoDeEntrada() {
        return tipoDeEntrada;
    }

    public void setTipoDeEntrada(String tipoDeEntrada) {
        this.tipoDeEntrada = tipoDeEntrada;
    }

    @Override
    public String toString() {
        return "DispositivoEntrada{" +
                "marca='" + marca + '\'' +
                ", tipoDeEntrada='" + tipoDeEntrada + '\'' +
                '}';
    }
}
