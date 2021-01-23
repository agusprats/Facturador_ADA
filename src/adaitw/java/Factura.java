package adaitw.java;

import java.util.ArrayList;
import java.util.List;

public class Factura {
    private List<Item> items;
    private Double descuento;

    public Factura(){
        items = new ArrayList<>();
        descuento = 0.0;
    }

    public Factura(List<Item> items) {
        this.items = items;
        descuento = 0.0;
    }

    public Double getDescuento() {
        return descuento;
    }
    public void setDescuento(Double descuento) {
        this.descuento = descuento;
    }
    public List<Item> getItems() {
        return items;
    }
    public void setItems(List<Item> items) {
        this.items = items;
    }
    public Double consultarMontoSinDescuento() {
        Double montoTotal = 0.0;
        for (Item i: items)
            montoTotal += i.getSubtotal();
        return montoTotal;
    }
    public Double consultarMontoFinal() {
        Double montoTotal = consultarMontoSinDescuento();
        montoTotal = montoTotal*1.21; // le sumo el 21% de IVA.
        if (descuento>0) {
            montoTotal = montoTotal - (montoTotal*descuento);  // calculo el descuento
        }
        return Math.floor(montoTotal);
    }

    public void agregarItem(Item i) {
        items.add(i);
    }
}
