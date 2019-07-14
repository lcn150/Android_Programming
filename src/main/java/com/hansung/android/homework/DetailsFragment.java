package com.hansung.android.homework;


import android.graphics.drawable.Icon;
import android.os.Build;
import android.os.Bundle;
import android.support.annotation.RequiresApi;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;


/**
 * A simple {@link Fragment} subclass.
 */
public class DetailsFragment extends Fragment {  //MenuDetail액티비티 위에서 작동할 DetailFragment(fragment_details.xml)
    int index=-1;

    public DetailsFragment() {
        // Required empty public constructor
    }

    public void setSelection(int i) { index = i; }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,  //프래그먼트에서 화면이 띄워질 수 있도록 onCreateView()를 설정
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_details, container, false);
        TextView tv = (TextView)view.findViewById(R.id.textview);  //텍스트id를 fragment_details.xml에서 가져온다.
        ImageView im = (ImageView)view.findViewById(R.id.imageview);  //이미지id를 fragment_details.xml에서 가져온다.

        if (index >=0)
            tv.setText(RestaurantInfo.ALLMENU[index]);  //텍스트 상수를 RestaurantInfo에서 가져와서 세팅
            im.setImageResource(RestaurantInfo.Images[index]);  //이미지 상수를 RestaurantInfo에서 가져와서 세팅
            return view;

    }
}