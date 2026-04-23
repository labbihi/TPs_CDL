package singlo;

public class ClientDB {


    public static void main(String[] args) {

        ConfigLoader2 config1 = ConfigLoader2.getInstance();
        ConfigLoader2 config2 = ConfigLoader2.getInstance();
        ConfigLoader2 config3 = ConfigLoader2.getInstance();

        System.out.println(ConfigLoader2.nbInstance);

       String login =  config1.getProperties("db.login");

       System.out.println(login);
    }

}
