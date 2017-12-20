package com.ditmarcastro.apirest.AdvancedList;

import android.app.Activity;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.ditmarcastro.apirest.R;

import java.util.ArrayList;

/**
 * Created by root on 08-08-17.
 */
public class AdapterList extends BaseAdapter {
    private Activity container;
    private ArrayList<ItemStructure> list;
    public AdapterList (Activity container, ArrayList<ItemStructure> list) {
        this.container = container;
        this.list = list;
    }
    @Override
    public int getCount() {
        return this.list.size();
    }

    @Override
    public Object getItem(int i) {
        return this.list.get(i);
    }

    @Override
    public long getItemId(int i) {
        return 0;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        if (view == null) {
            LayoutInflater inflate = (LayoutInflater) this.container.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            view = inflate.inflate(R.layout.item_activity_list, null);
        }
        ImageView image = (ImageView) view.findViewById(R.id.imagesource);
        TextView description = (TextView) view.findViewById(R.id.description);
        TextView title = (TextView) view.findViewById(R.id.titletxt);
        title.setText(this.list.get(i).getTitle());
        description.setText(this.list.get(i).getDescription());

        return view;
    }
}