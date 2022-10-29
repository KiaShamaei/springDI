package s5.p01.jsr250.xml;


public class BeanThree {
    private String name ;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public BeanThree() {
        System.out.println("Bean Three");
    }
}
