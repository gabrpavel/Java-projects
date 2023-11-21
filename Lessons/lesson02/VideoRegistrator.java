package gabrpavel.lesson02;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/*
Даны события events
реализуйте метод calcStartTimes, так, чтобы число включений регистратора на
заданный период времени (1) было минимальным, а все события events
были зарегистрированы.
Алгоритм жадный. Для реализации обдумайте надежный шаг.
*/

public class VideoRegistrator {
    
    public static void main(String[] args) {

        VideoRegistrator instance = new VideoRegistrator();
        double[] events = new double[]{1, 1.1, 1.6, 2.2, 2.4, 2.7, 3.9, 8.1, 9.1, 5.5, 3.7};
        List<Double> starts = instance.calcStartTimes(events,1);
        System.out.println(starts);
    }

    List<Double> calcStartTimes(double[] events, double workDuration) {

        List<Double> result = new ArrayList<>();
        Arrays.sort(events);

        int i=0;
        double start;
        while(i<events.length) {

            start = events[i];
            result.add(start);
            while ((i<events.length) && (events[i] <= start + workDuration)) i++;
        }

        return result;
    }
}

