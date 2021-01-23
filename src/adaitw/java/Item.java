package adaitw.java;

public class Item {
    private int nro;
    private String detalle;
    private Double precioUnitario;
    private int cantidad;

    public Item(int nro, String detalle, Double precioUnitario, int cantidad) {
        this.nro = nro;
        this.detalle = detalle;
        this.precioUnitario = precioUnitario;
        this.cantidad = cantidad;
    }

    public int getNro() {
        return nro;
    }

    public void setNro(int nro) {
        this.nro = nro;
    }

    public String getDetalle() {
        return detalle;
    }

    public void setDetalle(String detalle) {
        this.detalle = detalle;
    }

    public Double getPrecioUnitario() {
        return precioUnitario;
    }

    public void setPrecioUnitario(Double precioUnitario) {
        this.precioUnitario = precioUnitario;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public Double getSubtotal() {
        return cantidad*precioUnitario;
    }
}
