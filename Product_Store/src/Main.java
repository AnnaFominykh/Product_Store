import java.util.ArrayList;

public class Main {

    public static void main(String []args){
        ArrayList<Products> products=new ArrayList<>();
        ArrayList<Customer>customers=new ArrayList<>();
        ArrayList<Discount>discounts=new ArrayList<>();

        ProductStore p =new ProductStore();

        p.addProd("apple","fruit",20);
        p.addProd("yogurt","diary",40);
        p.addProd("donut","bakery",50);

        p.addCust("Barbara",100);

   p.addDisc("fruit",10);
   p.addDisc("diary",30);
        p.OutProd(0,"all");
p.OutCust("all",0);
p.OutDisc("all",0);

p.Disc("fruit",20,10);
p.Disc("diary",40,30);

p.OutProd(0,null);
p.OutProd(1,null);

p.sell(18,100,"apple");
p.OutCust(null,0);
p.sell(28,82,"yogurt");
p.OutCust(null,0);
p.sell(50,54,"donut");
p.OutCust(null,0);

    }




}
