import java.lang.Math;
import java.util.Scanner;
public class CalculateLength {

	double calculateLength(){
		System.out.println("Enter the cordinate");
		Scanner sc=new Scanner(System.in);
		int x1=sc.nextInt();
		int y1=sc.nextInt();
		int x2=sc.nextInt();
		int y2=sc.nextInt();
		double length;
	length=Math.sqrt((x2-x1)*(x2-x1)+(y2-y1)*(y2-y1));
	sc.close();
	return length;
	}
}
