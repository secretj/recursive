package pocu.study.recursive;

public class recursive {

	public static void main(String[] args) {
		System.out.println(fibonacci(5));
		System.out.println(sumTailRecursive(100000,0));
		

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

}
