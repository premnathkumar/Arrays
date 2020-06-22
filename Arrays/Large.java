public class Large
{
public static void main(String args[]) {
int a[]=new int[]{2,20,34,12,67};
int smallest=a[0];
int largest=a[0];
for(int i=0;i<a.length;i++){
if(a[i]<smallest){
smallest=a[i]; }
if(a[i]>largest){ 
largest=a[i]; }}
System.out.println(smallest+" "+largest); 
}
}