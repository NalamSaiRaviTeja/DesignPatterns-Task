package Iterator;

public class CollectionOfDesserts implements Container {
public String desserts[]={"Cookies","Cakes","Candies","Chocolates","Custards","Puddings","Jellies"};
    public Iterator getIterator() {
        return new CollectionOfDessertsIterate();
    }
    private class CollectionOfDessertsIterate implements Iterator{
        int i;
        public boolean hasNext() {
            if (i<desserts.length){
                return true;
            }
            return false;
        }

        public Object next() {
            if(this.hasNext()){
                return desserts[i++];
            }
            return null;
        }
    }
}
