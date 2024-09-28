package Array;

import java.util.*;
public class CountzeroOne {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int size=in.nextInt();
        int zero=0;
        int one=0;
        int[] arr=new int[size];
        for(int i=0;i<size;i++){
            arr[i]=in.nextInt();
        }
        for(int i=0;i<size;i++){
            if(arr[i]==0){
                zero++;
            }
            else if(arr[i]==1){
                one++;
            }
        }
        System.out.println("zerocount:"+" "+zero);
        System.out.println("onecount:"+" "+one);
    }
}
