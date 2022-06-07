import java.util.ArrayList;

public class moderator {
    ArrayList<Messages> message =new ArrayList<>();

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
        new_mess.set_u_id(idU());
        new_mess.set_m_id(Mid);
        new_mess.setText(text);
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
    public void del_m(String text,String role) {

        if (role == "usual") {
            int u;

            for (u=0;u<message.size();u++){
                if (message.get(u).getText().equals(text));
                {message.remove(u);
                    System.out.println("Сообщение удалено.");}}}

        else System.out.println("Вы не можете удалить это сообщение.");


    }}


