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
    }

    public static void sumapuertas (int a){
       int puertas;
               puertas = ++a;
       System.out.println(puertas);
    }

    public static void sumapuerta (int a){
        System.out.print("Añadir puerta? Y/N");
        Scanner reader = new Scanner(System.in);
        a = reader.nextInt();
        if (a=='Y'){
          sumapuertas(1);
        }
        else if(a=='N'){
            System.out.println("OK");
        }
    }
}
