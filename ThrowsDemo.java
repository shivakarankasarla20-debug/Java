class ThrowsDemo
{
public static void main(String args[])
{
int age=15;
try{
if(age<18)
{
throw new ArithmeticException("not eligible");
}
}
catch(Exception e){
System.out.println(e.getMessage());
}
}
}