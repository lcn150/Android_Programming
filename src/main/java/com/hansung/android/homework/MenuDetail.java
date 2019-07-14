package com.hansung.android.homework;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MenuDetail extends AppCompatActivity { //클릭했을 때 프래그먼트 뒤에 있을 액티비티(activity_details.xml)
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getSupportActionBar().setTitle("한성 맛집 앱");   //어플 이름 설정
        setContentView(R.layout.activity_details);

        Intent intent = getIntent();
        int selectedPosition = intent.getIntExtra("index",-1);
       //보낸 인텐트를 받을 수 있게 getIntExtra를 사용하여 변수 선언
        DetailsFragment detailsFragment = new DetailsFragment();
        detailsFragment.setSelection(selectedPosition);
        //activity_details.xml의 id를 가져와서 DetailsFragment프레그먼트에서 작동하게끔 세팅
        getSupportFragmentManager().beginTransaction().replace(R.id.details, detailsFragment).commit();
    }
}
