package com.hansung.android.homework;

import android.content.Intent;
import android.content.res.Configuration;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.View;
import android.widget.AdapterView;
import android.widget.GridView;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;

public class RestaurantDetail extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getSupportActionBar().setTitle("한성 맛집 앱");   //어플 이름 설정
        setContentView(R.layout.activity_main);          //xml에 화면
    }

    public void onTitleSelected(int i) {   //화면이 Tablet정도로 클 때
        if (getResources().getConfiguration().isLayoutSizeAtLeast(Configuration.SCREENLAYOUT_SIZE_LARGE)) {
            DetailsFragment detailsFragment = new DetailsFragment();
            detailsFragment.setSelection(i);
            getSupportFragmentManager().beginTransaction().replace(R.id.details, detailsFragment).commit();
        } else {    // 화면 크기가 작은 경우
            Intent intent = new Intent(this, MenuDetail.class);  //MenuDetai액티비티로 보낼 인텐트
            intent.putExtra("index", i);
            startActivity(intent);
        }
    }

    public void doOnBtnClick(View view) {   //전화 다이얼 버튼 및 인텐트 설정
        Intent implicit_intent = null;
        switch (view.getId()) {
            case R.id.buttonDialActivity:
                // 027604499 전화번호로 다이얼 작업을 수행할 수 있도록 인텐트 설정
                implicit_intent = new Intent(Intent.ACTION_DIAL,
                        Uri.parse("tel:027604499"));
                break;
        }
        if (implicit_intent != null)
            startActivity(implicit_intent);
    }
}