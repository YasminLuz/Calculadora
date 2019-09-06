package CommandOperations;

/**
 *
 * @author Yasmin
 */

enum Op{
    SUM, SUBTRACT, DIVIDE, MULTIPLY;
}

public class Operations {
    private float result;
    private String operation;
    
    public Operations() {
    }
    
//    public Operations(int num, String operation) {
//        this.num = num;
//        this.operation= operation;
//    }
      
//    public Operations(String operation) {
//        this.operation= operation;
//    }

//    public String getOperation() {
//        return operation;
//    }
      
    public float divide(float param){
        return this.result *= (1/param) ;
    }
    
    public float multiply (float param){
        return this.result *= param;
    }

    public float sum(float param){
        return this.result += param;
    }
    
    public float subtract(float param){
        return this.result += -param;
    }
    
}
