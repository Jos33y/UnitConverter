package com.myapps.unitconverter;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.Spinner;


import java.text.DecimalFormat;
import java.util.ArrayList;

import static com.myapps.unitconverter.UnitFunctions.result;

public class TemperatureFragment extends Fragment {

    private static DecimalFormat df = new DecimalFormat("0.00");

    private String editTextValue;
    public static double tempValue;

    private EditText editText;
    private ListView listView;
    private CustomAdapter customAdapter;


    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragement_temperature, container, false);

        listView = view.findViewById(R.id.all_fragment_listview);
        editText = view.findViewById(R.id.user_temp);
        final Spinner spinner = view.findViewById(R.id.spinner);
        String[] units = {"Select a unit", "°C", "°F", "K"};

        final ArrayList<ListViewDataModel> arrayList = new ArrayList<>();
        customAdapter = new CustomAdapter(getContext(), arrayList);
        listView.setAdapter(customAdapter);

        final ArrayAdapter<String> adapter = new ArrayAdapter<String>(getContext(), android.R.layout.simple_spinner_item, units);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);

        spinner.setAdapter(adapter);

        editText.requestFocus();

        spinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
                String value = adapterView.getItemAtPosition(i).toString();

              if (value.equals("Select a unit")) {
                  arrayList.add(new ListViewDataModel(tempValue, "°C"));
                  arrayList.add(new ListViewDataModel(tempValue, "°F"));
                  arrayList.add(new ListViewDataModel(tempValue, "K"));

              }

              if (value.equals("°C")) {
                  arrayList.clear();
                  editTextValue = editText.getText().toString();
                  tempValue = Double.valueOf(editTextValue);


                      arrayList.add(new ListViewDataModel(tempValue, "°C"));

                      UnitFunctions.celciusToFarenheit();
                      customAdapter.notifyDataSetChanged();
                      arrayList.add(new ListViewDataModel(result, "°F"));

                      UnitFunctions.celciusToKelvin();
                      customAdapter.notifyDataSetChanged();
                      arrayList.add(new ListViewDataModel(result, "K"));


              }
              if (value.equals("°F")) {
                  arrayList.clear();
                  editTextValue = editText.getText().toString();
                  tempValue = Double.valueOf(editTextValue);


                  arrayList.add(new ListViewDataModel(tempValue, "°F"));

                  UnitFunctions.farenheitToCelsius();
                  customAdapter.notifyDataSetChanged();
                  arrayList.add(new ListViewDataModel(result, "°C"));

                  UnitFunctions.farenheitToKelvin();
                  customAdapter.notifyDataSetChanged();
                  arrayList.add(new ListViewDataModel(result, "K"));

              }
              if (value.equals("K"))  {
                  arrayList.clear();
                  editTextValue = editText.getText().toString();
                  tempValue = Double.valueOf(editTextValue);


                  arrayList.add(new ListViewDataModel(tempValue, "k"));


                      UnitFunctions.kelvinToCelsius();
                      customAdapter.notifyDataSetChanged();
                      arrayList.add(new ListViewDataModel(result, "°C"));

                      UnitFunctions.kelvinToFarenheit();
                      customAdapter.notifyDataSetChanged();
                      arrayList.add(new ListViewDataModel(result, "°F"));



              }
            }

            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {

            }
        });

        return view;
    }

}

