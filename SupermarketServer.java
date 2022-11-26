/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rmi_supmkt;

import java.util.Scanner;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;

public class SupermarketServer {

    public static void main(String argv[]) {
        String regHost = "localhost";       // host machine running on RMI reg       
        int regPort;                        // port starting rmi connection         
        String outerCompRef = "OnlineShop";     //name of outside component as service                

        Scanner input = new Scanner(System.in);
        System.out.println("Enter the port to start running the rmiregistry. "
                + "Port number starts from 1024 - 65,535.");
        regPort = input.nextInt();//read port number typed in for RMI to start      
        try {
            System.out.println("Server: Putting service on reg");

            // make RMI register by wrting & running its program code instead of command line 
            LocateRegistry.createRegistry(regPort);
            Registry registry = LocateRegistry.getRegistry(regPort);
            Supermarket outer = new SupermarketImpl();

            // outer object being put on register with rmi register made
            registry.rebind("rmi://" + regHost + ":" + regPort + "/"
                    + outerCompRef, outer);
            System.out.println("Server: Ready...");
        } catch (Exception x) {
            System.out.println("Server: Puttin service on reg not successful: " + x);
        }
    }
}
