package practice;

public class Armstrong {

	/**
	 * 153= 1^3+5^3+3^3=1+125+27=153
	 * 
	 * 123= 1^3+2^3=3^3=1+8+27=36 
	 * 
	 * 1634= 1^4 + 6^4 + 3^4 + 4^4=1+1296+81+256=1634
	 */
	static void checkArmstrongNumber(int num,int p) {
		
		int temp,rem;
		double res=0;
		temp=num;
		while(num!=0) {
			rem=num%10;
			res=res+Math.pow(rem, p);//3^4 or 3^3
			num=num/10;
		}
		if(res==temp) {
			System.out.println("Given Number is armstrong");
		}else {
			System.out.println("Given Number is not armstrong");
		}		
	}	
	public static void main(String[] args) {
		
		Armstrong.checkArmstrongNumber(9474,4);
	}

}
