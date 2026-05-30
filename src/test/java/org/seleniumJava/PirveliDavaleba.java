package org.seleniumJava;


public class PirveliDavaleba {

    //  პირველი
    int[] numbers= {1,2,3,4,5,6,7,8,9,10};
    int i = 0;
    public void multipTo3 (){
        while (i < numbers.length){
            System.out.println("3" + " * " + numbers[i] +" = "+ 3 * numbers[i]);
            i++;

        }
    }


    //მეორე დავალება
    String winadadeba = "გამარჯობა ლელა.";
    public void luwiaTuKenti (){
        if (winadadeba.length() % 2 == 0 ){
            System.out.println("luwia");
        }else{
            System.out.println("kentia");
        }
    }


    //მესამე დავალება
    int[] numbers1 = {1,2,3,4,5,6,7,8 };
    public void continue5(){
        for (int i = 0; i< numbers1.length; i++ ){
            if (i==4 ){
                continue;
            }else {
                System.out.println(numbers1[i]);
            }
        }
    }


    //მეოთხე დავალება
    String winadadeba1 = "დღეს ისევ ცუდი ამინდია";
    char[] xmovnebi  = {'ა','ე','ი','ო','უ'};
    int count;
    public void countOfVowel(){
        for (int i = 0; i<winadadeba1.length(); i++ ){
            char chars = winadadeba1.charAt(i);

            for (int j = 0; j< xmovnebi.length; j++){
                if (xmovnebi[j]==chars ){
                    count++;
                }
            }
        }
        System.out.println(" წინადადებაში არის "+ count + " ხმოვანი ");
    }



    //მეხუთე დავალება
    String winadadeba2 = "ნეტავ როდის გამოვა ამინდი";
    int m = 0;
    char chars1;
    int count1;
    boolean xmovania;

    public void countOfVowel1() {
        while (m < winadadeba2.length()){
        chars1 = winadadeba2.charAt(m);
        int n = 0;
        while (n < xmovnebi.length) {
            if (xmovnebi[n] == chars1) {
                xmovania = false;
                break;
            } else {
                xmovania = true;
            }
            n++;
        }
        if (xmovania) {
            count1++;
        }
        m++;
    }
        System.out.println("წინადადებაში არის " + count1 + " თანხმოვანი");
        }

}
