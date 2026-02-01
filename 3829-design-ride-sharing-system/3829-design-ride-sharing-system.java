class RideSharingSystem {
    Queue<Integer> r;
    Queue<Integer> d;
    HashSet<Integer> R;
    HashSet<Integer> D;
    public RideSharingSystem() {
        r=new LinkedList<>();
        d=new LinkedList<>();
        R=new HashSet<>();
        D=new HashSet<>();
    }
    
    public void addRider(int riderId) {
        r.add(riderId);
        R.add(riderId);
    }
    
    public void addDriver(int driverId) {
        d.add(driverId);
        D.add(driverId);
    }
    
    public int[] matchDriverWithRider() {
        int[] ans={-1,-1};
        while(!r.isEmpty()&&!d.isEmpty()){
            int rid=r.peek();
            int dri=d.peek();
            if (!R.contains(rid)) {
                r.remove(); 
                continue;
            }
            if (!D.contains(dri)) {
                d.remove(); 
                continue;
            }
            r.remove();
            d.remove();
            R.remove(rid);
            D.remove(dri);
            ans[0] = dri;
            ans[1] = rid;
            return ans;
        }
        return ans;
    }
    
    public void cancelRider(int riderId) {
        R.remove(riderId);
    }
}

/**
 * Your RideSharingSystem object will be instantiated and called as such:
 * RideSharingSystem obj = new RideSharingSystem();
 * obj.addRider(riderId);
 * obj.addDriver(driverId);
 * int[] param_3 = obj.matchDriverWithRider();
 * obj.cancelRider(riderId);
 */