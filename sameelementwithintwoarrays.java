package basicprograms;

public class sameelementwithintwoarrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = new int[]{1,2,3,4,5};
		int arr1[] = new int[]{6,7,8,9,10};
		int flag=0;
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr1.length;j++) {
				if(arr[i]==arr1[j]) {
					System.out.println(arr[i]+"is same");
					flag=1;
				}
			}
			
		}
		if(flag==0) {
			System.out.println("No element is same");
		}

	}

}
