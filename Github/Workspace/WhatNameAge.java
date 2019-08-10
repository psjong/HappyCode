import java.util.Scanner ;
class WhatNameAge {
    public static void main (String[] agrs) {
        System.out.println("안녕~");
        System.out.println("내 이름은 피세종이야");
        System.out.println("너는 이름이 뭐니?");
        String name = "";
        Scanner scanner = new Scanner (System.in);
        name = scanner.next();
        System.out.println("내 이름은 " + name + "이야");
        System.out.println("반갑다~  " + name + "아");
        System.out.println("그런데 " + name + "  몇 살이니?");
        int age = 0 ;
        age = scanner.nextInt();
        System.out.println("내 나이는 " + age + "살이야");
    }
}