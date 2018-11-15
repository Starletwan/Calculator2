package com.example.wanyinzhen.calculator;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
private String inf="";//让inf的值和编辑框text里面的值永远是一个
 private EditText editText;
 @Override
 protected void onCreate(Bundle savedInstanceState) {
  super.onCreate(savedInstanceState);
  setContentView(R.layout.activity_main);
  this.editText=(EditText) this.findViewById(R.id.editText);
  this.editText.setText(this.inf);

 }

 public void go(View v) {
  int id = v.getId();
  if (id == R.id.one) {
   this.inf=this.inf+"1";//使的编辑框内显示1
   this.editText.setText(this.inf);//使得字符串inf的值显示在编辑框呢
  } else if (id == R.id.two) {
   this.inf=this.inf+"2";//使的编辑框内显示1
   this.editText.setText(this.inf);//使得字符串inf的值显示在编辑框呢
  } else if (id == R.id.three) {
   this.inf=this.inf+"3";//使的编辑框内显示1
   this.editText.setText(this.inf);//使得字符串inf的值显示在编辑框呢
  } else if (id == R.id.four) {
   this.inf=this.inf+"4";//使的编辑框内显示1
   this.editText.setText(this.inf);//使得字符串inf的值显示在编辑框呢
  } else if (id == R.id.five) {
   this.inf=this.inf+"5";//使的编辑框内显示1
   this.editText.setText(this.inf);//使得字符串inf的值显示在编辑框呢
  } else if (id == R.id.six) {
   this.inf=this.inf+"6";//使的编辑框内显示1
   this.editText.setText(this.inf);//使得字符串inf的值显示在编辑框呢
  } else if (id == R.id.seven) {
   this.inf=this.inf+"7";//使的编辑框内显示1
   this.editText.setText(this.inf);//使得字符串inf的值显示在编辑框呢
  } else if (id == R.id.eight) {
   this.inf=this.inf+"8";//使的编辑框内显示1
   this.editText.setText(this.inf);//使得字符串inf的值显示在编辑框呢
  } else if (id == R.id.nine) {
   this.inf=this.inf+"9";//使的编辑框内显示1
   this.editText.setText(this.inf);//使得字符串inf的值显示在编辑框呢
  } else if (id == R.id.zero) {
   this.inf=this.inf+"0";//使的编辑框内显示1
   this.editText.setText(this.inf);//使得字符串inf的值显示在编辑框呢
  } else if (id == R.id.point) {
   this.inf=this.inf+".";//使的编辑框内显示1
   this.editText.setText(this.inf);//使得字符串inf的值显示在编辑框呢
  } else if (id == R.id.add) {
   this.inf=this.inf+"+";//使的编辑框内显示1
   this.editText.setText(this.inf);//使得字符串inf的值显示在编辑框呢
  } else if (id == R.id.sub) {
   this.inf=this.inf+"-";//使的编辑框内显示1
   this.editText.setText(this.inf);//使得字符串inf的值显示在编辑框呢
  } else if (id == R.id.mul) {
   this.inf=this.inf+"*";//使的编辑框内显示1
   this.editText.setText(this.inf);//使得字符串inf的值显示在编辑框呢
  } else if (id == R.id.div) {
   this.inf=this.inf+"/";//使的编辑框内显示1
   this.editText.setText(this.inf);//使得字符串inf的值显示在编辑框呢
  } else if (id == R.id.equal) {
   this.inf=this.inf+"=";//使的编辑框内显示1
   this.editText.setText(this.inf);//使得字符串inf的值显示在编辑框呢
  } else if (id == R.id.black) {
   this.inf="234";
   this.editText.setText(this.inf);//使得字符串inf的值显示在编辑框呢
  } else if (id == R.id.clear) {
   this.inf="";//使的编辑框内显示1
   this.editText.setText(this.inf);//使得字符串inf的值显示在编辑框呢
  }
 }
  }

