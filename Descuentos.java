class Descuentos {
  public static void main(String[] args) {
    double compras,descuentos,total;
    compras=60000;
    if(compras<50000){
      System.out.println("El valor de la compras es : $" + compras);

    }else{
      if(compras >=50000 & compras<=200000){
        descuentos=compras*0.15;
        total=compras-descuentos;
        System.out.println("El valor de la compra sin descuento es: $" + compras);
        System.out.println("El valor con descuento es: "+ total);
      }else{
        descuentos=compras*0.25;
        total=compras-descuentos;
        System.out.println("El valor de la compra sin descuento es: $" + compras);
        System.out.println("El valor con descuento es: "+ total);


      }
    }
   
    
    }

  }
