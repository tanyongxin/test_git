package test;

public class Test {


    public static void main(String[] args) {

    }

    private static void master(){
        System.out.println("master 分支");
        B();
        B("B");
        A();
    }

    private static void A(){
        System.out.println("A 分支代码");
    }

    private static void A(int i){
        System.out.println("A 分支代码，增加重载方法");
    }


    private static void B(){
        System.out.println("B 分支代码");
    }

    private static void B(String s){
        System.out.println("B 分支代码" + s);
    }

}
