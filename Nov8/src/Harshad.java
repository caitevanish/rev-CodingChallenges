public class Harshad {

    public boolean isHarshad(int num, int sum){
        //481
        if(num%10 == num || num == 0){
            sum+=num;
        }
        else{
            int temp = num%10;
            int nextNum = num/10;
            System.out.println(temp);
            sum += temp;
            isHarshad(nextNum, sum);
        }

        if(num%sum == 0) return true;
        else return false;
    }

    public static void main(String[] args) {
        Harshad testHarshad = new Harshad();

        System.out.println(testHarshad.isHarshad(481, 0));
        System.out.println(testHarshad.isHarshad(89, 0));
        System.out.println(testHarshad.isHarshad(516, 0));
        System.out.println(testHarshad.isHarshad(200, 0));
    }
}
