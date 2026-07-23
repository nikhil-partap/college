abstract class Person {
    String name;
    int age;

    Person(String name, int age) {
        this.name = name;
        this.age = age;
    }
    void getInfo(){
        System.out.println(this.name + " \n" + this.age);

    }
}
