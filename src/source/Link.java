package source;

public class Link {
  public String dLink;
  public Link next;
  public Link previous;

public Link(String str){
    this.dLink=str;
}

public void showLink(){
    System.out.print(dLink+" ");
}

}
