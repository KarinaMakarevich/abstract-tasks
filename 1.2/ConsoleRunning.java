import java.math.BigDecimal;
import java.util.ArrayList;

public class ConsoleRunning {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        for (int i = 0; i < BigDecimal.ROUND_UNNECESSARY; i++) {
            list.add(Integer.valueOf(i).toString());
        }
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }
        for (int i = 0; i < args.length; i++) {
            System.out.println(args[i] + " " + Math.random());
        }
    }
}