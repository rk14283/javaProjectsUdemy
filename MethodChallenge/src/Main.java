

    public class Main {
        public static void main(String[] args) {

            int highScorePosition = calculateHighScorePosition(1500);
            displayHighScorePosition("Tim", highScorePosition);

            highScorePosition = calculateHighScorePosition(1000);
            displayHighScorePosition("Bob", highScorePosition);

            highScorePosition = calculateHighScorePosition(500);
            displayHighScorePosition("Percy", highScorePosition);


        }

        public static void displayHighScorePosition(String playerName, int position) {
            String message = playerName + " managed to get into position " + position + " on high score list";
            System.out.println(message);
        }

        //After testing the code we find ways to improve the code
        public static int calculateHighScorePosition(int playerScore) {
            //he did not use result
            //he just returns result
            //we shorten the code and make it more readable
            int position = 0;
            if (playerScore >= 1000) {
                position = 1;
            } else if (playerScore >= 500) {
                position = 2;
            } else if (playerScore >= 100) {
                position = 3;
            } else {
                position = 4;
            }
            return position;
        }
    }

