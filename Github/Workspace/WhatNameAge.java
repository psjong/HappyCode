import java.util.Scanner ;
class WhatNameAge {
    public static void main (String[] agrs) {
        Scanner scanner = new Scanner (System.in) ;
        System.out.println("�ȳ�~");
        System.out.println("�� �̸��� ȫ�浿�̾�");
        System.out.println("�ʴ� �̸��� ����?");
        String name = "";
        name = scanner.next();
        System.out.println("�� �̸��� " + name + "�̾�");
        System.out.println("�ݰ���~  " + name + "��");
        System.out.println("�׷��� " + name + "  �� ���̴�?");
        int age = 0 ;
        age = scanner.nextInt();
        System.out.println("�� ���̴� " + age + "���̾�");
    }
}