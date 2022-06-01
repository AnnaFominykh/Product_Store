import java.util.ArrayList;
import java.util.Locale;

public class ProductStore {

    ArrayList<Products>products=new ArrayList<>();
    ArrayList<Customer>customers=new ArrayList<>();
    ArrayList<Discount>discounts=new ArrayList<>();


    public void addProd(String name, String category,int Price )
        { Products prod = new Products();
            prod.setName(name);
            prod.setCategory(category);
           prod.setPrice(Price);
            products.add(prod);}

    public void addCust(String name,int balance )
    { Customer cust = new Customer();
        cust.setName(name);
        cust.setProperty(null);
        cust.setBalance(balance);
       customers.add(cust);}


    public void addDisc( String category,int percent )

    { Discount disc = new Discount();
        disc.setProdCategory(category);
       disc.setPercent(percent);
        discounts.add(disc);}



    public void sell(int Price,int balance,String property)
    {int new_balance;
        int Change;
       new_balance=balance-Price;
       if (balance>=Price){
           for (Customer customer:customers)
           {
               if (customer.getBalance()==balance) {
                   customer.setBalance(new_balance);
                   customer.setProperty(property);
               }}

       if (balance<Price){
           System.out.println("Вам не хватает денег");
       }
       else if (new_balance <= 0){
            System.out.println("У вас не осталось денег");
        }

       Customer customer = new Customer();
       customer.setProperty(property);
       customers.add(customer);
    }}

public void Disc(String category, int Price,int percent){

    int new_price;
            new_price = Price-(Price*percent/100);

    for (Products products:products) {
        if (products.getCategory()==category) {
            products.setPrice(new_price);
        }
    }}


public void OutProd(int P,String a)
{ if (a==null ) {
    System.out.println(products.get(P).getName() + " " + products.get(P).getCategory() + " " + products.get(P).getPrice());
}
    if (a=="all"){
        for (int p=0;p<products.size();p++){
            System.out.println(products.get(p).getName()+" "+products.get(p).getCategory()+" "+
                    products.get(p).getPrice());
        }
    }
}

    public void OutCust(String a, int C)
    {if (a==null ){
        System.out.println(customers.get(C).getName()+" "+customers.get(C).getBalance()+" "+
                customers.get(C).getProperty());}

        if (a=="all"){
            for (int p=0;p<customers.size();p++){
                System.out.println(customers.get(p).getName()+" "+customers.get(p).getBalance()+" "+
                        customers.get(p).getProperty());
            }
        }
    }

    public void OutDisc(String a, int D)
    { if (a==null ){
        System.out.println(discounts.get(D).getProdName()+" "+discounts.get(D).getProdCategory()+" "+
                discounts.get(D).getPercent()+"%");}

        if (a == "all"){
            for (int p=0;p<discounts.size();p++){
                System.out.println(discounts.get(p).getProdName()+" "+discounts.get(p).getProdCategory()+" "+
                        discounts.get(p).getPercent()+"%");}
        }
    }
}
