package com.study.basicofjavalanguage.stringpratiace;

import com.study.basicofjava.stringpratiace.AbstractEqualsTest;

import java.util.Scanner;

/**
 * �������������̽��equal��toUpperCase��toUpperCase��̽��
 * �������Լ����������Լ����ַ���
 */
class Realize extends AbstractEqualsTest {

    private static char[] arr;
    /**
     * ������������Ա�ַ�����������õ��ַ���������ʵ�ֶ�equal��toUpperCase��toUpperCase������̽��
     * �������ַ���ԭֵ��ConstructionOfString���еĳ�Ա����str1��str2��ֻ����������ֵ������Ĺ��췽����д�˶���
     */
    protected  String s1=str1;
    protected  String s2=str2;
    protected  String s3;

    /**
     * ���췽�������������������ַ�����ʼ����
     * ������һ���ַ�����
     * ��չ�˸���Ĺ��췽�� ConstructionOfString
     */
    public
    Realize(char[] arr) {
        super(arr);

        System.out.println("��������һ�����Լ����Զ�����ַ���");
        System.out.println("��չ���˸���Ĺ��췽��");
        Scanner scanner = new Scanner(System.in);
        s3=scanner.nextLine();
    }

    /**
     *��ʹ�ñ��������ַ���s1,s2��s3��Ϊ���������������ز�
     * equal�������÷�str.equals(String otherstr),���У�str��otherstr����Ҫ�Ƚϵ������ַ�������
     * �ַ���Ҳ����ʹ�á�==�����бȽϣ����������Ƚϵ����ַ������ڴ��ַ�������Ƚ������ַ���������
     * �������ַ����Ķ����ŵ��ڴ��ַ��һ�����á�==���Ƚ���Զ����false
     * java�������ָ���ַ��û����ʾ�����ַ����ĵ�ַ��ͬ
     */
    @Override
    protected void equalsCalc() {
      //TODO:���Զ���̽��equal�����Ĵ��루ʹ��s1��s2��s3��
    }

    /**
     * ����toUpperCase�÷���str.toUpperCase
     * ����str�������ַ���
     */
    @Override
    protected void toUpperCase() {
        //TODO:���Զ���̽��toUpperCase�����Ĵ��루ʹ��s1��s2��s3��
    }

    /**
     * ����toLowerCase���÷���str.toUpperCase
     * ����str�������ַ���
     */
    @Override
    protected void toLowerCase() {
        //TODO:���Զ���̽��toLowerCase�����Ĵ��루ʹ��s1��s2��s3��
    }

    /**
     * �˷������û�������ַ���ת��ΪRealize�Ĺ������ܹ�ʶ����ַ���������
     */
    static void inject(){
        System.out.println("��������Ҫ���й�����ַ�����");
        Scanner scanner=new Scanner(System.in);
        String input=scanner.nextLine();
        scanner.close();
        //count�൱���ַ���input���±�
        int count =0;
        arr = new char[input.length()];
        while (count < input.length()) {
            arr[count]=input.charAt(count);
            count++;
        }

    }
    public static void main(String[] args) {
        inject();
        Realize realize = new Realize(arr);
        realize.toUpperCase();
        realize.toLowerCase();
        realize.equalsCalc();
    }
}



