package com.androidunleashed.fragmentcodeapp;

import android.view.View;
import android.view.LayoutInflater;
import android.app.Fragment;
import android.os.Bundle;
import android.view.ViewGroup;
import android.widget.ListView;
import android.widget.ArrayAdapter;
import android.content.Context;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.TextView;
import android.content.Intent;
import android.app.FragmentManager;

public class Fragment1Activity extends Fragment{

    protected static final String FRAG2 = "2";

    public View onCreateView(LayoutInflater inflater, ViewGroup container,Bundle savedInstanceState) {
        Context c = getActivity().getApplicationContext();
        View vw = inflater.inflate(R.layout.fragment1, container, false);

        final String[] money={"EUR", "USD", "GBP", "AUD", "CAD"};
        final String[] info={"Euro", "USA", "Anglia", "Ausztralia", "Canada"};
        final String[] vetel={"4.85", "4.44", "5.55", "4.12", "3.94"};
        final String[] eladas={"3.85", "5.44", "6.55", "3.12", "4.94"};

        ListView valuesList = (ListView) vw.findViewById(R.id.values_list);
        ArrayAdapter<String> arrayAdpt= new ArrayAdapter<String>(c, android.R.layout.simple_list_item_1, money);
        valuesList.setAdapter(arrayAdpt);

        final FragmentManager fragmentManager = getFragmentManager();
        valuesList.setOnItemClickListener(new OnItemClickListener(){
            @Override
            public void onItemClick(AdapterView<?> parent, View v, int position, long id)
            {
                if(fragmentManager.findFragmentByTag(FRAG2)!=null){
                    TextView selectedOpt = (TextView) getActivity().findViewById(R.id.selectedopt);
                    TextView selectedOpt2 = (TextView) getActivity().findViewById(R.id.selectedopt2);
                    TextView selectedOpt3 = (TextView) getActivity().findViewById(R.id.selectedopt3);
                    selectedOpt.setText("A vetel ara "+vetel[position]);
                    selectedOpt2.setText("Az eladas ara "+eladas[position]);
                    selectedOpt3.setText("A kivalasztott penznem "+info[position]);
                } else {
                    Intent intent = new Intent(getActivity().getApplicationContext(),  ShowItemActivity.class);
                    intent.putExtra("info", info[position]);
                    intent.putExtra("item", vetel[position]);
                    intent.putExtra("item2", eladas[position]);
                    startActivity(intent);
                }
            }
        });
        return vw;
    }
}
