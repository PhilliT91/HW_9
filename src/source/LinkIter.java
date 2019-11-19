package source;

public class LinkIter{
    private Collection coll;
    private Link current;
    private Link previous;

    public LinkIter(Collection coll){
        this.coll=coll;
        this.current=coll.getFirst();
        this.previous=null;
    }


    public void toTheNext(){
        if(current.getNext()==null){
            reset();
        }
        previous=current;
        current=current.getNext();

    }
    public boolean hasNext(){
        if(current.getNext()==null)
        {
            return false;
        }
        else{
            return true;
        }
    }


    public void reset(){
        previous=null;
        current=coll.getFirst();
    }

    public Link getCurrent(){
        return this.current;
    }



        }
