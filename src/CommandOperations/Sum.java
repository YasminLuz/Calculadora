package CommandOperations;

import Interface.ICommand;

/**
 *
 * @author Yasmin
 */
public class Sum implements ICommand{
 
    private float num, result;
    private String symbol;
    private Operations operation;

    public Sum(int num, String symbol, Operations operation) {
        this.num = num;
        this.symbol = symbol;
        this.operation = operation;
    }
    
    @Override
    public String execute() {
        
        if (this.symbol.equals("+"))
            result = this.operation.sum(num);
        else 
            result = this.operation.subtract(num);
        
        System.out.println(result);
        
        return Float.toString(result);
    }

    @Override
    public void undo() {
         
        if (this.symbol.equals("+"))
            result = this.operation.subtract(num);
        else 
            result = this.operation.sum(num);
        
        System.out.println(result);
    }
    
}
