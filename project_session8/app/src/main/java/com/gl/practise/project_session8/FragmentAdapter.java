package com.gl.practise.project_session8;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;

public class FragmentAdapter extends FragmentStatePagerAdapter {
    public FragmentAdapter(FragmentManager fm)
    {
        super(fm);
    }

    @Override
    public Fragment getItem(int position) {
//        Fragment1 fragment1= new Fragment1();
//        Bundle bundle = new Bundle();
//        position = position+1;
//        bundle.putString("message",""+position);
//        fragment1.setArguments(bundle);
        switch(position) {

            case 0:
                Fragment1 f1=new Fragment1();
                return f1;
            case 1:
                Fragment2 f2=new Fragment2();
                return f2;
            case 2:
                Fragment3 f3=new Fragment3();
                return f3;

            default:
                Fragment3 f4=new Fragment3();
                  return f4;
        }
    }

    @Override
    public int getCount() {
        return 3;
    }
}
