//hashing
import java.util.*;
public class Main {
    public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    int[] a=new int[n];
    for(int i=0;i<n;i++)
    {
        a[i]=sc.nextInt();
    }

    int[] hash=new int[12];
    for(int i=0;i<n;i++)
    {
        hash[a[i]]=hash[a[i]]+1;
    }
    int t=sc.nextInt();
    while(t-->0)
    {
        int n1=sc.nextInt();
        System.out.println(hash[n1]);
    }
    }
}