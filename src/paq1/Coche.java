package paq1;
import paq1.Coche;
public class Coche {

    public micoche (String marca, String color, String modelo, int puertas){
        marca = 'mazda';
        color = 'blanco';
        modelo = '2022';
        puertas = 1;
    }
    public static void main(String[] args) {
        int puertas;
    }

    public static void sumapuertas (int a){
       int puertas
               puertas = ++a;
       System.out.println(puertas);
    }

    public static void sumapuerta (int a){
        System.out.print('Añadir puerta? Y/N');
        a = System.console().readLine();
        if (a=='Y'){
          sumapuertas(1);
          else{
              System.out.println('OK');
            }
        }
    }
}
