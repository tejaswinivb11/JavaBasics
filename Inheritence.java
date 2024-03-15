public class Inheritence {
    int a = 10;
    int b = 20;
}
class ChildClass extends Inheritence{
}

class TestClass{
    public static void main(String[] args) {
        ChildClass cc = new ChildClass();
        System.out.println(cc.b);
    }

}
// types of inheritence in java: single,multilevel,hyrarchical,hybrid,multiple

//aggrigation "has-A" relationship

class Address{
    String city,state,country;
    Address(String city,String state,String country){
        this.city = city;
        this.state = state;
        this.country = country;

    }
}

class employee {
    int id;
    String Name;
    Address address;


    employee(int id, String Name, Address address) {


        this.id =id;
        this.Name =Name;
        this.address = address;
    }

    void display(){
        System.out.println(id + Name);
        System.out.println(address.city + address.state + address.country);
    }

    public static void main(String[] args) {
        Address address1=new Address("mysore","karnataka","india");

        employee emp = new employee(1,"tejaswini",address1);
        emp.display();
    }
}