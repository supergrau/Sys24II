package future;

public class Swimming {
    public static void main(String[] args) {
        boolean rain = true;
        int temperature = 26;
        String msg = "stay home";

/*
        if (!rain)
            if (temperature >= 24)
                msg = "Swimming !!!";
*/
/*
            else
                msg = "stay home";
        }
        else
           msg = "stay home";
*/
        if (!rain && (temperature >= 24))
            msg = "Swimming";

        System.out.println(msg);

    }
}
