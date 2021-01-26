package adaitw.java;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        List<Factura> facturas = new ArrayList<>();
        //1ro creo una factura
        Factura f = new Factura();
        //Establezco 5% de descuento
        f.setDescuento(0.05);

        //Agrego items a la factura:
        //Creo un nuevo objeto i, y se lo paso al método.
        //Forma 1
        f.agregarItem(new Item(1,"tornillos",20.0,15));
        f.agregarItem(new Item(2,"tarugos",15.0,15));
        f.agregarItem(new Item(3,"destornillador",255.0,1));
        f.agregarItem(new Item(4,"martillo",360.50,1));
        System.out.println("El monto total es: "+f.consultarMontoFinal());
        // Agregar la factura a la lista:
        facturas.add(f);

        // Otra forma de crear una factura y agregarla a la lista:
        //Forma 2
        List<Item> itemsNuevos = new ArrayList<>();
        itemsNuevos.add(new Item(1,"tuerca",30.0,18));
        itemsNuevos.add(new Item(2,"arandela",12.0,18));
        itemsNuevos.add(new Item(3,"taladro",5840.0,1));
        facturas.add(new Factura(itemsNuevos));



        Double montoTotalVendido = 0.0;
        for(Factura factura:facturas){
            Double montoDeFactura = factura.consultarMontoFinal();
            montoTotalVendido += montoDeFactura;
            System.out.println("Factura por $"+montoDeFactura);
        }
        System.out.println("Monto total vendido: $"+montoTotalVendido);


    /*
	Una empresa desea implementar un sistema facturador que permita emitir facturas.
	Cada factura tiene ítems varios que contienen la siguiente información:
	nro., detalle, cantidad, precio unitario, precio subtotal.

	De cada factura se puede consultar el monto total, incluyendo un 21% de IVA.
    Algunas facturas pueden tener un descuento de 5% o 10%.

    Se desea tener una lista de todas las facturas emitidas con sus montos.
    Y el monto total vendido.
	 */
    }
}
