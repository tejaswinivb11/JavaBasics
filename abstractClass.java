abstract class abstractClass {
    abstract void method();//abstract method
    void nonAbstract(){
        System.out.println("its a non abstract method");
    }
}
class extended extends abstractClass{
        void method(){
            System.out.println("its a method override");
        }

    public static void main(String[] args) {
        abstractClass ex = new extended();//upcating
        ex.method();
    }
}

