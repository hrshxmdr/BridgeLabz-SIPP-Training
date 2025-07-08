public class CircularTour {
    static class PetrolPump {
        int petrol, distance;
        PetrolPump(int p, int d) {
            petrol = p;
            distance = d;
        }
    }

    public static int findStart(PetrolPump[] pumps) {
        int total = 0, curr = 0, start = 0;
        for (int i = 0; i < pumps.length; i++) {
            total += pumps[i].petrol - pumps[i].distance;
            curr += pumps[i].petrol - pumps[i].distance;

            if (curr < 0) {
                start = i + 1;
                curr = 0;
            }
        }
        return (total >= 0) ? start : -1;
    }
}
