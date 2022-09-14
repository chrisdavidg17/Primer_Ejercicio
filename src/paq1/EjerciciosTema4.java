package paq1;

public class EjerciciosTema4 {
    public static void main(String[] args) {
        //Ejercicio IF
        int numero = -3;

        if (numero == 0){
            System.out.println("Numero Neutro");
        }
        else if (numero < 0){
            System.out.println("Numero Negativo");
        }
        else if (numero > 0) {
            System.out.println("Numero Positivo");
        }
        //Ejercicio While
        int numerowhile = 0;

        while (numerowhile <= 3){
            System.out.println("Esto es While " + numerowhile);
            numerowhile++;
        }
        //Ejercicio Do while
        int numerodo = 1;
        do{
            System.out.println("Esto es DoWhile " + numerodo);
            numerodo++;
        }
        while (numerodo < 2);

        //Ejercicio FOR
        int numerofor;
        for (numerofor = 0; numerofor <=3; numerofor++){
            System.out.println("Esto es FOR " + numerofor);
        }
        //Ejercicio Switch

        var estacion = "Invierno";
        switch (estacion){
            case "Primavera":
                System.out.println("Estamos en primavera");
                break;
            case "Invierno":
                System.out.println("Estamos en invierno");
                break;
            case "Verano":
                System.out.println("Estamos en Verano");
                break;
            case "Otoño":
                System.out.println("Estamos en otoño");
                break;
            default:
                System.out.println("No es una estacion");
        }

    }
}
