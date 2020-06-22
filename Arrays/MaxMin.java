import java.util.*;
public class MaxMin{
public static void main(String[] args){
int arr[];
int max,min,n;
Scanner sc=new Scanner(System.in);
n=sc.nextInt();
for(int i=0;i<n;i++)
{
 arr[i]=sc.nextInt();
}
max=arr[0];
min=arr[0];
for(int i=1;i<n;i++){
  if(arr[i]>max)
{
max=arr[i];
}
if(arr[i]<min)
{
min=arr[i];
}
}
System.out.println(max);
System.out.println(min);

}
}