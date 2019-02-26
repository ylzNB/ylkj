package com.ylz;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class HeadPortrait extends AppCompatActivity {
    private EditText editText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getWindow().getDecorView().setSystemUiVisibility(View.SYSTEM_UI_FLAG_LIGHT_STATUS_BAR);
        setContentView(R.layout.activity_head_portrait);
        editText = findViewById(R.id.head_portrait);
//        Intent intent = getIntent();
//        String name = intent.getStringExtra("name");

//        Bundle bundle = getIntent().getExtras();
//        String name = bundle.getString("name", "无名");
//        Log.e("111", name);

//        UserBase userBase = (UserBase)getIntent().getParcelableExtra("userbase");
//        Log.e("111",userBase.toString());

        editText.setText(getIntent().getStringExtra("name"));


    }

    public void onSave(View view) {
        Intent intent = new Intent();
        intent.putExtra("name", editText.getText().toString());
        setResult(2, intent);
        finish();
    }

}
