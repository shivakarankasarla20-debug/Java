class Animal
{
String name;
void eat()
{
System.out.println(name+"is eating");
}
}
class Dog extends Animal
{
void bark()
{
System.out.println(name+"is barking");
}
}
public class inheritance
{
public static void main(String args[])
{
Dog d1= new Dog();
d1.name="vishwa";
d1.eat();
d1.bark();
}
}