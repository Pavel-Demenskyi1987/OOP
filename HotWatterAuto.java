public class HotWatterAuto {
    
        private int name;
        private int volume;
        private int temp;

    public HotWatterAuto(int name,int volume, int temp) {
        this.name = name;
        this.volume = volume;
        this.temp = temp;
    }

    public int getName() {
        return name;
    }

    public void setName(int name) {
        this.name = name;
    }

    public int getVolume() {
        return volume;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }

    public int getTemp() {
        return temp;
    }

    public void setTemp(int temp) {
        this.temp = temp;
    }




    @Override
    public String toString() {
        return "HotWatterAuto{" +
                "name=" + name + ' ' +
                ", volume=" + volume + ' '+
                ", temp=" + temp + '}';
    }
}
