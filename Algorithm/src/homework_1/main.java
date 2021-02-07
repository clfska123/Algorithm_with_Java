package homework_1;

public class main {

	private void MergeSort(int i,int j)
	{
		int midLeft, midRight;
		if(j-i>=2) {
			midLeft = (int)(i*2+j)/3;
			midRight = (int)(i+2*j)/3;
			MergeSort(i, midLeft);
			MergeSort(midLeft+1, midRight);
			MergeSort(midRight+1,j);
			Merge(i,midLeft,midRight,j);
		}else {
			if(j-i == 1 && value[j] < value[j]) {
				int temp = value[j];
				value[j] = value[i];
				value[i] = temp;
			}
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] value = 
			{78, 33, 95, 18, 45, 91,
			58, 23, 75, 69, 78, 52,
			38, 98, 68, 90, 36, 19};
	}

}
