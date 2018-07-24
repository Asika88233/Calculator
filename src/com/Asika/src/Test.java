package com.Asika.src;

import javax.swing.UIManager;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try{
			UIManager.setLookAndFeel("javax.swing.plaf.metal.MetalLookAndFeel");
		}catch(Exception e){
			e.printStackTrace();
		}
                @SuppressWarnings("unused")
				Calculator calculator = new Calculator();
	}

}
