package kr.hs.emirim.qls6521.helloandroid;

import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;

public class MainActivity extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
//        위에 R.layout R은 리소스!!! 컨텐츠뷰는 그림같은 거 보여줄거얏
//        onCreate이 클래스가 처음 불러졌을 때 딱 한번만 실행한다
//        생성자? 그 클래스가 처음 만들어졌을때 호출되는 특별한 메소드이다 클래스가 처음 인스턴스를 만들때!
//        생성자와 다른점은 onCreate는 컴퓨터가 자동으로 만들어줌 activity한걸 보여주기전에 준비하라고 onCreate를 실행
//        객체지향식으로 짠다는 것... ? 객체가 중심이 되어야함 각자 역할을 주고 상황설명과 동작을 알려주는게 객체지향
//        순서대로 위에서부터 주최하는 것(내가) 이건 C언어 스타일
    }
}
