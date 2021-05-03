package chapter2;

public class ExplicitConversion {

	public static void main(String[] args) {
		
		int iNum = 1000;
		byte bNum = (byte)iNum;
		
		System.out.println(iNum);
		System.out.println(bNum);
		
		double dNum = 3.14; // 8����Ʈ, �Ǽ��̱� ������ int�� �� �� ����
		iNum = (int)dNum; // int�� �ְڴٴ� ����, ����� �� ��ȯ
		System.out.println(iNum); // �Ҽ��� ���� ���ǵǾ �������� ����
		
		float fNum = 0.9F;
		int num1 = (int)dNum + (int)fNum; //���ϱ� ���� int�� ��ȯ, �Ҽ����� ���� �� 3�� 0���� ��ȯ�Ǿ� ���
		int num2 = (int)(dNum + fNum); //�� ���� �Ǽ� 3.14�� 0.9�� ���� �� int�� ��ȯ�Ǿ� 4 ���� �Ҽ��� ���� 
		
		System.out.println(num1);
		System.out.println(num2);
		
	}

}
