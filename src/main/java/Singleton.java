public class Singleton {
    // Static variable reference of Singleton
    private static Singleton singleton = null;

    // Declaring a variable of type String
    private String s;


    // Private constructor, restricted to this class itself
    private Singleton(){
        s = "Singleton";
    }


    // Static method to create instance of Singleton class
    public static Singleton getInstance()
    {
        if (singleton == null)
            singleton = new Singleton();

        return singleton;
    }

}
