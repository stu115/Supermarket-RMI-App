/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rmi_supmkt;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import java.util.Collection;
import java.util.List;

public class ProductImpl extends UnicastRemoteObject implements Product {

    public ProductImpl() throws RemoteException {
        super();
    }  
   
     @Override
    public String addProductReminder(String Rmdr) throws RemoteException {
        String capitalRmdr;

        System.out.println("Server: ProductReminder() started...");
        System.out.println("Server: Reminder > " + Rmdr);
        capitalRmdr = Rmdr.toUpperCase();    // convert message into capital
        return (capitalRmdr);               // return the capitalized message back to the client
    }

    
    @Override
    public List<Supermarket> giveProduct() throws RemoteException {
         //To change body of generated methods, choose Tools | Templates.
          throw new UnsupportedOperationException("Not supported yet.");
    }

   
    
}
