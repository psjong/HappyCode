import java.util.Scanner ;
class WhatName {
    public static void main (String[] args){
        System.out.println("�̸��� ����?");
        String name = "";
        Scanner scanner = new Scanner(System.in);
        name = scanner.next();
        System.out.println("�� �̸��� " + name + "�̾�~");
        System.out.println("�� ���̴�?");
        int age = 0 ;
        age = scanner.nextInt();
        System.out.print("�� ���̴� " + age + "�� �̾�~" );
    }
}