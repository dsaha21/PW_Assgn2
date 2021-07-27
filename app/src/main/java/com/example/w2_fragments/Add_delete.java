package com.example.w2_fragments;

import android.app.FragmentManager;
import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentTransaction;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.Objects;


public class Add_delete extends Fragment {
    EditText e1;
    Button add_b,del_b; int i=-1;
   // CheckBox ch1;
    ArrayList<String> addList= new ArrayList<>();
    ArrayList<Integer> addlistpos= new ArrayList<>();
    ArrayList<Integer> chboxpos= new ArrayList<>();
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
       View v= inflater.inflate(R.layout.fragment_add_delete, container, false);
       e1=(EditText) v.findViewById(R.id.editNameid);
       add_b=(Button)v.findViewById(R.id.addbid);
       del_b=(Button)v.findViewById(R.id.delbid);
       //ch1=(CheckBox)v.findViewById(R.id.checkBox2);


       add_b.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View view) {
               try{
                   i++;
                   String s=e1.getText().toString();
                  // Toast.makeText(getActivity(), "geeting the word"+s, Toast.LENGTH_LONG).show();

                   Bundle b1=new Bundle();
                   b1.putString("name",s);
                   b1.putInt("count",i);
                   b1.putStringArrayList("addarraylist",addList);
                   b1.putIntegerArrayList("addlistpos",addlistpos);
                   b1.putIntegerArrayList("chboxpos",chboxpos);
                   Details_list dl2=new Details_list();
                   dl2.setArguments(b1);
                   FragmentTransaction ft=getFragmentManager().beginTransaction();
                   ft.replace(R.id.frame1,dl2);
                   ft.commit();
                   e1.setText("");


               }catch (Exception e){
                  Toast.makeText(getContext(),"Please enter a name",Toast.LENGTH_LONG).show();

               }
           }
       });

     /*  del_b.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View view) {
               // to delete
            try{
                Bundle b4=getArguments();
                ArrayList<Integer> ad_poslist=b4.getIntegerArrayList("pos");
                for(int k=0;k<ad_poslist.size(); k++){
                    if(ad_poslist.get(k)==1){
                        al.remove(k);
                    }
                    // pos.add(al2.indexOf(namef2)) ;
                }

            }catch (Exception e){
                Toast.makeText(getContext(), "No items to delete..", Toast.LENGTH_SHORT).show();
            }



           }
       });*/
       return v;
    }
}




  /*  // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;

    public Add_delete() {
        // Required empty public constructor
    }


    // TODO: Rename and change types and number of parameters
    public static Add_delete newInstance(String param1, String param2) {
        Add_delete fragment = new Add_delete();
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