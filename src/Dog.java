public class Dog extends Animals {

    private static int dogCount = 0;
    private final int maxDistanceRun = 500;
    private final int maxDistanceSwim = 10;

    public Dog() {
        dogCount +=1;
    }

    @Override
    public void animalDistRun(int dist) {
        if (dist <= maxDistanceRun) {
            System.out.println("Dog run distance - " + dist + "m");
        } else {
            System.out.println("Dog run only " + maxDistanceRun + "m");
        }
    }

    @Override
    public void animalDistSwim(int dist) {
        if (dist <= maxDistanceRun) {
            System.out.println("Dog swim distance - " + dist + "m");
        } else {
            System.out.println("Dog swim only " + maxDistanceSwim + "m");
        }
    }

    public static int getDogCount() {
        return dogCount;
    }
}
