import java.util.*;
 
class Main
{  
 public static void main(String args[])
 {
 Scanner sc = new Scanner(System.in);
 
         int i,n,copy;
 
 System.out.println("Enter the number of elements:") ;
 n = sc.nextInt();
 int[] a = new int[n];
 
     System.out.println("Enter the elements") ;
     for(i=0;i<n;i++)
     { 
         a[i] = sc.nextInt();
     }
 
     	System.out.println("Original array");
     for(i=0;i<n;i++)
     {
         System.out.print(a[i]+" ");
     }
 
     /* shifting array elements */
     copy=a[n-1];
     for(i=n-1;i>0;i--)
     {
       a[i]=a[i-1];
     }
     a[0]=copy;
 
     System.out.println("\nNew array after rotating by one postion in the right direction");
     for(i=0;i<n;i++)
     {
       System.out.print(a[i]+" ");
     }
 } 
}
