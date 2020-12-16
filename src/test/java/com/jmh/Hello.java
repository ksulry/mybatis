package com.jmh;

import org.openjdk.jmh.annotations.Benchmark;
import org.openjdk.jmh.runner.Runner;
import org.openjdk.jmh.runner.RunnerException;
import org.openjdk.jmh.runner.options.Options;
import org.openjdk.jmh.runner.options.OptionsBuilder;

import java.util.HashMap;
import java.util.Map;

public class Hello {
    @Benchmark
    public void testMethod() {
        Map<String, String> map = new HashMap<>();
        map.put("a", "b");
    }



    public static void main(String[] args) {
        final Options build = new OptionsBuilder().include(Hello.class.getSimpleName()).forks(1).build();
        try {
            new Runner(build).run();
        } catch (RunnerException e) {
            e.printStackTrace();
        }
    }
}
