package test;

public class Test {


    public static void main(String[] args) {

    }

    private static void master(){
        System.out.println("master 分支");
        B();
        A();
    }

    private static void A(){
        System.out.println("A 分支代码");
    }

    private static void B(){
        System.out.println("B 分支代码");
    }
}
