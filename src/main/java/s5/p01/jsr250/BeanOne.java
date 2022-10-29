package s5.p01.jsr250;



import javax.inject.Named;

@Named
public class BeanOne {
    public void write(){
        System.out.println("this is from bean one ...");
    }
}
