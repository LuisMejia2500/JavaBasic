public class Descuento{
    public static void main (String [] args){
        double vlrunitario,totalcamisas,descuento,totalcompra,vlrpagar;
        vlrunitario=20000;
        totalcamisas=3;
        descuento=(vlrunitario*3)*0.15;
        totalcompra=(vlrunitario*totalcamisas);
        vlrpagar=totalcompra-descuento;
        System.out.println("El valor del descuento es: " + descuento);
        System.out.println("El valor total de la compra es: " + totalcompra);
        System.out.println("El valor a pagar es : " + vlrpagar);
    }
}