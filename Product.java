/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rmi_supmkt;

import java.rmi.Remote;
import java.rmi.RemoteException;
import java.util.List;

/**
 *
 * @author stefa
 */
public interface Product extends Remote {
     String addProductReminder(String strRmdr) throws RemoteException;
    
    
    public List<Supermarket> giveProduct() throws RemoteException; 
         //To change body of generated methods, choose Tools | Templates.
    

   
    
    
}
