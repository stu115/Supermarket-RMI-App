/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rmi_supmkt;

import java.rmi.Remote;
import java.rmi.RemoteException;
import java.util.Collection;
//One to many with supermarket
public interface Supermarket extends Remote { 
   String supermarketStockReminder(String strRmdr) throws RemoteException;
   
   Collection<Product>getProduct(Product product) throws RemoteException;
   
}
