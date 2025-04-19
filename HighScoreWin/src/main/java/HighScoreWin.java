import java.util.Scanner;
import java.util.regex.Pattern;

public class HighScoreWin {
        public static void main(String[] args) {
            while (true) {
                try {
                    Scanner input = new Scanner(System.in);
                    System.out.println("Please enter a game score in this format: \nTeam1:Team2|Team1score:Team2score ");
                    String game = input.nextLine();
                    String[] parts = game.split(Pattern.quote("|"));
                    if (parts.length != 2) {
                        throw new Exception();// force jump to catch if format is wrong
                    }
                    String[] teams = parts[0].split(Pattern.quote(":"));
                    String[] score = parts[1].split(Pattern.quote(":"));
                    if (teams.length != 2 || score.length != 2) { // also force error if teams or score are missing
                        throw new Exception();
                    }
                    int score1 = Integer.parseInt(score[0]);
                    int score2 = Integer.parseInt(score[1]);
                    if (score1 > score2) {
                        System.out.println("winner: " + teams[0]);
                    } else if (score2 > score1) {
                        System.out.println("winner: " + teams[1]);

                    } else {
                        System.out.println("Equal! no winners");
                    }
                    break;
                } catch (Exception e) {
                    System.out.println("Invalid input please try again");
                }


            }
        }
    }


