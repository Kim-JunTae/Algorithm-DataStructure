package sort;

public class StraightSelectionSort {
	//a[idx1]�� a[idx2]�� ���� �ٲߴϴ�.
	static void swap(int[] a, int idx1, int idx2) {
		int t = a[idx1];
		a[idx1] = a[idx2];
		a[idx2] = t;
	}
	
	//�ܼ� ���� ����
	static void selectionSort(int[] a, int n) {
		for(int i=0; i<n-1; i++) {
			int min = i;	//���� ���ĵ��� �ʴ� �κп��� ���� ���� ����� �ε����� ����մϴ�.
			for(int j=i+1; j<n; j++) {
				if(a[j] < a[min])
					min = j;
				swap(a, i, min);	//���� ���ĵ��� ���� �κ��� ù ��ҿ� ���� ���� ��Ҹ� ��ȯ�մϴ�.
			}
		}
	}
}