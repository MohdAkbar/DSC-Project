package com.example.akbar.imaging;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;

public class MainActivity extends AppCompatActivity {

    RecyclerView imagesList;
    Button button;
    MyAdapter adapter;
    int A[]={R.drawable.pic_one,R.drawable.pic_two,R.drawable.pic_threee,R.drawable.pic_four,R.drawable.pic_five,R.drawable.pic_six
    ,R.drawable.pic_seven,R.drawable.pic_eight,R.drawable.pic_nine,R.drawable.pic_ten,R.drawable.pic_eleven};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        button=(Button)findViewById(R.id.button);
        imagesList=(RecyclerView)findViewById(R.id.imagesList);
        LinearLayoutManager manager=new LinearLayoutManager(this);
        imagesList.setLayoutManager(manager);
        adapter=new MyAdapter(A,MainActivity.this);
        imagesList.setAdapter(adapter);
        imagesList.setNestedScrollingEnabled(false);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String url="https://www.facebook.com/Gramiksha/photos";
                Intent i=new Intent(Intent.ACTION_VIEW,Uri.parse(url));
                startActivity(i);
            }
        });
    }

}
