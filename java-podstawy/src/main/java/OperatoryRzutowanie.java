public class OperatoryRzutowanie {
    public static void main(String[] args) {
        float capacity = 10; // tu spróbujemy popsuć
        float cabbageSize = 1.7f;
        float tomatoSize = 0.6f;
        float onionSize = 0.2f;
        int cabbageCount = 2;
        int tomatoCount = 8;
        int onionCount = 12;

        float usedCapacity = 0; // i tu
        usedCapacity += cabbageCount * cabbageSize;
        usedCapacity += tomatoSize * tomatoCount;
        usedCapacity += onionCount * onionSize;

        System.out.println("Zawartość torby " + usedCapacity);
        System.out.println("Przekracza jej pojemność? " + (usedCapacity > capacity));


        // to samo można zapisać następująco
        // a następnie tu
        float usedCapacityOtherNotation = cabbageCount * cabbageSize + tomatoSize * tomatoCount + onionCount * onionSize;

        System.out.println("Zawartość torby " + usedCapacityOtherNotation);
        System.out.println("Przekracza jej pojemność? " + (usedCapacityOtherNotation > capacity));
    }
}
