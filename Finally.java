class Finally
{
public static void main(String args[])
{
try{
int a=10,b=0;
int c=a/b;
}
catch(Exception e){
System.out.println("error handled");
}finally{
System.out.println("always executes");
}
}
}