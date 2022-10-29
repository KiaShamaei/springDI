package s5.p02.innerBean;


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
