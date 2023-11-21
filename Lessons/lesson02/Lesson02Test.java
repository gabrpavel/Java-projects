package gabrpavel.lesson02;

import org.junit.Test;

import java.io.File;
import java.util.List;

import static org.junit.Assert.assertTrue;

public class Lesson02Test {

    @Test(timeout = 2000)
    public void VideoRegistrator() {
        VideoRegistrator instance=new VideoRegistrator();
        double[] events=new double[]{1, 1.1, 1.6, 2.2, 2.4, 2.7, 3.9, 8.1, 9.1, 5.5, 3.7};
        List<Double> starts=instance.calcStartTimes(events,1); //рассчитаем моменты старта, с длинной сеанса 1
        boolean ok=starts.toString().equals("[1.0, 2.2, 3.7, 5.5, 8.1]");
        assertTrue("VideoRegistrator failed", ok);
    }

    @Test(timeout = 2000)
    public void Sheduler() {
        Sheduler instance = new Sheduler();
        Sheduler.Event[] events = {new Sheduler.Event(0, 3), new Sheduler.Event(0, 1), new Sheduler.Event(1, 2), new Sheduler.Event(3, 5),
                new Sheduler.Event(1, 3), new Sheduler.Event(1, 3), new Sheduler.Event(1, 3), new Sheduler.Event(3, 6),
                new Sheduler.Event(2, 7), new Sheduler.Event(2, 3), new Sheduler.Event(2, 7), new Sheduler.Event(7, 9),
                new Sheduler.Event(3, 5), new Sheduler.Event(2, 4), new Sheduler.Event(2, 3), new Sheduler.Event(3, 7),
                new Sheduler.Event(4, 5), new Sheduler.Event(6, 7), new Sheduler.Event(6, 9), new Sheduler.Event(7, 9),
                new Sheduler.Event(8, 9), new Sheduler.Event(4, 6), new Sheduler.Event(8, 10), new Sheduler.Event(7, 10)
        };

        List<Sheduler.Event> starts = instance.calcStartTimes(events, 0, 10);  //рассчитаем оптимальное заполнение аудитории
        boolean ok=starts.toString().equals("[(0:1), (1:2), (2:3), (3:5), (6:7), (7:9)]");
        assertTrue("B_Sheduler failed", ok);
    }
    @Test(timeout = 2000)
    public void GreedyKnapsack() throws Exception {
        String root=System.getProperty("user.dir")+"/src/";
        File file=new File(root+"\\main\\resources\\greedyKnapsack.txt");
        double costFinal=new GreedyKnapsack().calc(file);
        boolean ok=costFinal==200;
        assertTrue("B_Sheduler failed", ok);
    }

}