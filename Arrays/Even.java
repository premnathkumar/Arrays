public class Even{
public static void main(String[] args){
  int nums[]={1, 0, 1, 0, 0, 1, 1};
    int[] result = new int[nums.length];
    int nextEven = 0;
    int nextOdd = nums.length - 1;

    for ( int num : nums )
    {
        if ( num % 2 == 0 )
            result[ nextEven++ ] = num;
        else
            result[ nextOdd-- ] = num;
    }

    return result;
}
}
