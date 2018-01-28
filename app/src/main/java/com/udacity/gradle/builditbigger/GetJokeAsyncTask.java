package com.udacity.gradle.builditbigger;

import android.os.AsyncTask;
import android.util.Log;

import com.example.jokeprovider.JokeProvider;

/**
 * Created by unity on 21/01/18.
 */

public class GetJokeAsyncTask extends AsyncTask<JokeView, Void, String> {

    JokeView mJokeView;

    @Override
    protected String doInBackground(JokeView... params) {
        mJokeView = params[0];
        JokeProvider jokeProvider = new JokeProvider();
        return jokeProvider.getJoke();
    }

    @Override
    protected void onPostExecute(String result) {
        mJokeView.showJoke(result);
    }
}
