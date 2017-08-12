package logic;
import java.util.Scanner;
public class primerange {
	public static void main(String args[]){
		int i;
		int count=0;
		for(i=10; i<=556; i++){
		if(i%2!=0 &&i%3!=0 && i%5!=0 && i%7!=0){
		//System.out.print(i+" ");
		count++;
		}
		}
		System.out.println(count);
}
}