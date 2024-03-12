public class HotWatter {
    private int temp;

    public HotWatter( int temp){
        this.temp = temp;
    }

    public int getTemp(){
        return temp;
    }

    public void setTemp(int temp){
        this.temp = temp;
    }

    @Override
    public String toString() {
        return "HotWatter{" + " temp=" + temp + '}';
    }

}
