package com.gl.practise.session5_part3;

import android.app.Activity;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;

public class CustomListView extends Activity {

    int[] IMAGE = {R.drawable.finalicon, R.drawable.finalicon, R.drawable.finalicon, R.drawable.finalicon, R.drawable.finalicon, R.drawable.finalicon};

    String[] NAME = {"Android", "Android","Android","Android", "Android","Android",};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_custom_list_view);

        ListView listView=(ListView)findViewById(R.id.listview_id);
        CustomAdapter customAdapter=new CustomAdapter();
        listView.setAdapter(customAdapter);
    }

    class CustomAdapter extends BaseAdapter{

        @Override
        public int getCount() {
            return IMAGE.length;
        }

        @Override
        public Object getItem(int i) {
            return null;
        }

        @Override
        public long getItemId(int i) {
            return 0;
        }

        @Override
        public View getView(int i, View convertView, ViewGroup parent) {
            convertView = getLayoutInflater().inflate(R.layout.customlayput2,null);
            ImageView imageView = (ImageView)convertView.findViewById(R.id.imageview_id);
            TextView textView = (TextView)convertView.findViewById(R.id.textview_id);
            imageView.setImageResource(IMAGE[i]);
            textView.setText(NAME[i]);
            return convertView;
        }
    }

}

