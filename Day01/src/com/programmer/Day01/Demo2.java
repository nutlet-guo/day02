package com.programmer.Day01;

import java.util.Scanner;

// ��֧��ѭ��
public class Demo2 {
    public static void main(String[] args) {
		  //˳��  ������������ִ��
//    	  int a = 1;
//    	  int b = 1;
//    	  int sum = a+b;
//    	  System.out.println(sum);
    	  //��֧ -->�ڱ�д�����ʱ������������
    	  /*
    	   * if��֧
    	   * if����֧  if-else if-else if  ifǶ��
    	   * switch-case��֧
    	   * switch(ֵ){
    	   * 	case ֵ: 
    	   *        ִ�д���;
    	   *          break;
    	   *    case ֵ: 
    	   *        ִ�д���;
    	   *          break;   
    	   *     default:
    	   *         ִ�д���;
    	   *          break;           
    	   * 
    	   * }
    	   */
    	  //if����֧:
    	  /*
    	   * if(���ʽ[ѡ������]){
    	   * 	 ִ�����;
    	   * }
    	   * ������������,���մ�С�������
    	   *  a = 1  
    	   *  b = 3 
    	   *  c = 2
    	   *  ȷ���� ˭�����ֵ  ˭���м�ֵ  ˭����Сֵ
    	   *   a>b && a>c  && b>c
    	   *   sysout(c,b,a)
    	   *   д6��if�������
    	   */
    	    // ���䷶Χ --> 0~9 --> �������һ������ҿ�����
    	    // [0,1) --> [0*10~1*10)--[0,10) ������Сֵ���������ֵ  0~9
    	    int a = (int)(Math.random()*1000);
    	    int b = (int)(Math.random()*1000);
    	    int c = (int)(Math.random()*1000);
//    	    if(a>b && a>c && b>c) {
//    	    	System.out.println(c+" "+b+" "+a);
//    	    
//    	    }
//    	    if(a>b && a>c && c>b) {
//    	    	System.out.println(b+" "+c+" "+a);
//    	    	
//    	    }
    	    
    	    //������������ֵ
    	    // ʹ�õ���������
    	    //����:���赱ǰ����ֵ�������ҴӴ�С
    	    //  3 2 1 --> ��С�������  -->  1 2 3
    	    //  2 3 1
    	    if(a>b) {
    	    	int tmp = a;
    	    	a = b;
    	    	b = tmp;
    	    }
    	    // 2 3 1
    	    if(a > c) {
    	    	int tmp = a;
    	    	a  = c;
    	    	c = tmp;
    	    }
    	    //1 3 2 
    	    if(b>c) {
    	    	int tmp = b;
    	    	b = c;
    	    	c = tmp;
    	    			
    	    }
    	    System.out.println(a+" "+b+" "+c);
    	    //1 2 3
    	   
    	    //if-else 
    	    /*
    	     * if(ѡ������){
    	     *    ִ��1;
    	     * else{
    	     *    ִ��2;
    	     *   }
    	     *    ���漴��
    	     *   �ж�����     
    	     */
//    	    int year = 2019;
//    	    if((year%4==0 && year%100 != 0) ||(year%400 == 0)) {
//    	    	System.out.println("����");
//    	    }else { //�൱����if�����ķ�����
//    	    	System.out.println("��������");
//    	    }
    	    /*
    	     * if-eles if
    	     * if(ѡ������1){
    	     *    ִ��1;
    	     *  }else if(ѡ������2){
    	     *  	ִ��2;
    	     *  }else{
    	     *  	 Ĭ�����һ�����
    	     *  }
    	     *  ps:ֻҪ��һ���������� ���������������ж�
    	     */
    	      int  fs = (int)(Math.random()*100)+1;
    	      //��������ж�  
    	      //˳���ܸı�: ������ 90 80 70 60 ...
    	      if(fs>=90 && fs<=100) {
    	    	  System.out.println("A");
    	      }else if(fs>=80) {
    	          System.out.println("B");
    	      }else if(fs>=70) {
    	    	  System.out.println("C");
    	      }else if(fs>=60) {
    	    	  System.out.println("D");
    	      }else { // ���һ�����
    	    	  System.out.println("����");
    	      }
    	      //ifǶ��
    	      /*
    	       *   if(){
    	       *     if(){
    	       *         if(){
    	       *         }else{
    	       *         }
    	       *     }
    	       *    }
    	       *   
    	       *  ��ϰ:���ʱ����һ��
    	       *  20:39:40 --> 20:39:41
    	       *  20:39:59 --> 20:40:00
    	       *  20:59:59 --> 21:00:00
    	       *  23:59:59 --> 00:00:00   
    	       */
    	         Scanner input = new Scanner(System.in);
    	         String time = input.next();
    	         String[] times = time.split(":");
    	          int h = new Integer(times[0]);
    	          int m = new Integer(times[1]);
    	          int s = new Integer(times[2]);
    	          //��Ҫ+1
    	          s++;
    	          if(s == 60) {
    	        	  // ����0
    	        	  s = 0;
    	        	  //����+1
    	        	  m++;
    	        	  if(m == 60) {
    	        		  //������0
    	        		  m = 0;
    	        		  //Сʱ+1
    	        		  h++;
    	        		  if(h == 24) {
    	        			  //Сʱ��0
    	        			  h=0;
    	        		  }
    	        	  }
    	          }
    	         System.out.println(String.format("%02d", h)+":"
    	          +String.format("%02d", m)+":"+String.format("%02d", s));
    	          
    	         
    	      
    	       //switch-case��֧
    	       //��׼�汾(break)�͹ᴩ�汾(����ʹ��break����ȫ������)
    	       //switch(����(byte,short,int)/�ַ�/ö��/�ַ���)
    	         
    	       //�����Ӧ����
    	      //���������������: 2000-1-1 ���  ��1��
    	      //                 2000-12-31 ��� ��366��
    	      //���￼��ƽ������������
    	      //  2000 -5 -1 --> �����˼����� 4 ����  4 3 2 1  5�µ�1��
    	         //4+3+2+1  + 5�µ�ǰ������
    	       //��ǰ�·�-1 �ǹ�����·� 5-1 = 4  12-1 = 11
    	         int year = 2000;
    	         int month = 1;
    	         int day  = 1;
    	         switch(month-1) {
    	         // 4,6,9,11 --> 30�� ��2����ʣ��Ķ���31��
    	         //��case��case֮��û��break
    	         //�������������Ӱ�����
    	         case 5:
    	        	  day += 31;
    	         case 4:
    	        	  day += 30; // --> day = day +30
    	         case 3:
    	        	  day += 31;
    	         case 2:
    	        	  if((year%4==0&&year%100!=0)||(year%400==0)) {
    	        		  day += 29;
    	        	  }else {
    	        		  day += 28;
    	        	  }
    	         case 1:
    	        	  day += 31;
    	        	  System.out.println("��"+day+"��");
    	        	  break;
    	         default: // ��1�·�
    	        	  System.out.println("��"+day+"��");
    	        	  break;
    	        	  
    	         }
    	        
    	      
    	  
    	  
    	  
    	  
    	  
    	  
    	  
    	  
    	  
	}
}
