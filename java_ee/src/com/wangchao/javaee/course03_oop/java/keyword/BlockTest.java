package com.wangchao.javaee.course03_oop.java.keyword;

/**
 * 类的成员之四
 *
 * 1. 代码块的作用：用来初始化类或者对象
 * 2. 代码块如果有修饰的话，只能使用static
 * 3. 分类：   static代码块    VS    非static代码块
 *
 * 4. 静态代码块：
 *      > 内部可以有输出语句
 *      > 随着类的加载而执行，而且只能执行一次
 *      > 作用：初始化类的信息
 *      > 如果一个类中定义了多个静态代码块，则按照声明的先后顺序执行
 *      > 静态代码块的执行要优先于非静态代码块的执行
 *      > 静态代码块内只能调用静态的属性、静态的方法，不能调用非静态的结构
 *
 * 5. 非静态代码块：
 *      > 内部可以有输出语句
 *      > 随着对象的创建而执行，每创建一个对象就会执行一次
 *      > 作用：可以在创建对象时，对对象的属性等进行初始化
 *      > 如果一个类中定义了多个非静态代码块，则按照声明的先后顺序执行
 *      > 非静态代码块内可以调用静态的属性、静态的方法，或非静态的属性、非静态的方法
 *
 * ※※可以对属性进行赋值的位置
 *      ① 默认初始化
 *      ② 显示初始化 / ⑤ 在代码块中赋值
 *      ③ 构造器中初始化
 *      ④ 创建对象之后，可以通过"对象.属性" 或者 "对象.方法"的方式，进行赋值
 */
public class BlockTest {
    public static void main(String[] args) {
        String desc = Student.desc;
        System.out.println(desc);

        Student s1 = new Student("Tom", 12);
        System.out.println(s1.name);

        Student.info();
    }
}

class Student{
    //属性
    String name;
    int age;
    //静态属性
    static String desc = "我是一名学生";

    //构造器
    public Student() {
    }
    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    //非static代码块
    {
        System.out.println("hello, block - 2");
    }
    {
        System.out.println("hello, block - 1");
        //调用非静态结构
        age = 1;
        study();
        //不可以调用静态结构
        desc = "我是一个爱学习的人1";
        info();
    }
    //static代码块
    static{
        System.out.println("hello, static block - 2");
    }
    static{
        System.out.println("hello, static block - 1");
        //调用静态结构
        desc = "我是一个爱学习的人";
        info();
        //不可以调用非静态结构
//       eat();
//       name = "Tom";
    }

    //方法
    public void study(){
        System.out.println("学习");
    }
    @Override
    public String toString() {
        return "Person [name=" + name + ", age=" + age + "]";
    }
    //静态方法
    public static void info(){
        System.out.println("我是一个快乐的学生！");
    }
}
