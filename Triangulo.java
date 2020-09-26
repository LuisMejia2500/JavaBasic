class Triangulo{
  public static void main(String[] args) {
    int l1,l2,l3;
    l1=20;
    l2=10;
    l3=12;

    if(l1 > (l2+l3) || l2 > (l3+l1) || l3 > (l1+l2)){
      System.out.println("Estas medidas no corresponden a un triangulo");
    }else{
      if(l1==l2 & l2==l3){
        System.out.println("El triangulo es equilatero");
      }else{
        if(l1!=l2 & l2==l3 || l1==l3 & l2!=l3 || l3!=l1 & l1==l2){
          System.out.println("El triangulo es isoceles");
        }else{
          System.out.println("El triangulo es escaleno");
        }
      }
    }
    
    }

  }