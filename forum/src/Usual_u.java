import java.util.ArrayList;
import java.util.Iterator;

import static java.lang.String.valueOf;

public class Usual_u {

    ArrayList<Messages> message =new ArrayList<>();
        ArrayList<User> registered =new ArrayList<>();
  Iterator<Messages> messu = message.iterator();



    public String idU()
    {

        String uId="";
        String idU="1234567890";
        for (int i = 0; i < 4; i++){
            uId+=idU.charAt((int) ((Math.random() * (idU.length() - 0)) + 0));

        }

        return uId;
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

        public   void write_comm(String Mid,String text,String idU)
        {
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


        }


        public void red( String text) {
            for(int i=0;i<9;i++)
        //message.add(new String(),);

            {  System.out.println(message+" Изменено");}


            Messages new_mess = new Messages();
            new_mess.setText(text);
            new_mess.set_u_id(idU());
            boolean add = message.add(new_mess);
        }
    }
    //https://overcoder.net/q/85549/%D0%BA%D0%B0%D0%BA-%D0%B8%D0%B7%D0%BC%D0%B5%D0%BD%D0%B8%D1%82%D1%8C-%D0%B7%D0%BD%D0%B0%D1%87%D0%B5%D0%BD%D0%B8%D0%B5-%D1%8D%D0%BB%D0%B5%D0%BC%D0%B5%D0%BD%D1%82%D0%B0-arraylist-%D0%B2-java