// data types
// arrays
// variables
// ram memory space data 
// types of variables?
// primitive varaible
// directly value store
// refernce varibale
// primritive variable 
// int x=5

// float y=16f;
// String s="rashid";
// String s1;
// String s =new String("rashid");
// Apple a=new Apple
// Apple b;
// classifcation variable , the value it contains
// 2nd classification 
// static or class level
// instance or object level variable
// local variable/bounded scope variable /thread safety variable

// instance variable
// whenevrr i will be creating an instance  varibale 
// it always be declared within the class but nt in any method
// instance variable or object level

// s1 ->x student(); memory adddres 

// s2-> x student(); memory address
// they will be intailaed automatically by their deafult.
// int 0 float 0.0 string null bool false
// class variable static variable 
// collegename = upes 
// static variable 
// if i would be having some variable which will always be same for all the objects ithan i should static 
// variable .because static variable will be same for all the objects therefore there will be only copy
// of static variable for all the objects .
// staic variable will be shared in all the objects 
//  if will commit some changes into static variable than it will be reflected into all the objects
// we can access static varianle with object name as well a classname
// college.x = 5; error
// int x;
// static int y;
// static variable will also be intialised by their default value
// java.exe test java file jvm 
// java classname
// start jvm
// jvm 
// main thread
// locate file
// load class ram -> scope of static variable
// execute main 
//  unload class -> end scope of static variable
// terminate thread
// shutdown jvm
// System.out.println(s2.f); // 0.0
// System.out.println(s2.s); // null
// System.out.println(s2.b); // false
// in static method we cant acess non-static(instance variable).
// error: non-static method sam() cannot be referenced from a static context
// test t1 = new test();
// System.out.println(t1.x);
// t1.sam();
// System.out.println(x);

// college s1 = new college();
// s1.collegename = "dit";
// college.collegename = "dbit";
// System.out.println(x);

// college s2 = new college();
// System.out.println(s2.collegename); // 0
// public void sam() {
//     System.out.println(y);

// }

// class college {

//     static int x;
//     float f;
//     String s;
//     boolean b;
//     static String collegename = "upes";

//     public void student() {

//         // System.out.println(x);

//     }
// }

// local variable?
// within method variable x, upto that method

// int x = 30;

// if (args.length > 0) {
// x = x + 10;
// System.out.println(x + 10);

// test t1 = new test();
// System.out.println(t1.x);
// }

// if (args.length > 0) {
// x = x + 10;
// System.out.println(x + 10);

// test t1 = new test();
// System.out.println(t1.x);
// else {
// x = 40;
// }
// System.out.println(x);
// System.out.println(y);
// System.out.println(x);

// public void thor() {

// }

// arithmetic + - * / %
// relation operator > >= < <=
// logical && || !
// bitwise operator
// | & ~ ^ ! >>  <<
// teranry operator 
// ? :
// unary operator

// int x = 5;
//         // incremet dec
//         // pre post
//         x++;
//         System.out.println(++x + x++);
//         System.out.println(x++);
//         System.out.println(x);

// int x = 10;
// System.out.println(x++);// 10 (11)
// System.out.println(++x);// 12
// System.out.println(x--);// 12 (11)
// System.out.println(--x);// 10

// variable length arguement 
// m1 string array double array int array 
// m1(String ...x,double ...y) 
// array 
// main method 
// variable 
// operator 
// flow control
// int x[] = new int[5];
//  int a[] = { 10, 20, 30, };
//  int b[] = { 30, 40, 50 };
//  test t1 = new test();

//  // int z = t1.m1();
//  System.out.println(x);

// m1("rashid");
// conditional statement -> if if else elseif
// main-> overload or override , inherit
// operator -> post incremeent
// x++
// byte+byte-> int
// short+short->int
// byte+long->long
// long+double->double
// float+long->float
// char+char->int
//
// byte x = 10;
// x++ ->x=x+1
// x = (byte) (x + 1);
// + -> byte (b,b)->int

// byte b = 10;
// byte c = 13;
// byte d = (byte) (b + c);
// infinity
// NaN
// 10/0-> there is no such way to reprsent infinity value->arithmetic exception 
// short byte int long
// 10/0.0
// float double->infinity
// 0
// 0.0/0
// NaN->not a number !=10
// not a number == not a number 
// not a number != noot a number
// Arithmetic Exception->integral number
// what is operator overloading?
// -> int+int-> literal addition
// -> string + string-> concatenation
// ->box1 +box2
// ->"rashid"+ "siddiqui"
// "rashidsiddiqui"
// relational oerator
// >,>=,<,<=,==,!=
// 10>20->false
// 'a'>10->true
// 
// char x = 97;
// operator overloading exist in java?
// String s = "rashid";
// int x = 1, y = 2, z = 3;
// int x = 4 + 5;
// sop(z+s+x+y+z)
// ->left to right
// s+x->s+y->s+z
// s = z + x + y;
// a->97
// A->65
// relational operator
// "rashid">"aimal"
// string are objects
// true<false
// < ,> >=,<= nesting / chaining of operator not allowed
// == -> reference comparsion
// !=
// what is the most top level class in java?
// Object java/python/js
// timing->
//

// String x = "rashid";
// String y = "rashid";
// x = "salman";
// Thread t1 = new Thread();
// Thread t2 = t1;
// Thread t3 = new Thread();
// operand1==operand2 , equals ->
// Object is a class ,it is super class of all the class
// iostream
// thread
// exception 

// Object obj = new Object(); // Object is parent
// Thread t1 = new Thread();
// String s = new String("Hello");
// String s1 = null;
// String s2 = new String("hello");
// json->javascript object notation java 
// c# redbus
// facebook php
// java amazon 
// xml->
// json->
// instanceof -> is a opeartor java in , it tells whether xrefernce
// bitwise opeartor &,~,^,|,>>,<<
// &-> boolean -> true /false
// &-> integrals nu
// 12 & 15
// | -> boolaen -> true and false
// integral
// 1001
// 0101
// 1101->13
// if both the signals are same the result is false
// 100
// 101
// 001
// >> right shift
// 100
// << left shift
// bitwise complement ~
// && ,& | ||
// &, |-> boolean,integral values
// &&, ||-> boolean
// ||
// | atleast one operand should be true-> it will check for both
// || atleast one operand should be true-> if first arguement is true than it
// will not check for second
// &->both operand true ->true -> it will check for both operand
// &&-> both operand true ->true ->if the first operand is false it will not
// check for second
// bansal-> 12 20
// arora-> 12 20
// neha->12 20
// ayush 12 20
// arjun 12 20
// anchal 12 20
// assignment
// shorthand compound augmented
// x+=x->x=x+x
// x+=2-> x=x+2
// + -> sign symbol
// typecasting coercion
// converting 1 data type into other
// implicit-> it is there not mention
// explicit-> detailed
//
// x = 2; // x=x+2

// int y = 20;
// if (++x > 10 | ++y > ++x) { // x=11,y=21
// x++;
// } else {
// y++;
// }
// System.out.println(--x + " ... " + ">>> " + ++y);
// byte -> short -> (char->)int->long->float->double.

// byte i = 10;
// int x = i;
// int i = 150;
// byte x = (byte) i;

// double x = 10;
// Object obj = new Object(); // Object is parent
// Thread t1 = new Thread();
// String s = new String("Hello");
// int x;
// int y;
// public static int m1() {
// int res = 1000;
// // int z;
// // for (int i = 0; i < x.length; i++) {
// // res += x[i];
// // }
// System.out.println("sum : " + x);
// return res;

// }

// public static void m1(int x, int y) {

// System.out.println("helllo " + x);
// }
// conditinal operator , ternary operator-> 
//a+b
// ++x
// int x=(condition)?firstvalue:second value
// String x = "Student";
// args[0] b = new args[0]();
// Student s= new Student();
// Student s1;-> refernce variable
// s1=new Student();
// object create with new operator without knowing classname?
// no
// newInstance()
// Student s1 = new Student();
// what is constructor?
//vcs->github->bitbucket-> linus ->merge conflict->
// filezilla
// slack

// System.out.println("this is what i hav erecived" + args[0]);
// Object b = Class.forName("Student").getDeclaredConstructor().newInstance();
// System.out.println("object is created " + b.getClass().getName());
// // int x = 5;
// int z = 6;
// int a = (x < z) ? ((10 > 9) ? 100 : 200) : 10;
// operator precedence
// ()
// unary operator ~
// binary operator
// arithmetic

// ternary operator
// assignment
//

// System.out.println(m(1) * 12 + 13 - 2 * m(1));
// new operator
// Student s = new Student();
// object
// newInstance

// Class.forname(args[0])
// class Student {
//     Student(int x) {
//         System.out.println("const with sum arg");
//     }

//     Student() {
//         System.out.println("empty const");
//     }

// }

// class employee {

// }

// class customer {
// }

// int x = 10;
// int y = 20;
// boolean x = true;
//
// x++
// int x = 10;
// int y = 12;
// z=x+1;

// if (++x > 10 && ++y > y)
// ;

// int y = 7;
// int z = 10;
// if (x == y && x > z) {
// System.out.println(x + " x and y are equal and greatest");
// } else if (y == z && y > z) {

// System.out.println(y + " z and y are equal and greatest");

// } else if (x == z && x > y) {

// System.out.println(z + " x and z are equal and greatest");

// }

// else if (x >= y && x >= z) {
// System.out.println(x + " is greatest x");
// } else if (y >= x) {
// System.out.println(y + " is greatest y");
// } else {
// System.out.println(z + " is greatest z");
// }

// if (true)
// if (false)
// System.out.println("hello");
// else
// System.out.println("hey whats up");

// System.out.println("login sucessfull");
// System.out.println("it will always run");

// 35fxgd5ueNxM
// conditional statement if else -> else if else if ladder -> if with single staetemnet-> but not for declarative->condition it always expect
// boolean value ->dangling in java ->
// selection statement -> switch case -> else if 
// what is fall through?
class upes {

    public static void main(String args[]) {
        // int x = Integer.parseInt(args[0]);
        // byte y = 20;
        // byte z = x + y;
        // final int y = 30;
        // final int z = x;
        // boolean x = true;
        // switch (x) {
        // case true:
        // System.out.println("test");
        // case false:
        // System.out.println(" print");

        // }
        // -2147483648 to 2147483647
        // long x = 5l;
        // double x = 10.0;
        // String
        // enum
      

        // switch (x) {
        // case 1:
        // System.out.println("hello");

        // break;

        // case 2:
        // case 3:
        // case 4:
        // case 5:
        // System.out.println("lower primary");
        // break;
        // case 6:
        // case 7:
        // case 8:
        // System.out.println("Upper Primary");
        // break;
        // case 9:
        // case 10:
        // case 11:
        // case 12:
        // System.out.println("Higher secondary");
        // break;
        // default:
        // System.out.println("default");

        // }

    }

}
