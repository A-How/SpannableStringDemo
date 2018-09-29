package com.zpf.spanablestringdemo;

import android.graphics.Color;
import android.graphics.Rect;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import android.text.Spanned;
import android.text.TextPaint;
import android.text.method.LinkMovementMethod;
import android.text.style.AbsoluteSizeSpan;
import android.text.style.ClickableSpan;
import android.text.style.ForegroundColorSpan;
import android.text.style.ImageSpan;
import android.text.style.RelativeSizeSpan;
import android.text.style.StrikethroughSpan;
import android.text.style.StyleSpan;
import android.text.style.SubscriptSpan;
import android.text.style.SuperscriptSpan;
import android.text.style.URLSpan;
import android.text.style.UnderlineSpan;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView tv1 = findViewById(R.id.tv1);
        SpannableString spanStr = new SpannableString("设置文字前背景");
        spanStr.setSpan(new ForegroundColorSpan(getResources().getColor(R.color.colorPrimary)),3, spanStr.length(), Spanned.SPAN_INCLUSIVE_INCLUSIVE);
        tv1.setMovementMethod(LinkMovementMethod.getInstance());
        tv1.setHighlightColor(getResources().getColor(android.R.color.transparent));
        tv1.setText(spanStr);

        TextView tv2 = findViewById(R.id.tv2);
        SpannableString spanStr2 = new SpannableString("设置文字背景色");
        spanStr2.setSpan(new ForegroundColorSpan(Color.parseColor("#ffdf40")),3, spanStr2.length(), Spanned.SPAN_INCLUSIVE_INCLUSIVE);
        tv2.setMovementMethod(LinkMovementMethod.getInstance());
        tv2.setHighlightColor(getResources().getColor(android.R.color.transparent));
        tv2.setText(spanStr2);


        TextView tv3 = findViewById(R.id.tv3);
        SpannableString spanStr3 = new SpannableString("高高低低你高高低低");
        RelativeSizeSpan relativeSizeSpan1 = new RelativeSizeSpan(1.1f);
        RelativeSizeSpan relativeSizeSpan2 = new RelativeSizeSpan(1.3f);
        RelativeSizeSpan relativeSizeSpan3 = new RelativeSizeSpan(1.5f);
        RelativeSizeSpan relativeSizeSpan4 = new RelativeSizeSpan(1.7f);
        RelativeSizeSpan relativeSizeSpan5 = new RelativeSizeSpan(1.9f);
        RelativeSizeSpan relativeSizeSpan6 = new RelativeSizeSpan(1.7f);
        RelativeSizeSpan relativeSizeSpan7 = new RelativeSizeSpan(1.5f);
        RelativeSizeSpan relativeSizeSpan8 = new RelativeSizeSpan(1.3f);
        RelativeSizeSpan relativeSizeSpan9 = new RelativeSizeSpan(1.1f);
        spanStr3.setSpan(relativeSizeSpan1,0,1,Spanned.SPAN_INCLUSIVE_EXCLUSIVE);
        spanStr3.setSpan(relativeSizeSpan2,1,2,Spanned.SPAN_INCLUSIVE_EXCLUSIVE);
        spanStr3.setSpan(relativeSizeSpan3,2,3,Spanned.SPAN_INCLUSIVE_EXCLUSIVE);
        spanStr3.setSpan(relativeSizeSpan4,3,4,Spanned.SPAN_INCLUSIVE_EXCLUSIVE);
        spanStr3.setSpan(relativeSizeSpan5,4,5,Spanned.SPAN_INCLUSIVE_EXCLUSIVE);
        spanStr3.setSpan(relativeSizeSpan6,5,6,Spanned.SPAN_INCLUSIVE_EXCLUSIVE);
        spanStr3.setSpan(relativeSizeSpan7,6,7,Spanned.SPAN_INCLUSIVE_EXCLUSIVE);
        spanStr3.setSpan(relativeSizeSpan8,7,8,Spanned.SPAN_INCLUSIVE_EXCLUSIVE);
        spanStr3.setSpan(relativeSizeSpan9,8,9,Spanned.SPAN_INCLUSIVE_EXCLUSIVE);
        tv3.setText(spanStr3);

        TextView tv4 = findViewById(R.id.tv4);
        SpannableString spanStr4 = new SpannableString("我是下划线下划线");
        spanStr4.setSpan(new UnderlineSpan(),1,spanStr4.length(),Spanned.SPAN_INCLUSIVE_INCLUSIVE);
        tv4.setText(spanStr4);


        TextView tv5 = findViewById(R.id.tv5);
        SpannableString spanStr5 = new SpannableString("你个删除线删除线");
        spanStr5.setSpan(new StrikethroughSpan(),1, spanStr5.length(),Spanned.SPAN_INCLUSIVE_INCLUSIVE);
        tv5.setText(spanStr5);

        TextView tv6 = findViewById(R.id.tv6);
        SpannableString spanStr6 = new SpannableString("这个显示上标");
        spanStr6.setSpan(new SuperscriptSpan(),4,spanStr6.length(),Spanned.SPAN_INCLUSIVE_INCLUSIVE);
        spanStr6.setSpan(new RelativeSizeSpan(0.6f),4,spanStr6.length(),Spanned.SPAN_INCLUSIVE_INCLUSIVE);
        tv6.setText(spanStr6);

        TextView tv7 = findViewById(R.id.tv7);
        SpannableString spanStr7 = new SpannableString("这个显示下标");
        spanStr7.setSpan(new SubscriptSpan(),4, spanStr7.length(),Spanned.SPAN_INCLUSIVE_INCLUSIVE);
        spanStr7.setSpan(new RelativeSizeSpan(0.8f),4,spanStr7.length(),Spanned.SPAN_INCLUSIVE_INCLUSIVE);
        tv7.setText(spanStr7);


        TextView tv8 = findViewById(R.id.tv8);
        SpannableString spanStr8 = new SpannableString("文字里添加表情(表情)");
        Drawable image = getResources().getDrawable(R.mipmap.ic_launcher);
        image.setBounds(new Rect(0,0,50,50));
        spanStr8.setSpan(new ImageSpan(image),5, 7,Spanned.SPAN_INCLUSIVE_INCLUSIVE);
        tv8.setText(spanStr8);

        TextView tv9 = findViewById(R.id.tv9);
        SpannableString spanStr9 = new SpannableString("为文字设置粗体、斜体风格");
        StyleSpan styleSpan_B  = new StyleSpan(Typeface.BOLD);
        StyleSpan styleSpan_I  = new StyleSpan(Typeface.ITALIC);
        spanStr9.setSpan(styleSpan_B, 5, 7, Spanned.SPAN_INCLUSIVE_EXCLUSIVE);
        spanStr9.setSpan(styleSpan_I, 8, 10, Spanned.SPAN_INCLUSIVE_EXCLUSIVE);
        tv9.setHighlightColor(Color.parseColor("#36969696"));
        tv9.setText(spanStr9);

        TextView tv10 = findViewById(R.id.tv10);
        SpannableString spanStr10 = new SpannableString("请准守协议《XXXXXX协议》");
        spanStr10.setSpan(new ClickableSpan() {
            @Override
            public void onClick(View view) {
                //点击事件
                Toast.makeText(MainActivity.this,"点击了我，可以写跳转逻辑",Toast.LENGTH_SHORT).show();
            }
            @Override
            public void updateDrawState(TextPaint ds) {
                ds.setColor(Color.parseColor("#ff4d40"));
            }
        },5,spanStr10.length(),Spanned.SPAN_INCLUSIVE_INCLUSIVE);
        tv10.setMovementMethod(LinkMovementMethod.getInstance()); // 必须的设置这个，不然点击效果 不生效
        tv10.setHighlightColor(Color.parseColor("#ffffff")); //点击后显示的背景色，我这里设置了白色，默认颜色不好看
        tv10.setText(spanStr10);

        TextView tv11 = findViewById(R.id.tv11);
        SpannableString spanStr11 = new SpannableString("直接设置跳转链接《XXXXXX协议》");
        spanStr11.setSpan(new URLSpan("http://www.baidu.com"),8,spanStr11.length(),Spanned.SPAN_INCLUSIVE_INCLUSIVE);
        tv11.setMovementMethod(LinkMovementMethod.getInstance());
        tv11.setHighlightColor(Color.parseColor("#36969696"));
        tv11.setText(spanStr11);


        TextView tv12 = findViewById(R.id.tv12);
        String beforeText = "快快下单";
        String afterText = "(立享200元优惠)";
        int beforeSize = 20;
        int afterSize = 15;
        SpannableStringBuilder builder = new SpannableStringBuilder(beforeText);
        builder.setSpan(new ForegroundColorSpan(Color.parseColor("#ffdf40")),0,beforeText.length(),Spanned.SPAN_INCLUSIVE_INCLUSIVE);
        builder.setSpan(new AbsoluteSizeSpan(beforeSize,true),0,beforeText.length(),Spanned.SPAN_INCLUSIVE_EXCLUSIVE);
        builder.append(afterText);
        builder.setSpan(new ForegroundColorSpan(Color.parseColor("#ff6940")),beforeText.length(),builder.length(),Spanned.SPAN_INCLUSIVE_INCLUSIVE);
        builder.setSpan(new AbsoluteSizeSpan(afterSize,true),beforeText.length(),builder.length(),Spanned.SPAN_INCLUSIVE_EXCLUSIVE);
        tv12.setText(builder);


    }
}
