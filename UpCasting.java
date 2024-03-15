//If the reference variable of Parent class refers to the object of Child class, it is known as upcasting.
public class UpCasting {
    void run(){
        System.out.println("its a parent class");
    }
}
class babyClass extends UpCasting{
    void run(){
        System.out.println("its a child class");
    }
    void UpcastTest(){
        System.out.println("it works");
    }
}
class uptest{
    public static void main(String[] args) {
        UpCasting uc = new babyClass();//upcasting
        //babyClass bc = new UpCasting(); ---> downcasting
        uc.run();
        //uc.UpcastTest(); ---> upcasting do not allow the unoverriden methods to be displayed
    }
}
