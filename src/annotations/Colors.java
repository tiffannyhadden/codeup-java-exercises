package annotations;

class Red{
     public void show(){
         System.out.println("I am red");
     }

}

class Orange extends Red{
    //@Override
    // comments the compiler // it checks to see if that
    //comment is doing what it is supposed to do
    // reason why you want to add @Override acts like a safety net
    // hey this method should be overriding the method in its parents
    // class of red
     public void show(){
         System.out.println("I am orange");
     }

}
public class Colors {
    public static void main(String[] args) {
    Red redobj = new Red();
    Orange orangeobj = new Orange();
    redobj.show(); // I am red
    orangeobj.show(); // I am orange
    }
}
