package baseee;

import java.util.Scanner;

/**
 * @Auther: ttliu
 * @Date: 2021/4/19 - 04 - 19 - 19:34
 * @Description: 制造披萨
 * @version: 1.0
 */
public class OOPTest {
    int size;
    double price;
    String name;

    public String showPizza (){
        return  "名字"+name+"\n大小"+size+"\n价格"+price;
    }
    public OOPTest(){}
    public OOPTest(String name,int size,double price){
        this.price=price;
        this.size=size;
        this.name=name;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
/**
 * 培根pizza
 */
class BaconPizza extends OOPTest{
    int weight;

    public BaconPizza(){}
    public BaconPizza(String name,int size,double price,int weight){
        super(name, size, price);
        this.weight=weight;
    }


    @Override
    public String showPizza() {

        return super.showPizza()+"\n重量"+weight;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }
}
/**
 * 水果pizza
 *
 */
class Fruit extends OOPTest{
        private  String Burdening;

        public Fruit(){}
        public Fruit(String name,int size,double price,String Burdening){
            super(name, size, price);
            this.Burdening=Burdening;
        }

    @Override
    public String showPizza() {
        return super.showPizza()+"\n添加的配料"+Burdening;
    }

    public String getBurdening() {
        return Burdening;
    }

    public void setBurdening(String burdening) {
        Burdening = burdening;
    }
}

class Test{
    /**
     *  
     * 
     * @author ttliu
     * @date 2021/4/20 17:22
     * @param [java.lang.String[]]
     * @return void
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("选择要制作的pizza： 1：培根披萨  2：水果披萨");
        int i = sc.nextInt();
        OOPTest pizza=PizzaStore.getPizza(i);
        System.out.println(pizza.showPizza());

    }
}