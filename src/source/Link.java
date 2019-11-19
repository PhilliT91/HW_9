package source;

public class Link {
  private String dLink;
  private Link next;
  private Link previous;

public Link(String str){
    this.dLink=str;
}

    public String getdLink() {
        return dLink;
    }

    public Link getNext() {
        return next;
    }

    public Link getPrevious() {
        return previous;
    }

    public void setdLink(String dLink) {
        this.dLink = dLink;
    }

    public void setNext(Link next) {
        this.next = next;
    }
  public void setNext(){
    this.next=null;
    }



    public void setPrevious(Link previous) {
        this.previous = previous;
    }
   public void setPrevious() {
        this.previous = null;
    }



    public void showLink(){
    System.out.print(dLink+" ");




}

}
