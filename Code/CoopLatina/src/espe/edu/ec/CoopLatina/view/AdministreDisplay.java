
package espe.edu.ec.CoopLatina.view;

import espe.edu.ec.CoopLatina.model.Bus;
import espe.edu.ec.CoopLatina.model.Customer;
import espe.edu.ec.CoopLatina.model.Passage;
import espe.edu.ec.CoopLatina.model.Passenger;
import espe.edu.ec.CoopLatina.model.Routes;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author Loor Cesar David Montufar,DDCO-ESPE,GADC.MSI
 */
<<<<<<< HEAD:Code/CoopLatina/src/ec/edu/espe/CoopLatina/view/AdmistrativeDisplay.java
public class AdmistrativeDisplay {

    public static void main(String[] args) throws IOException {
        System.out.println("==========Welcome to Coop-Latina==========");
        System.out.println("\t=========================");
=======
public class AdministreDisplay {

    
    public static void main(String[] args) throws IOException {
       System.out.println("\t=========================");
>>>>>>> d81d571f077fbe40e5bcce4af73f2e3e1ad9d4df:Code/CoopLatina/src/espe/edu/ec/CoopLatina/view/AdministreDisplay.java
        System.out.println("\t==WELCOME TO COOPLATINA==");
        System.out.println("\t=========================");
        
        FileWriter fileWriter;
        BufferedWriter BufferedWriter;
        
        int id;
        int op;
        int number;
        String identificationCard;
        String name;
        String address;
        String email;
      
        String pathCustomerCVS;
        
        //Al momento de ejecutar el codigo para guardar datos deben ubicar su carpeta para guardar .csv
        pathCustomerCVS = "C:\\Users\\pc\\Desktop\\2do Semestre\\Poo\\codigo\\G-4-GADC.MSI\\costumer.csv";
        
        
        ArrayList<Routes>routes;
        ArrayList<Bus>buses;
        ArrayList<Customer>customers;
        ArrayList<Passage>passage;
        ArrayList<Passenger>passengers;
        
        
        
        
        buses = new ArrayList<>();
        routes = new ArrayList<>();
        customers = new ArrayList<>();
     

        
        Scanner textInput = new Scanner(System.in);
       
        
        
        //Buses disponibles
        buses.add( new Bus("A001", "Marco", 35));
        buses.add(new Bus("A003", "Jorge", 13));
        
        //Rutas disponibles
        routes.add(new Routes("Quito", 01, 25, 2.5f, true));
        routes.add(new Routes("Valle", 02, 10, 1.5f, true));
        
     
        
            Scanner sn = new Scanner(System.in);
            boolean exit = false;
             
 
        
        while (!exit) {
            printOption();
           
            try {
 
                System.out.println("choose one of de option");
                 op = textInput.nextInt();
   
                switch (op) {
                    case 1:
                        File file = new File(pathCustomerCVS);
                        if (!(file.exists())) {
                          file.createNewFile();
                          fileWriter = new FileWriter(pathCustomerCVS);
                          fileWriter.append("Name;Identication;password;Number;\n");
                          fileWriter.close();
                        }else{
                           fileWriter = new FileWriter(pathCustomerCVS,true);
                        }
                           BufferedWriter = new BufferedWriter(fileWriter);
                           System.out.println(file.exists());
                           
                        System.out.println("You choose the option Nº1\n");
                        System.out.println("\n\n======Type Data about  user======");
                        
                        System.out.println("Write Name");
                        name = textInput.nextLine();
                        textInput.nextLine();
                        
                        System.out.println("Write Password");
                        identificationCard= sn.next();
                        name = textInput.nextLine();
                        textInput.nextLine();
                        
                        System.out.println("Write the number of your phone");
                        number = textInput.nextInt();
                        
                        System.out.println("Write the address");
                        address = textInput.next();
                        
                        customers.add(new Customer(name, identificationCard, address, number));
                        String str = customers.get(customers.size()-1).toString().replaceAll(",",";");
                       
                        System.out.println(str);
                        BufferedWriter.append(str+"\n");
                        BufferedWriter.close();
                     break;  
  
    
                    case 2:
                        System.out.println("\n\n======The available routes are======");

                        System.out.println(routes);
                        break;
                        
                    case 3:
                        System.out.println("\n\n======The avalible bus are======");
                        System.out.println(buses);
                        break;
                    case 4: 
                        
                        
                    case 5:
                        exit = true;
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
    

    private static void printOption() {
        System.out.println("Type 1 to introduce the user");
        System.out.println("Type 2 to view available routes");
        System.out.println("Type 3 to view the bus available");
        System.out.println("Type 4 Cooming Soom");
        System.out.println("Type 5 to exit");
         
    }  
    
}
