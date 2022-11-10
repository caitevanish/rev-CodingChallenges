/*
A number is said to be Harshad if it's exactly divisible by the sum of its digits.
Create a function that determines whether a number is a Harshad or not.

Examples

isHarshad(75) ➞ false
// 7 + 5 = 12
// 75 is not exactly divisible by 12

isHarshad(171) ➞ true
// 1 + 7 + 1 = 9
// 9 exactly divides 171

isHarshad(481) ➞ true
isHarshad(89) ➞ false
isHarshad(516) ➞ true
isHarshad(200) ➞ true

Notes:
You are expected to solve this challenge via recursion.
 */

public class DraftHarshad {

    public static int numTotal = 0;
    public static String numOrig = "";

    public boolean harshadTest(int num) {
        //check to see if it is a single digit.

        String numString = Integer.toString(num);
        int numLength = numString.length();
        boolean flag = true;

//        while (numLength >= 1) {
        while (flag) {
            int num1 = Integer.valueOf(numString.substring(0, 1));
            numOrig += num1;
            numTotal += num1;

            if (numLength == 1) {
                if (Integer.parseInt(numOrig) % numTotal == 0) {
                    numTotal = 0;
                    numOrig = "";
                    System.out.println("True");
                    return true;
                }
                else {

                    System.out.println("False");
                    return false;

//                numLength = 0;
//                break;
//            if(numLength == 1) continue;
                }
            } else
                harshadTest(Integer.parseInt(numString.substring(1)));
        }
        return false;
    }
//        if(Integer.parseInt(numOrig) % numTotal == 0 ){
//            numTotal=0;
//            numOrig="";
//            System.out.println("True");
//            return true;
//        }
//        else{
//
//        System.out.println("False");
//        return false;
//        }
//    }
//


        public static void main (String[]args){
            DraftHarshad draftHarshad = new DraftHarshad();
//        harshad.harshadTest(9);
            draftHarshad.harshadTest(481);
            draftHarshad.harshadTest(89);

        }
    }


