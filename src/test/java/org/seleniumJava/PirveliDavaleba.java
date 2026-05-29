package org.seleniumJava;


public class PirveliDavaleba {

    //  პირველი
    int sum = 0;
    int[] numbers = {1,2,3,4,5,6,7,8,9,10};
    int i = 0;

    public void calculation(){
        while (i<numbers.length){
            System.out.println(numbers[i] + " * 3 = " + numbers[i]*3 );
            i++;
        }
    };

    //მეორე
    String text = "ცუდას რად უნდა მტერობა, კარგია მუდამ მტრიანი";
    public void countOfChars(){
        if (text.length() % 2 == 0){
            System.out.println(" ლუწია ");
        }else {
            System.out.println(" კენტია ");
        }
    };

    //მესამე
    String[] massiveOfText = {"1 გიორგი","2 ქეთი","3 დათა","4 დემე","5 დაიბეჭდოს?","6 მამუკა","7 ნუნუკა"};
    public void  gamotoveSityva(){
        for (int i = 0; i < massiveOfText.length; i++){
           if (i == 4){
               continue;
           }else {
               System.out.println(massiveOfText[i]);
           }
        };
    };

    //მეოთხე
    String text4 = "ალუდა ქეთელაური კაცია დავლათიანი";
    char aso;
    int count;
    char[] xmovnebi = {'ა','ე','ი','ო','უ'};
    public  void countVowel(){
        for (int i=0 ; i<text4.length();i++){
            aso = text4.charAt(i);
            for (int j = 0; j < xmovnebi.length; j++){
                if (xmovnebi[j]==aso){
                    count++;
                }
            }
        };
        System.out.println(count);
    }

    // მეხუთე
    String text5 = "დღეს სტუმარია ეგ ჩემი, თუნდ ზღვა ემართოს სისხლისა   ";
    char[] araTanxmovnebi = {'ა', 'ე', 'ი', 'ო', 'უ','1','2','3','4','5','6','7','8','9','0','!','@','#','%','^','&','*','(',')','-','_','+','=','"',';',' '};
    int countOfConsonant;
    int k = 0;
    int tanxmovnebisRaodenoba = 0;
    char asos;
    boolean tanxmovania;

    public void countOfConsonants() {
        while (k < text5.length()) {
           asos = text5.charAt(k);
           int l = 0;
            while (l < araTanxmovnebi.length) {
                if (araTanxmovnebi[l] == asos) {
                    tanxmovania = false;
                   break;
                }
                else {
                    tanxmovania = true;
                }
                l++;

            };
            if (tanxmovania){
                tanxmovnebisRaodenoba++;
            }
            k++;
        }
        System.out.println(tanxmovnebisRaodenoba +  " თანხმოვანია ამ ტექსტში");
    }

}
