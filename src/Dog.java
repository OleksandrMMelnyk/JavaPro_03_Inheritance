public class Dog extends Animals {

    private static int dogCount = 0;
    private final int maxRunDistance = 500;
    private final int maxSwimDistance = 10;

    public Dog() {
        dogCount += 1;
    }

    @Override
    public void animalDistRun(int dist) {
        if (dist <= maxRunDistance) {
            System.out.println("Dog run distance - " + dist + "m");
        } else {
            System.out.println("Dog run only " + maxRunDistance + "m");
        }
    }

    @Override
    public void animalDistSwim(int dist) {
        if (dist <= maxRunDistance) {
            System.out.println("Dog swim distance - " + dist + "m");
        } else {
            System.out.println("Dog swim only " + maxSwimDistance + "m");
        }
    }

    public static int getDogCount() {
        return dogCount;
    }
}
