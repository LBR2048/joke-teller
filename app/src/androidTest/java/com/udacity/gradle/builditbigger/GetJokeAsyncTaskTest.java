package com.udacity.gradle.builditbigger;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by unity on 28/01/18.
 */
public class GetJokeAsyncTaskTest {

    @Test
    public void getJokeAsyncTaskShouldReturnNonNullStringTest() {
        new GetJokeAsyncTask().execute(new JokeView() {
            @Override
            public void showJoke(String joke) {
                Assert.assertNotNull(joke);
            }
        });
    }
}