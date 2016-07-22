class c
{
public static void main(String args[])
{

try{
int sum=0;
for(String x:args){
sum=sum+Integer.parseInt(x);
}
System.out.println("sum is "+ sum);
}
catch(NumberFormatException e)
{
System.out.println("Only number allowed , no special character");
}
}

}

