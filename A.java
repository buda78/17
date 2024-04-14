package goo;
import java.util.*;
public class hashset{
	public static void main(String arg[]) {
		Scanner sc=new Scanner(System.in);
		TreeSet<Integer> ts=new TreeSet<>();
		System.out.println("How many values:");
		int n=sc.nextInt();
		System.out.println("Enter the Numbers:");
		for(int i=0;i<n;i++) {
			int num=sc.nextInt();
			ts.add(num);
		}
		System.out.println("numbers in Sorted orders:");
		for(int num:ts) {
			System.out.println(num);
		}
	}
}
