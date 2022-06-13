package garbageCollector;

public class GCDemo {

    private int objectID;

    public GCDemo(int objectID){
        this.objectID = objectID;
        System.out.println("Object Is Created " + this.objectID);
    }

    public static void main(String[] args) {
        for(int i = 0 ; i < 500000 ; i++){
            GCDemo demo = new GCDemo(i);
        }
    }

    //By Overriding finalize() - Method:
    @Override
    protected void finalize() throws Throwable {
        System.out.println("Object Is Destroyed " + this.objectID);
    }
}
