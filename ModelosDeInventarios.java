Java.util.Scanner;
public class ModelosDeInvetarios {
    public static void main(String[] args) {
        Scanner Sol=new Scanner(System.in);
        System.in.println("Ingresa tu demanda (D): ");
        double demanda=Sol.nextInt();
        System.in.println("Ingresa tu precio pedido (K): ");
        double pedido=Sol.nextInt();
        System.out.printn("Ingresa tu costo de almacenamiento (H): ");
        double h=Sol.nextInt();
        System.out.println("Ingrese los dias en el que recibira el producto (L): ")
        int L=Sol.nextInt();
        double y*=Math.sqrt((2*demanda*pedido)/h);
        double to=(y*/demanda);
        System.out.println("La cantidad del pedido es (y*): " + y*);
        System.out.println("La duracion del ciclo (to): " + (to));
    }
}

