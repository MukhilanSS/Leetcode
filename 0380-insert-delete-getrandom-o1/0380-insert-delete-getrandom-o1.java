class RandomizedSet {
    private List<Integer>a; 
    public RandomizedSet() {
         a=new ArrayList<Integer>();
    }
    
    public boolean insert(int val) {
        if(a.contains(val)){
            return false;
    }
            a.add(val);
            return true;
    }
    
    public boolean remove(int val) {
        if(a.contains(val)){
            a.remove(a.indexOf(val));
            return true;
        }
        else
            return false;
    }
    
    public int getRandom() {
        Random rand= new Random();
        return a.get(rand.nextInt(a.size()));
    }
}

/**
 * Your RandomizedSet object will be instantiated and called as such:
 * RandomizedSet obj = new RandomizedSet();
 * boolean param_1 = obj.insert(val);
 * boolean param_2 = obj.remove(val);
 * int param_3 = obj.getRandom();
 */