//6.Method overriding
package com.overriding;

 class Girl extends Human {
public void eat() {
	System.out.println("Girl is eating");
}
public static void main(String args[]) {
	Girl obj= new Girl();
	obj.eat();
}
}
