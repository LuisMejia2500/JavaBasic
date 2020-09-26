class Primo{
    public static void main(String[]args){
        int num;
        num=13;
        if(num<=9 & num>20){
            System.out.println("El numero no es correcto");
        }else{
            if(num%2==0 || num%3==0 || num%4==0 || num%5==0 ||num%6==0 || num%7==0 || num%8==0 || num%9==0){
                System.out.println("El numero es compuesto");
            }else{
                System.out.println("El numero es primo");
            }
        }
    }
}