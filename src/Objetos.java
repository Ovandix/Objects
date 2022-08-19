import java.util.Scanner;

public class Objetos{
    String name;
    String apellido;
    String dpi;
    String nit;
    int op;
    public static void main(String [] args){
        Scanner reader = new Scanner(System.in);
        String[] arr = new String [41];
        Objetos myObj = new Objetos();
        boolean tf = true;
        int cont = 0;
        String si;
        System.out.println("Bienvenido al registro.");
        while (tf){
            System.out.println("\n¿Deseas agregar un nuevo registro? \n1. Si \n2. Mostrar datos \n3. Salir");
            myObj.op = reader.nextInt();
            si = reader.nextLine();

            switch (myObj.op){
                case 1:
                
                System.out.println("Por favor, ingresa tus nombres: ");
                myObj.name = reader.nextLine();
                cont = (cont + 1);
                arr[cont] = myObj.name;

                System.out.println("Ingresa tus apellidos: ");
                myObj.apellido = reader.nextLine();
                cont = (cont + 1);
                arr[cont] = myObj.apellido;

                System.out.println("Ingresa el número de tu DPI: ");
                myObj.dpi = reader.nextLine();
                cont = (cont + 1);
                arr[cont] = myObj.dpi;
                
                System.out.println("Ingresa tu NIT: ");
                myObj.nit = reader.nextLine();
                cont = (cont + 1);
                arr[cont] = myObj.nit;
                
                break;

                case 2:
                System.out.println("|    Nombres    |  |     Apellidos     |  |       DPI       |  |       NIT       |");

                for(int i = 1; i <= cont; i++){
                    System.out.print("  " + arr[i] + "  ");
                    if (i == 4 || i == 8 || i == 12 || i == 16 || i == 20 || i == 24 || i == 28 || i == 32 || i == 36 || i == 40){
                        System.out.println("");
                    }
                }
                break;

                case 3:
                tf = false;
                break;
            }
        }
        
        System.out.println("Gracias por usar mi programa :D");
    }
}