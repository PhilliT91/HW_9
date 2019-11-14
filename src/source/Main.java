package source;

public class Main {

    public static void main(String[] args) {
        // write your code here
        Collection test = new Collection();
test.display();


        test.add("1");
        test.display();
        test.last.showLink();
        System.out.println("");

        test.add("2");
        test.display();
        test.last.showLink();
        System.out.println("");

        test.add("123");
        test.display();
        test.last.showLink();
        System.out.println("");


        test.add("111",1);
        test.display();
        test.last.showLink();
        System.out.println("");


        test.add("112");
        test.display();
        test.last.showLink();


    }
}
