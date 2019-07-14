package com.hansung.android.homework;


import android.app.Activity;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;


/**
 * A simple {@link Fragment} subclass.
 */
//모든것은 프래그먼트에서 처리
public class TitlesFragment extends Fragment {
    //RestaurantDetail액티비티 위에서 동작할 TitlesFragment(fragment_titles.xml)
    public TitlesFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // inflator를 사용한 rootView는 프래그먼트에서 화면을 부풀리는 중요한 역할
        View rootView = inflater.inflate(R.layout.fragment_titles, container, false);

        TextView tt1 = (TextView)rootView.findViewById(R.id.text123);   //서울 성북구 삼선동 2가 389
        tt1.setText(RestaurantInfo.VALUE[0]);

        TextView tt2 = (TextView)rootView.findViewById(R.id.text456);  //02-760-4499
        tt2.setText(RestaurantInfo.VALUE[1]);

        TextView tt3 = (TextView)rootView.findViewById(R.id.text789);  //AM 10:00 ~ PM 11:00
        tt3.setText(RestaurantInfo.VALUE[2]);

        // 데이터 원본 준비 "value"
        ArrayList<MyItem> data = new ArrayList<MyItem>();
        //메뉴 리스트를 보여주기 위하여 RestaurantInfo에서 가져와서 사용한다.
        data.add(new MyItem(R.drawable.sample_1,RestaurantInfo.TITLES[0],RestaurantInfo.DIALOGUE[0]));   //냉모밀
        data.add(new MyItem(R.drawable.sample_2,RestaurantInfo.TITLES[1],RestaurantInfo.DIALOGUE[1]));   //라면
        data.add(new MyItem(R.drawable.sample_3,RestaurantInfo.TITLES[2],RestaurantInfo.DIALOGUE[2]));   //원조김밥
        data.add(new MyItem(R.drawable.sample_4,RestaurantInfo.TITLES[3],RestaurantInfo.DIALOGUE[3]));   //치즈라면
        data.add(new MyItem(R.drawable.sample_5,RestaurantInfo.TITLES[4],RestaurantInfo.DIALOGUE[4]));   //부대찌개
        data.add(new MyItem(R.drawable.sample_6,RestaurantInfo.TITLES[5],RestaurantInfo.DIALOGUE[5]));   //제육덮밥
        data.add(new MyItem(R.drawable.sample_7,RestaurantInfo.TITLES[6],RestaurantInfo.DIALOGUE[6]));   //새우볶음밥
        data.add(new MyItem(R.drawable.sample_8,RestaurantInfo.TITLES[7],RestaurantInfo.DIALOGUE[7]));   //비빔밥

        //어댑터 생성
        MyAdapter adapter = new MyAdapter(getContext(), R.layout.item, data);
        //어댑터 연결
        ListView listView = rootView.findViewById(R.id.listview);
        listView.setAdapter(adapter);

        // 리스트뷰 항목이 선택되었을 때, 항목 클릭 이벤트 처리
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            //리스트뷰 항목을 선택했을 때 RestaurantDetail의 onTitleSelected()가 호출됨
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int position, long id) {
                // 선택된 항목 위치 (position)을 이 프래그먼트와 연결된 액티비티로 전달
                Activity activity = getActivity();
                // 선택된 항목 위치 (position)을 이 프래그먼트와 연결된 RestaurantDetai로 전달
                if (activity instanceof RestaurantDetail)
                    ((RestaurantDetail)activity).onTitleSelected(position);
            }
        });
        return rootView;
    }
}