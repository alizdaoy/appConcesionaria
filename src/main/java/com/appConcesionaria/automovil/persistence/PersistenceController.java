
package com.appConcesionaria.automovil.persistence;

import com.appConcesionaria.automovil.logic.Automovil;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

public class PersistenceController {
    
    AutomovilJpaController AutomovilController = new AutomovilJpaController();
    
    public void crearAutomovil (Automovil automovil){
        AutomovilController.create(automovil);
    }
    
    public void editarAutomovil (Automovil automovil){
        try {
            AutomovilController.edit(automovil);
        } catch (Exception ex) {
            Logger.getLogger(PersistenceController.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    public Automovil encontrarAutomovil (int id){
        try {
            return AutomovilController.findAutomovil(id);
        } catch (Exception e) {
            System.out.println("OMATOPOPIH");
            return null;
        }
    }
    public ArrayList<Automovil> listarVehiculo(){
        List<Automovil> listaAutomovil = AutomovilController.findAutomovilEntities();
        ArrayList<Automovil> arrayAutomovil = new ArrayList<Automovil>(listaAutomovil);
        return arrayAutomovil;
    }
}
    
    
        
    

