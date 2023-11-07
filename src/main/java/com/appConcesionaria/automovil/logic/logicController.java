
package com.appConcesionaria.automovil.logic;

import com.appConcesionaria.automovil.persistence.PersistenceController;

public class LogicController {
    
    PersistenceController persistenceController = new PersistenceController();
    
    private Automovil automovil;
    
    public void guardarAuto (Automovil automovil){
        persistenceController.crearAutomovil(automovil);
    }
    
    
}
