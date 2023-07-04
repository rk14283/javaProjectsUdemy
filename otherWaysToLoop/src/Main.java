public class Main {
    public static void main(String[] args) {
/*
        for(int i =1; i<5; i++){
            System.out.println(i);
        }
        int j = 1;
        //we did not add initialization with keyword
        boolean isReady = false;
        do{
            if(j>5){
                break;
            }
            System.out.println(j);
            //we had to increment manually
            j++;
            isReady = (j>0);
        }
        //while is after the statement, this is why do while always executes once
        while(isReady);

 */
        int number = 0;
        while(number<50){
            number +=5;
            //this is to not include 25 and 50, and continue looping
            if(number%25 ==0){
                continue;
            }
            System.out.print(number + "_");
        }
    }
}




