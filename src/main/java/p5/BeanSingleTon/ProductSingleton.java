package p5.BeanSingleTon;

public class ProductSingleton {
private final static ProductSingleton  intstance = new ProductSingleton();
private ProductSingleton(){

}
public ProductSingleton getIntstance(){
    return  intstance;
}
}
