package com.codewithmosh;

public class Main {

    public static void main(String[] args) {
     var textBox1 = new TextBox();
     var textBox2 = textBox1;
     textBox2.setText("hello");
        System.out.println(textBox1.text);


    }
}
