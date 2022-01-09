package pocu.study.recursive;

public class recursive {

	public static void main(String[] args) {
		System.out.println(fibonacci(5));
		System.out.println(binarySearchRecursive(int arr[]= {1,3,4,6,2,4,10},6 );

	}

	// �Ǻ���ġ ����
	public static int fibonacci(int n) {
		if (n <= 1) {
			return n;
		}
		return fibonacci(n - 1) + fibonacci(n - 2);
	}

	// ��ü ���� ���� ���ϴ� ���� ����Լ�
	public static int sumTailRecursive(int n, int sum) {

		if (n <= 0) {
			return sum;
		}
		return sumTailRecursive(n - 1, sum + n);
	}

	// �ݺ������� ���� ���� Ž�� �˰���
	public static int binarySearchRecursive(int arr[], int target) {
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
		return -1; // array�ȿ��� ���ڸ� ã�� ���ߴ� �ǹ�
	}

	// ����Լ��� �̿��ؼ� ���� ���� Ž�� �˰���
	public static int binarySearchRecursive2(int nums[], int value, int low, int high) {
		if (low > high)
			return -1; // array�ȿ��� ���ڸ� ã�� ���ߴ� �ǹ�
		int mid = (low + high) / 2;
		if (nums[mid] == value)
			return mid;
		else if (nums[mid] > value)
			return binarySearchRecursive2(nums, value, low, mid - 1);
		else
			return binarySearchRecursive2(nums, value, mid + 1, high);
	}

	// ���� ���� �˰���
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
