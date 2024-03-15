import java.util.*;

class ArraySort{

    public void sort(int[] a, int[] b,int[] c, int n,int m){
        int i =0,j=0,k=0;
        while(i<n && j<m){
            if(a[i]<b[j]){
                c[k++] =a[i++];
            }
            else{
                c[k++] = b[j++];
            }
        }
        for(;i<n;i++){
            c[k++]=a[i];
        }
        for(;j<m;j++){
            c[k++]=b[j];
        }

    }
}
class MergeSort{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.err.println("enter the 1st array len");
        int n=sc.nextInt();
        System.err.println("enter the 1st array len");
        int m=sc.nextInt();
        int k=n+m;
        int[] a = new int[n]; 
        int[] b = new int[m];
        int[] c = new int[k];
        System.out.println("Enter the value of the array 1:");
        for(int i=0;i<n;i++){
            a[i]=sc.nextInt();
        }
        System.out.println("Enter the value of the array 2:");
        for(int i=0;i<m;i++){
            b[i]=sc.nextInt();
        }
        ArraySort as = new ArraySort();
        as.sort(a, b, c, n, m);        
        for(int i=0; i<k ; i++){
            System.out.println(c[i]);
        }
    }
}