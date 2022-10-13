
public class KadanesAlgorithm {
	public static void main(String[] args) {
		int arr[] = {1,2,3,-2,5};
		int msf = Integer.MIN_VALUE;//used for stored the sum
		int me=0;//subarray
		for(int i=0;i<arr.length;i++) {
			me = me+arr[i];
			if(msf<me) {
				msf=me;
			}
			if(me<0) {
				me=0;
			}
			
		}
		System.out.println(msf);
	}
}
