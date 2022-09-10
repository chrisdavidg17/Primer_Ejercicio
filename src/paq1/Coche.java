package paq1;
import paq1.Coche;
import java.util.Scanner;
public class Coche {
    public Coche(){}
    public Coche (String marca, String color, String modelo, int puertas){
        marca = "mazda";
        color = "blanco";
        modelo = "2022";
        puertas = 1;
    }
    public static void main(String[] args) {
        int puertas;
        sumapuerta();
    }

    public static void sumapuertas (int b){
       int puertas;
               puertas = ++b;
       System.out.println(puertas);
    }

    public static void sumapuerta (){
        System.out.print("Añadir puerta? Y/N");
        Scanner teclado = new Scanner(System.in);
        String a;
        a =  teclado.nextLine();
        if (a == "Y"){
          sumapuertas(1);
        }
        else if(a == "N"){
            System.out.println("OK");
        }
    }
}
