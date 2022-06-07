import java.util.ArrayList;

public class admin extends Register{

    ArrayList<Messages> message =new ArrayList<>();
    ArrayList<User> registered = new ArrayList<>();


    public String idU()
    {

        String uId="";
        String idU="1234567890";
        for (int i = 0; i < 4; i++){
            uId+=idU.charAt((int) ((Math.random() * (idU.length() - 0)) + 0));

        }

        return uId;
    }

    public void mess (String Mid, String text) {
        Messages new_mess = new Messages();
        new_mess.set_m_id(Mid);
        new_mess.setText(text);
        new_mess.set_u_id(idU());
        boolean add = message.add(new_mess);
    }

    public void mess (String text)
    {
        String Mid ="";


        String poss="1234567890";
        for (int i = 0; i < 4; i++){
            Mid+=poss.charAt((int) ((Math.random()* (poss.length() - 0)) + 0));
        }

        Messages new_mess = new Messages();
        new_mess.set_m_id(Mid);
        new_mess.setText(text);
        new_mess.set_u_id(idU());
        boolean add = message.add(new_mess);
    }


    public   void write_comm(String text)
    {

        String Mid ="";


        String poss="1234567890";
        for (int i = 0; i < 4; i++){
            Mid+=poss.charAt((int) ((Math.random()* (poss.length() - 0)) + 0));
        }

        Messages new_mess = new Messages();
        new_mess.set_m_id(Mid);
        new_mess.setText(text);
        new_mess.set_u_id(idU());
        boolean add = message.add(new_mess);
    }
    public void del_m(String text,String role,String idU) {

        if (role == "usual") {
            int u;
            String a = "Сообщение удалено.";
            for (u = 0; u < message.size(); u++) ;
            if (message.get(u).getText().equals(text)) ;
            {
                message.remove(u);
            }
            System.out.println("Сообщение удалено.");
        }
        else System.out.println("Вы не можете удалить это сообщение.");


    }
    public void add(String name, String pass, String role){

        User new_user= new User();
        new_user.SetPassword(pass);
        new_user.SetName(name);
        new_user.SetRole(role);
        boolean add = registered.add(new_user);
        }


    @Override
    public void del(String name, String pass, String role) {
        super.del(name, pass, role);
    }

    public void cr (String name, String pass, String role){
      switch (role) {
          case "usual":
              role = "moderator";
          case "moderator":
              role = "usual";

              for (User EL2 : registered) {
                  if (EL2.GetRole() == role){

                      User new_user = new User();
                      new_user.SetRole(role);
              }
      } break;
          default:
              throw new IllegalStateException( role);
      }}}
