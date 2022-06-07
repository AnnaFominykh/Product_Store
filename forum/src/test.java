public class test {
    boolean check;
    public void Reg_test( int a, Register r, String name, String pass){

        r.Reg(name,pass);
        if (r.registered.get(a).GetName().equals(name)&&r.registered.get(a).
                GetPassword().equals(pass)){check=false;}
        else {check=true;}
        System.out.println(check);}

    public void dell_test( int a, Register r, String name, String pass,String role)
    {r.del(name,pass,role);
      if ( r.registered.get(a).GetName().equals(null)&& r.registered.get(a).GetPassword().equals(null)&&
                r.registered.get(a).GetRole().equals(null)){check=true;}
      else {check=false;}
        System.out.println(check);}


    public void comm_test(admin a,int c){
        a.mess("Mess 1");
        if (a.message.get(c).getText().equals(null)){check=false;}
        else {check=true;}
        System.out.println(check);}

    public void comm2_test(admin a,int c){
        a.write_comm("Mess 1");
        if (a.message.get(c).getText().equals(null)){check=false;}
        else {check=true;}
        System.out.println(check);}



    public void add_test( int d, admin a, String name, String pass,String role){
      a.add(name,pass,role);
        if(a.registered.get(d).GetName().equals(name)&& a.registered.get(d)
                .GetPassword().equals(pass)&&
                a.registered.get(d).GetRole().equals(role)){check=false;}
        else {check=true;}
        System.out.println(check);}


    public void delm_test( int g, admin a, String text, String uid,String role)
    {a.del_m(text,uid,role);
        if ( a.message.get(g).getText().equals(null)&& a.message.get(g).get_u_id().equals(null)&&
                a.registered.get(g).GetRole().equals(null)){check=true;}
        else {check=false;}
        System.out.println(check);}
    public void cr_test(int g,admin a,Register R,String name, String uid,String role)
    {a.cr(name,uid,role);
        if ( a.registered.get(g).GetName().equals(name)&& a.message.get(g).get_u_id().equals(uid)&&
                R.registered.get(g).GetRole().equals("moderator")){check=true;}
        else {check=false;}
        System.out.println(check);
    }

    public void red_test(Usual_u U,int c, String text){
        U.red(text);
        if (U.message.get(c).getText().equals(text)){check=true;}
        else {check=false;}
            System.out.println(check);
        }


    }