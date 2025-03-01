class RandomizedSet {
    private List<Integer> list; // List to store elements
    private Map<Integer, Integer> map; // Map to store element and its index
    private Random random; // Random object for getRandom
    public RandomizedSet() {
        list = new ArrayList<>();
        map = new HashMap<>();
        random = new Random();
    }

    public boolean insert(int val) {
        if (map.containsKey(val)) {
            return false;
        }
        else {
            list.add(val);
            map.put(val, list.size() -1);
            return true;
        }
    }

    public boolean remove(int val) {
        if (!map.containsKey(val)) {
            return false;
        } else {
            int index = map.get(val);
            int lastElement = list.get(list.size() - 1);
            list.set(index, lastElement);
            map.put(lastElement, index);
            list.remove(list.size() - 1);
            map.remove(val);
            return true;
        }
    }

    public int getRandom() {
        return list.get(random.nextInt(list.size()));
    }
}

/**
 * Your RandomizedSet object will be instantiated and called as such:
 * RandomizedSet obj = new RandomizedSet();
 * boolean param_1 = obj.insert(val);
 * boolean param_2 = obj.remove(val);
 * int param_3 = obj.getRandom();
 */