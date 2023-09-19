import java.awt.image.AreaAveragingScaleFilter;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.PriorityQueue;
import java.util.Queue;

public class PlanningAlgorithms {

    public static ArrayList<String> FCFS(ArrayList<Process> processesList)
    {
        ArrayList<String> result = new ArrayList<String>();

        for(Process process : processesList)
            result.add(process.getName());

        return result;
    }

    public static ArrayList<String> SJF(ArrayList<Process> processesList)
    {
        ArrayList<String> result = new ArrayList<String>();

        Queue<Process> sjfQueue = new PriorityQueue<>(Process.durationComparator);

        for(Process process : processesList)
            sjfQueue.add(process);

        while(!sjfQueue.isEmpty())
            result.add(sjfQueue.poll().getName());

        return result;
    }

    public static ArrayList<String> Priorities(ArrayList<Process> processesList)
    {
        ArrayList<String> result = new ArrayList<String>();

        Queue<Process> priorityQueue = new PriorityQueue<>(Process.priorityComparator);

        for(Process process : processesList)
            priorityQueue.add(process);

        while(!priorityQueue.isEmpty())
            result.add(priorityQueue.poll().getName());

        return result;
    }

}
