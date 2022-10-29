package s5.p02.innerBean;





public class BeanOne {
    public BeanTwo getBeanTwo() {
        return beanTwo;
    }

    public void setBeanTwo(BeanTwo beanTwo) {
        this.beanTwo = beanTwo;
    }

    private BeanTwo beanTwo ;

    public BeanOne() {
        System.out.println("beanOne");
    }

    public void write(){
        System.out.println("this is with automatic autowiring ...");
    }
}
