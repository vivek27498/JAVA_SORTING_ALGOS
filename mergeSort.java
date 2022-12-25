import java.util.Arrays;

public class mergeSort {
	
	public static void merger(int[] arr,int si,int mid,int ei) {
		
		int idx1 = si; // array 1 start
		int idx2 = mid + 1; // array 2 start
		int x = 0; // new array start
		
		int[] merged = new int[ei-si+1];
		
		while(idx1<=mid && idx2<=ei)
		{
			if(arr[idx1]<arr[idx2])
			{
				merged[x++]=arr[idx1++];
			}
			else
			{
				merged[x++]=arr[idx2++];
			}
		}
		
		while(idx1<=mid)
		{
			merged[x++]=arr[idx1++];
		}
		
		while(idx2<=ei)
		{
			merged[x++]=arr[idx2++];
		}
		
		for(int i=0,j=si;i<merged.length;i++,j++)
		{
			arr[j]=merged[i];
		}
		
	}
	
	public static void divide(int[] arr,int si,int ei) {
		
		if(si>=ei)
		{
			return;
		}
		
		int mid = si + (ei-si)/2;
		divide(arr,si,mid);
		divide(arr,mid+1,ei);
		merger(arr,si,mid,ei);
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {2,10,12,3,1,4};
		divide(arr,0,arr.length-1);
		System.out.println(Arrays.toString(arr));
	}

}
