package interfacePogram;

import com.if_elseOperators.Prime_1_to_100;

interface Bank
{
	float rateOfInterest();// by default--->public abstract
}
class SBI implements Bank
{

	@Override
	public float rateOfInterest() {
		// TODO Auto-generated method stub
		return 9.15f;
	}
	
}
class PNB1 implements Bank{
	@Override
	public float rateOfInterest() {
		// TODO Auto-generated method stub
		return 9.7f;
	}
}
public class Interface2 {
	public static void main(String[] args)
	{
		SBI I=new SBI();
		System.out.println("SBI POI: "+I.rateOfInterest());
		PNB1 p1=new PNB1();
		System.out.println("PNB POI: "+p1.rateOfInterest());
		Bank b=new SBI();
		System.out.println("ROI: "+b.rateOfInterest());
	}

}
