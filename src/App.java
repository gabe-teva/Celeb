import java.util.Scanner;

import javax.net.ssl.SNIHostName;

public class App {
    public static void main(String[] args) throws Exception {
        String[][] celebs = new String[][] {{"Name", "Blond", "5.5", "Job", "Origin", "True", "100", "True"}, {"Name", "Brown", "5.5", "Job", "Origin", "True", "100", "True"}, {"Name", "Black", "5.5", "Job", "Origin", "True", "100", "True"}, {"Name", "Ginger", "5.5", "Job", "Origin", "True", "100", "True"}, {"Name", "Brown", "5.5", "Job", "Origin", "True", "100", "True"}};
        if(game(new Celebrity(celebs[(int) Math.floor(Math.random() * celebs.length)]))){
            System.out.println("you win!");
        } else {
            System.out.println("You Suck");
        }
    }

    private static boolean game(Celebrity celeb) {
        Scanner scan = new Scanner(System.in);
        for (int i = 0; i < 20; i++){
            System.out.print("Guess " + (i + 1) +"\n1: Name\n2: Hair\n3: Height\n4: Job\n5: Place of Birth\n6: Sex\n7: Age\n8: Dead or Alive\n");
            int input = scanInt(scan, 8, 1);
            switch (input) {
                case 1:
                    System.out.print("Enter a Name\n");
                    if (celeb.compareName(scan.nextLine())){
                        return true;
                    }
                    System.out.print("Incorrect\n");
                    break;
                case 2: 
                    System.out.print("1: Blond\n2: Brown\n3: Black\n4: Ginger\n");
                    switch (scanInt(scan, 4, 1)) {
                        case 1:
                            if(celeb.compareHairColor("Blond")){
                                System.out.print("Correct\n");
                            } else {
                                System.out.print("Incorrect\n");
                            }
                            break;
                        case 2:
                            if(celeb.compareHairColor("Brown")){
                                System.out.print("Correct\n");
                            } else {
                                System.out.print("Incorrect\n");
                            }
                            break;
                        case 3:
                            if(celeb.compareHairColor("Black")){
                                System.out.print("Correct\n");
                            } else {
                                System.out.print("Incorrect\n");
                            }
                            break;
                        case 4:
                            if(celeb.compareHairColor("Ginger")){
                                System.out.print("Correct\n");
                            } else {
                                System.out.print("Incorrect\n");
                            }
                            break;
                        default:
                            break;
                    }
                    break;
                case 3:
                    System.out.print("Enter height in feet and then inches\n");
                    int feet = scanInt(scan, (int) Math.pow(100, 100), 0);
                    int inches = scanInt(scan, (int) Math.pow(100, 100), 0);
                    float height = ((float) feet) + ((float) inches)/12; 
                    System.out.print("1: Greater than input\n2: Less than input");
                    if(celeb.compareHeight(height, scanInt(scan, 2, 1) - 1)){
                        System.out.print("Correct\n");
                    } else {
                        System.out.print("Incorrect\n");
                    }
                case 4:
                    System.out.print("Enter a proffesion\n");
                    System.out.print("Enter a Name\n");
                    if (celeb.compareProfession(scan.nextLine())){
                        System.out.print("Correct\n");
                    } else {
                        System.out.print("Incorrect\n");
                    }
                    break;
                case 5:
                    System.out.print("Enter a place of birth\n");
                    if (celeb.compareOrigin(scan.nextLine())){
                        System.out.print("Correct\n");
                    } else {
                        System.out.print("Incorrect\n");
                    }
                    break;
                case 6: 
                    System.out.print("1: Male\n2: Female\n");
                    switch (scanInt(scan, 2, 1)) {
                        case 1:
                            if(celeb.compareSex(true)){
                                System.out.print("Correct\n");
                            } else {
                                System.out.print("Incorrect\n");
                            }
                            break;
                        case 2:
                            if(celeb.compareSex(false)){
                                System.out.print("Correct\n");
                            } else {
                                System.out.print("Incorrect\n");
                            }
                            break;
                        default:
                            break;
                    }
                    break;
                case 7:
                    System.out.print("Enter an age\n");
                    int age = scanInt(scan, (int) Math.pow(100, 100), 0);
                    System.out.print("1: Greater than input\n2: Less than input\n");
                    if (celeb.compareAge(age, scanInt(scan, 2, 1))){
                        System.out.print("Correct\n");
                    } else {
                        System.out.print("Incorrect\n");
                    }
                    break;
                case 8:
                    System.out.print("1: Alive\n2: Dead\n");
                    switch (scanInt(scan, 2, 1)) {
                        case 1:
                            if(celeb.compareLifeStatus(true)){
                                System.out.print("Correct\n");
                            } else {
                                System.out.print("Incorrect\n");
                            }
                            break;
                        case 2:
                            if(celeb.compareLifeStatus(false)){
                                System.out.print("Correct\n");
                            } else {
                                System.out.print("Incorrect\n");
                            }
                            break;
                        default:
                            break;
                    }
                    break;
                default:
                    break;
            }
        }
        scan.close();
        return false;
    }
    static int scanInt(Scanner scan, int max, int min){
        int outputVal;
        while (true){
            while (true){
                try {
                    outputVal = Integer.parseInt(scan.nextLine());
                    break;
                } catch (Exception e) {
                    System.out.print("please enter a number\n");
                }
            }
            if (outputVal <= max && outputVal >= min){
                break;
            } else {
                System.out.print("Please enter a number between " + min + " and " + max + "\n");
            }
        }
        return (outputVal);
    }
    
}
