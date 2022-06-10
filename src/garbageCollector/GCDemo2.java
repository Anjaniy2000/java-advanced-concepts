package garbageCollector;

public class GCDemo2 {
    private int objectID;

    public GCDemo2(int objectID){
        this.objectID = objectID;
        System.out.println("Object Is Created " + this.objectID);
    }

    public static void main(String[] args) {

        new GCDemo2(1);
        new GCDemo2(2);
        new GCDemo2(3);
        new GCDemo2(4);
        new GCDemo2(5);

        //By Using System.gc() - Method:
        for(int i = 0 ; i < 100 ; i++){
            System.gc();
        }
    }
    @Override
    protected void finalize() throws Throwable {
        System.out.println("Object Is Destroyed " + this.objectID);
    }
}
