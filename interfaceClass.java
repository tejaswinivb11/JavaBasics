//An interface in Java is a blueprint of a class. It has static constants and abstract methods.
//The interface in Java is a mechanism to achieve abstraction
    // There can be only abstract methods in the Java interface, not method body.
    // It is used to achieve abstraction and multiple inheritance in Java
//interface also represents the IS-A relationship.
//There are mainly three reasons to use interface. They are given below.
    //It is used to achieve abstraction.
    //By interface, we can support the functionality of multiple inheritance.
    //It can be used to achieve loose coupling.--->less dependence on other class compared to tight dependence
//The Java compiler adds public and abstract keywords before the interface method.
// Moreover, it adds public, static and final keywords before data members.
//The relationship between classes and interfaces
    //a class extends another class, an interface extends another interface, but a class implements an interface.
    //class ---> extends ---> class
    //class ---> implements --->interface
    //interface --->extends ---> interface
//there can not be a superclass for an interface.
//in interface we can have "default" and "static" method in it i.e a method with a body
interface interfaceClass {
    void methods();
}
class interfaceTest implements interfaceClass{
    public void methods(){
        System.out.println("its a implemented method");
    }// as the methods in interface class is public so, even in the implemented class the methods should be private
    public static void main(String[] args) {
        interfaceClass itf= new interfaceTest();
        itf.methods();
    }
}

interface secondOne{
    void method1();
}
class implementing1 implements secondOne{
    public void method1(){
        System.out.println("its a implemented1 method");
    }
}
class implementing2 implements secondOne{
    public void method1(){
        System.out.println("its a implemented2 method");
    }
}
class testinginterface{
    public static void main(String[] args) {
        secondOne so;
        so = new implementing1();
        so.method1();
        so=new implementing2();
        so.method1();
    }
}