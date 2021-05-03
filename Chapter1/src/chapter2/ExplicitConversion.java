package chapter2;

public class ExplicitConversion {

	public static void main(String[] args) {
		
		int iNum = 1000;
		byte bNum = (byte)iNum;
		
		System.out.println(iNum);
		System.out.println(bNum);
		
		double dNum = 3.14; // 8바이트, 실수이기 때문에 int로 들어갈 수 잆음
		iNum = (int)dNum; // int로 넣겠다는 선언, 명시적 형 번환
		System.out.println(iNum); // 소수점 이하 유실되어도 괜찮음을 선언
		
		float fNum = 0.9F;
		int num1 = (int)dNum + (int)fNum; //더하기 전에 int로 변환, 소수점이 유실 된 3과 0으로 변환되어 계산
		int num2 = (int)(dNum + fNum); //두 개의 실수 3.14와 0.9를 더한 후 int로 변환되어 4 이후 소수점 유실 
		
		System.out.println(num1);
		System.out.println(num2);
		
	}

}
