package com.hansung.android.homework;

import android.provider.MediaStore;
import android.widget.ImageView;

public final class RestaurantInfo {  //상수로 정의한 RestaurantInfo
        public static final String[] VALUE={  //구체적인 맛집 상세 정보 상수
                "서울 성북구 삼선동 2가 389","02-760-4499","AM 10:00 ~ PM 11:00"
        };
    
    public static final String[] TITLES =   //초기화면에서 사용하는 음식  이름 상수
            {
                    "냉모밀",
                    "라면",
                    "원조김밥",
                    "치즈라면",
                    "부대찌개",
                    "제육덮밥",
                    "새우볶음밥",
                    "비빔밥"

            };

    /**
     * Our data, part 2.
     */
    public static final String[] DIALOGUE =   //초기화면에서 사용하는 가격 상수
            {
                    "3000원",
                    "2000원",
                    "3500원",
                    "2500원",
                    "5000원",
                    "4000원",
                    "4500원",
                    "5000원"
            };
    public static final Integer[] Images =   //메뉴 이미지 상수
            {
                    R.drawable.sample_1,
                    R.drawable.sample_2,
                    R.drawable.sample_3,
                    R.drawable.sample_4,
                    R.drawable.sample_5,
                    R.drawable.sample_6,
                    R.drawable.sample_7,
                    R.drawable.sample_8,
                    R.drawable.sample_0
            };
    public static final String[] ALLMENU =    //메뉴를 클릭했을 때 MenuDetail액티비티에서 사용되는 상수
            {
                    "냉모밀"+"     "+"3000원"+"    "+"평점:3.5",
                    "라면"+"     "+"2000원"+"    "+"평점:2.5",
                    "원조김밥"+"      "+"3500원"+"    "+"평점:1.5",
                   "치즈라면"+"      "+"2500원"+"    "+"평점:3.9",
                    "부대찌개"+"      "+"5000원"+"    "+"평점:5.0",
                    "제육덮밥"+"     "+"4000원"+"    "+"평점:4.5",
                    "새우볶음밥"+"       "+"4500원"+"    "+"평점:4.7",
                    "비빔밥"+"       "+"5000원"+"    "+"평점:2.9"
            };
}