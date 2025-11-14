import Java.util.Scanner;
public class ModelosDeInvetarios {
    public static void main(String[] args) {
        do{
            System.out.println("\n \n \tMenu");
            System.out.println("1. Modelo de Ineventarios basico");
            System.out.println("2. Modelo de invenatrios con descuento");
            System.out.println("Salir");
            Syste.out.println("Opcion: ");
            opcion=Sol.nextInt();
            switch(opcion){
                case 1:

            }
        }while(opcion!=3);
        Scanner Sol=new Scanner(System.in);
        System.out.println("Ingresa tu demanda (D): ");
        double D=Sol.nextInt();
        System.out.println("Ingresa tu precio pedido (K): ");
        double K=Sol.nextInt();
        System.out.printn("Ingresa tu costo de almacenamiento (H): ");
        double h=Sol.nextInt();
        System.out.println("Ingrese los dias en el que recibira el producto (L): ");
        int L=Sol.nextInt();
        double y=Math.sqrt((2*D*K)/h);
        double to=(y/D);
        double n=L/to;
        double Lc=L-(n*to);
        double Le=D*Lc;
        double CTU=(k/y/D)+(H*Y/2);
        System.out.println("La cantidad del pedido es (y*): " + y);
        System.out.println("La duracion del ciclo (to): " + to);
        System.out.println("El pedido de reorden es (Le): " + Le);
        System.out.println("El Costo Total Unitario es (CTU): " + CTU);
    }
}

