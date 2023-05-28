import java.util.ArrayList;
import java.util.List;

public class Filter {
    protected int treshold;
    public Filter(int treshold){
        this.treshold = treshold;
    }
    public List<Integer> filterOut(List<Integer> source){
        Logger logger = Logger.getInstance();
        List<Integer> result = new ArrayList<>();
        int j = 0;
        for(int i: source){
            if(i >= treshold){
                logger.log("Значение " + i +" верное");
                result.add(i);
                j++;
            }else {
                logger.log("Значение " + i +" неверное");
            }

        }
        logger.log("Прошло  " + j + " элементов из " + result.size());
        return result;
    }

}
