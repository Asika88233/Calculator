package com.Asika.src;
/**
 * 以下说几句个人理解，
 * @author Asika
 *
 */
public class Calculator {
          public  Calculator () {
        	  CalculatorInterface Interface = new CalculatorInterface();
        	  Listener listener = new Listener();
        	  Interface. button7.addActionListener(listener);
        	  Interface. button8.addActionListener(listener);
        	  Interface.button9.addActionListener(listener);
        	  Interface.button_Divs.addActionListener(listener);
        	  Interface.button4.addActionListener(listener);
        	  Interface.button5.addActionListener(listener);
        	  Interface.button6.addActionListener(listener);
        	  Interface.button_Muti.addActionListener(listener);
        	  Interface.button1.addActionListener(listener);
        	  Interface.button2.addActionListener(listener);
        	  Interface.button3.addActionListener(listener);
        	  Interface.button_Minus.addActionListener(listener);
        	  Interface.button0.addActionListener(listener);
        	  Interface.button_Del.addActionListener(listener);
        	  Interface.button_Result.addActionListener(listener);
        	  Interface.button_Add.addActionListener(listener);
        	  Interface.button_clear.addActionListener(listener);
        	  
          }
	
}
