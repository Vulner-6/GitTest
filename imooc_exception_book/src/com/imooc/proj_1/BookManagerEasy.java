package com.imooc.proj_1;

import java.util.Scanner;

public class BookManagerEasy {
	private static Scanner console = new Scanner(System.in);

	public static void main(String[] args) {
		String[] books = { "C����", "���ݽṹ", "�������", "����", "��ѧ����", "ë��" };
		while (true) {
			System.out.println("�������1-�������Ʋ���ͼ�飻2-������Ų���ͼ��");
			String book;
			try {
				int command = inputCommand(); //用户输入整数就返回整数，否则返回-1
				switch (command) {
				case 1://����ͼ������ѡ��ͼ��
					book = getBookByName(books);  //查书名是否存在
					System.out.println("book:" + book);
					break;
				case 2://����ͼ����ţ������±꣩ѡ��ͼ��
					book = getBookByNumber(books);  //查书的序列号是否存在
					System.out.println("book:" + book);
					break;
				case -1://����ֵΪ-1��˵����������
					System.out.println("������������������ʾ�����������");
					continue;
				default://����ֵ���������Ϊ�Ǵ�������
					System.out.println("�����������");
					continue;
				}
				break;//�˳�����
			} catch (Exception bne) {

				System.out.println(bne.getMessage());
				continue;
			} 
		}
	}

	/**
	 *功能：查找数组中是否存在用户输入的书名
	 *   若有，则返回书名
	 *   没有，则抛出异常
	 * @param books
	 * @return
	 * @throws Exception
	 */
	private static String getBookByName(String[] books)
			throws Exception {
		System.out.println("请输入书名：");

		String name = console.next();
		for (int i = 0; i < books.length; i++) {
			if (name.equals(books[i]))

				return books[i];
		}

		throw new Exception("ͼ�鲻���ڣ�");
	}

	/**
	 *
	 * @param books
	 * @return
	 * @throws Exception
	 */
	private static String getBookByNumber(String[] books)
			throws Exception {
		while (true) {
			System.out.println("请输入图书序号：");
			try {
				int index = inputCommand();

				if(index == -1){
					System.out.println("������������������ʾ�����������");
					continue;
				}

				String book = books[index];
				return book;
			} catch (ArrayIndexOutOfBoundsException e) {

				Exception bookNotExists = new Exception("图书不存在，超出范围。");
				bookNotExists.initCause(e);
				throw bookNotExists;
			}
		}
	}

	/**
	 * 用户输入是整数，就返回整数
	 * 用户输入不是整数，就返回-1
	 * @return
	 */
	private static int inputCommand(){
		int command;
		try {
			command = console.nextInt();
			return command;
		} catch (Exception e) {

			console = new Scanner(System.in);
			return -1;
		}
	}
}
