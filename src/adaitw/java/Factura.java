package adaitw.java;

import java.util.ArrayList;
import java.util.List;

public class Factura {
    private List<Item> items;
    private Double descuento;
    private Integer numeroFactura; //no lo necesito

    //Constructor para poder agregar los items
    //Forma 1 Es un constructor vacío que me genera una lista vacía
    public Factura(){
        items = new ArrayList<>();
        descuento = 0.0;
    }
    //Constructor de facturas que recibe una lista de items
    //Forma 2 Este recibe la lista y la guarda
    public Factura(List<Item> items) {
        this.items = items;
        descuento = 0.0;
    }

    //Getters y Setters
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

    //Agregar items Factura ( a la lista Item, le agrega i, un nuevo item)
    public void agregarItem(Item i) {
        items.add(i);
    }

    public Double consultarMontoSinDescuento() {
        Double montoTotal = 0.0;

        for (Item i: items)//For each: para cada item i, dentro de Items, dame el subtotal (i.getSubtotal())
            montoTotal += i.getSubtotal();
        //En montoTotal voy a sumar el subtotal de cada item, que es $ * q, y lo retorno.
        return montoTotal;
    }
    public Double consultarMontoFinal() {
        Double montoTotal = consultarMontoSinDescuento();
        montoTotal = montoTotal*1.21; // le sumo el 21% de IVA.
        if (descuento>0) {
            montoTotal = montoTotal - (montoTotal*descuento);// calculo el descuento
        }
        return Math.floor(montoTotal);
    }
}
//return Math.round(montoTotal) redondea al nro entero mas cercano
//return Math.ceil(montoTotal) redondea para arriba
//return Math.floor(montoTotal) redondea para abajo