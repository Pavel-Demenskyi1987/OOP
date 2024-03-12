import java.util.List;

public class HotWatterVendingMachine implements VendingMachine{
    List<HotWatterAuto> HotWatters;

    public HotWatterVendingMachine(List<HotWatterAuto> HotWatters) {
        this.HotWatters = HotWatters;
    }

    public List<HotWatterAuto> getHotWatters() {
        return HotWatters;
    }

    public void getHotWattersAuto(List<HotWatterAuto> HotWatters) {
        this.HotWatters = HotWatters;
    }

    @Override
    public HotWatterAuto getHotWattersAuto(int name) {
        for (HotWatterAuto item : HotWatters) {
            if(item.getName() == name)
                return item;
        }
        return null;
    }

    public HotWatterAuto getHotWattersAuto(int name,int volume, int temp){
        for (HotWatterAuto bottle : HotWatters) {
            if(bottle.getName() == name && bottle.getVolume() == volume && bottle.getTemp() == temp){
                return bottle;
            }
                
        }
        return null;
    }
    public void addHotWatterAuto(HotWatterAuto HotWatter){
        this.HotWatters.add(HotWatter);
    }


}