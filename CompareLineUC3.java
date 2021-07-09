
public class CompareLineUC3 {
	void CompareLength(){
		System.out.println("Enter the co-ordinate");
		CalculateLength l1=new CalculateLength();
		CalculateLength l2=new CalculateLength();
		double len1=l1.calculateLength();
		double len2=l2.calculateLength();
		if(len1==len2){
			System.out.println("Lines are equal");
		}
		else if(len1>len2) {
			System.out.println(len1+"is greater than"+len2);
		}
		else{
			System.out.println(len1+"is less than "+len2);
		}
	}
}
