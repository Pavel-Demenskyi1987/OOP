import java.util.List;

public class HotWatterVendingMachine2 implements VendingMachine2{
    List<HotWatter> HotWatters;

    public HotWatterVendingMachine2(List<HotWatter> HotWatters) {
        this.HotWatters = HotWatters;
    }

    public List<HotWatter> getHotWatters() {
        return HotWatters;
    }

    public void getHotWatters(List<HotWatter> HotWatters) {
        this.HotWatters = HotWatters;
    }

    @Override
    public HotWatter getHotWatters(int temp) {
        for (HotWatter item : HotWatters) {
            if(item.getTemp() == temp)
                return item;
        }
        return null;
    }

    public void addHotWatter(HotWatter HotWatter){
        this.HotWatters.add(HotWatter);
    }


}