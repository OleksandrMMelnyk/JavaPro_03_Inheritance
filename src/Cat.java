public class Cat extends Animals {

    private static int catCount = 0;
    private final int maxDistanceRun = 200;

    public Cat() {
        catCount += 1;
    }

    @Override
    public void animalDistRun(int dist) {
        if (dist <= maxDistanceRun) {
            System.out.println("Cat run distance - " + dist + "m");
        } else {
            System.out.println("Cat run only " + maxDistanceRun + "m");
        }
    }

    @Override
    public void animalDistSwim(int dist) {
        System.out.println("Сat does not swim!");
    }

    public static int getCatCount() {
        return catCount;
    }


}
