package practice;

public class ArraySamplePrograms {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		printFreq(new int[]{1,2,6,2,1,5,2});
	}
	
	public static void printFreq(int []arr) {		
		int[] freq=new int[arr.length];
		int elementVisit=-1;
		
		for(int i=0;i<arr.length;i++) {
			int ct=1;
			for(int j=i+1;j<arr.length;j++) {
				if(arr[i]==arr[j]) {
					ct++;
					freq[j]=elementVisit;
				}
			}
			if(freq[i]!=elementVisit) {
				freq[i]=ct;
			}
		}
		System.out.println("******* Each element frequency************");
		for(int i=0;i<freq.length;i++) {
			if(freq[i]!=elementVisit) {
				System.out.println("element "+ arr[i]+": "+freq[i]);
			}
		}
	}
}
