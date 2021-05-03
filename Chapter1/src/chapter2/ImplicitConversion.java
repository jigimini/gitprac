package chapter2;

public class ImplicitConversion {

	public static void main(String[] args) {
		byte bNum = 10;
		int num = bNum;
		
		System.out.println(num);
		
		long lNum = 10;
		float fNum = lNum;
		
		System.out.println(fNum);
		
		double dNum = fNum + num; // 두 번의 형 변환. 더하는 연산 우선 수행, num이 float 형으로 변환
		System.out.println(dNum); // 두 수를 더한 값이 double로 형 변환
	}

}
