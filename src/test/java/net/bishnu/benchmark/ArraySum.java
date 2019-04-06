package net.bishnu.benchmark;

import org.openjdk.jmh.annotations.*;

import java.util.Arrays;
import java.util.Random;
import java.util.concurrent.TimeUnit;

@BenchmarkMode(Mode.AverageTime)
@OutputTimeUnit(TimeUnit.MICROSECONDS)
@State(Scope.Benchmark)
@Fork(value = 1, jvmArgs = {"-Xms2G", "-Xmx2G", "-XX:MaxInlineLevel=12"})
@Warmup(iterations = 10)
@Measurement(iterations = 10)
public class ArraySum {
    static final long SEED = -897234L;

    @Param({"1000000"})
    int sz;

    int[] array;

    @Setup
    public void setup() {
        Random random = new Random(SEED);
        array = new int[sz];
        Arrays.setAll(array, i -> random.nextInt());
    }

    @Benchmark
    public int sumForLoop() {
        int sum = 0;
        for (int a : array)
            sum += a;
        return sum;
    }

    @Benchmark
    public int sumStream() {
        return Arrays.stream(array).sum();
    }
}
