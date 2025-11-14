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
                            double c01=Sol.nextDouble();
                            System.out.println("Ingresa el segundo costo unitario (C): ");
                            double c02=Sol.nextDouble();
                            System.out.println("Ingresa el tercer costo unitario (C): ");
                            double c03=Sol.nextDouble();
                            System.in.println("Ingresa el descuento: ");
                            double i=Sol.nexyDouble();
                            double h1=c01*i/100;
                            double h2=c02*i/100;
                            double h3=c03*i/100;
                            double y1=Math.sqrt((2*d*k)/h1);
                            double y2=Math.sqrt((2*d*k)/h2);
                            double y3=Math.sqrt((2*d*k)/h3);
                            System.out. println("Los costos de almacenamiento con descuento aplicado son: " + h1 + ", " + h2 + ", " + h3);
                            double CC1=d*c01;
                            double CC2=d*c02;
                            double CC3=d*c03;
                            System.out.println("Los costos de compra son: " + CC1 ", " + CC2 + ", " + CC3);
                            double CO1=(d*k)/y1;
                            double CO2=(d*k)/y2;
                            double CO3=(d*k)/y3;
                            System.out.println("Los costos de ordenamiento son: " + CO1 + ", " + CO2 ", " + CO3);
                            double CM1=(h1*y1)/2;
                            double CM2=(h2*y2)/2
                            double CM3=(h3*y3)/2;
                            System.out.println("Los costos de mantenimiento son: " + CM1 + ", " + CM2 ", " + CM3);
                            double CTU1=CC1+C01+CM1;
                            double CTU1=CC2+C02+CM2;
                            double CTU1=CC3+C03+CM3;
                            System.out.println("Los CTU son: " + CTU1 + ", " + CTU2 + ", " + CTU3);
                            break;
                    }
            }
        }while(opcion!=3);
    }
}

