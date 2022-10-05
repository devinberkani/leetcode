import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String romans = scanner.nextLine();
        System.out.println(romanToInt(romans));
    }

    public static int romanToInt(String s) {
        int numTotal = 0;
        char[] romanArr = s.toCharArray();

        for (int i = 0; i < romanArr.length; i++) {
            char currentLetter = romanArr[i];
            switch(currentLetter) {
                case 'M':
                    numTotal += 1000;
                    break;

                case 'D':
                    numTotal += 500;
                    break;

                case 'C':
                    if (i != romanArr.length - 1) {
                        if (romanArr[i + 1] == 'D') {
                            numTotal += 400;
                            i++;
                            break;
                        } else if (romanArr[i + 1] == 'M') {
                            numTotal += 900;
                            i++;
                            break;
                        }
                    }
                    numTotal += 100;
                    break;

                case 'L':
                    numTotal += 50;
                    break;

                case 'X':
                    if (i != romanArr.length - 1) {
                        if (romanArr[i + 1] == 'L') {
                            numTotal += 40;
                            i++;
                            break;
                        } else if (romanArr[i + 1] == 'C') {
                            numTotal += 90;
                            i++;
                            break;
                        }
                    }
                    numTotal += 10;
                    break;

                case 'V':
                    numTotal += 5;
                    break;

                case 'I':
                    if (i != romanArr.length - 1) {
                        if (romanArr[i + 1] == 'V') {
                            numTotal += 4;
                            i++;
                            break;
                        } else if (romanArr[i + 1] == 'X') {
                            numTotal += 9;
                            i++;
                            break;
                        }
                    }
                    numTotal += 1;
                    break;

                default:
                    System.out.println("letter not recognized");
            }
        }
        return numTotal;
    }
}