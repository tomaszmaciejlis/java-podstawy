public class Operatory {
    public static void main(String[] args) {
        float capacity = 10;
        float cabbageSize = 1.7f;
        float tomatoSize = 0.6f;
        float onionSize = 0.2f;
        int cabbageCount = 2;
        int tomatoCount = 8;
        int onionCount = 12;

        float usedCapacity = 0;
        usedCapacity += cabbageCount * cabbageSize;
        usedCapacity += tomatoSize * tomatoCount;
        usedCapacity += onionCount * onionSize;

        System.out.println("Zawartość torby " + usedCapacity);
        System.out.println("Przekracza jej pojemność? " + (usedCapacity > capacity));


        // to samo można zapisać następująco
        float usedCapacityOtherNotation = cabbageCount * cabbageSize + tomatoSize * tomatoCount + onionCount * onionSize;

        System.out.println("Zawartość torby " + usedCapacityOtherNotation);
        System.out.println("Przekracza jej pojemność? " + (usedCapacityOtherNotation > capacity));
    }
}
