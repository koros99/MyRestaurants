package com.kilel.myrestaurants;

import android.widget.ListView;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.robolectric.Robolectric;
import org.robolectric.RobolectricTestRunner;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

@RunWith(RobolectricTestRunner.class)

public class RestaurantsActivityTest {

    private RestaurantsActivity activity;
    private ListView mRestaurantsListView;

    @Before
    public void setup(){
        activity = Robolectric.setupActivity(RestaurantsActivity.class);
        mRestaurantsListView = (ListView) activity.findViewById(R.id.listView);
    }

    @Test
    public void restaurantsListViewPopulates(){
        assertNotNull(mRestaurantsListView.getAdapter());
        assertEquals(mRestaurantsListView.getAdapter().getCount(), 15);
    }
}
