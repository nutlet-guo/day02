package com.programmer.Day01;
//ѭ��
public class Demo3 {

	public static void main(String[] args) {
		// ˳��,��֧,ѭ��
		//Java while 0.019% do-while 0.001%  for --> 99.8%
		/*
		 *   ѭ����������ֵ  --> ��ѭ����ʼ��λ��
		 *   ѭ������   -->  ѭ���Ĵ���
		 *   ѭ���������������Լ�  --> ��ѭ�����ڽ���
		 */
		//��ӡ1-10֮��ÿһ�����ְ�����10
		//whileѭ��
		//ѭ����������ֵ  
		  int i = 1;
		  while(i<=10) {//ѭ������ -->��Χ(ѭ������) --> ��ϵ���ʽ
			  //�ظ�����������
			  System.out.println(i);
			  //ѭ���������������Լ�
			  i++;  // ��ѭ����i++ �� ++iû���κ�����
		  }
		  //while����д��ѭ�� --> ����ѭ��
		 //while��ѭ�������ǹ�ϵ���ʽ --> ֵֻ��true��false
//		  while(true) {
//			  System.out.println("1");
//		  }
		
		  //do-while��while��Щ����
		  //do-while�൱��while�ķ���
		  //ѭ����������ֵ
		  int j = 1; 
		  do {
			  System.out.println(j);
			  j++;
		  }while(j<=10);
		  
		  //do-while ��ִ�����ж�  while�����ж���ִ��
		  /*
		   * while(1<0){
		   *   sysout(1)
		   * }  ʲô�������ӡ
		   * 
		   * do{
		   *   sysout(1)
		   *   }while(1<0);  ���ӡ1
		   */
		  
		  //forѭ��
		  //for(ѭ����������ֵ;ѭ������;ѭ�������������Լ�){
          //   �ظ�����������
		  //	}
		  //��forѭ��С������������ѭ������������ֻ����forѭ�����ڲ�(�ܷ����)
		  for(int i1=1;i<=10;i1++) {
			  System.out.println(i1);
		  }
		 
		  //1.��ѭ������������for�ⲿ
//		  int i2 = 1;  //i2����������forѭ�����ⲿ����
//		  for(;i2<10;i2++) {
//			  System.out.println(i2);
//		  }
		  int i2;  //i2����������forѭ�����ⲿ����
		  for(i2 = 1;i2<10;i2++) {
			  System.out.println(i2);
		  }
		  
		  //2.��ѭ������������forѭ�����ⲿ ,ѭ�������������Լ�д��ѭ�����ڲ�
		  int i3 = 1;
		  for(;i3<10;) {
			  System.out.println(i3);
			  i3++;
		  }
		  
		  //3.forѭ���汾��ѭ��
		  
		  for(;;) {
			  System.out.println("1");
		  }
		  
				 
		  
		  
		  
		  
		  
		  
		

	}

}
