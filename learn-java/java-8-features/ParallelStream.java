/* Question: What is parallel stream?
 * Answer: Parallel stream came into java 1.8. It meant to utilize the multiple core of the processor.
 * Till now our java code has 1 stream of processsing where it execute secquentially. 
 * But in parallel stream we divide the code into multiple stream that executes parallely, on seperate core and the final 
 * result is the outcome of each individual core can be combined.
 * 
 * Sequential stream: Till now we were processing elements of stream sequential.
 *  Task1  Core   task1 task2 task3 task4
 *    T1   CORE1   T1    T2    T3    T4    
 * Here the output of this sequential stream is T1, T2 T3, and T4 in sequential order the tasks are executed and output
 * of one task is the input to other task. 
 * So in order to save the time, performance and memory java people introduced Parallel stream where if you have 4 core 
 * on your system /pc they have divided the stream task into four(4) task in such a way where
 * T1 task is assigned to CORE3, T2 task is assigned to CORE1, T3 task is assigned to CORE4 and finally T4 task is assigned
 * to CORE2. 
 * Example: Tasks     Core     Task1     Task2     Task3     Task4
 *           T1       CORE1               T2         
 *           T2       CORE2                                    T4 
 *           T3       CORE3     T1         
 *           T4       CORE4                         T3
 * 
 * So the output of this parallel stream is: T2,T4,T1,T3 --> which is not sequential.
 * So the order of execution is not under control.
 * So, hence it's advisible to use parallel stream only when the order of thread not matter and state of one of the element
 * does not affect another.
 * 
 * Problems of Parallel stream.
 * 
 */
import java.util.*;
import java.util.stream.*;

public class ParallelStream {

    public static void main(String[] args) {

    
    }
}
