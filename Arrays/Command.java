import java.util.*;
public class Command{
public static void main(String[] args){
int a=args.length;
int x,y,w,z,i;
int arr[][]=new int[4][4];
if(a<4)
{
System.out.println("please nter 4 values");
}
if(a==4)
{
int k=0;
for(i=0;i<2;i++)
{
for(int j=0;j<2;j++)
{
arr[i][j]=Integer.parseInt(args[k]);
k++;
}
}
}
for(i=0;i<2;i++)
{
for(int j=0;j<2;j++)
{
System.out.println(arr[i][j]+" ");
}
System.out.println();
}
for(i=1;i>=0;i--)
{
for(int j=1;j>=0;j--)
{
System.out.println(arr[i][j]+" ");
}
System.out.println();
}
}
}