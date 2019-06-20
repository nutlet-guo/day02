package com.programmer.Day01;
//循环
public class Demo3 {

	public static void main(String[] args) {
		// 顺序,分支,循环
		//Java while 0.019% do-while 0.001%  for --> 99.8%
		/*
		 *   循环变量赋初值  --> 即循环开始的位置
		 *   循环条件   -->  循环的次数
		 *   循环变量的自增或自减  --> 让循环趋于结束
		 */
		//打印1-10之间每一个数字包括是10
		//while循环
		//循环变量赋初值  
		  int i = 1;
		  while(i<=10) {//循环条件 -->范围(循环次数) --> 关系表达式
			  //重复操作的事情
			  System.out.println(i);
			  //循环变量的自增或自减
			  i++;  // 在循环中i++ 或 ++i没有任何区别
		  }
		  //while可以写死循环 --> 无线循环
		 //while的循环条件是关系表达式 --> 值只有true和false
//		  while(true) {
//			  System.out.println("1");
//		  }
		
		  //do-while和while有些类似
		  //do-while相当是while的翻版
		  //循环变量赋初值
		  int j = 1; 
		  do {
			  System.out.println(j);
			  j++;
		  }while(j<=10);
		  
		  //do-while 先执行在判断  while是先判断在执行
		  /*
		   * while(1<0){
		   *   sysout(1)
		   * }  什么都不会打印
		   * 
		   * do{
		   *   sysout(1)
		   *   }while(1<0);  会打印1
		   */
		  
		  //for循环
		  //for(循环变量赋初值;循环条件;循环变量自增或自减){
          //   重复操作的事情
		  //	}
		  //在for循环小括号中声明的循环变量作用域只能在for循环的内部(密封变量)
		  for(int i1=1;i<=10;i1++) {
			  System.out.println(i1);
		  }
		 
		  //1.将循环变量声明在for外部
//		  int i2 = 1;  //i2变量可以在for循环的外部访问
//		  for(;i2<10;i2++) {
//			  System.out.println(i2);
//		  }
		  int i2;  //i2变量可以在for循环的外部访问
		  for(i2 = 1;i2<10;i2++) {
			  System.out.println(i2);
		  }
		  
		  //2.将循环变量声明在for循环的外部 ,循环变量自增或自减写在循环的内部
		  int i3 = 1;
		  for(;i3<10;) {
			  System.out.println(i3);
			  i3++;
		  }
		  
		  //3.for循环版本死循环
		  
		  for(;;) {
			  System.out.println("1");
		  }
		  
				 
		  
		  
		  
		  
		  
		  
		

	}

}
