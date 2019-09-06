package CommandOperations;

import Interface.ICommand;

/**
 *
 * @author Yasmin
 */
public class Multiply implements ICommand {

    private float num, result;
    private String symbol;
    private Operations operation;

    public Multiply(int num, String symbol, Operations operation) {
        this.num = num;
        this.symbol = symbol;
        this.operation= operation;
    }
   
    @Override
    public String execute() {
          
        if (this.symbol.equals("*"))
            result = this.operation.multiply(num);
        else 
            result = this.operation.divide(num);
        
        System.out.println(result);
        
        return Float.toString(result);
    }

    @Override
    public void undo() {
        
          if (this.symbol.equals("*"))
            result = this.operation.divide(num);
        else 
            result = this.operation.multiply(num);
          
        System.out.println(result);  
    }
    
}
