package s5.p01.jsr250.xml;


public class BeanOne {

    public BeanOne() {
        System.out.println("beanOne");
    }

    public void write(){
        System.out.println("this is with automatic autowiring ...");
    }
}
