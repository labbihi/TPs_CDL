package singlo;

public class ClinetLogs {

    public static void main(String[] args) {

        ConfigLoader2 config= ConfigLoader2.getInstance();


        System.out.println(config.nbInstance);

        String url =  config.getProperties("log.level");

        System.out.println(url);

    }


}
