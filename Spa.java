public class Spa{
    public static void main (String [] args){
        double gananciajefe,ganancia,gananciadueno,cantidamn,costomn;
        cantidamn=6;
        costomn=12000;
        ganancia=(cantidamn*costomn);

        gananciajefe=(ganancia*0.7);
        gananciadueno=ganancia-gananciajefe;

        System.out.println("La ganancia del jefe es : " + gananciajefe );
        System.out.println("La ganancia del dueño es : " + gananciadueno );
   
    }
}