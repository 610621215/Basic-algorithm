package ggmod;
//�e������
public class ggg1 {
	public static void main(String[] args) {
		//�ȨB�J
		tower(3,"A","B","C");
		
	}
	public static void tower(int n,String A,String B,String C){
		if(n==1) {
			System.out.println("�q " +A+ " �� " +C);//����̫�@�ӥi�H���ʬ���
			return;
		}
		else {
			System.out.println("\n"+"=====0====="+"\n");
			tower(n-1,"A","C","B");//�ɥi�઺���WB
			System.out.println("\n"+"=====1====="+"\n");
			tower(1,"A","B","C");//�@�w�u�Ѥ@�ӡA��������L��L�h
			System.out.println("\n=====2=====\n");
			tower(n-1,"B","A","C");//�ɥi�઺����A�W�l���A�ϥ��̫�A�|�^�h
		}
		
	}
}
