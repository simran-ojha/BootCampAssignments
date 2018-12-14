package com.gl.practise.task;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;


public class BedRoomFragment extends Fragment {


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        View v = inflater.inflate(R.layout.fragment_bed_room, container, false);

        ListView lstItems = (ListView) v.findViewById(R.id.fragment_listview_id);

        ArrayList<String> bedroom = new ArrayList<String>();
        bedroom.add("Bed");
        bedroom.add("Table");
        bedroom.add("Wardrobe");

        ArrayAdapter<String> allItemsAdapter = new ArrayAdapter<String>(getActivity().getBaseContext(), android.R.layout.simple_list_item_1, bedroom);

        lstItems.setAdapter(allItemsAdapter);

        return v;


    }
}
