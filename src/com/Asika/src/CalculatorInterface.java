package com.Asika.src;

import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.event.KeyEvent;
import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;


public class CalculatorInterface {
	JFrame frame = new JFrame("Calculator");
   //result_TestField 为生成一个文本框方法，参数设置为20个字符，默认为没有空白·输入 全局变量
	 public static JTextField result_TestField = new JTextField("", 20);
	JButton button0 = new JButton("0");
	JButton button1 = new JButton("1");
	JButton button2 = new JButton("2");
	JButton button3 = new JButton("3");
	JButton button4 = new JButton("4");
	JButton button5 = new JButton("5");
	JButton button6 = new JButton("6");
	JButton button7 = new JButton("7");
	JButton button8 = new JButton("8");
	JButton button9 = new JButton("9");
	
	JButton button_clear = new JButton("clear");
	JButton button_Add = new JButton("+");
	JButton button_Minus = new JButton("-");
	JButton button_Muti = new JButton("*");
	JButton button_Divs = new JButton("/");
	JButton button_Result = new JButton("=");
	JButton button_Del = new JButton(".");

	public CalculatorInterface(){
		// 设置热键 使用alt+ 对应按键可实现键盘输入
		button0.setMnemonic(KeyEvent.VK_0);
		button1.setMnemonic(KeyEvent.VK_1);
		button2.setMnemonic(KeyEvent.VK_2);
		button3.setMnemonic(KeyEvent.VK_3);
		button4.setMnemonic(KeyEvent.VK_4);
		button5.setMnemonic(KeyEvent.VK_5);
		button6.setMnemonic(KeyEvent.VK_6);
		button7.setMnemonic(KeyEvent.VK_7);
		button8.setMnemonic(KeyEvent.VK_8);
		button9.setMnemonic(KeyEvent.VK_9);
     
        result_TestField.setHorizontalAlignment(JTextField.RIGHT);
		
		JPanel pan = new JPanel();
		pan.setLayout(new GridLayout(4,4,5,5));
		pan.add(button1);
		pan.add(button2);
		pan.add(button3);
		pan.add(button_Add);
		pan.add(button4);
		pan.add(button5);
		pan.add(button6);
		pan.add(button_Minus);
		pan.add(button7);
		pan.add(button8);
		pan.add(button9);
		pan.add(button_Muti);
		pan.add(button0);
		pan.add(button_Del);
		pan.add(button_Result);
		pan.add(button_Divs);
		pan.setBorder(BorderFactory.createEmptyBorder(5,5,5,5));
		
		JPanel pan2 = new JPanel();
		pan2.setLayout(new BorderLayout());
		pan2.add(result_TestField,BorderLayout.WEST);
		pan2.add(button_clear,BorderLayout.EAST);
		
		frame.setLocation(300, 200);
		frame.setResizable(true);
		frame.getContentPane().setLayout(new BorderLayout());
		frame.getContentPane().add(pan2, BorderLayout.NORTH);
		frame.getContentPane().add(pan, BorderLayout.CENTER);
		frame.pack();
		frame.setVisible(true);
	}

}
