import java.io.*;
class OddNumber
{
public static void main(String args[])
{
try
{
DataInputStream in=new DataInputStream(System.in);
int st,et,i;
st=Integer.parseInt(in.readLine());
et=Integer.parseInt(in.readLine());
for(i=st;i<=et;i++)
{
if(i%2!=0)
{
System.out.println(i);
}
}
}
catch(Exception e)
{
}
}
}
