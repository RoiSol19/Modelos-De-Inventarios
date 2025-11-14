import Java.util.Scanner;
public class ModelosDeInvetarios {
    public static void main(String[] args) {
        Scanner Sol=new Scanner(System.in);
        int opcion=0;
        int Opcion=0;
        do{
            System.out.println("\n \n \tMenu");
            System.out.println("1. Modelo de Ineventarios basico");
            System.out.println("2. Modelo de invenatrios con descuento");
            System.out.println("Salir");
            System.out.println("Opcion: ");
            opcion=Sol.nextInt();
            switch(opcion){
                case 1:
                    System.out.println("Ingresa tu demanda (D): ");
                    double D=Sol.nextDouble();
                    System.out.println("Ingresa tu precio pedido (K): ");
                    double K=Sol.nextDouble();
                    System.out.println("Ingresa tu costo de almacenamiento (H): ");
                    double h=Sol.nextDouble();
                    System.out.println("Ingrese los dias en el que recibira el producto (L): ");
                    int L=Sol.nextDouble();
                    double y=Math.sqrt((2*D*K)/h);
                    double to=(y/D);
                    double n=L/to;
                    double Lc=L-(n*to);
                    double Le=D*Lc;
                    double CTU=(K/y/D)+(h*y/2);
                    System.out.println("La cantidad del pedido es (y*): " + y);
                    System.out.println("La duracion del ciclo (to): " + to);
                    System.out.println("El pedido de reorden es (Le): " + Le);
                    System.out.println("El Costo Total Unitario es (CTU): " + CTU);
                    break;
                case 2:
                    System.out.println("Ingresa tu demanda (D): ");
                    double d=Sol.nextDouble();
                    System.out.println("Ingresa tu precio pedido (K): ");
                    double k=Sol.nextInt();
                    System.out.println("Ingresa la cantidad de costos que tiene tu modelo de inventarios: ");
                    Opcion=Sol.nextInt();
                    switch(Opcion){
                        case 1:
                            System.out.println("Ingresa el costo unitario (C): ");
                            double c=Sol.nextDouble();
                            break;
                        case 2:
                            System.out.println("Ingresa el primer costo unitario (C): ");
                            double c1=Sol.nextDouble();
                            System.out.println("Ingresa el segundo costo unitario (C): ");
                            double c2=Sol.nextDouble();
                            break;
                        case 3:
                            System.out.println("Ingresa el primer costo unitario (C): ");
                            double c1=Sol.nextDouble();
                            System.out.println("Ingresa el segundo costo unitario (C): ");
                            double c2=Sol.nextDouble();
                            System.out.println("Ingresa el tercer costo unitario (C): ");
                            double c3=Sol.nextDouble();
                            break;
                    }
            }
        }while(opcion!=3);
    }
}

