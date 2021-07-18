package ir.mohammad.movie;

import android.content.Context;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.SpinnerAdapter;

import java.util.ArrayList;
import java.util.List;


public class settingFragment extends Fragment {
    ArrayAdapter<String> townlist;
    Spinner spinnercity;
    Spinner spinnertown;


    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view=inflater.inflate(R.layout.fragment_setting, container, false);
         spinnercity=(Spinner)view.findViewById(R.id.cityspinner);
         spinnertown=(Spinner)view.findViewById(R.id.townspinner);
        initspinnerfooter();


        return view;
    }

    private void initspinnerfooter() {
        String[]city={"استان خود را انتخاب کنید","قزوین","تهران","اصفهان","فارس"};
        ArrayAdapter<String>cityadapter=new ArrayAdapter<String>(getContext(), android.R.layout.simple_spinner_item,city);
        cityadapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinnercity.setAdapter(cityadapter);


        spinnercity.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                String[]a={"شهر خود را انتخاب کنید"};
                String[] qaz={"قزوین","بوئین زهرا","آوج","تاکستان","الوند","آبیک","اقبالیه","شال","بیدستان"};
                String[]teh={"تهران","ری","اسلامشهر","دماوند","فیروزکوه","شهریار","رباط کریم","پردیس","فشم","آبعلی"};
                String[]esf={"اصفهان","کاشان","خمینی شهر","شاهین شهر","داران","نجف آباد","مبارکه","آران و بیدگل"};
                String[]fars={"شیراز","کازرون","ممسنی","اقلید","مرودشت"};

                if (position==0){
                     townlist = new ArrayAdapter<String>(getContext(), android.R.layout.simple_spinner_dropdown_item,a);
                }else  if (position==1){
                    townlist = new ArrayAdapter<String>(getContext(), android.R.layout.simple_spinner_dropdown_item,qaz);
                }else  if (position==2){
                    townlist = new ArrayAdapter<String>(getContext(), android.R.layout.simple_spinner_dropdown_item,teh);
                }else  if (position==3){
                    townlist = new ArrayAdapter<String>(getContext(), android.R.layout.simple_spinner_dropdown_item,esf);
                }else  if (position==4){
                    townlist = new ArrayAdapter<String>(getContext(), android.R.layout.simple_spinner_dropdown_item,fars);
                }
                spinnertown.setAdapter((SpinnerAdapter) townlist);
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });

    }

    }
