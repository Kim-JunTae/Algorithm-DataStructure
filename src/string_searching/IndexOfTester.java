package string_searching;

import java.util.Scanner;

//String.indexOf, String.lastIndexOf �޼���� ���ڿ��� �˻��մϴ�.
public class IndexOfTester {

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		
		System.out.print("�ؽ�Ʈ : ");
		String s1 = stdIn.next();		//�ؽ�Ʈ�� ���ڿ�
		
		System.out.print("���� : ");
		String s2 = stdIn.next();		//���Ͽ� ���ڿ�
		
		int idx1 = s1.indexOf(s2);		//���ڿ� s1���� s2�� �˻�
		int idx2 = s1.lastIndexOf(s2);	//���ڿ� s1���� s2�� �˻�
		
		if(idx1 == -1)
			System.out.println("�ؽ�Ʈ �ȿ� ������ �����ϴ�.");
		else {
			//ã�Ƴ� ���ڿ��� �ٷ� �ձ����� ���� ������ ���մϴ�.
			int len1 = 0;
			for(int i=0; i<idx1; i++)
				len1 += s1.substring(i, i+1).getBytes().length;
			len1 += s2.length();
			
			int len2 = 0;
			for(int i=0; i<idx2; i++)
				len2 += s1.substring(i, i+1).getBytes().length;
			len2 += s2.length();
		
			//ã�� ���ڿ��� �ٷ� �ձ����� ���ڸ� ���鹮�ڷ� ���
			//getBytes()
			System.out.println("�ؽ�Ʈ : " + s1);
			System.out.printf(String.format("���� : %%%ds\n", len1), s2);
			System.out.println("�ؽ�Ʈ : " + s1);
			System.out.printf(String.format("���� : %%%ds\n", len2), s2);
		}

	}

}