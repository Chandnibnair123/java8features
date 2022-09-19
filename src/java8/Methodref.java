package java8;

interface Sayable{  
    void say();  
}  
public class Methodref {  
    public static void saySomething(){  
        System.out.println("Hello, this is static method.");  
    }  
    public static void main(String[] args) {  
       
        Sayable sayable = Methodref::saySomething;  
         
        sayable.say();  
    }  
}  
