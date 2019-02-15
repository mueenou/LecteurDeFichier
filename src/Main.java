public class Main {

    public static void main(String[] args){
        // TODO Auto-generated method stub
        LecteurFichierInterface lf = new LecteurFichier("C:/Users/mueen/Desktop/test.txt");
        lf.read();
        lf.display();
        System.out.println();

        LecteurFichierInterface lr = new LecteurReverse("C:/Users/mueen/Desktop/test.txt");
        lr.read();
        lr.display();
        System.out.println();


        LecteurFichierInterface lp = new LecteurPalindrome("C:/Users/mueen/Desktop/test.txt");
        lp.read();
        lp.display();

    }

}
