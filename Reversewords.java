package logic;

import java.util.Scanner;

public class Reversewords {
	public  static void main(String args[]) {
		Scanner s=new Scanner(System.in);
		String str=s.nextLine();
        StringBuffer str2=new StringBuffer(str);
        str2.reverse();
        System.out.println(str2);
}
}