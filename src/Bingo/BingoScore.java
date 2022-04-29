package Bingo;

public class BingoScore {
    private static int highScore = 0;
    public static int getHighScore(){return highScore;}
    public static int getNextUnlocked(){
        if (getHighScore() < 20 ) return 20;
        else if (getHighScore() >= 20 && getHighScore() <59) return 60;
        else if (getHighScore() >= 60 && getHighScore() <109) return 110;
        else if (getHighScore() >= 110 && getHighScore() <199) return 200;
        else if (getHighScore() >= 200 && getHighScore() <299) return 300;
        else if (getHighScore() >= 300 && getHighScore() <399) return 400;
        else  //"YOU UNLOCKED ALL LEVELS"
        return 0;
    }



    public BingoScore(){
        int getScore;

        /*switch(numStage){
            case 1 : getScore = 20; break;
            case 2 : getScore = 30; break;
            case 3 : getScore = 40; break;
            case 4 : getScore = 50; break;
            case 5 : getScore = 60; break;
            case 6 : getScore = 70; break;
            case 7 : getScore = 80; break;

         */


        }
    }

