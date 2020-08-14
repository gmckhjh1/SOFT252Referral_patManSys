/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUIUpdateObserver;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Glenn McKnight
 */
public final class GUIUpdate implements GUIUpdateObservable {
    
    private static GUIUpdate errorReportingInstance;
    
    private List<GUIUpdateObserver> errorObservers = new ArrayList();
    
    private GUIUpdate(){}
    
    public  static GUIUpdate getInstance(){
        if(errorReportingInstance == null){
            errorReportingInstance = new GUIUpdate();
        }        
        return errorReportingInstance;
}
    
    public void updateDisplayMessage(String errorMessage){
        notifyUpdateObserver(errorMessage);
    }

    @Override
    public void updateObserver(GUIUpdateObserver observer) { 
        if(!errorObservers.contains(observer)){
            errorObservers.add(observer);
        }
    }

    @Override
    public void removeUpdateObserver(GUIUpdateObserver observer) { 
        int index = errorObservers.indexOf(observer);
        if (index >= 0) errorObservers.remove(index);
    }
    
    @Override
    public void notifyUpdateObserver(String errorMessage) {
        errorObservers.forEach((signupObserver) -> {
            signupObserver.update(errorMessage);
        });
    }
}
