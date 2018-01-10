package de.fhro.inf.prg3.a12.icndb;

import org.junit.jupiter.api.Test;

/**
 * @author Peter Kurfer
 * Created on 12/28/17.
 */
class JokesGeneratorTests {

    private JokeGenerator jokeGenerator = new JokeGenerator();

    @Test
    void testRandomStream() {
        jokeGenerator.randomJokesStream()
                .limit(10)
                .map(x -> x.getValue().getJoke())
                .forEach(System.out::println);
    }


    @Test
    void testJokesStream() {
        jokeGenerator.jokesStream()
                .skip(10)
                .limit(20)
                .map(x -> x.getValue().getJoke())
                .forEach(System.out::println);
    }

}
