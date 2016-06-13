package com.shablcu.shalu.sunshineapp;

import android.app.Fragment;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public static class PlaceholderFragment extends Fragment {
              public PlaceholderFragment() {
                  }
                @Override
                public View onCreateView(LayoutInflater inflater, ViewGroup container,
                                         Bundle savedInstanceState) {
                    View rootView = inflater.inflate(R.layout.fragment_blank, container, false);
                 return rootView;
          }
            }
}
