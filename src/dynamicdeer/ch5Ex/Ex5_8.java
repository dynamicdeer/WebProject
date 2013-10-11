package dynamicdeer.ch5Ex;

public class Ex5_8 {
	public static void main(String[] args) {
		int[] answer = {1,4,4,3,1,4,4,2,1,3,2};
		int[] counter = new int[4];
		
		for(int i=0; i<answer.length;i++){
			counter[answer[i]-1]++;
		}
		for(int i=0; i<counter.length;i++){
			System.out.println(counter[i]);
			
			for(int j=0; j<counter[i]; j++){
				System.out.println("*");// counter[i]의 값 만큼 '*'을 찍는다.
			}
			System.out.println();
		}
	}
}
