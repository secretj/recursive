package pocu.study.recursive;

public class recursive {

	public static void main(String[] args) {
		System.out.println(fibonacci(5));
		System.out.println(sumTailRecursive(1000,0));
		

	}
	//피보나치 수열
	public static int fibonacci(int n) {
		if(n<=1) {
			return n;
		}
			return fibonacci(n-1)+fibonacci(n-2);
	}
	
	// 전체 수의 합을 구하는 꼬리 재귀함수
	public static int sumTailRecursive(int n, int sum) {
		
		if(n<=0) {
			return sum;
		}
		return sumTailRecursive(n-1, sum+n); 
	}
	
	//반복문으로 만든 이진 탐색 알고리듬 
	public static int binarySearchRecursive(int arr[], int target) {
	    int low = 0;
	    int high = arr.length - 1;
	    int mid;

	    while(low <= high) {
	        mid = (low + high) / 2;

	        if (arr[mid] == target)
	            return mid;
	        else if (arr[mid] > target)
	            high = mid - 1;
	        else
	            low = mid + 1;
	    }
	    return -1;			//array안에서 숫자를 찾지 못했단 의미 
	}
	
	// 재귀함수를 이용해서 만든 이진 탐색 알고리듬
	public static int binarySearchRecursive2(int nums[], int value, int low, int high) {
	    if (low > high)
	        return -1;			//array안에서 숫자를 찾지 못했단 의미 
	    int mid = (low + high) / 2;
	    if (nums[mid] == value)
	        return mid;
	    else if (nums[mid] > value)
	        return binarySearchRecursive2(nums, value, low, mid-1);
	    else
	        return binarySearchRecursive2(nums, value, mid+1, high);
	}
