package lesson_05;

import java.util.Scanner;

public class HomeWork_051 {
    public static void main(String[] args) {
        System.out.println("������ 1. ������ ������� ��� ��������� ������ �����.");
        System.out.println("�������� ������: ");
        System.out.println("1 - ����");
        System.out.println("2 - ����");
        System.out.println("3 - �������");
        System.out.println("4 - �����������");
        System.out.println("5 - ��������");

        Scanner scanner = new Scanner(System.in);
        int inputFigura = scanner.nextInt(); //����� ������

        System.out.println("��� ���������: ");
        System.out.println("1 - �������");
        System.out.println("2 - �������� ");
        int inputAction = scanner.nextInt(); //��� �������

        switch (inputFigura){
            case 1: //����

                break;
            case 2: //����

                break;
            case 3: //�������
                System.out.println("������� ������� ��������: ");
                int inputSide = scanner.nextInt();
                if(inputAction == 1){
                    System.out.println("������� �������� = " + inputSide*inputSide);
                }else if(inputAction == 2){
                    System.out.println("�������� �������� = " + inputSide*4);
                }else {
                    System.out.println("����� ����� ���.");
                }
                break;
            case 4: //�����������

                break;
            case 5: //��������

                break;
            default:
                System.out.println("����� ������ ���!");
        }

    }
}
