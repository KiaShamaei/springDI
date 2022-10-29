package s5.p05.customizeComponentScan;

@MyAnnotation
public class MyBean {
    public void create(){
        System.out.println("this from bean ");
    }

    public MyBean() {
        create();
    }
}
