import java.util.Scanner ;
class WhatName1 {
    public static void main(String[] ages) {
        System.out.println("이름이 뭐이가?");
        String name = "";
        Scanner scanner = new Scanner (System.in) ;
        name = scanner.next();
        System.out.println ("내 이름은 " + name + "이다.");
        System.out.println ("그럼 나이는 몇이가?") ; 
        int age = 0 ;
        age = scanner.nextInt();
        System.out.println ("내 나이는 " + age + "살 이다." ); 
    }
}