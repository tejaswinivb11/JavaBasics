// compile time error example:syntax error
//run time error example : arthametic error , zerodivision error

public class ExceptionHandiling {
    public static void main(String[] args) {
        try{
            int[] arr={1,2,3,4};
            System.out.println(arr[2]);
        }
        catch(Exception f){
            System.out.println("its a exception");
        }
        finally {
            System.out.println("ita a finally block");
        }
    }
}
// throw method
//The throw statement allows you to create a custom error.
//The throw statement is used together with an exception type.
// There are many exception types available in Java:
// ArithmeticException, FileNotFoundException, ArrayIndexOutOfBoundsException, SecurityException, etc
class throwException{

    static void checkAge(int age){
        if (age<18){
            throw new ArithmeticException("its a arithametic exception block");
        }
        else{
            System.out.println("done");
        }
    }

    public static void main(String[] args) {

        checkAge(15);
    }
}