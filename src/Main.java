public class Main {
    public static void main(String [] args){
        System.out.println("Hey");
        System.out.println("Hola");
        System.out.println("¿Hola,qué tal?");
        System.out.println("Adios");

        System.out.println("Segundo commit");

        System.out.println(suma(3,5)+" es el resultado de la suma");
        System.out.println(resta(3,5)+" es el resultado de la resta");



}

    public static int suma(int num1, int num2){

        return num1+num2;
    }
    public static int resta(int num1, int num2){

        return num1-num2;
    }
}