import java.util.*;
public class Rotating_array_again{
    static int[] Rotate(int arr[],int lp,int up){
        int i=lp,j=up;
        while(j>=i){
           int temp=arr[i];
           arr[i]=arr[j];
           arr[j]=temp;
           i++;
           j--;
        }return arr;}
    public static void main(String[] args){
        Scanner Sc=new Scanner(System.in);
        System.out.print("Enter size of the Array: ");
        int n=Sc.nextInt();
       int[] arr=new int[n];
        System.out.println("Enter your Array: ");
        for(int i=0;i<n;i++)arr[i]=Sc.nextInt();
        System.out.print("Till which term you want to rotate: ");
       int turn=Sc.nextInt();
       turn=turn%n;
       Rotate(arr,0,n-turn-1);
       Rotate(arr,n-turn,n-1);
       Rotate(arr,0,n-1);
        System.out.println("The rotated Array is: ");
    for(int ele:arr) System.out.print(ele+" ");
    }
}
