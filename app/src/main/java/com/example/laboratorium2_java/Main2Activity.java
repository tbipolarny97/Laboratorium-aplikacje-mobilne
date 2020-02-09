//package com.example.laboratorium2_java;
//
//import androidx.appcompat.app.AppCompatActivity;
//
//import android.content.Intent;
//import android.os.Bundle;
//import android.widget.Button;
//
//public class Main2Activity extends AppCompatActivity {
//
//    @Override
//    protected void onCreate(Bundle savedInstanceState) {
//        super.onCreate(savedInstanceState);
//        setContentView(R.layout.activity_main2);
//    }
//
//    public static class MainActivity extends AppCompatActivity {
//
//        private Button button;
//
//        @Override
//        protected void onCreate(Bundle savedInstanceState) {
//            super.onCreate(savedInstanceState);
//            setContentView(R.layout.activity_main);
//
//            button = findViewById(R.id.przyciskLogowania);
//
//            button.setOnClickListener(v -> {
//                    Intent intent = new Intent(this, AbsenceActivity.class);
//                    startActivity(intent);
//            });
//        }
//    }
//}
