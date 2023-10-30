package org.cmendoza.stream.list;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.stream.Stream;

public class StreamInfinito {
    public static void main(String[] args) {

        AtomicInteger contador = new  AtomicInteger(0);

        Stream.generate(()->{
            //hacer alguna tarea
            try {
                TimeUnit.SECONDS.sleep(2);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            return contador.incrementAndGet();
        } ).limit(5).forEach(System.out::println);



















    }
}
