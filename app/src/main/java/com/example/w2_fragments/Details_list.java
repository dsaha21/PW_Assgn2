package com.example.w2_fragments;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.CheckBox;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.ScrollView;
import android.widget.TextView;

import java.util.ArrayList;

import androidx.fragment.app.Fragment;


public class Details_list extends Fragment {
    ListView l;

    String namef2="";
    int i;
    CheckBox ch;
    ScrollView sl;
    ArrayList<String> addlist;
    ArrayList<Integer> addlistpos, chboxpos;
    TextView sampletext,t;
     LinearLayout linearLayout;
    ListView listView;
    ArrayAdapter adapternames;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {


        View v = inflater.inflate(R.layout.fragment_details_list, container, false);
        // View v2 = inflater.inflate(R.layout.fragment_details_list, container, false);
        Bundle b2 = getArguments();

        //sampletext=(TextView)v.findViewById(itemtextid);
        //t=(TextView)v.findViewById(R.id.deliverid);
         //ch = (CheckBox) v.findViewById(R.id.itemcheckBoxid);
         //l=(ListView)v.findViewById(R.id.listviewid);

         linearLayout=(LinearLayout)v.findViewById(R.id.linear_layout);
         sl=(ScrollView)v.findViewById(R.id.scrollid);


        //ch.setText(namef2);
        try {
            if (b2!= null && !namef2.isEmpty()) {
               namef2 = b2.getString("name");

                   // CheckBox checkBox = new CheckBox(MainActivity.this);
                    //checkBox.setText(name);
                    //linearLayout.addView(checkBox);

                CheckBox ch=new CheckBox(getContext());
                    ch.setText(namef2);
                   // View stringtoview=(View)viewaddlist.get(i);
                   // linearLayout.addChildrenForAccessibility(addlist);
                     linearLayout.addView(ch);



            }


                //
                //listView.setAdapter(adapter);
             //else {
               // Toast.makeText(getActivity(), "Cannot be empty", Toast.LENGTH_SHORT).show();

                // addlist.add((String));

          }catch (Exception e)
             {e.printStackTrace();
        }
        return v;
    }


    }

      /*  l=(ListView)v.findViewById(R.id.listid);

       // Log.i("the first value of c from pundu..","ch.."+ch);
        //===========================================================
        if(b2!=null && ch!=null){
         namef2 = b2.getString("name");
         ch.setText(namef2);
         i= b2.getInt("times");
          ArrayList<String> al2=b2.getStringArrayList("array");


            al2.add((String) ch.getText());
            Toast.makeText(getContext(), "The text.."+(String)ch.getText(), Toast.LENGTH_LONG).show();


           // Log.i("yhe value of c from pundu..","ch.."+ch);
          /* if(ch.isChecked()==true)
                poslist.add(1);
            else
                poslist.add(0);



         // int pos[]=new int[al2.size()];

            Bundle b3=new Bundle();
            b3.putIntegerArrayList("pos",poslist);
            //b1.putInt("times",i);
            //b1.putStringArrayList("array",al);
            Add_delete adobj=new Add_delete();
            adobj.setArguments(b3);
            FragmentTransaction ft=getFragmentManager().beginTransaction();
            //ft.replace(R.id.frame2,adobj);
            ft.add(R.id.frame2,adobj);
            ft.commit();
      }*/
//


            //
//                if(namef2.isEmpty()==false) {
//                    t.setText(namef2);
////                    addlist = b2.getStringArrayList("addarraylist");
////                    addlistpos = b2.getIntegerArrayList("addlistpos");
////                     chboxpos = b2.getIntegerArrayList("chboxpos");
//                    i = b2.getInt("count");
//
//
//
//                    addlist.add(namef2);
//                    //Toast.makeText(getActivity(), "Got the message", Toast.LENGTH_SHORT).show();
////
////
////
//                adapternames = new ArrayAdapter(getActivity(), R.layout.item_view , itemtextid ,addlist);
////              ArrayAdapter adapterch = new ArrayAdapter(getContext(), R.layout.item_view, R.id.itemcheckBoxid, chboxpos);
//                l.setAdapter(adapternames);
////               l.setAdapter(adapterch);





/*  // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;

    public Details_list() {
        // Required empty public constructor
    }


    // TODO: Rename and change types and number of parameters
    public static Details_list newInstance(String param1, String param2) {
        Details_list fragment = new Details_list();
        Bundle args = new Bundle();
        args.putString(ARG_PARAM1, param1);
        args.putString(ARG_PARAM2, param2);
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getArguments() != null) {
            mParam1 = getArguments().getString(ARG_PARAM1);
            mParam2 = getArguments().getString(ARG_PARAM2);
        }

    }
   */