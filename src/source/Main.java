package source;

public class Main {

    public static void main(String[] args) {
        // write your code here
        Collection test = new Collection();
        Collection test2= new Collection();

        test.add("aaa");
        test.add("bbb");
        test.add("ccc",2);
        System.out.println(test.size());

test.delete(1);
        System.out.println(test.size());
test.delete("aaa");
        System.out.println(test.size());
    }
}
