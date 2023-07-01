public class Main {
    public static void main(String[] args) {
        System.out.println(isCatPlaying(true,10));
        System.out.println(isCatPlaying(false,25));
    }
    public static boolean isCatPlaying(boolean summer, int temprature){
        boolean catPlaying = false;
        if(summer==true){
     if (temprature>=25 && temprature<=45) {
          catPlaying = true;
     }
     else if (temprature<25){
         catPlaying = false;
     }
    }
        else {
            if (temprature>=25 && temprature<=35) {
                catPlaying = true;
            }
            else if (temprature<25){
                catPlaying = false;
            }
        }
        return catPlaying;
    }
}