import java.util.ArrayList;

public class Arraylist {
    public static void main(String[] args){
        addItem();
    }
    public static void addItem(){
        ArrayList<String> items=new ArrayList<>();
        items.add("Eggs");
        items.add("Juice");
        items.add("Butter");

        System.out.println(items);
        removeItem(items);
        replaceItem(items);
    }
    public static void removeItem(ArrayList<String> items){
        items.remove(0);
        System.out.println(items);
    }
    public static void replaceItem(ArrayList<String> items){
        items.set(1,"Chicken");
        System.out.println(items);

    }
}
