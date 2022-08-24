import com.example.demo.MyDemo;
import com.example.exception.MyException;

/*
Create a custom exception class called MyException.

We are going create a MyDemo class , which will contain a method called int myBalance() and
one attribute called balance.

myBalance method will return the balance, if balance is lower than 1000, it will throw MyException, with message low balance.

form ImplMain we have to call this myBalance and handle the appropriate exception.
 */
public class ImplMain {
    public static void main(String[] args) {
        MyDemo demo = new MyDemo(500);
       try {
            System.out.println("my balance is = " + demo.myBalance());
        }catch (MyException e){
            System.out.println(e);
            e.printStackTrace();

           System.out.println("Please deposit amount to maintain your balance");
        }

       // System.out.println("my balance is = " + demo.myBalance());
    }
}
