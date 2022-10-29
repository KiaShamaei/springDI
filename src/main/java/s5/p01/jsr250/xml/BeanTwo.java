package s5.p01.jsr250.xml;

public class BeanTwo {
    public BeanTwo() {
        System.out.println("Bean Two");
    }
    public void write(){
        System.out.println("this is  from beanTwo inner in beanOne ");
    }
}
