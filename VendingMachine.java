import java.util.ArrayList;
import java.util.List;

public interface VendingMachine {

    HotWatterAuto getHotWattersAuto(int name);

    HotWatterAuto getHotWattersAuto(int name, int volume, int temp);
}
