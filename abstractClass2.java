abstract class abstractClass2 {
    abstract void abstractmethod();
    abstractClass2(){
        System.out.println("its a constructor");
    }
    void method(){
        System.out.println("its a non abstract method");
    }
}
class testing extends abstractClass2 {
    void abstractmethod(){
        System.out.println("its a overriding the constructor");
    }

    public static void main(String[] args) {
        abstractClass2 ab=new testing();
        ab.abstractmethod();
        ab.method();

        }
}
