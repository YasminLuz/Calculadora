package calculadora;

import Interface.ICommand;
import java.util.ArrayList;

/**
 *
 * @author Yasmin
 */
public class Action {
    private ArrayList<ICommand> listAction = new ArrayList<>();
    private ICommand undoCommand;
        
    public void addAction(ICommand operate) {
         listAction.add(operate);
    }
    
    public void execAction() { //String action
       for(ICommand act : listAction)  
           act.execute();
    }
    
    public void undo() {
        listAction.get(listAction.size()-1).undo();
    }
    
    public void indo(String action) {
            
    }
}
