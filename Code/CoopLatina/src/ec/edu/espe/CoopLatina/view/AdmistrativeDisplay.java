 
package ec.edu.espe.CoopLatina.view;

import ec.edu.espe.CoopLatina.model.Bus;
import ec.edu.espe.CoopLatina.model.Routes;
import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author Loor Cesar, Molina Gustavo,DDCO-ESPE,GADC.MSI
 */
public class AdmistrativeDisplay {
    public static void main(String[] args) {
        System.out.println("==========Welcome to CoopLatina==========");
        
        
        ArrayList<Bus> buses;
        ArrayList<Routes> routes;
        int op;
        Scanner text;
        String name;
        buses = new ArrayList<>();
        routes = new ArrayList<>();
        text= new Scanner(System.in);
        
     
        System.out.println("Routes Avalibles\n");
                
        routes.add(0, new Routes("Sur",23,false,15,0.75F));
        routes.add(1, new Routes("Nort",35,false,20,1.25F));
        routes.add(2, new Routes("Nort",15,true,8,0.35F));
        for (Routes route : routes) {
            System.out.println(routes);
        }
        
        System.out.println("\ntransport available\n");
        buses.add(0, new Bus("A002","Luis",23,3.6F));   //placa,chofer,Nºbus,gananciaDiaria
        buses.add(0, new Bus("A001", "Marco",35, 4.8F));
      
        for (Bus buse : buses) {
            System.out.println(buses);
        }

   Scanner sn = new Scanner(System.in);
        boolean salir = false;
        int opcion; 
 
        
        while (!salir) {
 
            System.out.println("1. Choose routes");
            System.out.println("2. Pay for routes");
            System.out.println("3. ??????");
            System.out.println("4. Exit");
 
            try {
 
                System.out.println("choose one of de option");
                opcion = sn.nextInt();
 
                switch (opcion) {
                    case 1:
                        System.out.println("you have chosen the option 1");
                        break;
                    case 2:
                        System.out.println("you have chosen the option 2");
                        break;
                    case 3:
                        System.out.println("you have chosen the option 3");
                        break;
                    case 4:
                        salir = true;
                        break;
                    default:
                        System.out.println("just numbers between 1 and 4");
                }
            } catch (InputMismatchException e) {
                System.out.println("You must choose a valid option (number)");
                sn.next();
            }
        }
 
    }
    }
   


