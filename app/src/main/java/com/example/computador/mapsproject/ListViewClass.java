package com.example.computador.mapsproject;


import android.app.Activity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.HashMap;


public class ListViewClass extends Activity {

    public static  String KEY_REFERENCE = "reference"; // id of the place
    public static  String KEY_NAME = "name"; // name of the place
    public static String KEY_VICINITY = "vicinity"; // Place area name

    ArrayList<HashMap<String, String>> placesListItems = new ArrayList<HashMap<String,String>>();
    ListView list;


    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.listview_maps);

        //list = (ListView) findViewById(R.id.list);
        //GetNearbyPlacesData getNearbyPlacesData = new GetNearbyPlacesData();
       // getNearbyPlacesData.ShowNearbyPlacesList(list, );
    }

}


