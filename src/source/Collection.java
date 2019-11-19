package source;


public class Collection {//implements CustomCollection {

    private int size = 0;
    private Link last;
    private Link first;

    public Collection() {
        this.first = null;
        this.last = null;


    }

    public boolean isEmpty() {
        return first == null;
    }

    public Link getFirst() {
        return this.first;
    }


    public boolean add(String str) {

        Link newlink = new Link(str);

        if (this.isEmpty()) {
            addfirst(newlink);

        } else {
            adddest(newlink, last);

        }

        return true;

    }

    private void adddest(Link link, Link dest) {

        link.setNext(dest.getNext());
        link.setPrevious(dest);
        dest.setNext(link);
        if (dest == last) last = link;
        size++;
    }

    private void addfirst(Link link) {
        this.first = link;
        this.last = link;
        link.setPrevious(null);
        link.setNext(null);
        size++;
    }


    private void deldest(Link dest) { ///delete  dest link
        Link temp1;
        Link temp2;
        temp1 = dest.getNext();
        temp2 = dest.getPrevious();
        if (temp1 == null && temp2 == null) {
            this.first = null;
            this.last = null;
        } else if (temp1 == null && temp2 != null) {
            temp2.setPrevious();
            this.first = temp2;
        } else if (temp1 != null && temp2 == null) {
            temp1.setNext();
            this.last = temp1;

        } else {
            temp1.setNext(temp2);
            temp2.setPrevious(temp1);


        }
        size--;

    }


    private LinkIter getIterator() {
        LinkIter iter = new LinkIter(this);
        return iter;
    }


    public boolean add(String str, int index) {
        Link newlink = new Link(str);
        adddest(newlink, index(index - 1));
        return true;
    }


    private Link index(int ind) {
        if (ind >= size) {
            System.out.println("no index");
            return null;
        }

        LinkIter it = getIterator();
        int count = 0;

        for (; count <= ind; count++) {


            if (count == ind) {
                return it.getCurrent();
            }
            it.toTheNext();

        }
        return null;
    }


    void display() {
        LinkIter it = getIterator();
        if (isEmpty()) {
            System.out.println("no elements!");
        } else {
            System.out.print("this are elements: ");

            for (int i = 0; i < size; i++) {

                it.getCurrent().showLink();
                it.toTheNext();
                System.out.print("");
            }


        }
        System.out.println("");
    }


    public boolean addAll(String[] strArr) {
        for (int i = 0; i < strArr.length; i++) {
            this.add(strArr[i]);

        }
        return true;


    }


    public boolean addAll(Collection strColl) {
        LinkIter it = strColl.getIterator();
        while (it.hasNext()) {
            if (this.isEmpty()) {
                this.addfirst(it.getCurrent());
            } else {
                this.adddest(it.getCurrent(), last);
            }
            it.toTheNext();

        }
        return true;
    }

    public boolean delete(int index) {
        if (index >= size || index < 0) {
            System.out.println("no index");
            return false;


        } else {
            deldest(index(index));

        }
        return true;
    }

    public boolean delete(String str) {
        LinkIter it = this.getIterator();
        for (int i = 0; i < size; ) {
            if (str == it.getCurrent().getdLink()) {
                delete(i);

                return true;
            }
        }
        return false;
    }


    public String get(int index) {
        return index(index).getdLink();
    }

    public boolean contains(String str) {
        LinkIter it = this.getIterator();
        for (int i = 0; i < size; i++) {
            if (str == it.getCurrent().getdLink()) {
                return true;
            }
            it.toTheNext();
        }
        return false;


    }

    public boolean clear() {
        LinkIter it = this.getIterator();
        while (it.hasNext()) {
            it.toTheNext();
            this.delete(0);
        }

        this.first = null;
        this.last = null;
        size = 0;
        return true;
    }

    public int size() {
        return size;

    }

    public boolean trim() {
        return false;
    }

    public boolean compare(Collection coll) {
        if (coll == this) {
            return true;
        } else if (this.size != coll.size) {
            return false;
        } else {
            LinkIter it1 = this.getIterator();
            LinkIter it2 = coll.getIterator();
            for (int i = 0; i < size; i++) {
                if (!this.contains(coll.get(i))) return false;

            }
            return true;
        }

    }


}
