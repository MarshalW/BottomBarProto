package com.easymorse;

import android.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/**
 * Created with IntelliJ IDEA.
 * User: marshal
 * Date: 12-9-12
 * Time: 下午7:40
 * To change this template use File | Settings | File Templates.
 */
public class HomePageFragment extends Fragment{
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        return inflater.inflate(R.layout.home_page,container,false);
    }
}
