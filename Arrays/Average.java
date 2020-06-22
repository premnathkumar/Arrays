import java.util.*;
public class Average{
public static void main(String[] args){
 int n,sum=0;
float average;
Scanner sc=new Scanner(System.in);
n=sc.nextInt();
int a[]=new int[n];
for(int i=0;i<n;i++){
a[i]=sc.nextInt();
sum=sum+a[i];
}
System.out.println(sum);
average=(float)sum/n;
System.out.println(average);
}
}