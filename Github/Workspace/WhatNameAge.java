import java.util.Scanner ;
class WhatNameAge {
    public static void main (String[] agrs) {
        System.out.println("�ȳ�~");
        System.out.println("�� �̸��� �Ǽ����̾�");
        System.out.println("�ʴ� �̸��� ����?");
        String name = "";
        Scanner scanner = new Scanner (System.in);
        name = scanner.next();
        System.out.println("�� �̸��� " + name + "�̾�");
        System.out.println("�ݰ���~  " + name + "��");
        System.out.println("�׷��� " + name + "  �� ���̴�?");
        int age = 0 ;
        age = scanner.nextInt();
        System.out.println("�� ���̴� " + age + "���̾�");
    }
}