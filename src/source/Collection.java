package source;

import org.jetbrains.annotations.Contract;

public class Collection {//implements CustomCollection {

    public Link last;
    private Link first;

    public Collection() {
        this.first = null;
        this.last = null;
    }

    public boolean isEmpty() {
        return first == null;
    }


    public boolean add(String str) {

        Link newlink = new Link(str);

        if (this.isEmpty()) {
            this.first = newlink;
            this.last = newlink;
            newlink.previous = null;
            newlink.next = null;
        } else {
            adddest(newlink,last);

        }
        return true;

    }

    public void adddest(Link link, Link dest) {

       link.next=dest.next;
       link.previous=dest;
        dest.next=link;
        if (dest==last)last=link;

    }


    public boolean add(String str, int index) {
        Link newlink = new Link(str);
        adddest(newlink,index(index));
return true;
    }


    private Link index(int ind) {
        int count = 0;
        Link temp = first;
        for (; count <= ind; count++) {


            if (count == ind) {
                return temp;
            }
            temp = temp.next;

        }
        System.out.println("key not found");
        return null;
    }


    void display() {

        if (isEmpty()) {
            System.out.println("no elements!");
        } else {
            System.out.print("this are elements: ");
            Link current = first;
            while (current != null) {
                current.showLink();
                current = current.next;
            }
            System.out.println("");
        }
    }


    /*public boolean addAll(String[] strArr) {
    }

    public boolean addAll(Collection strColl) {
    }

    boolean delete(int index) {
    }

    boolean delete(String str) {
    }

    String get(int index) {
    }

    boolean contains(String str) {
    }

    boolean clear() {
    }

    int size() {
    }

    boolean trim() {
    }

    boolean compate(Collection coll) {
    }
*/

}
