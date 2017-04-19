package countClone;

/**
 * Created by Brian on 1/20/17.
 */
public class CountTestApp {
    public static void main(String[] args) throws CloneNotSupportedException {
        System.out.println("Counting Alligator...");
        Alligator alligator = new Alligator();
        CountUtil.count(alligator, 3);
        System.out.println("============================");

        System.out.println("Counting Sheep...");

        Sheep sheep = new Sheep();
        sheep.setSheep("Blackie");
        CountUtil.count(sheep,2);

        Sheep clone = (Sheep) sheep.clone();
        System.out.println("=============================");
        clone.setSheep("Dolly");
        CountUtil.count(clone, 3);
        System.out.println("==============================");
        CountUtil.count(sheep,1);
    }
}
