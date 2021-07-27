package com.example.w2_fragments;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        FragmentManager manager=getSupportFragmentManager();
        FragmentTransaction t=manager.beginTransaction();
        Details_list f1=new Details_list();
        Add_delete f2=new Add_delete();
        t.add(R.id.frame1,f1);
        t.add(R.id.frame2,f2);
        t.commit();
    }

    public void f1(String S) {

    }
}