import java.util.Scanner ;
class WhatName {
    public static void main (String[] args){
        System.out.println("이름이 뭐니?");
        String name = "";
        Scanner scanner = new Scanner(System.in);
        name = scanner.next();
        System.out.println("내 이름은 " + name + "이야~");
        System.out.println("몇 살이니?");
        int age = 0 ;
        age = scanner.nextInt();
        System.out.print("내 나이는 " + age + "살 이야~" );
    }
}