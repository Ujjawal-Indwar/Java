public class MethodOverloadingChallen {
    public static void main(String[] args) {



        int mi=580;
        int se=3690;
        System.out.println("1st method time  "+getDurationString(se));
        System.out.println("2nd method time  " +getDurationString(mi,se));


    }
    public static String getDurationString(int seconds){

        int min=seconds/60;
        int hr=min/60;
        int remaining_min=min%60;
        int remaining_sec=seconds%60;
        return hr+"h"+remaining_min+"m"+remaining_sec+"s";
    }
    public static String getDurationString(int minut,int sec){
        int hr=minut/60;
        int remaining_min=minut%60;
        int remaining_sec=sec%60;
        return hr+"hr"+remaining_min+"min"+remaining_sec+"sec";
    }
}
