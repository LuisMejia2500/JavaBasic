class AreaTotal {
  public static void main(String[] args) {
    double arearoja,areaazul,ladom,ladome,radio,X,Z,h,perimetroroja,costototal,perimetroazul;
    h=6;
    radio=(h/2);
    ladom=(h+h/2);
    ladome=h;
    X=100;
    Z=200;
    perimetroazul=2*3.1416*radio;
    perimetroroja=(perimetroazul+(ladome+ladom+ladom));
    areaazul=3.1416*(radio*radio);
    arearoja=((ladom*ladome)+areaazul/2)-areaazul;
    Z= Z*perimetroroja;
    X=X*arearoja;
    costototal=X+Z;
    System.out.println("El costo de la maya es: $"+Z);
    System.out.println("");
    System.out.println("El costo de la grama es: $"+X);
    System.out.println("");
    System.out.println("El precio total del proyecto es: $"+costototal);
    System.out.println("");
    System.out.println("Los metros de maya total son: "+ arearoja);
    System.out.println("");
    System.out.println("Metro de grama utilizado es: " +perimetroroja);
    }

  }
