/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rmi_supmkt;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import java.util.Collection;

public class SupermarketImpl extends UnicastRemoteObject implements Supermarket {

    public SupermarketImpl() throws RemoteException {
        super();
    }  
     
     @Override
    public String supermarketStockReminder(String Rmdr) throws RemoteException {
        String capitalRmdr;

        System.out.println("Server: MarketMessage() started...");
        System.out.println("Server: Message > " + Rmdr);
        capitalRmdr = Rmdr.toUpperCase();    // turn message letters into upper-case 
        return (capitalRmdr);               // return the big lettered message back to the client
    }

   
    @Override
    public Collection<Product>getProduct(Product product) throws RemoteException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    

  
}
