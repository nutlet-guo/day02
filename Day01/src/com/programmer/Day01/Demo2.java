package com.programmer.Day01;

import java.util.Scanner;

// 分支和循环
public class Demo2 {
    public static void main(String[] args) {
		  //顺序  从上至下逐行执行
//    	  int a = 1;
//    	  int b = 1;
//    	  int sum = a+b;
//    	  System.out.println(sum);
    	  //分支 -->在编写代码的时候进行条件添加
    	  /*
    	   * if分支
    	   * if单分支  if-else if-else if  if嵌套
    	   * switch-case分支
    	   * switch(值){
    	   * 	case 值: 
    	   *        执行代码;
    	   *          break;
    	   *    case 值: 
    	   *        执行代码;
    	   *          break;   
    	   *     default:
    	   *         执行代码;
    	   *          break;           
    	   * 
    	   * }
    	   */
    	  //if单分支:
    	  /*
    	   * if(表达式[选择条件]){
    	   * 	 执行语句;
    	   * }
    	   * 有三个不等数,按照从小到大输出
    	   *  a = 1  
    	   *  b = 3 
    	   *  c = 2
    	   *  确定数 谁是最大值  谁是中间值  谁是最小值
    	   *   a>b && a>c  && b>c
    	   *   sysout(c,b,a)
    	   *   写6个if就能完成
    	   */
    	    // 区间范围 --> 0~9 --> 随机数是一个左闭右开区间
    	    // [0,1) --> [0*10~1*10)--[0,10) 包含最小值不包含最大值  0~9
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
    	    
    	    //交换两个数的值
    	    // 使用第三方变量
    	    //假如:假设当前三个值是有序并且从大到小
    	    //  3 2 1 --> 从小到大输出  -->  1 2 3
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
    	     * if(选择条件){
    	     *    执行1;
    	     * else{
    	     *    执行2;
    	     *   }
    	     *    非真即假
    	     *   判断闰年     
    	     */
//    	    int year = 2019;
//    	    if((year%4==0 && year%100 != 0) ||(year%400 == 0)) {
//    	    	System.out.println("闰年");
//    	    }else { //相当于是if条件的反方向
//    	    	System.out.println("不是闰年");
//    	    }
    	    /*
    	     * if-eles if
    	     * if(选择条件1){
    	     *    执行1;
    	     *  }else if(选择条件2){
    	     *  	执行2;
    	     *  }else{
    	     *  	 默认最后一种情况
    	     *  }
    	     *  ps:只要有一个条件满足 其他条件都不会判断
    	     */
    	      int  fs = (int)(Math.random()*100)+1;
    	      //多个条件判断  
    	      //顺序不能改变: 必须是 90 80 70 60 ...
    	      if(fs>=90 && fs<=100) {
    	    	  System.out.println("A");
    	      }else if(fs>=80) {
    	          System.out.println("B");
    	      }else if(fs>=70) {
    	    	  System.out.println("C");
    	      }else if(fs>=60) {
    	    	  System.out.println("D");
    	      }else { // 最后一种情况
    	    	  System.out.println("补考");
    	      }
    	      //if嵌套
    	      /*
    	       *   if(){
    	       *     if(){
    	       *         if(){
    	       *         }else{
    	       *         }
    	       *     }
    	       *    }
    	       *   
    	       *  练习:求出时间下一秒
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
    	          //秒要+1
    	          s++;
    	          if(s == 60) {
    	        	  // 秒清0
    	        	  s = 0;
    	        	  //分钟+1
    	        	  m++;
    	        	  if(m == 60) {
    	        		  //分钟清0
    	        		  m = 0;
    	        		  //小时+1
    	        		  h++;
    	        		  if(h == 24) {
    	        			  //小时清0
    	        			  h=0;
    	        		  }
    	        	  }
    	          }
    	         System.out.println(String.format("%02d", h)+":"
    	          +String.format("%02d", m)+":"+String.format("%02d", s));
    	          
    	         
    	      
    	       //switch-case分支
    	       //标准版本(break)和贯穿版本(部分使用break或完全不适用)
    	       //switch(整数(byte,short,int)/字符/枚举/字符串)
    	         
    	       //输出对应天数
    	      //假如输入的天数是: 2000-1-1 输出  第1天
    	      //                 2000-12-31 输出 第366天
    	      //这里考虑平年或闰年的问题
    	      //  2000 -5 -1 --> 过完了几个月 4 个月  4 3 2 1  5月第1天
    	         //4+3+2+1  + 5月当前的天数
    	       //当前月份-1 是过完的月份 5-1 = 4  12-1 = 11
    	         int year = 2000;
    	         int month = 1;
    	         int day  = 1;
    	         switch(month-1) {
    	         // 4,6,9,11 --> 30天 除2月外剩余的都是31天
    	         //即case和case之间没有break
    	         //这里的条件不会影响计算
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
    	        	  System.out.println("第"+day+"天");
    	        	  break;
    	         default: // 即1月份
    	        	  System.out.println("第"+day+"天");
    	        	  break;
    	        	  
    	         }
    	        
    	      
    	  
    	  
    	  
    	  
    	  
    	  
    	  
    	  
    	  
	}
}
