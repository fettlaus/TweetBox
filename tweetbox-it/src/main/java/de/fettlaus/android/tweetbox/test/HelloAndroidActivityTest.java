package de.fettlaus.android.tweetbox.test;

import android.test.ActivityInstrumentationTestCase2;
import de.fettlaus.android.tweetbox.*;

public class HelloAndroidActivityTest extends ActivityInstrumentationTestCase2<HelloAndroidActivity> {

    public HelloAndroidActivityTest() {
        super(HelloAndroidActivity.class); 
    }

    public void testActivity() {
        HelloAndroidActivity activity = getActivity();
        assertNotNull(activity);
    }
}

