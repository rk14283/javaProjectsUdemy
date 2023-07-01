public class Main {
    public static void main(String[] args) {
        printMegaBytesAndKiloBytes(2500);
        printMegaBytesAndKiloBytes(-1024);
        printMegaBytesAndKiloBytes(5000);
        printMegaBytesAndKiloBytes(0);
    }
    public static void printMegaBytesAndKiloBytes(int kiloBytes){

        if(kiloBytes<0){
            System.out.println("Invalid Value");
        }
        else {
            //"2500 KB = 2 MB and 452 KB"// the KB is the remainder
            int valueInMB = kiloBytes / 1024;
            int valueInKB = kiloBytes % 1024;

            System.out.println(kiloBytes +" KB"+ " = " + valueInMB+" MB" + " and " + valueInKB+" KB");
        }
    }
}