class Calc
{
public static void main(String args[])
{
if(args.length==2){
try{
int a=Integer.parseInt(args[0]);
int b=Integer.parseInt(args[1]);
int c=a+b;
System.out.println("Sum is " +c);
}
catch(NumberFormatException e)
{
System.out.println("Only number allowed , no special character");
}
}
else
{
System.out.println("Two vale are required , insufficientt value");
}
}
}
