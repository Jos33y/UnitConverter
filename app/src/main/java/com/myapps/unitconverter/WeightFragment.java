package com.myapps.unitconverter;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.os.Bundle;
import android.util.Log;
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


public class WeightFragment extends Fragment {
    private static DecimalFormat df = new DecimalFormat("0.00");

    private String editTextValue;
    public static double weightValue;

    private EditText editText;
    private ListView listView;
    private CustomAdapter customAdapter;


    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        final View view = inflater.inflate(R.layout.fragment_weight, container, false);
        listView = view.findViewById(R.id.all_fragment_listview);
        editText = view.findViewById(R.id.user_temp);
        final Spinner spinner = view.findViewById(R.id.spinner);
        String[] units = {"Select a unit", "g", "kg", "lb(pounds)", "ounce", "tonne"};


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
                    arrayList.add(new ListViewDataModel(weightValue, "g"));
                    arrayList.add(new ListViewDataModel(weightValue, "kg"));
                    arrayList.add(new ListViewDataModel(weightValue, "lb(pounds)"));
                    arrayList.add(new ListViewDataModel(weightValue, "ounce"));
                    arrayList.add(new ListViewDataModel(weightValue, "tonne"));

                }

                if (value.equals("lb(pounds)")) {
                    arrayList.clear();
                    spinner.setSelection(0);
                    Log.d("message", "pounds selected");
                    editTextValue = editText.getText().toString();
                    weightValue = Double.valueOf(editTextValue);


                    arrayList.add(new ListViewDataModel(weightValue, "pound"));



                        UnitFunctions.poundsToKg();
                        customAdapter.notifyDataSetChanged();
                        arrayList.add(new ListViewDataModel(result, "kg"));

                        UnitFunctions.poundsToG();
                        customAdapter.notifyDataSetChanged();
                        arrayList.add(new ListViewDataModel(result, "g"));

                        UnitFunctions.poundsToOunce();
                        arrayList.add(new ListViewDataModel(result, "ounce"));
                        customAdapter.notifyDataSetChanged();

                        UnitFunctions.poundsToTonnes();
                        arrayList.add(new ListViewDataModel(result, "tonne"));
                        customAdapter.notifyDataSetChanged();


                }


                if (value.equals("g"))  {
                    arrayList.clear();
                    spinner.setSelection(0);
                    Log.d("message", "pounds selected");
                    editTextValue = editText.getText().toString();
                    weightValue = Double.valueOf(editTextValue);

                    arrayList.add(new ListViewDataModel(weightValue, "g"));

                    {

                        UnitFunctions.gToPounds();
                        customAdapter.notifyDataSetChanged();
                        arrayList.add(new ListViewDataModel(result, "pound"));

                        UnitFunctions.gTokg();
                        customAdapter.notifyDataSetChanged();
                        arrayList.add(new ListViewDataModel(result, "Kg"));

                        UnitFunctions.gToOunce();
                        customAdapter.notifyDataSetChanged();
                        arrayList.add(new ListViewDataModel(result, "ounce"));

                        UnitFunctions.gToTonne();
                        customAdapter.notifyDataSetChanged();
                        arrayList.add(new ListViewDataModel(result, "Tonne"));


                    }


                }

                if (value.equals("kg")) {

                    arrayList.clear();
                    spinner.setSelection(0);
                    Log.d("message", "kg selected");
                    editTextValue = editText.getText().toString();
                    weightValue = Double.valueOf(editTextValue);

                    arrayList.add(new ListViewDataModel(weightValue, "kg"));

                    {
                        UnitFunctions.kgTopounds();
                        customAdapter.notifyDataSetChanged();
                        arrayList.add(new ListViewDataModel(result, "pound"));

                        UnitFunctions.kgToG();
                        customAdapter.notifyDataSetChanged();
                        arrayList.add(new ListViewDataModel(result, "G"));

                        UnitFunctions.kgToOunce();
                        customAdapter.notifyDataSetChanged();
                        arrayList.add(new ListViewDataModel(result, "ounce"));

                        UnitFunctions.kgToTonne();
                        customAdapter.notifyDataSetChanged();
                        arrayList.add(new ListViewDataModel(result, "Tonne"));


                    }
                }


                if (value.equals("ounce"))  {
                    arrayList.clear();
                    spinner.setSelection(0);
                    Log.d("message", "ounce selected");
                    editTextValue = editText.getText().toString();
                    weightValue = Double.valueOf(editTextValue);


                    arrayList.add(new ListViewDataModel(weightValue, "ounce"));
                    {

                        UnitFunctions.ounceToPounds();
                        customAdapter.notifyDataSetChanged();
                        arrayList.add(new ListViewDataModel(result, "pound"));

                        UnitFunctions.ounceTokg();
                        customAdapter.notifyDataSetChanged();
                        arrayList.add(new ListViewDataModel(result, "kg"));

                        UnitFunctions.ounceToG();
                        customAdapter.notifyDataSetChanged();
                        arrayList.add(new ListViewDataModel(result, "G"));

                        UnitFunctions.ounceToTonne();
                        customAdapter.notifyDataSetChanged();
                        arrayList.add(new ListViewDataModel(result, "Tonne"));
                    }

                }

                if (value.equals("tonne"))  {
                    arrayList.clear();
                    spinner.setSelection(0);
                    Log.d("message", "ounce selected");
                    editTextValue = editText.getText().toString();
                    weightValue = Double.valueOf(editTextValue);

                    arrayList.add(new ListViewDataModel(weightValue, "tonne"));
                    {

                        UnitFunctions.tonnesToPounds();
                        customAdapter.notifyDataSetChanged();
                        arrayList.add(new ListViewDataModel(result, "pound"));

                        UnitFunctions.tonnesTokg();
                        customAdapter.notifyDataSetChanged();
                        arrayList.add(new ListViewDataModel(result, "Kg"));

                        UnitFunctions.tonnesToG();
                        customAdapter.notifyDataSetChanged();
                        arrayList.add(new ListViewDataModel(result, "g"));

                        UnitFunctions.tonnesToOunce();
                        customAdapter.notifyDataSetChanged();
                        arrayList.add(new ListViewDataModel(result, "ounce"));



                    }

                }
            }


            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {


            }
        });


        return view;
    }


}