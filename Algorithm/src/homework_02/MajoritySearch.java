package homework_02;

public class MajoritySearch {
	public static void Majority(int[] A, int[] majority_num, int low, int high){
		if(high - low > 1){
			int mid = (low+high)/2;
			Majority(A, majority_num, low, mid);
			Majority(A, majority_num, mid+1, high);
			Search(A, majority_num, low, high);
		}else if(high - low == 1) {
			if(A[low]==A[high]){majority_num[low] = A[low];}
			}
		else if(high - low == 0){majority_num[low] = A[low];}
	}

	public static void Search(int[] A, int[] majority_num, int low, int high){
		int count = 0; //=> 같은 숫자를 세주는 변수
		if(majority_num[low] != 0){
			//이전 배열에 과반인 수가 있는 경우=> 없는 경우는 넘김
			for(int j = low ; j <= high ; j++){
				if(majority_num[low] == A[j]){ count++; }
			}
			if(count <= (high-low)/2){ majority_num[low] = 0;}
		}else {majority_num[low] = 0;}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] A = {54, 23, 97, 23, 23, 80, 23, 67, 23};
		int[] majority_num = new int[A.length];
		Majority(A, majority_num, 0, A.length-1);
		
		for(int i=0;i<majority_num.length;i++)
			System.out.print(majority_num[i]+" ");
		System.out.println();
		
		for(int i=0;i<majority_num.length;i++)
			if(majority_num[i] != 0){System.out.println("과반의 수 : "+majority_num[i]); break;}
			else if(i == majority_num.length-1) {System.out.println("과반의 수가 없습니다.");}
	}
}
