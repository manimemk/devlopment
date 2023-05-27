package conditionals;

public class Pattern {

public static void main(String args[]) {
	for(int i=1;i<=5;i++) {
		String s="";
		for(int j=0;j<i;j++) {
//			s=s+"* ";
			System.out.print("* ");
		}
		System.out.println(s);
	}
	
}
}
