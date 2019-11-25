package com.myapps.unitconverter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.ArrayList;

public class CustomAdapter extends ArrayAdapter<ListViewDataModel> {

    private Context context;
    private ArrayList<ListViewDataModel> arrayList = new ArrayList<>();

    public CustomAdapter(Context context, ArrayList<ListViewDataModel> arrayList) {
        super(context, 0, arrayList);
        this.context = context;
        this.arrayList = arrayList;
    }





    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        if (convertView == null)
            convertView = LayoutInflater.from(context).inflate(R.layout.listview_layout,null);
        TextView value = convertView.findViewById(R.id.value_textview);
        TextView unit = convertView.findViewById(R.id.unit_textview);

        ListViewDataModel currentList = arrayList.get(position);

        value.setText(currentList.getValue());
        unit.setText(currentList.getUnit());
        return convertView;
    }
}
