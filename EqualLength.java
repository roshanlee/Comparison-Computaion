
public class EqualLength {
	
	void FindLength(){
	CalculateLength l1=new CalculateLength();
	CalculateLength l2=new CalculateLength();
	double len1=l1.calculateLength();
	double len2=l2.calculateLength();
	if(len1==len2){
		System.out.println("Lines are equal");
	}
	else{
		System.out.println("Line are not equal");
	}
}
	}
