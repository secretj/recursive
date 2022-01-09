package pocu.recursive.function;

public class binnaryAndBubble {

// 반복문으로 만든 이진 탐색 알고리듬
	public int binarySearchRecursive(int arr[], int target) {
		int low = 0;
		int high = arr.length - 1;
		int mid;

		while (low <= high) {
			mid = (low + high) / 2;

			if (arr[mid] == target)
				return mid;
			else if (arr[mid] > target)
				high = mid - 1;
			else
				low = mid + 1;
		}
		return -1; // array안에서 숫자를 찾지 못했단 의미
	}

// 재귀함수를 이용해서 만든 이진 탐색 알고리듬
	public int binarySearchRecursive2(int nums[], int value, int low, int high) {
		if (low > high)
			return -1; // array안에서 숫자를 찾지 못했단 의미
		int mid = (low + high) / 2;
		if (nums[mid] == value)
			return mid;
		else if (nums[mid] > value)
			return binarySearchRecursive2(nums, value, low, mid - 1);
		else
			return binarySearchRecursive2(nums, value, mid + 1, high);
	}

// 버블 정렬 알고리듬
	public void bublleSort(int[] nums) {
			for(int i=0; i<nums.length-1; ++i) {
				for(int j=0; j<nums.length-i-1; ++j ) {
					if(nums[j] > nums[j+1]) {
						int temp = nums[j];
						nums[j] = nums[j+1];
						nums[j+1] = temp;
					}
				}
			}
	}
}
