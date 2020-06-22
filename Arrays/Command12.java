import java.util.*;
public class Command12{
public static void main(String[] args){
int a=args.length;
int x,y,w,z,i;
int arr[][][]=new int[9][9][9];
if(a<9)
{
System.out.println("please nter 4 values");
}
if(a==9)
{
int h=0;
for(i=0;i<3;i++)
{
for(int j=0;j<3;j++)
{
for(int k=0;k<3;k++)
{
arr[i][j][k]=Integer.parseInt(args[h]);
h++;
}
}
}
}
for(i=0;i<2;i++)
{
for(int j=0;j<2;j++)
{
for(int k=0;k<3;k++)
{
System.out.println(arr[i][j][k]+" ");
}
System.out.println();
}
}
for(i=1;i>=0;i--)
{
for(int j=1;j>=0;j--)
{
for(int k=1;k>=0;k--)
{
System.out.println(arr[i][j][k]+" ");
}
System.out.println();
}
}
}
}