package com.programmer.Day01;

public class Demo5 {
	
	//方法  静态方法 非静态方法 抽象方法
	
	//静态方法 --> 需要定义在类中 方法和方法之间是平级关系
	/*
	 *访问权限修饰符 [其他修饰符] 返回值类型 方法名(参数列表){
	 *					方法体
	 *                return
	 * }
	 * 访问权限修饰符:  即 谁可以访问这个方法 -->  public 公有 (最高权限谁都可以访问)
	 * [其他修饰符]:  这个是可以省略的,不写即普通方法
	 * static 或 abstract 或 final    静态属于类,静态方会随着类的加载而加载
	 * 使用类名调用  即 类名.静态方法名   静态的是所有对象共享
	 * ps: 静态方法也可以使用对象调用
	 * 返回值类型: 可以是值类型(基本数据类型)和引用类型(数组,类,接口,集合等等)
	 *             void 返回值类型
	 * 方法名: 满足标识符命名规则 -->  小驼峰  手单词字母小写后续单词字母大写
	 *         不要操作26字符     不用拼音
	 * 参数列表 :  可以内有参数即()
	 *            也可以有多个参数,多参数的情况下使用逗号隔开
	 * ps: 方法中参数列表就相当于定义变量,在没有调用方法时 这个变量不会在内存中开辟空间
	 *  数据类型 变量名,数据类型 变量 .....
	 * { }  方法的逻辑写在这里
	 * 
	 * return: return是一个关键字作用是结束一个方法并且可以带回一个返回值
	 * return的使用根据的是 方法中的返回值类型
	 * 若方法的返回值类型是void,此时可以使用return 也可以不写 但是不能带有返回值
	 * 若方法的返回值类型是值类型或是引用类型时
	 * 必须使用return 而且必须调用返回值,这个返回值需要和返回值类型一致
	 * 假如 
	 * public static int add(){
	 * 		return 1; //1这个值必须是int类型 不能给其他类型
	 *     一个方法中只能有一个return执行
	 * }
	 *
	 * 
	 */
	public static void show() {
		 System.out.println("静态方法");
	}
	
	
    public static void main(String[] args) {
		   
    	 //使用一个方法交换这两个数,为什么? 
    	 //public static void swap(int a,int b){}
    	
    	 //在main方法中 需要交换量数
    	 int a = 1;
    	 int b = 2;
    	 //交换完后得到 a = 2  b = 1
    	 int tmp = a;
    	 a = b;
    	 b = tmp;
    	 System.out.println("交换后:");
    	 System.out.println(a);
    	 System.out.println(b);
    	
    	
    	
    	
    	
    	
    	
    	
    	
    	
	}
}
