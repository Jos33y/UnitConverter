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

public class LengthFragment extends Fragment {
    private String editTextValue;
    private EditText editText;
    private ListView listView;
    public static double lengthValue;
    private CustomAdapter customAdapter;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_length, container, false);
        listView = view.findViewById(R.id.all_fragment_listview);
        editText = view.findViewById(R.id.user_temp);
        final Spinner spinner = view.findViewById(R.id.spinner);
        String[] units = {"Select a unit", "m", "cm", "inch", "ft", "mile", "km", "yard"};

        final ArrayList<ListViewDataModel> arrayList = new ArrayList<>();
        customAdapter = new CustomAdapter(getContext(), arrayList);
        listView.setAdapter(customAdapter);

        final ArrayAdapter<String> adapter = new ArrayAdapter<String>(getContext(), android.R.layout.simple_spinner_item, units);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinner.setAdapter(adapter);

        editText.requestFocus();

        arrayList.add(new ListViewDataModel(lengthValue, "m"));
        arrayList.add(new ListViewDataModel(lengthValue, "cm"));
        arrayList.add(new ListViewDataModel(lengthValue, "inch"));
        arrayList.add(new ListViewDataModel(lengthValue, "ft"));
        arrayList.add(new ListViewDataModel(lengthValue, "mile"));
        arrayList.add(new ListViewDataModel(lengthValue, "km"));
        arrayList.add(new ListViewDataModel(lengthValue, "yard"));

        spinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
                String value = adapterView.getItemAtPosition(i).toString();


                if (value.equals("m")) {
                    arrayList.clear();
                    spinner.setSelection(0);
                    customAdapter.notifyDataSetChanged();
                    editTextValue = editText.getText().toString();
                    lengthValue = Double.valueOf(editTextValue);

                    arrayList.add(new ListViewDataModel(lengthValue, "m"));

                    UnitFunctions.mToCm();
                    customAdapter.notifyDataSetChanged();
                    arrayList.add(new ListViewDataModel(result, "cm"));

                    UnitFunctions.mToInch();
                    customAdapter.notifyDataSetChanged();
                    arrayList.add(new ListViewDataModel(result, "inch"));

                    UnitFunctions.mToFt();
                    customAdapter.notifyDataSetChanged();
                    arrayList.add(new ListViewDataModel(result, "ft"));

                    UnitFunctions.mToMile();
                    customAdapter.notifyDataSetChanged();
                    arrayList.add(new ListViewDataModel(result, "mile"));

                    UnitFunctions.mToKm();
                    customAdapter.notifyDataSetChanged();
                    arrayList.add(new ListViewDataModel(result, "km"));

                    UnitFunctions.mToYard();
                    customAdapter.notifyDataSetChanged();
                    arrayList.add(new ListViewDataModel(result, "Yard"));

                }

                if (value.equals("cm")) {
                    arrayList.clear();
                    spinner.setSelection(0);
                    customAdapter.notifyDataSetChanged();
                    editTextValue = editText.getText().toString();
                    lengthValue = Double.valueOf(editTextValue);

                    arrayList.add(new ListViewDataModel(lengthValue, "cm"));

                    UnitFunctions.cmToM();
                    customAdapter.notifyDataSetChanged();
                    arrayList.add(new ListViewDataModel(result, "m"));

                    UnitFunctions.cmToInch();
                    customAdapter.notifyDataSetChanged();
                    arrayList.add(new ListViewDataModel(result, "inch"));

                    UnitFunctions.cmToft();
                    customAdapter.notifyDataSetChanged();
                    arrayList.add(new ListViewDataModel(result, "km"));

                    UnitFunctions.cmToMile();
                    customAdapter.notifyDataSetChanged();
                    arrayList.add(new ListViewDataModel(result, "Mile"));

                    UnitFunctions.cmToKm();
                    customAdapter.notifyDataSetChanged();
                    arrayList.add(new ListViewDataModel(result, "km"));

                    UnitFunctions.cmToYard();
                    customAdapter.notifyDataSetChanged();
                    arrayList.add(new ListViewDataModel(result, "yard"));


                }

                if (value.equals("inch")) {
                    arrayList.clear();
                    spinner.setSelection(0);
                    customAdapter.notifyDataSetChanged();
                    editTextValue = editText.getText().toString();
                    lengthValue = Double.valueOf(editTextValue);

                    arrayList.add(new ListViewDataModel(lengthValue, "inch"));

                    UnitFunctions.inchToM();
                    customAdapter.notifyDataSetChanged();
                    arrayList.add(new ListViewDataModel(result, "m"));

                    UnitFunctions.inchTocm();
                    customAdapter.notifyDataSetChanged();
                    arrayList.add(new ListViewDataModel(result, "cm"));

                    UnitFunctions.inchToFt();
                    customAdapter.notifyDataSetChanged();
                    arrayList.add(new ListViewDataModel(result, "ft"));

                    UnitFunctions.inchToMile();
                    customAdapter.notifyDataSetChanged();
                    arrayList.add(new ListViewDataModel(result, "mile"));

                    UnitFunctions.inchTokm();
                    customAdapter.notifyDataSetChanged();
                    arrayList.add(new ListViewDataModel(result, "km"));

                    UnitFunctions.inchToYard();
                    customAdapter.notifyDataSetChanged();
                    arrayList.add(new ListViewDataModel(result, "yard"));

                }

                if (value.equals("ft")) {
                    arrayList.clear();
                    spinner.setSelection(0);
                    customAdapter.notifyDataSetChanged();
                    editTextValue = editText.getText().toString();
                    lengthValue = Double.valueOf(editTextValue);

                    arrayList.add(new ListViewDataModel(lengthValue, "ft"));

                    UnitFunctions.ftToM();
                    customAdapter.notifyDataSetChanged();
                    arrayList.add(new ListViewDataModel(result, "m"));

                    UnitFunctions.ftTocm();
                    customAdapter.notifyDataSetChanged();
                    arrayList.add(new ListViewDataModel(result, "cm"));

                    UnitFunctions.ftToMile();
                    customAdapter.notifyDataSetChanged();
                    arrayList.add(new ListViewDataModel(result, "mile"));

                    UnitFunctions.ftTokm();
                    customAdapter.notifyDataSetChanged();
                    arrayList.add(new ListViewDataModel(result, "km"));

                    UnitFunctions.ftToMile();
                    customAdapter.notifyDataSetChanged();
                    arrayList.add(new ListViewDataModel(result, "mile"));

                    UnitFunctions.ftToyard();
                    customAdapter.notifyDataSetChanged();
                    arrayList.add(new ListViewDataModel(result, "yard"));
                }

                if (value.equals("mile")) {
                    arrayList.clear();
                    spinner.setSelection(0);
                    customAdapter.notifyDataSetChanged();
                    editTextValue = editText.getText().toString();
                    lengthValue = Double.valueOf(editTextValue);

                    arrayList.add(new ListViewDataModel(lengthValue, "mile"));

                    UnitFunctions.mileToM();
                    customAdapter.notifyDataSetChanged();
                    arrayList.add(new ListViewDataModel(result, "m"));

                    UnitFunctions.mileTocm();
                    customAdapter.notifyDataSetChanged();
                    arrayList.add(new ListViewDataModel(result, "cm"));

                    UnitFunctions.mileToFt();
                    customAdapter.notifyDataSetChanged();
                    arrayList.add(new ListViewDataModel(result, "ft"));

                    UnitFunctions.mileToinch();
                    customAdapter.notifyDataSetChanged();
                    arrayList.add(new ListViewDataModel(result, "inch"));

                    UnitFunctions.mileToKm();
                    customAdapter.notifyDataSetChanged();
                    arrayList.add(new ListViewDataModel(result, "km"));

                    UnitFunctions.mileToYard();
                    customAdapter.notifyDataSetChanged();
                    arrayList.add(new ListViewDataModel(result, "yard"));

                }

                if (value.equals("km")) {
                    arrayList.clear();
                    spinner.setSelection(0);
                    customAdapter.notifyDataSetChanged();
                    editTextValue = editText.getText().toString();
                    lengthValue = Double.valueOf(editTextValue);

                    arrayList.add(new ListViewDataModel(lengthValue, "km"));

                    UnitFunctions.kmToM();
                    customAdapter.notifyDataSetChanged();
                    arrayList.add(new ListViewDataModel(result, "m"));

                    UnitFunctions.kmToCm();
                    customAdapter.notifyDataSetChanged();
                    arrayList.add(new ListViewDataModel(result, "cm"));

                    UnitFunctions.kmToInch();
                    customAdapter.notifyDataSetChanged();
                    arrayList.add(new ListViewDataModel(result, "inch"));

                    UnitFunctions.kmToFt();
                    customAdapter.notifyDataSetChanged();
                    arrayList.add(new ListViewDataModel(result, "ft"));

                    UnitFunctions.kmtoMile();
                    customAdapter.notifyDataSetChanged();
                    arrayList.add(new ListViewDataModel(result, "mile"));

                    UnitFunctions.kmToYard();
                    customAdapter.notifyDataSetChanged();
                    arrayList.add(new ListViewDataModel(result, "yard"));


                }

                if (value.equals("yard")) {
                    arrayList.clear();
                    spinner.setSelection(0);
                    customAdapter.notifyDataSetChanged();
                    editTextValue = editText.getText().toString();
                    lengthValue = Double.valueOf(editTextValue);

                    arrayList.add(new ListViewDataModel(lengthValue, "yard"));

                    UnitFunctions.yardToM();
                    customAdapter.notifyDataSetChanged();
                    arrayList.add(new ListViewDataModel(result, "m"));

                    UnitFunctions.yardToCm();
                    customAdapter.notifyDataSetChanged();
                    arrayList.add(new ListViewDataModel(result, "cm"));

                    UnitFunctions.yardToinch();
                    customAdapter.notifyDataSetChanged();
                    arrayList.add(new ListViewDataModel(result, "inch"));

                    UnitFunctions.yardToFt();
                    customAdapter.notifyDataSetChanged();
                    arrayList.add(new ListViewDataModel(result, "ft"));

                    UnitFunctions.yardToMile();
                    customAdapter.notifyDataSetChanged();
                    arrayList.add(new ListViewDataModel(result, "mile"));

                    UnitFunctions.yardToKm();
                    customAdapter.notifyDataSetChanged();
                    arrayList.add(new ListViewDataModel(result, "km"));

                }
            }

            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {

            }
        });

        return view;

    }


}

