package com.Asika.src;
import javax.swing.JButton;
import javax.swing.JFrame;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.script.ScriptEngine;
import javax.script.ScriptEngineManager;
import javax.script.ScriptException;
class Listener  extends JFrame implements ActionListener{
	 
	@SuppressWarnings("unchecked")
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO 监听方法的实现，主要是通过按钮传入的值来进行进行何种操作的判断
		/**
		 * @author Asika
		 * @param Reset 重置显示框
		 *                equal 计算字符串的值
		 *                Clear 判断是否为清楚信号
		 *                Error 如果输入了错误的字符串计算方法，则会返回这个错误信息
		 */
		String Reset="";
		String equal="=";
		String Clear="clear";
		String Error="Error!";
		/**
		 *  @param Action 从监听器获得的行为参数 加减乘除等等
		 *                 Text 访问全局变量获得的当前计算语句
		 *                 result 计算获得的结果
		 */
        
		String Action = ((JButton) e.getSource()).getText();
		String Text= CalculatorInterface.result_TestField.getText();
		
		if(Action.equals(equal)){			
			ScriptEngineManager manager = new ScriptEngineManager();
			ScriptEngine engine = manager.getEngineByName("js");
			try {
			//注意 不能直接进行强转换，而要使用tostring方法
				String result = engine.eval(Text).toString();
				CalculatorInterface.result_TestField.setText(result);
			} catch (ScriptException e1) {
				// TODO  如果计算有问题 则会在文本框中打印错误信息
				CalculatorInterface.result_TestField.setText(Error);
			}
		}
		else if(Action.equals(Clear)){
			CalculatorInterface.result_TestField.setText(Reset);
		}
		else {
			Text+=Action;
			CalculatorInterface.result_TestField.setText(Text);
		}
	  }
	}