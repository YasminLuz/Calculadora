package calculadora;

import CommandOperations.*;

/**
 *
 * @author Yasmin
 */
public class Calculadora {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
//        Operations op1 = new Operations("+");
//        Operations op2 = new Operations("-");
//        Operations op3 = new Operations("*");
//        Operations op4 = new Operations("/");
          Operations op = new Operations();
        
//        ICommand som = new Sum(op1);
//        ICommand sub = new Sum(op2);
//        ICommand mult = new Multiply(op3);
//        ICommand div = new Multiply(op4);
        
        Action act = new Action();
            act.addAction(new Sum(3, "+", op));
            act.addAction(new Sum(30, "+", op));
            act.addAction(new Sum(5, "-", op));
            act.addAction(new Multiply(7, "*", op));
            act.addAction(new Sum(1, "+", op));
            act.addAction(new Multiply(3, "/", op));

        act.execAction();
      act.undo();
      act.undo();
        
        
        
        
    }
    
}
