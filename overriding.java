class Animal
{
void sound()
{
System.out.println("eating");
}
}
class Dog extends Animal
{
void sound()
{
System.out.println("barking");
}
}
public class overriding
{
public static void main(String args[])
{
Animal a= new Animal();
a.sound();
}
}