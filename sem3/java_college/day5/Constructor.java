// 1. Main class is now at the top!
public class Constructor {
    public static void main(String[] args) {
        Person1 p1 = new Person1();
        Person1 p2 = new Person1(2 , "asdf");
    }
}

// 2. Secondary class goes below
class Person1 {
    int age;
    String name;
    Person1(int P_age, String P_name){ 
        System.out.println("para constructor ");
    }
    Person1(){ 
        System.out.println("default constructor ");
    }
}
`