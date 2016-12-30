package com.example.app;

import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    private DrawerLayout drawerLayout=null;
    private LinearLayout linearLayout2=null;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        drawerLayout= (DrawerLayout) findViewById(R.id.layout_drawer);
        linearLayout2= (LinearLayout) findViewById(R.id.linearLayout2);
        //布局属性（布局参数）
        ViewGroup.LayoutParams layoutParams=linearLayout2.getLayoutParams();
        //设置抽屉划进来的宽度为屏幕宽度的3/4.
        //getResources().getDisplayMetrics().widthPixels是屏幕的宽度
        layoutParams.width=getResources().getDisplayMetrics().widthPixels*3/4;
        linearLayout2.setLayoutParams(layoutParams);

    }

    @Override
    public void onClick(View view) {
        switch (view.getId()){
            case R.id.textView1:
                //打开抽屉
                drawerLayout.openDrawer(linearLayout2);
                break;
            case R.id.textView2:
                //关闭抽屉
                drawerLayout.closeDrawer(linearLayout2);
                break;
            case R.id.textView3:
                Toast.makeText(this, "点到了 ", Toast.LENGTH_SHORT).show();
                break;

        }
    }
}
