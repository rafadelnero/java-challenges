package com.javachallenges.spliterator;

import java.util.List;
import java.util.Spliterator;
import java.util.function.Consumer;
import java.util.stream.Stream;
import java.util.stream.StreamSupport;

public class SpliteratorChallenge {
    public static void main(String... doYourBest) {
        List<Animal> l = List.of(new Animal("Duck"), new Animal("Dinosaur"),
                new Animal("Dog"));

        Stream<Animal> streamAnimal = StreamSupport.stream(
                new AnimalSpliterator(l.spliterator()), false);
        streamAnimal.forEach(a -> System.out.println(a.name));
    }
    static class Animal {
        private String name;
        public Animal(String name) { this.name = name;}
    }

    static class AnimalSpliterator implements Spliterator<Animal> {
        Spliterator<Animal> spliterator;
        private String name;
        public AnimalSpliterator(Spliterator<Animal> spliterator) { this.spliterator = spliterator; }

        public boolean tryAdvance(Consumer<? super Animal> action) {
            if (spliterator.tryAdvance(l -> this.name = l.name)) {
                action.accept(new Animal(name));
                return false;
            } else {
                return true;
            }
        }

        public Spliterator<Animal> trySplit() { return spliterator.trySplit(); }
        public long estimateSize() { return spliterator.estimateSize() / 2; }
        public int characteristics() { return spliterator.characteristics(); }
    }
}
