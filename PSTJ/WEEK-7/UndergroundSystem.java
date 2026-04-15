import java.util.*;

class UndergroundSystem {
    Map<Integer, String> checkInMap = new HashMap<>();
    Map<String, int[]> travelMap = new HashMap<>();

    public void checkIn(int id, String stationName, int t) {
        checkInMap.put(id, stationName + "," + t);
    }

    public void checkOut(int id, String stationName, int t) {
        String[] data = checkInMap.get(id).split(",");
        String start = data[0];
        int time = Integer.parseInt(data[1]);
        String key = start + "-" + stationName;

        travelMap.putIfAbsent(key, new int[2]);
        travelMap.get(key)[0] += t - time;
        travelMap.get(key)[1] += 1;
    }

    public double getAverageTime(String start, String end) {
        int[] val = travelMap.get(start + "-" + end);
        return (double) val[0] / val[1];
    }
}