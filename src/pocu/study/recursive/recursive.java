package pocu.study.recursive;

public class recursive {

	public static void main(String[] args) {
		System.out.println(fibonacci(5));
		System.out.println(sumTailRecursive(100000,0));
		

	}
	//�Ǻ���ġ ����
	public static int fibonacci(int n) {
		if(n<=1) {
			return n;
		}
			return fibonacci(n-1)+fibonacci(n-2);
	}
	
	// ��ü ���� ���� ���ϴ� ���� ����Լ�
	public static int sumTailRecursive(int n, int sum) {
		
		if(n<=0) {
			return sum;
		}
		return sumTailRecursive(n-1, sum+n); 
	}

}
