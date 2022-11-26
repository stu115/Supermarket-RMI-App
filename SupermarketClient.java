/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rmi_supmkt;

import java.util.Scanner;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;

public class SupermarketClient {

    public static void main(String argv[]) {
        String regHost = "localhost";
        int regPort;
        String outerCompRef = "OnlineShop";

        System.out.println("Enter number of port that started rmiregistry .");
        Scanner input = new Scanner(System.in);
        regPort = input.nextInt();
        String nameRegistered = "rmi://" + regHost + ":" + regPort + "/" + outerCompRef;
        System.out.println("Client: Looking up " + nameRegistered + " ...");
        Supermarket OutSupermarket = null;
        try {
            Registry registry = LocateRegistry.getRegistry(regPort);
            OutSupermarket = (Supermarket) registry.lookup(nameRegistered);// look in reg  for the outside object
        } catch (Exception x) {
            System.out.println("Client: Come across exception while going to " + nameRegistered);
            System.exit(1);
        }

        // Send input messge from client to the remote object. Exit until the input = "."          
        System.out.println("Type in the message. Enter End to stop ");
        for (;;) {
            String strRmdr = input.nextLine();
            if ("End".equals(strRmdr)) {
                break;
            }
            try {    	// invoke the remote method!
                String changedMsg = OutSupermarket.supermarketStockReminder(strRmdr);
                System.out.println("Server has given: " + changedMsg);
            } catch (Exception x) {
                System.out.println("Client: Come across exception calling Supermarket Message().");
                System.exit(1);
            }
        }
    }
}
