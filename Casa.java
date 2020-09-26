class Casa{
  public static void main(String[] args) {
    double Valor_De_Casa,Ingreso_Mensual,anticipo,cuotas;
    Valor_De_Casa=150000000;
    Ingreso_Mensual=8000000;
    if(Ingreso_Mensual>=2000000){
      anticipo=Valor_De_Casa*0.35;
      cuotas=((Valor_De_Casa-anticipo)/7);
      System.out.println("El valor del anticipo es:$ "+ anticipo);
      System.out.println("El valor a pagar mensual es:  $"+cuotas);

    }else{
      anticipo=Valor_De_Casa*0.2;
      cuotas=((Valor_De_Casa-anticipo)/(15));
      System.out.println("El valor del anticipo es:$ "+ anticipo);
      System.out.println("El valor a pagar mensual es:  $"+cuotas);

    }

    
    }

  }