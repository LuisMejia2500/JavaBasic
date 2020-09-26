class Salarios{
    public static void main (String[]args){
        int Horas_Laboradas,salario;
        Horas_Laboradas=80;

        if(Horas_Laboradas<=40){
            salario=Horas_Laboradas*16;
            System.out.println(salario);
        }else{
            salario=(40*16)+((Horas_Laboradas-40)*20);
            System.out.println(salario);
        }
    }

}