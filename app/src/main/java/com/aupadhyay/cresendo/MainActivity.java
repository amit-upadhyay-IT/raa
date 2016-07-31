package com.aupadhyay.cresendo;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.NavigationView;
import android.support.design.widget.Snackbar;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;


public class MainActivity extends AppCompatActivity
        implements NavigationView.OnNavigationItemSelectedListener, View.OnClickListener, AdapterView.OnItemSelectedListener {

    String judgeEmail ;
    String strJudgeEmail;
    DatabaseReference myRootRef;// = FirebaseDatabase.getInstance().getReference();
    DatabaseReference myChildRootRef ; // this will be the key of judge email

    DatabaseReference myGrandChildRootRef1; // this will be the key of the total marks given by judge
    DatabaseReference myGrandChildRootRef2;
    DatabaseReference myGrandChildRootRef3;
    DatabaseReference myGrandChildRootRef4;
    DatabaseReference myGrandChildRootRef5;
    DatabaseReference myGrandChildRootRef6;
    DatabaseReference myGrandChildRootRef7;
    DatabaseReference myGrandChildRootRef8;
    DatabaseReference myGrandChildRootRef9;
    DatabaseReference myGrandChildRootRef10;
    DatabaseReference myGrandChildRootRef11;
    DatabaseReference myGrandChildRootRef12;
    DatabaseReference myGrandChildRootRef13;
    DatabaseReference myGrandChildRootRef14;

    SharedPreferences loginPreference;


    EditText bodyLanguageMarks, bodyLanguageMarks2, bodyLanguageMarks3, bodyLanguageMarks4, bodyLanguageMarks5, bodyLanguageMarks6, bodyLanguageMarks7, bodyLanguageMarks8, bodyLanguageMarks9, bodyLanguageMarks10, bodyLanguageMarks11, bodyLanguageMarks12, bodyLanguageMarks13, bodyLanguageMarks14;
    EditText confidenceMarks, confidenceMarks2, confidenceMarks3, confidenceMarks4, confidenceMarks5, confidenceMarks6, confidenceMarks7, confidenceMarks8, confidenceMarks9, confidenceMarks10, confidenceMarks11, confidenceMarks12, confidenceMarks13, confidenceMarks14;
    EditText crowdApprovalMarks, crowdApprovalMarks2, crowdApprovalMarks3, crowdApprovalMarks4, crowdApprovalMarks5, crowdApprovalMarks6, crowdApprovalMarks7, crowdApprovalMarks8, crowdApprovalMarks9, crowdApprovalMarks10, crowdApprovalMarks11, crowdApprovalMarks12, crowdApprovalMarks13, crowdApprovalMarks14;
    EditText situtationMarks, situtationMarks2, situtationMarks3, situtationMarks4, situtationMarks5, situtationMarks6, situtationMarks7, situtationMarks8, situtationMarks9, situtationMarks10, situtationMarks11, situtationMarks12, situtationMarks13, situtationMarks14;
    EditText interviewMarks, interviewMarks2, interviewMarks3, interviewMarks4, interviewMarks5, interviewMarks6, interviewMarks7, interviewMarks8, interviewMarks9, interviewMarks10, interviewMarks11, interviewMarks12, interviewMarks13, interviewMarks14;
    Button getTotalButton, getTotalButton2, getTotalButton3, getTotalButton4, getTotalButton5, getTotalButton6, getTotalButton7, getTotalButton8, getTotalButton9, getTotalButton10, getTotalButton11, getTotalButton12, getTotalButton13, getTotalButton14;
    TextView totalTextView, totalTextView2, totalTextView3, totalTextView4, totalTextView5, totalTextView6, totalTextView7, totalTextView8, totalTextView9, totalTextView10, totalTextView11, totalTextView12, totalTextView13, totalTextView14;

    boolean flag1 = false;
    boolean flag2 = false;
    boolean flag3 = false;
    boolean flag4 = false;
    boolean flag5 = false;
    boolean flag6 = false;
    boolean flag7 = false;
    boolean flag8 = false;
    boolean flag9 = false;
    boolean flag10 = false;
    boolean flag11 = false;
    boolean flag12 = false;
    boolean flag13 = false;
    boolean flag14 = false;

    SharedPreferences sharedPreferences;

    public void initView()
    {
        bodyLanguageMarks = (EditText) findViewById(R.id.bodyLanguageMarks);
        bodyLanguageMarks2 = (EditText) findViewById(R.id.bodyLanguageMarks2);
        bodyLanguageMarks3 = (EditText) findViewById(R.id.bodyLanguageMarks3);
        bodyLanguageMarks4 = (EditText) findViewById(R.id.bodyLanguageMarks4);
        bodyLanguageMarks5 = (EditText) findViewById(R.id.bodyLanguageMarks5);
        bodyLanguageMarks6 = (EditText) findViewById(R.id.bodyLanguageMarks6);
        bodyLanguageMarks7 = (EditText) findViewById(R.id.bodyLanguageMarks7);
        bodyLanguageMarks8 = (EditText) findViewById(R.id.bodyLanguageMarks8);
        bodyLanguageMarks9 = (EditText) findViewById(R.id.bodyLanguageMarks9);
        bodyLanguageMarks10 = (EditText) findViewById(R.id.bodyLanguageMarks10);
        bodyLanguageMarks11 = (EditText) findViewById(R.id.bodyLanguageMarks11);
        bodyLanguageMarks12 = (EditText) findViewById(R.id.bodyLanguageMarks12);
        bodyLanguageMarks13 = (EditText) findViewById(R.id.bodyLanguageMarks13);
        bodyLanguageMarks14 = (EditText) findViewById(R.id.bodyLanguageMarks14);

        confidenceMarks = (EditText) findViewById(R.id.confidenceMarks);
        confidenceMarks2 = (EditText) findViewById(R.id.confidenceMarks2);
        confidenceMarks3 = (EditText) findViewById(R.id.confidenceMarks3);
        confidenceMarks4 = (EditText) findViewById(R.id.confidenceMarks4);
        confidenceMarks5 = (EditText) findViewById(R.id.confidenceMarks5);
        confidenceMarks6 = (EditText) findViewById(R.id.confidenceMarks6);
        confidenceMarks7 = (EditText) findViewById(R.id.confidenceMarks7);
        confidenceMarks8 = (EditText) findViewById(R.id.confidenceMarks8);
        confidenceMarks9 = (EditText) findViewById(R.id.confidenceMarks9);
        confidenceMarks10 = (EditText) findViewById(R.id.confidenceMarks10);
        confidenceMarks11 = (EditText) findViewById(R.id.confidenceMarks11);
        confidenceMarks12 = (EditText) findViewById(R.id.confidenceMarks12);
        confidenceMarks13 = (EditText) findViewById(R.id.confidenceMarks13);
        confidenceMarks14 = (EditText) findViewById(R.id.confidenceMarks14);

        crowdApprovalMarks = (EditText) findViewById(R.id.crowdApprovalMarks);
        crowdApprovalMarks2 = (EditText) findViewById(R.id.crowdApprovalMarks2);
        crowdApprovalMarks3 = (EditText) findViewById(R.id.crowdApprovalMarks3);
        crowdApprovalMarks4 = (EditText) findViewById(R.id.crowdApprovalMarks4);
        crowdApprovalMarks5 = (EditText) findViewById(R.id.crowdApprovalMarks5);
        crowdApprovalMarks6 = (EditText) findViewById(R.id.crowdApprovalMarks6);
        crowdApprovalMarks7 = (EditText) findViewById(R.id.crowdApprovalMarks7);
        crowdApprovalMarks8 = (EditText) findViewById(R.id.crowdApprovalMarks8);
        crowdApprovalMarks9 = (EditText) findViewById(R.id.crowdApprovalMarks9);
        crowdApprovalMarks10 = (EditText) findViewById(R.id.crowdApprovalMarks10);
        crowdApprovalMarks11 = (EditText) findViewById(R.id.crowdApprovalMarks11);
        crowdApprovalMarks12 = (EditText) findViewById(R.id.crowdApprovalMarks12);
        crowdApprovalMarks13 = (EditText) findViewById(R.id.crowdApprovalMarks13);
        crowdApprovalMarks14 = (EditText) findViewById(R.id.crowdApprovalMarks14);

        situtationMarks = (EditText) findViewById(R.id.situtationMarks);
        situtationMarks2 = (EditText) findViewById(R.id.situtationMarks2);
        situtationMarks3 = (EditText) findViewById(R.id.situtationMarks3);
        situtationMarks4 = (EditText) findViewById(R.id.situtationMarks4);
        situtationMarks5 = (EditText) findViewById(R.id.situtationMarks5);
        situtationMarks6 = (EditText) findViewById(R.id.situtationMarks6);
        situtationMarks7 = (EditText) findViewById(R.id.situtationMarks7);
        situtationMarks8 = (EditText) findViewById(R.id.situtationMarks8);
        situtationMarks9 = (EditText) findViewById(R.id.situtationMarks9);
        situtationMarks10 = (EditText) findViewById(R.id.situtationMarks10);
        situtationMarks11 = (EditText) findViewById(R.id.situtationMarks11);
        situtationMarks12 = (EditText) findViewById(R.id.situtationMarks12);
        situtationMarks13 = (EditText) findViewById(R.id.situtationMarks13);
        situtationMarks14 = (EditText) findViewById(R.id.situtationMarks14);

        interviewMarks = (EditText) findViewById(R.id.interviewMarks);
        interviewMarks2 = (EditText) findViewById(R.id.interviewMarks2);
        interviewMarks3 = (EditText) findViewById(R.id.interviewMarks3);
        interviewMarks4 = (EditText) findViewById(R.id.interviewMarks4);
        interviewMarks5 = (EditText) findViewById(R.id.interviewMarks5);
        interviewMarks6 = (EditText) findViewById(R.id.interviewMarks6);
        interviewMarks7 = (EditText) findViewById(R.id.interviewMarks7);
        interviewMarks8 = (EditText) findViewById(R.id.interviewMarks8);
        interviewMarks9 = (EditText) findViewById(R.id.interviewMarks9);
        interviewMarks10 = (EditText) findViewById(R.id.interviewMarks10);
        interviewMarks11 = (EditText) findViewById(R.id.interviewMarks11);
        interviewMarks12 = (EditText) findViewById(R.id.interviewMarks12);
        interviewMarks13 = (EditText) findViewById(R.id.interviewMarks13);
        interviewMarks14 = (EditText) findViewById(R.id.interviewMarks14);

        getTotalButton = (Button) findViewById(R.id.getTotalButton);
        getTotalButton2 = (Button) findViewById(R.id.getTotalButton2);
        getTotalButton3 = (Button) findViewById(R.id.getTotalButton3);
        getTotalButton4 = (Button) findViewById(R.id.getTotalButton4);
        getTotalButton5 = (Button) findViewById(R.id.getTotalButton5);
        getTotalButton6 = (Button) findViewById(R.id.getTotalButton6);
        getTotalButton7 = (Button) findViewById(R.id.getTotalButton7);
        getTotalButton8 = (Button) findViewById(R.id.getTotalButton8);
        getTotalButton9 = (Button) findViewById(R.id.getTotalButton9);
        getTotalButton10 = (Button) findViewById(R.id.getTotalButton10);
        getTotalButton11 = (Button) findViewById(R.id.getTotalButton11);
        getTotalButton12 = (Button) findViewById(R.id.getTotalButton12);
        getTotalButton13 = (Button) findViewById(R.id.getTotalButton13);
        getTotalButton14 = (Button) findViewById(R.id.getTotalButton14);

        totalTextView = (TextView) findViewById(R.id.totalTextView);
        totalTextView2 = (TextView) findViewById(R.id.totalTextView2);
        totalTextView3 = (TextView) findViewById(R.id.totalTextView3);
        totalTextView4 = (TextView) findViewById(R.id.totalTextView4);
        totalTextView5 = (TextView) findViewById(R.id.totalTextView5);
        totalTextView6 = (TextView) findViewById(R.id.totalTextView6);
        totalTextView7 = (TextView) findViewById(R.id.totalTextView7);
        totalTextView8 = (TextView) findViewById(R.id.totalTextView8);
        totalTextView9 = (TextView) findViewById(R.id.totalTextView9);
        totalTextView10 = (TextView) findViewById(R.id.totalTextView10);
        totalTextView11 = (TextView) findViewById(R.id.totalTextView11);
        totalTextView12 = (TextView) findViewById(R.id.totalTextView12);
        totalTextView13 = (TextView) findViewById(R.id.totalTextView13);
        totalTextView14 = (TextView) findViewById(R.id.totalTextView14);

        getTotalButton.setOnClickListener(this);
        getTotalButton2.setOnClickListener(this);
        getTotalButton3.setOnClickListener(this);
        getTotalButton4.setOnClickListener(this);
        getTotalButton5.setOnClickListener(this);
        getTotalButton6.setOnClickListener(this);
        getTotalButton7.setOnClickListener(this);
        getTotalButton8.setOnClickListener(this);
        getTotalButton9.setOnClickListener(this);
        getTotalButton10.setOnClickListener(this);
        getTotalButton11.setOnClickListener(this);
        getTotalButton12.setOnClickListener(this);
        getTotalButton13.setOnClickListener(this);
        getTotalButton14.setOnClickListener(this);

        sharedPreferences = getSharedPreferences("total_marks", Context.MODE_PRIVATE);

        float t1 = sharedPreferences.getFloat("total_1",0);
        float t2 = sharedPreferences.getFloat("total_2",0);
        float t3 = sharedPreferences.getFloat("total_3",0);
        float t4 = sharedPreferences.getFloat("total_4",0);
        float t5 = sharedPreferences.getFloat("total_5",0);
        float t6 = sharedPreferences.getFloat("total_6",0);
        float t7 = sharedPreferences.getFloat("total_7",0);
        float t8 = sharedPreferences.getFloat("total_8",0);
        float t9 = sharedPreferences.getFloat("total_9",0);
        float t10 = sharedPreferences.getFloat("total_10",0);
        float t11 = sharedPreferences.getFloat("total_11",0);
        float t12 = sharedPreferences.getFloat("total_12",0);
        float t13 = sharedPreferences.getFloat("total_13",0);
        float t14 = sharedPreferences.getFloat("total_14",0);

        totalTextView.setText(String.valueOf(t1));
        totalTextView2.setText(String.valueOf(t2));
        totalTextView3.setText(String.valueOf(t3));
        totalTextView4.setText(String.valueOf(t4));
        totalTextView5.setText(String.valueOf(t5));
        totalTextView6.setText(String.valueOf(t6));
        totalTextView7.setText(String.valueOf(t7));
        totalTextView8.setText(String.valueOf(t8));
        totalTextView9.setText(String.valueOf(t9));
        totalTextView10.setText(String.valueOf(t10));
        totalTextView11.setText(String.valueOf(t11));
        totalTextView12.setText(String.valueOf(t12));
        totalTextView13.setText(String.valueOf(t13));
        totalTextView14.setText(String.valueOf(t14));

        float b1 = sharedPreferences.getFloat("body_language_1", 0);
        float b2 = sharedPreferences.getFloat("body_language_2", 0);
        float b3 = sharedPreferences.getFloat("body_language_3", 0);
        float b4 = sharedPreferences.getFloat("body_language_4", 0);
        float b5 = sharedPreferences.getFloat("body_language_5", 0);
        float b6 = sharedPreferences.getFloat("body_language_6", 0);
        float b7 = sharedPreferences.getFloat("body_language_7", 0);
        float b8 = sharedPreferences.getFloat("body_language_8", 0);
        float b9 = sharedPreferences.getFloat("body_language_9", 0);
        float b10 = sharedPreferences.getFloat("body_language_10", 0);
        float b11 = sharedPreferences.getFloat("body_language_11", 0);
        float b12 = sharedPreferences.getFloat("body_language_12", 0);
        float b13 = sharedPreferences.getFloat("body_language_13", 0);
        float b14 = sharedPreferences.getFloat("body_language_14", 0);

        bodyLanguageMarks.setText(String.valueOf(b1).equals("0.0")?"":String.valueOf(b1));
        bodyLanguageMarks2.setText(String.valueOf(b2).equals("0.0")?"":String.valueOf(b2));
        bodyLanguageMarks3.setText(String.valueOf(b3).equals("0.0")?"":String.valueOf(b3));
        bodyLanguageMarks4.setText(String.valueOf(b4).equals("0.0")?"":String.valueOf(b4));
        bodyLanguageMarks5.setText(String.valueOf(b5).equals("0.0")?"":String.valueOf(b5));
        bodyLanguageMarks6.setText(String.valueOf(b6).equals("0.0")?"":String.valueOf(b6));
        bodyLanguageMarks7.setText(String.valueOf(b7).equals("0.0")?"":String.valueOf(b7));
        bodyLanguageMarks8.setText(String.valueOf(b8).equals("0.0")?"":String.valueOf(b8));
        bodyLanguageMarks9.setText(String.valueOf(b9).equals("0.0")?"":String.valueOf(b9));
        bodyLanguageMarks10.setText(String.valueOf(b10).equals("0.0")?"":String.valueOf(b10));
        bodyLanguageMarks11.setText(String.valueOf(b11).equals("0.0")?"":String.valueOf(b11));
        bodyLanguageMarks12.setText(String.valueOf(b12).equals("0.0")?"":String.valueOf(b12));
        bodyLanguageMarks13.setText(String.valueOf(b13).equals("0.0")?"":String.valueOf(b13));
        bodyLanguageMarks14.setText(String.valueOf(b14).equals("0.0")?"":String.valueOf(b14));

        float c1 = sharedPreferences.getFloat("confidence_1", 0);
        float c2 = sharedPreferences.getFloat("confidence_2", 0);
        float c3 = sharedPreferences.getFloat("confidence_3", 0);
        float c4 = sharedPreferences.getFloat("confidence_4", 0);
        float c5 = sharedPreferences.getFloat("confidence_5", 0);
        float c6 = sharedPreferences.getFloat("confidence_6", 0);
        float c7 = sharedPreferences.getFloat("confidence_7", 0);
        float c8 = sharedPreferences.getFloat("confidence_8", 0);
        float c9 = sharedPreferences.getFloat("confidence_9", 0);
        float c10 = sharedPreferences.getFloat("confidence_10", 0);
        float c11 = sharedPreferences.getFloat("confidence_11", 0);
        float c12 = sharedPreferences.getFloat("confidence_12", 0);
        float c13 = sharedPreferences.getFloat("confidence_13", 0);
        float c14 = sharedPreferences.getFloat("confidence_14", 0);

        confidenceMarks.setText(String.valueOf(c1).equals("0.0")?"":String.valueOf(c1));
        confidenceMarks2.setText(String.valueOf(c2).equals("0.0")?"":String.valueOf(c2));
        confidenceMarks3.setText(String.valueOf(c3).equals("0.0")?"":String.valueOf(c3));
        confidenceMarks4.setText(String.valueOf(c4).equals("0.0")?"":String.valueOf(c4));
        confidenceMarks5.setText(String.valueOf(c5).equals("0.0")?"":String.valueOf(c5));
        confidenceMarks6.setText(String.valueOf(c5).equals("0.0")?"":String.valueOf(c6));
        confidenceMarks7.setText(String.valueOf(c7).equals("0.0")?"":String.valueOf(c7));
        confidenceMarks8.setText(String.valueOf(c8).equals("0.0")?"":String.valueOf(c8));
        confidenceMarks9.setText(String.valueOf(c9).equals("0.0")?"":String.valueOf(c9));
        confidenceMarks10.setText(String.valueOf(c10).equals("0.0")?"":String.valueOf(c10));
        confidenceMarks11.setText(String.valueOf(c11).equals("0.0")?"":String.valueOf(c11));
        confidenceMarks12.setText(String.valueOf(c12).equals("0.0")?"":String.valueOf(c12));
        confidenceMarks13.setText(String.valueOf(c13).equals("0.0")?"":String.valueOf(c13));
        confidenceMarks14.setText(String.valueOf(c14).equals("0.0")?"":String.valueOf(c14));

        float ca1 = sharedPreferences.getFloat("crowd_approval_1", 0);
        float ca2 = sharedPreferences.getFloat("crowd_approval_2", 0);
        float ca3 = sharedPreferences.getFloat("crowd_approval_3", 0);
        float ca4 = sharedPreferences.getFloat("crowd_approval_4", 0);
        float ca5 = sharedPreferences.getFloat("crowd_approval_5", 0);
        float ca6 = sharedPreferences.getFloat("crowd_approval_6", 0);
        float ca7 = sharedPreferences.getFloat("crowd_approval_7", 0);
        float ca8 = sharedPreferences.getFloat("crowd_approval_8", 0);
        float ca9 = sharedPreferences.getFloat("crowd_approval_9", 0);
        float ca10 = sharedPreferences.getFloat("crowd_approval_10", 0);
        float ca11 = sharedPreferences.getFloat("crowd_approval_11", 0);
        float ca12 = sharedPreferences.getFloat("crowd_approval_12", 0);
        float ca13 = sharedPreferences.getFloat("crowd_approval_13", 0);
        float ca14 = sharedPreferences.getFloat("crowd_approval_14", 0);

        crowdApprovalMarks.setText(String.valueOf(ca1).equals("0.0")?"":String.valueOf(ca1));
        crowdApprovalMarks2.setText(String.valueOf(ca2).equals("0.0")?"":String.valueOf(ca2));
        crowdApprovalMarks3.setText(String.valueOf(ca3).equals("0.0")?"":String.valueOf(ca3));
        crowdApprovalMarks4.setText(String.valueOf(ca4).equals("0.0")?"":String.valueOf(ca4));
        crowdApprovalMarks5.setText(String.valueOf(ca5).equals("0.0")?"":String.valueOf(ca5));
        crowdApprovalMarks6.setText(String.valueOf(ca6).equals("0.0")?"":String.valueOf(ca6));
        crowdApprovalMarks7.setText(String.valueOf(ca7).equals("0.0")?"":String.valueOf(ca7));
        crowdApprovalMarks8.setText(String.valueOf(ca8).equals("0.0")?"":String.valueOf(ca8));
        crowdApprovalMarks9.setText(String.valueOf(ca9).equals("0.0")?"":String.valueOf(ca9));
        crowdApprovalMarks10.setText(String.valueOf(ca10).equals("0.0")?"":String.valueOf(ca10));
        crowdApprovalMarks11.setText(String.valueOf(ca11).equals("0.0")?"":String.valueOf(ca11));
        crowdApprovalMarks12.setText(String.valueOf(ca12).equals("0.0")?"":String.valueOf(ca12));
        crowdApprovalMarks13.setText(String.valueOf(ca13).equals("0.0")?"":String.valueOf(ca13));
        crowdApprovalMarks14.setText(String.valueOf(ca14).equals("0.0")?"":String.valueOf(ca14));

        float s1 = sharedPreferences.getFloat("situtation_1",0);
        float s2 = sharedPreferences.getFloat("situtation_2",0);
        float s3 = sharedPreferences.getFloat("situtation_3",0);
        float s4 = sharedPreferences.getFloat("situtation_4",0);
        float s5 = sharedPreferences.getFloat("situtation_5",0);
        float s6 = sharedPreferences.getFloat("situtation_6",0);
        float s7 = sharedPreferences.getFloat("situtation_7",0);
        float s8 = sharedPreferences.getFloat("situtation_8",0);
        float s9 = sharedPreferences.getFloat("situtation_9",0);
        float s10 = sharedPreferences.getFloat("situtation_10",0);
        float s11 = sharedPreferences.getFloat("situtation_11",0);
        float s12 = sharedPreferences.getFloat("situtation_12",0);
        float s13 = sharedPreferences.getFloat("situtation_13",0);
        float s14 = sharedPreferences.getFloat("situtation_14",0);

        situtationMarks.setText(String.valueOf(s1).equals("0.0")?"":String.valueOf(s1));
        situtationMarks2.setText(String.valueOf(s2).equals("0.0")?"":String.valueOf(s2));
        situtationMarks3.setText(String.valueOf(s3).equals("0.0")?"":String.valueOf(s3));
        situtationMarks4.setText(String.valueOf(s4).equals("0.0")?"":String.valueOf(s4));
        situtationMarks5.setText(String.valueOf(s5).equals("0.0")?"":String.valueOf(s5));
        situtationMarks6.setText(String.valueOf(s6).equals("0.0")?"":String.valueOf(s6));
        situtationMarks7.setText(String.valueOf(s7).equals("0.0")?"":String.valueOf(s7));
        situtationMarks8.setText(String.valueOf(s8).equals("0.0")?"":String.valueOf(s8));
        situtationMarks9.setText(String.valueOf(s9).equals("0.0")?"":String.valueOf(s9));
        situtationMarks10.setText(String.valueOf(s10).equals("0.0")?"":String.valueOf(s10));
        situtationMarks11.setText(String.valueOf(s11).equals("0.0")?"":String.valueOf(s11));
        situtationMarks12.setText(String.valueOf(s12).equals("0.0")?"":String.valueOf(s12));
        situtationMarks13.setText(String.valueOf(s13).equals("0.0")?"":String.valueOf(s13));
        situtationMarks14.setText(String.valueOf(s14).equals("0.0")?"":String.valueOf(s14));

        float i1 = sharedPreferences.getFloat("interview_1", 0);
        float i2 = sharedPreferences.getFloat("interview_2", 0);
        float i3 = sharedPreferences.getFloat("interview_3", 0);
        float i4 = sharedPreferences.getFloat("interview_4", 0);
        float i5 = sharedPreferences.getFloat("interview_5", 0);
        float i6 = sharedPreferences.getFloat("interview_6", 0);
        float i7 = sharedPreferences.getFloat("interview_7", 0);
        float i8 = sharedPreferences.getFloat("interview_8", 0);
        float i9 = sharedPreferences.getFloat("interview_9", 0);
        float i10 = sharedPreferences.getFloat("interview_10", 0);
        float i11 = sharedPreferences.getFloat("interview_11", 0);
        float i12 = sharedPreferences.getFloat("interview_12", 0);
        float i13 = sharedPreferences.getFloat("interview_13", 0);
        float i14 = sharedPreferences.getFloat("interview_14", 0);

        interviewMarks.setText(String.valueOf(i1).equals("0.0")?"":String.valueOf(i1));
        interviewMarks2.setText(String.valueOf(i2).equals("0.0")?"":String.valueOf(i2));
        interviewMarks3.setText(String.valueOf(i3).equals("0.0")?"":String.valueOf(i3));
        interviewMarks4.setText(String.valueOf(i4).equals("0.0")?"":String.valueOf(i4));
        interviewMarks5.setText(String.valueOf(i5).equals("0.0")?"":String.valueOf(i5));
        interviewMarks6.setText(String.valueOf(i6).equals("0.0")?"":String.valueOf(i6));
        interviewMarks7.setText(String.valueOf(i7).equals("0.0")?"":String.valueOf(i7));
        interviewMarks8.setText(String.valueOf(i8).equals("0.0")?"":String.valueOf(i8));
        interviewMarks9.setText(String.valueOf(i9).equals("0.0")?"":String.valueOf(i9));
        interviewMarks10.setText(String.valueOf(i10).equals("0.0")?"":String.valueOf(i10));
        interviewMarks11.setText(String.valueOf(i11).equals("0.0")?"":String.valueOf(i11));
        interviewMarks12.setText(String.valueOf(i12).equals("0.0")?"":String.valueOf(i12));
        interviewMarks13.setText(String.valueOf(i13).equals("0.0")?"":String.valueOf(i13));
        interviewMarks14.setText(String.valueOf(i14).equals("0.0")?"":String.valueOf(i14));

    }

    private String CONSTANT_DETAILS[] = new String[]{"Contestant Number 1", "Contestant Number 2", "Contestant Number 3", "Contestant Number 4", "Contestant Number 5", "Contestant Number 6", "Contestant Number 7", "Contestant Number 8", "Contestant Number 9", "Contestant Number 10","Contestant Number 11","Contestant Number 12","Contestant Number 13","Contestant Number 14"};

    Spinner spinner;
    public void initSpinner()
    {
        spinner  = (Spinner) findViewById(R.id.spinner);
        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_dropdown_item);
        arrayAdapter.addAll(CONSTANT_DETAILS);
        spinner.setAdapter(arrayAdapter);

        spinner.setOnItemSelectedListener(this);
    }

    private LinearLayout contestant1LinearLayout;
    private LinearLayout contestant2LinearLayout;
    private LinearLayout contestant3LinearLayout;
    private LinearLayout contestant4LinearLayout;
    private LinearLayout contestant5LinearLayout;
    private LinearLayout contestant6LinearLayout;
    private LinearLayout contestant7LinearLayout;
    private LinearLayout contestant8LinearLayout;
    private LinearLayout contestant9LinearLayout;
    private LinearLayout contestant10LinearLayout;
    private LinearLayout contestant11LinearLayout;
    private LinearLayout contestant12LinearLayout;
    private LinearLayout contestant13LinearLayout;
    private LinearLayout contestant14LinearLayout;

    public void initLinearLayouts()
    {
        contestant1LinearLayout = (LinearLayout) findViewById(R.id.contestant1LinearLayout);
        contestant2LinearLayout = (LinearLayout) findViewById(R.id.contestant2LinearLayout);
        contestant3LinearLayout = (LinearLayout) findViewById(R.id.contestant3LinearLayout);
        contestant4LinearLayout = (LinearLayout) findViewById(R.id.contestant4LinearLayout);
        contestant5LinearLayout = (LinearLayout) findViewById(R.id.contestant5LinearLayout);
        contestant6LinearLayout = (LinearLayout) findViewById(R.id.contestant6LinearLayout);
        contestant7LinearLayout = (LinearLayout) findViewById(R.id.contestant7LinearLayout);
        contestant8LinearLayout = (LinearLayout) findViewById(R.id.contestant8LinearLayout);
        contestant9LinearLayout = (LinearLayout) findViewById(R.id.contestant9LinearLayout);
        contestant10LinearLayout = (LinearLayout) findViewById(R.id.contestant10LinearLayout);
        contestant11LinearLayout = (LinearLayout) findViewById(R.id.contestant11LinearLayout);
        contestant12LinearLayout = (LinearLayout) findViewById(R.id.contestant12LinearLayout);
        contestant13LinearLayout = (LinearLayout) findViewById(R.id.contestant13LinearLayout);
        contestant14LinearLayout = (LinearLayout) findViewById(R.id.contestant14LinearLayout);
    }

    public void setRealtimeDatabaseInfo()
    {
        loginPreference = getSharedPreferences("login_info", Context.MODE_PRIVATE);
        judgeEmail = loginPreference.getString("e_o_j", "");
        strJudgeEmail = judgeEmail.substring(0,7);

        myRootRef = FirebaseDatabase.getInstance().getReference();

        myChildRootRef = myRootRef.child(strJudgeEmail);
    }


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        toolbar.setNavigationIcon(R.drawable.cresendoicon);
        setSupportActionBar(toolbar);
        initSpinner();
        initView();
        initLinearLayouts();
        setRealtimeDatabaseInfo();

        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Welcome to Crescendo 16", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });

        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(
                this, drawer, toolbar, R.string.navigation_drawer_open, R.string.navigation_drawer_close);
        drawer.setDrawerListener(toggle);
        toggle.syncState();

        NavigationView navigationView = (NavigationView) findViewById(R.id.nav_view);
        navigationView.setNavigationItemSelectedListener(this);
    }

    @Override
    public void onBackPressed() {
        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        if (drawer.isDrawerOpen(GravityCompat.START)) {
            drawer.closeDrawer(GravityCompat.START);
        } else {
            super.onBackPressed();
        }
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {

            Toast.makeText(this, "You Selected Settings", Toast.LENGTH_LONG).show();
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    @SuppressWarnings("StatementWithEmptyBody")
    @Override
    public boolean onNavigationItemSelected(MenuItem item) {
        // Handle navigation view item clicks here.
        int id = item.getItemId();

        if (id == R.id.about_event) {
            // Handle the camera action
            Toast.makeText(this, "About the Event", Toast.LENGTH_LONG).show();
        } else if(id == R.id.store_data_into_file) {

            // function is after onClick method
            storeDataUsingSharedPreference();

        } else if (id == R.id.developer) {

            Toast.makeText(this, "Developed by Amit Upadhyay", Toast.LENGTH_LONG).show();

        } else if (id == R.id.participant_marks) {
            Toast.makeText(this, "Marks of Participant", Toast.LENGTH_LONG).show();

            Intent intent = new Intent(MainActivity.this, ShowTotal.class);
            startActivity(intent);

        } else if (id == R.id.nav_share) {

            Toast.makeText(this, "Share it", Toast.LENGTH_LONG).show();

        } else if (id == R.id.nav_send) {

            Toast.makeText(this, "Send it", Toast.LENGTH_LONG).show();
        }

        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        drawer.closeDrawer(GravityCompat.START);
        return true;
    }

    @Override
    public void onClick(View view) {

        switch (view.getId())
        {
            case R.id.getTotalButton:
            {
                String blm = bodyLanguageMarks.getText().toString().trim();
                String cm = confidenceMarks.getText().toString().trim();
                String cam = crowdApprovalMarks.getText().toString().trim();
                String sm = situtationMarks.getText().toString().trim();
                String im = interviewMarks.getText().toString().trim();

                if(blm.equals("") || cm.equals("") || cam.equals("") || sm.equals("")|| im.equals(""))
                {
                    Toast.makeText(MainActivity.this, "Fill Completely", Toast.LENGTH_LONG).show();
                    return;
                }

                float b = Float.parseFloat(blm);
                float c = Float.parseFloat(cm);
                float ca = Float.parseFloat(cam);
                float s = Float.parseFloat(sm);
                float i = Float.parseFloat(im);


                if(b >10)
                {
                    Toast.makeText(MainActivity.this, "Body Language Marks can't exceed '10' ", Toast.LENGTH_LONG).show();
                    bodyLanguageMarks.setText("");
                    bodyLanguageMarks.requestFocus();
                    return;
                }
                else if (c > 10)
                {
                    Toast.makeText(MainActivity.this, "Confidence Marks can't exceed '10' ", Toast.LENGTH_LONG).show();
                    confidenceMarks.setText("");
                    confidenceMarks.requestFocus();
                    return;
                }
                else if (ca > 10)
                {
                    Toast.makeText(MainActivity.this, "Crowd Approval Marks can't exceed '10' ", Toast.LENGTH_LONG).show();
                    crowdApprovalMarks.setText("");
                    crowdApprovalMarks.requestFocus();
                    return;
                }
                else if (s > 10)
                {
                    Toast.makeText(MainActivity.this, "Situtaion Marks can't exceed '10' ", Toast.LENGTH_LONG).show();
                    situtationMarks.setText("");
                    situtationMarks.requestFocus();
                    return;
                }
                else if (i > 10)
                {
                    Toast.makeText(MainActivity.this, "Interview Marks can't exceed '10' ", Toast.LENGTH_LONG).show();
                    interviewMarks.setText("");
                    interviewMarks.requestFocus();
                    return;
                }

                float sum = b+c+ca+s+i;   // total sum

                totalTextView.setText(String.valueOf(sum));
                flag1 = true;

                sharedPreferences.edit().putFloat("total_1", sum).apply();

                sharedPreferences.edit().putFloat("body_language_1", b).apply();
                sharedPreferences.edit().putFloat("confidence_1", c).apply();
                sharedPreferences.edit().putFloat("crowd_approval_1", ca).apply();
                sharedPreferences.edit().putFloat("situtation_1", s).apply();
                sharedPreferences.edit().putFloat("interview_1", i).apply();

                Toast.makeText(this, judgeEmail, Toast.LENGTH_LONG).show();




                myGrandChildRootRef1 = myChildRootRef.child("Contestant 01 marks");
                myGrandChildRootRef1.setValue(sum);

            }
            break;
            case R.id.getTotalButton2:
            {
                String blm = bodyLanguageMarks2.getText().toString().trim();
                String cm = confidenceMarks2.getText().toString().trim();
                String cam = crowdApprovalMarks2.getText().toString().trim();
                String sm = situtationMarks2.getText().toString().trim();
                String im = interviewMarks2.getText().toString().trim();

                if(blm.equals("") || cm.equals("") || cam.equals("") || sm.equals("")|| im.equals(""))
                {
                    Toast.makeText(MainActivity.this, "Fill Completely", Toast.LENGTH_LONG).show();
                    return;
                }

                float b = Float.parseFloat(blm);
                float c = Float.parseFloat(cm);
                float ca = Float.parseFloat(cam);
                float s = Float.parseFloat(sm);
                float i = Float.parseFloat(im);

                if(b >10)
                {
                    Toast.makeText(MainActivity.this, "Body Language Marks can't exceed '10' ", Toast.LENGTH_LONG).show();
                    bodyLanguageMarks2.setText("");
                    bodyLanguageMarks2.requestFocus();
                    return;
                }
                else if (c > 10)
                {
                    Toast.makeText(MainActivity.this, "Confidence Marks can't exceed '10' ", Toast.LENGTH_LONG).show();
                    confidenceMarks2.setText("");
                    confidenceMarks2.requestFocus();
                    return;
                }
                else if (ca > 10)
                {
                    Toast.makeText(MainActivity.this, "Crowd Approval Marks can't exceed '10' ", Toast.LENGTH_LONG).show();
                    crowdApprovalMarks2.setText("");
                    crowdApprovalMarks2.requestFocus();
                    return;
                }
                else if (s > 10)
                {
                    Toast.makeText(MainActivity.this, "Situtaion Marks can't exceed '10' ", Toast.LENGTH_LONG).show();
                    situtationMarks2.setText("");
                    situtationMarks2.requestFocus();
                    return;
                }
                else if (i > 10)
                {
                    Toast.makeText(MainActivity.this, "Interview Marks can't exceed '10' ", Toast.LENGTH_LONG).show();
                    interviewMarks2.setText("");
                    interviewMarks2.requestFocus();
                    return;
                }

                float sum = b+c+ca+s+i;   // total sum

                totalTextView2.setText(String.valueOf(sum));
                flag2 = true;

                sharedPreferences.edit().putFloat("total_2", sum).apply();

                sharedPreferences.edit().putFloat("body_language_2", b).apply();
                sharedPreferences.edit().putFloat("confidence_2", c).apply();
                sharedPreferences.edit().putFloat("crowd_approval_2", ca).apply();
                sharedPreferences.edit().putFloat("situtation_2", s).apply();
                sharedPreferences.edit().putFloat("interview_2", i).apply();

                myGrandChildRootRef2 = myChildRootRef.child("Contestant 02 marks");
                myGrandChildRootRef2.setValue(sum);

            }
            break;
            case R.id.getTotalButton3:
            {
                String blm = bodyLanguageMarks3.getText().toString().trim();
                String cm = confidenceMarks3.getText().toString().trim();
                String cam = crowdApprovalMarks3.getText().toString().trim();
                String sm = situtationMarks3.getText().toString().trim();
                String im = interviewMarks3.getText().toString().trim();

                if(blm.equals("") || cm.equals("") || cam.equals("") || sm.equals("")|| im.equals(""))
                {
                    Toast.makeText(MainActivity.this, "Fill Completely", Toast.LENGTH_LONG).show();
                    return;
                }

                float b = Float.parseFloat(blm);
                float c = Float.parseFloat(cm);
                float ca = Float.parseFloat(cam);
                float s = Float.parseFloat(sm);
                float i = Float.parseFloat(im);

                if(b >10)
                {
                    Toast.makeText(MainActivity.this, "Body Language Marks can't exceed '10' ", Toast.LENGTH_LONG).show();
                    bodyLanguageMarks3.setText("");
                    bodyLanguageMarks3.requestFocus();
                    return;
                }
                else if (c > 10)
                {
                    Toast.makeText(MainActivity.this, "Confidence Marks can't exceed '10' ", Toast.LENGTH_LONG).show();
                    confidenceMarks3.setText("");
                    confidenceMarks3.requestFocus();
                    return;
                }
                else if (ca > 10)
                {
                    Toast.makeText(MainActivity.this, "Crowd Approval Marks can't exceed '10' ", Toast.LENGTH_LONG).show();
                    crowdApprovalMarks3.setText("");
                    crowdApprovalMarks3.requestFocus();
                    return;
                }
                else if (s > 10)
                {
                    Toast.makeText(MainActivity.this, "Situtaion Marks can't exceed '10' ", Toast.LENGTH_LONG).show();
                    situtationMarks3.setText("");
                    situtationMarks3.requestFocus();
                    return;
                }
                else if (i > 10)
                {
                    Toast.makeText(MainActivity.this, "Interview Marks can't exceed '10' ", Toast.LENGTH_LONG).show();
                    interviewMarks3.setText("");
                    interviewMarks3.requestFocus();
                    return;
                }

                float sum = b+c+ca+s+i;   // total sum

                totalTextView3.setText(String.valueOf(sum));
                flag3 = true;

                sharedPreferences.edit().putFloat("total_3", sum).apply();

                sharedPreferences.edit().putFloat("body_language_3", b).apply();
                sharedPreferences.edit().putFloat("confidence_3", c).apply();
                sharedPreferences.edit().putFloat("crowd_approval_3", ca).apply();
                sharedPreferences.edit().putFloat("situtation_3", s).apply();
                sharedPreferences.edit().putFloat("interview_3", i).apply();

                myGrandChildRootRef3 = myChildRootRef.child("Contestant 03 marks");
                myGrandChildRootRef3.setValue(sum);

            }
            break;
            case R.id.getTotalButton4:
            {
                String blm = bodyLanguageMarks4.getText().toString().trim();
                String cm = confidenceMarks4.getText().toString().trim();
                String cam = crowdApprovalMarks4.getText().toString().trim();
                String sm = situtationMarks4.getText().toString().trim();
                String im = interviewMarks4.getText().toString().trim();

                if(blm.equals("") || cm.equals("") || cam.equals("") || sm.equals("")|| im.equals(""))
                {
                    Toast.makeText(MainActivity.this, "Fill Completely", Toast.LENGTH_LONG).show();
                    return;
                }

                float b = Float.parseFloat(blm);
                float c = Float.parseFloat(cm);
                float ca = Float.parseFloat(cam);
                float s = Float.parseFloat(sm);
                float i = Float.parseFloat(im);

                if(b >10)
                {
                    Toast.makeText(MainActivity.this, "Body Language Marks can't exceed '10' ", Toast.LENGTH_LONG).show();
                    bodyLanguageMarks4.setText("");
                    bodyLanguageMarks4.requestFocus();
                    return;
                }
                else if (c > 10)
                {
                    Toast.makeText(MainActivity.this, "Confidence Marks can't exceed '10' ", Toast.LENGTH_LONG).show();
                    confidenceMarks4.setText("");
                    confidenceMarks4.requestFocus();
                    return;
                }
                else if (ca > 10)
                {
                    Toast.makeText(MainActivity.this, "Crowd Approval Marks can't exceed '10' ", Toast.LENGTH_LONG).show();
                    crowdApprovalMarks4.setText("");
                    crowdApprovalMarks4.requestFocus();
                    return;
                }
                else if (s > 10)
                {
                    Toast.makeText(MainActivity.this, "Situtaion Marks can't exceed '10' ", Toast.LENGTH_LONG).show();
                    situtationMarks4.setText("");
                    situtationMarks4.requestFocus();
                    return;
                }
                else if (i > 10)
                {
                    Toast.makeText(MainActivity.this, "Interview Marks can't exceed '10' ", Toast.LENGTH_LONG).show();
                    interviewMarks4.setText("");
                    interviewMarks4.requestFocus();
                    return;
                }

                float sum = b+c+ca+s+i;   // total sum

                totalTextView4.setText(String.valueOf(sum));
                flag4 = true;

                sharedPreferences.edit().putFloat("total_4", sum).apply();

                sharedPreferences.edit().putFloat("body_language_4", b).apply();
                sharedPreferences.edit().putFloat("confidence_4", c).apply();
                sharedPreferences.edit().putFloat("crowd_approval_4", ca).apply();
                sharedPreferences.edit().putFloat("situtation_4", s).apply();
                sharedPreferences.edit().putFloat("interview_4", i).apply();

                myGrandChildRootRef4 = myChildRootRef.child("Contestant 04 marks");
                myGrandChildRootRef4.setValue(sum);

            }
            break;
            case R.id.getTotalButton5:
            {
                String blm = bodyLanguageMarks5.getText().toString().trim();
                String cm = confidenceMarks5.getText().toString().trim();
                String cam = crowdApprovalMarks5.getText().toString().trim();
                String sm = situtationMarks5.getText().toString().trim();
                String im = interviewMarks5.getText().toString().trim();

                if(blm.equals("") || cm.equals("") || cam.equals("") || sm.equals("")|| im.equals(""))
                {
                    Toast.makeText(MainActivity.this, "Fill Completely", Toast.LENGTH_LONG).show();
                    return;
                }

                float b = Float.parseFloat(blm);
                float c = Float.parseFloat(cm);
                float ca = Float.parseFloat(cam);
                float s = Float.parseFloat(sm);
                float i = Float.parseFloat(im);

                if(b >10)
                {
                    Toast.makeText(MainActivity.this, "Body Language Marks can't exceed '10' ", Toast.LENGTH_LONG).show();
                    bodyLanguageMarks5.setText("");
                    bodyLanguageMarks5.requestFocus();
                    return;
                }
                else if (c > 10)
                {
                    Toast.makeText(MainActivity.this, "Confidence Marks can't exceed '10' ", Toast.LENGTH_LONG).show();
                    confidenceMarks5.setText("");
                    confidenceMarks5.requestFocus();
                    return;
                }
                else if (ca > 10)
                {
                    Toast.makeText(MainActivity.this, "Crowd Approval Marks can't exceed '10' ", Toast.LENGTH_LONG).show();
                    crowdApprovalMarks5.setText("");
                    crowdApprovalMarks5.requestFocus();
                    return;
                }
                else if (s > 10)
                {
                    Toast.makeText(MainActivity.this, "Situtaion Marks can't exceed '10' ", Toast.LENGTH_LONG).show();
                    situtationMarks5.setText("");
                    situtationMarks5.requestFocus();
                    return;
                }
                else if (i > 10)
                {
                    Toast.makeText(MainActivity.this, "Interview Marks can't exceed '10' ", Toast.LENGTH_LONG).show();
                    interviewMarks5.setText("");
                    interviewMarks5.requestFocus();
                    return;
                }

                float sum = b+c+ca+s+i;   // total sum

                totalTextView5.setText(String.valueOf(sum));
                flag5 = true;

                sharedPreferences.edit().putFloat("total_5", sum).apply();

                sharedPreferences.edit().putFloat("body_language_5", b).apply();
                sharedPreferences.edit().putFloat("confidence_5", c).apply();
                sharedPreferences.edit().putFloat("crowd_approval_5", ca).apply();
                sharedPreferences.edit().putFloat("situtation_5", s).apply();
                sharedPreferences.edit().putFloat("interview_5", i).apply();

                myGrandChildRootRef5 = myChildRootRef.child("Contestant 05 marks");
                myGrandChildRootRef5.setValue(sum);

            }
            break;
            case R.id.getTotalButton6:
            {
                String blm = bodyLanguageMarks6.getText().toString().trim();
                String cm = confidenceMarks6.getText().toString().trim();
                String cam = crowdApprovalMarks6.getText().toString().trim();
                String sm = situtationMarks6.getText().toString().trim();
                String im = interviewMarks6.getText().toString().trim();

                if(blm.equals("") || cm.equals("") || cam.equals("") || sm.equals("")|| im.equals(""))
                {
                    Toast.makeText(MainActivity.this, "Fill Completely", Toast.LENGTH_LONG).show();
                    return;
                }

                float b = Float.parseFloat(blm);
                float c = Float.parseFloat(cm);
                float ca = Float.parseFloat(cam);
                float s = Float.parseFloat(sm);
                float i = Float.parseFloat(im);

                if(b >10)
                {
                    Toast.makeText(MainActivity.this, "Body Language Marks can't exceed '10' ", Toast.LENGTH_LONG).show();
                    bodyLanguageMarks6.setText("");
                    bodyLanguageMarks6.requestFocus();
                    return;
                }
                else if (c > 10)
                {
                    Toast.makeText(MainActivity.this, "Confidence Marks can't exceed '10' ", Toast.LENGTH_LONG).show();
                    confidenceMarks6.setText("");
                    confidenceMarks6.requestFocus();
                    return;
                }
                else if (ca > 10)
                {
                    Toast.makeText(MainActivity.this, "Crowd Approval Marks can't exceed '10' ", Toast.LENGTH_LONG).show();
                    crowdApprovalMarks6.setText("");
                    crowdApprovalMarks6.requestFocus();
                    return;
                }
                else if (s > 10)
                {
                    Toast.makeText(MainActivity.this, "Situtaion Marks can't exceed '10' ", Toast.LENGTH_LONG).show();
                    situtationMarks6.setText("");
                    situtationMarks6.requestFocus();
                    return;
                }
                else if (i > 10)
                {
                    Toast.makeText(MainActivity.this, "Interview Marks can't exceed '10' ", Toast.LENGTH_LONG).show();
                    interviewMarks6.setText("");
                    interviewMarks6.requestFocus();
                    return;
                }

                float sum = b+c+ca+s+i;   // total sum

                totalTextView6.setText(String.valueOf(sum));
                flag6 = true;

                sharedPreferences.edit().putFloat("total_6", sum).apply();

                sharedPreferences.edit().putFloat("body_language_6", b).apply();
                sharedPreferences.edit().putFloat("confidence_6", c).apply();
                sharedPreferences.edit().putFloat("crowd_approval_6", ca).apply();
                sharedPreferences.edit().putFloat("situtation_6", s).apply();
                sharedPreferences.edit().putFloat("interview_6", i).apply();

                myGrandChildRootRef6 = myChildRootRef.child("Contestant 06 marks");
                myGrandChildRootRef6.setValue(sum);

            }
            break;
            case R.id.getTotalButton7:
            {
                String blm = bodyLanguageMarks7.getText().toString().trim();
                String cm = confidenceMarks7.getText().toString().trim();
                String cam = crowdApprovalMarks7.getText().toString().trim();
                String sm = situtationMarks7.getText().toString().trim();
                String im = interviewMarks7.getText().toString().trim();

                if(blm.equals("") || cm.equals("") || cam.equals("") || sm.equals("")|| im.equals(""))
                {
                    Toast.makeText(MainActivity.this, "Fill Completely", Toast.LENGTH_LONG).show();
                    return;
                }

                float b = Float.parseFloat(blm);
                float c = Float.parseFloat(cm);
                float ca = Float.parseFloat(cam);
                float s = Float.parseFloat(sm);
                float i = Float.parseFloat(im);

                if(b >10)
                {
                    Toast.makeText(MainActivity.this, "Body Language Marks can't exceed '10' ", Toast.LENGTH_LONG).show();
                    bodyLanguageMarks7.setText("");
                    bodyLanguageMarks7.requestFocus();
                    return;
                }
                else if (c > 10)
                {
                    Toast.makeText(MainActivity.this, "Confidence Marks can't exceed '10' ", Toast.LENGTH_LONG).show();
                    confidenceMarks7.setText("");
                    confidenceMarks7.requestFocus();
                    return;
                }
                else if (ca > 10)
                {
                    Toast.makeText(MainActivity.this, "Crowd Approval Marks can't exceed '10' ", Toast.LENGTH_LONG).show();
                    crowdApprovalMarks7.setText("");
                    crowdApprovalMarks7.requestFocus();
                    return;
                }
                else if (s > 10)
                {
                    Toast.makeText(MainActivity.this, "Situtaion Marks can't exceed '10' ", Toast.LENGTH_LONG).show();
                    situtationMarks7.setText("");
                    situtationMarks7.requestFocus();
                    return;
                }
                else if (i > 10)
                {
                    Toast.makeText(MainActivity.this, "Interview Marks can't exceed '10' ", Toast.LENGTH_LONG).show();
                    interviewMarks7.setText("");
                    interviewMarks7.requestFocus();
                    return;
                }

                float sum = b+c+ca+s+i;   // total sum

                totalTextView7.setText(String.valueOf(sum));
                flag7 = true;

                sharedPreferences.edit().putFloat("total_7", sum).apply();

                sharedPreferences.edit().putFloat("body_language_7", b).apply();
                sharedPreferences.edit().putFloat("confidence_7", c).apply();
                sharedPreferences.edit().putFloat("crowd_approval_7", ca).apply();
                sharedPreferences.edit().putFloat("situtation_7", s).apply();
                sharedPreferences.edit().putFloat("interview_7", i).apply();

                myGrandChildRootRef7 = myChildRootRef.child("Contestant 07 marks");
                myGrandChildRootRef7.setValue(sum);


            }
            break;
            case R.id.getTotalButton8:
            {
                String blm = bodyLanguageMarks8.getText().toString().trim();
                String cm = confidenceMarks8.getText().toString().trim();
                String cam = crowdApprovalMarks8.getText().toString().trim();
                String sm = situtationMarks8.getText().toString().trim();
                String im = interviewMarks8.getText().toString().trim();

                if(blm.equals("") || cm.equals("") || cam.equals("") || sm.equals("")|| im.equals(""))
                {
                    Toast.makeText(MainActivity.this, "Fill Completely", Toast.LENGTH_LONG).show();
                    return;
                }

                float b = Float.parseFloat(blm);
                float c = Float.parseFloat(cm);
                float ca = Float.parseFloat(cam);
                float s = Float.parseFloat(sm);
                float i = Float.parseFloat(im);

                if(b >10)
                {
                    Toast.makeText(MainActivity.this, "Body Language Marks can't exceed '10' ", Toast.LENGTH_LONG).show();
                    bodyLanguageMarks8.setText("");
                    bodyLanguageMarks8.requestFocus();
                    return;
                }
                else if (c > 10)
                {
                    Toast.makeText(MainActivity.this, "Confidence Marks can't exceed '10' ", Toast.LENGTH_LONG).show();
                    confidenceMarks8.setText("");
                    confidenceMarks8.requestFocus();
                    return;
                }
                else if (ca > 10)
                {
                    Toast.makeText(MainActivity.this, "Crowd Approval Marks can't exceed '10' ", Toast.LENGTH_LONG).show();
                    crowdApprovalMarks8.setText("");
                    crowdApprovalMarks8.requestFocus();
                    return;
                }
                else if (s > 10)
                {
                    Toast.makeText(MainActivity.this, "Situtaion Marks can't exceed '10' ", Toast.LENGTH_LONG).show();
                    situtationMarks8.setText("");
                    situtationMarks8.requestFocus();
                    return;
                }
                else if (i > 10)
                {
                    Toast.makeText(MainActivity.this, "Interview Marks can't exceed '10' ", Toast.LENGTH_LONG).show();
                    interviewMarks8.setText("");
                    interviewMarks8.requestFocus();
                    return;
                }

                float sum = b+c+ca+s+i;   // total sum

                totalTextView8.setText(String.valueOf(sum));
                flag8 = true;

                sharedPreferences.edit().putFloat("total_8", sum).apply();

                sharedPreferences.edit().putFloat("body_language_8", b).apply();
                sharedPreferences.edit().putFloat("confidence_8", c).apply();
                sharedPreferences.edit().putFloat("crowd_approval_8", ca).apply();
                sharedPreferences.edit().putFloat("situtation_8", s).apply();
                sharedPreferences.edit().putFloat("interview_8", i).apply();

                myGrandChildRootRef8 = myChildRootRef.child("Contestant 08 marks");
                myGrandChildRootRef8.setValue(sum);

            }
            break;
            case R.id.getTotalButton9:
            {
                String blm = bodyLanguageMarks9.getText().toString().trim();
                String cm = confidenceMarks9.getText().toString().trim();
                String cam = crowdApprovalMarks9.getText().toString().trim();
                String sm = situtationMarks9.getText().toString().trim();
                String im = interviewMarks9.getText().toString().trim();

                if(blm.equals("") || cm.equals("") || cam.equals("") || sm.equals("")|| im.equals(""))
                {
                    Toast.makeText(MainActivity.this, "Fill Completely", Toast.LENGTH_LONG).show();
                    return;
                }

                float b = Float.parseFloat(blm);
                float c = Float.parseFloat(cm);
                float ca = Float.parseFloat(cam);
                float s = Float.parseFloat(sm);
                float i = Float.parseFloat(im);

                if(b >10)
                {
                    Toast.makeText(MainActivity.this, "Body Language Marks can't exceed '10' ", Toast.LENGTH_LONG).show();
                    bodyLanguageMarks9.setText("");
                    bodyLanguageMarks9.requestFocus();
                    return;
                }
                else if (c > 10)
                {
                    Toast.makeText(MainActivity.this, "Confidence Marks can't exceed '10' ", Toast.LENGTH_LONG).show();
                    confidenceMarks9.setText("");
                    confidenceMarks9.requestFocus();
                    return;
                }
                else if (ca > 10)
                {
                    Toast.makeText(MainActivity.this, "Crowd Approval Marks can't exceed '10' ", Toast.LENGTH_LONG).show();
                    crowdApprovalMarks9.setText("");
                    crowdApprovalMarks9.requestFocus();
                    return;
                }
                else if (s > 10)
                {
                    Toast.makeText(MainActivity.this, "Situtaion Marks can't exceed '10' ", Toast.LENGTH_LONG).show();
                    situtationMarks9.setText("");
                    situtationMarks9.requestFocus();
                    return;
                }
                else if (i > 10)
                {
                    Toast.makeText(MainActivity.this, "Interview Marks can't exceed '10' ", Toast.LENGTH_LONG).show();
                    interviewMarks9.setText("");
                    interviewMarks9.requestFocus();
                    return;
                }

                float sum = b+c+ca+s+i;   // total sum

                totalTextView9.setText(String.valueOf(sum));
                flag9 = true;

                sharedPreferences.edit().putFloat("total_9", sum).apply();

                sharedPreferences.edit().putFloat("body_language_9", b).apply();
                sharedPreferences.edit().putFloat("confidence_9", c).apply();
                sharedPreferences.edit().putFloat("crowd_approval_9", ca).apply();
                sharedPreferences.edit().putFloat("situtation_9", s).apply();
                sharedPreferences.edit().putFloat("interview_9", i).apply();

                myGrandChildRootRef9 = myChildRootRef.child("Contestant 09 marks");
                myGrandChildRootRef9.setValue(sum);

            }
            break;
            case R.id.getTotalButton10:
            {
                String blm = bodyLanguageMarks10.getText().toString().trim();
                String cm = confidenceMarks10.getText().toString().trim();
                String cam = crowdApprovalMarks10.getText().toString().trim();
                String sm = situtationMarks10.getText().toString().trim();
                String im = interviewMarks10.getText().toString().trim();

                if(blm.equals("") || cm.equals("") || cam.equals("") || sm.equals("")|| im.equals(""))
                {
                    Toast.makeText(MainActivity.this, "Fill Completely", Toast.LENGTH_LONG).show();
                    return;
                }

                float b = Float.parseFloat(blm);
                float c = Float.parseFloat(cm);
                float ca = Float.parseFloat(cam);
                float s = Float.parseFloat(sm);
                float i = Float.parseFloat(im);

                if(b >10)
                {
                    Toast.makeText(MainActivity.this, "Body Language Marks can't exceed '10' ", Toast.LENGTH_LONG).show();
                    bodyLanguageMarks10.setText("");
                    bodyLanguageMarks10.requestFocus();
                    return;
                }
                else if (c > 10)
                {
                    Toast.makeText(MainActivity.this, "Confidence Marks can't exceed '10' ", Toast.LENGTH_LONG).show();
                    confidenceMarks10.setText("");
                    confidenceMarks10.requestFocus();
                    return;
                }
                else if (ca > 10)
                {
                    Toast.makeText(MainActivity.this, "Crowd Approval Marks can't exceed '10' ", Toast.LENGTH_LONG).show();
                    crowdApprovalMarks10.setText("");
                    crowdApprovalMarks10.requestFocus();
                    return;
                }
                else if (s > 10)
                {
                    Toast.makeText(MainActivity.this, "Situtaion Marks can't exceed '10' ", Toast.LENGTH_LONG).show();
                    situtationMarks10.setText("");
                    situtationMarks10.requestFocus();
                    return;
                }
                else if (i > 10)
                {
                    Toast.makeText(MainActivity.this, "Interview Marks can't exceed '10' ", Toast.LENGTH_LONG).show();
                    interviewMarks10.setText("");
                    interviewMarks10.requestFocus();
                    return;
                }

                float sum = b+c+ca+s+i;   // total sum

                totalTextView10.setText(String.valueOf(sum));
                flag10 = true;

                sharedPreferences.edit().putFloat("total_10", sum).apply();

                sharedPreferences.edit().putFloat("body_language_10", b).apply();
                sharedPreferences.edit().putFloat("confidence_10", c).apply();
                sharedPreferences.edit().putFloat("crowd_approval_10", ca).apply();
                sharedPreferences.edit().putFloat("situtation_10", s).apply();
                sharedPreferences.edit().putFloat("interview_10", i).apply();

                myGrandChildRootRef10 = myChildRootRef.child("Contestant 10 marks");
                myGrandChildRootRef10.setValue(sum);

            }
            break;
            case R.id.getTotalButton11:
            {
                String blm = bodyLanguageMarks11.getText().toString().trim();
                String cm = confidenceMarks11.getText().toString().trim();
                String cam = crowdApprovalMarks11.getText().toString().trim();
                String sm = situtationMarks11.getText().toString().trim();
                String im = interviewMarks11.getText().toString().trim();

                if(blm.equals("") || cm.equals("") || cam.equals("") || sm.equals("")|| im.equals(""))
                {
                    Toast.makeText(MainActivity.this, "Fill Completely", Toast.LENGTH_LONG).show();
                    return;
                }

                float b = Float.parseFloat(blm);
                float c = Float.parseFloat(cm);
                float ca = Float.parseFloat(cam);
                float s = Float.parseFloat(sm);
                float i = Float.parseFloat(im);

                if(b >10)
                {
                    Toast.makeText(MainActivity.this, "Body Language Marks can't exceed '10' ", Toast.LENGTH_LONG).show();
                    bodyLanguageMarks11.setText("");
                    bodyLanguageMarks11.requestFocus();
                    return;
                }
                else if (c > 10)
                {
                    Toast.makeText(MainActivity.this, "Confidence Marks can't exceed '10' ", Toast.LENGTH_LONG).show();
                    confidenceMarks11.setText("");
                    confidenceMarks11.requestFocus();
                    return;
                }
                else if (ca > 10)
                {
                    Toast.makeText(MainActivity.this, "Crowd Approval Marks can't exceed '10' ", Toast.LENGTH_LONG).show();
                    crowdApprovalMarks11.setText("");
                    crowdApprovalMarks11.requestFocus();
                    return;
                }
                else if (s > 10)
                {
                    Toast.makeText(MainActivity.this, "Situtaion Marks can't exceed '10' ", Toast.LENGTH_LONG).show();
                    situtationMarks11.setText("");
                    situtationMarks11.requestFocus();
                    return;
                }
                else if (i > 10)
                {
                    Toast.makeText(MainActivity.this, "Interview Marks can't exceed '10' ", Toast.LENGTH_LONG).show();
                    interviewMarks11.setText("");
                    interviewMarks11.requestFocus();
                    return;
                }

                float sum = b+c+ca+s+i;   // total sum

                totalTextView11.setText(String.valueOf(sum));
                flag11 = true;

                sharedPreferences.edit().putFloat("total_11", sum).apply();

                sharedPreferences.edit().putFloat("body_language_11", b).apply();
                sharedPreferences.edit().putFloat("confidence_11", c).apply();
                sharedPreferences.edit().putFloat("crowd_approval_11", ca).apply();
                sharedPreferences.edit().putFloat("situtation_11", s).apply();
                sharedPreferences.edit().putFloat("interview_11", i).apply();

                myGrandChildRootRef11 = myChildRootRef.child("Contestant 11 marks");
                myGrandChildRootRef11.setValue(sum);

            }
            break;
            case R.id.getTotalButton12:
            {
                String blm = bodyLanguageMarks12.getText().toString().trim();
                String cm = confidenceMarks12.getText().toString().trim();
                String cam = crowdApprovalMarks12.getText().toString().trim();
                String sm = situtationMarks12.getText().toString().trim();
                String im = interviewMarks12.getText().toString().trim();

                if(blm.equals("") || cm.equals("") || cam.equals("") || sm.equals("")|| im.equals(""))
                {
                    Toast.makeText(MainActivity.this, "Fill Completely", Toast.LENGTH_LONG).show();
                    return;
                }

                float b = Float.parseFloat(blm);
                float c = Float.parseFloat(cm);
                float ca = Float.parseFloat(cam);
                float s = Float.parseFloat(sm);
                float i = Float.parseFloat(im);

                if(b >10)
                {
                    Toast.makeText(MainActivity.this, "Body Language Marks can't exceed '10' ", Toast.LENGTH_LONG).show();
                    bodyLanguageMarks12.setText("");
                    bodyLanguageMarks12.requestFocus();
                    return;
                }
                else if (c > 10)
                {
                    Toast.makeText(MainActivity.this, "Confidence Marks can't exceed '10' ", Toast.LENGTH_LONG).show();
                    confidenceMarks12.setText("");
                    confidenceMarks12.requestFocus();
                    return;
                }
                else if (ca > 10)
                {
                    Toast.makeText(MainActivity.this, "Crowd Approval Marks can't exceed '10' ", Toast.LENGTH_LONG).show();
                    crowdApprovalMarks12.setText("");
                    crowdApprovalMarks12.requestFocus();
                    return;
                }
                else if (s > 10)
                {
                    Toast.makeText(MainActivity.this, "Situtaion Marks can't exceed '10' ", Toast.LENGTH_LONG).show();
                    situtationMarks12.setText("");
                    situtationMarks12.requestFocus();
                    return;
                }
                else if (i > 10)
                {
                    Toast.makeText(MainActivity.this, "Interview Marks can't exceed '10' ", Toast.LENGTH_LONG).show();
                    interviewMarks12.setText("");
                    interviewMarks12.requestFocus();
                    return;
                }

                float sum = b+c+ca+s+i;   // total sum

                totalTextView12.setText(String.valueOf(sum));
                flag12 = true;

                sharedPreferences.edit().putFloat("total_12", sum).apply();

                sharedPreferences.edit().putFloat("body_language_12", b).apply();
                sharedPreferences.edit().putFloat("confidence_12", c).apply();
                sharedPreferences.edit().putFloat("crowd_approval_12", ca).apply();
                sharedPreferences.edit().putFloat("situtation_12", s).apply();
                sharedPreferences.edit().putFloat("interview_12", i).apply();

                myGrandChildRootRef12 = myChildRootRef.child("Contestant 12 marks");
                myGrandChildRootRef12.setValue(sum);

            }
            break;
            case R.id.getTotalButton13:
            {
                String blm = bodyLanguageMarks13.getText().toString().trim();
                String cm = confidenceMarks13.getText().toString().trim();
                String cam = crowdApprovalMarks13.getText().toString().trim();
                String sm = situtationMarks13.getText().toString().trim();
                String im = interviewMarks13.getText().toString().trim();

                if(blm.equals("") || cm.equals("") || cam.equals("") || sm.equals("")|| im.equals(""))
                {
                    Toast.makeText(MainActivity.this, "Fill Completely", Toast.LENGTH_LONG).show();
                    return;
                }

                float b = Float.parseFloat(blm);
                float c = Float.parseFloat(cm);
                float ca = Float.parseFloat(cam);
                float s = Float.parseFloat(sm);
                float i = Float.parseFloat(im);

                if(b >10)
                {
                    Toast.makeText(MainActivity.this, "Body Language Marks can't exceed '10' ", Toast.LENGTH_LONG).show();
                    bodyLanguageMarks13.setText("");
                    bodyLanguageMarks13.requestFocus();
                    return;
                }
                else if (c > 10)
                {
                    Toast.makeText(MainActivity.this, "Confidence Marks can't exceed '10' ", Toast.LENGTH_LONG).show();
                    confidenceMarks13.setText("");
                    confidenceMarks13.requestFocus();
                    return;
                }
                else if (ca > 10)
                {
                    Toast.makeText(MainActivity.this, "Crowd Approval Marks can't exceed '10' ", Toast.LENGTH_LONG).show();
                    crowdApprovalMarks13.setText("");
                    crowdApprovalMarks13.requestFocus();
                    return;
                }
                else if (s > 10)
                {
                    Toast.makeText(MainActivity.this, "Situtaion Marks can't exceed '10' ", Toast.LENGTH_LONG).show();
                    situtationMarks13.setText("");
                    situtationMarks13.requestFocus();
                    return;
                }
                else if (i > 10)
                {
                    Toast.makeText(MainActivity.this, "Interview Marks can't exceed '10' ", Toast.LENGTH_LONG).show();
                    interviewMarks13.setText("");
                    interviewMarks13.requestFocus();
                    return;
                }

                float sum = b+c+ca+s+i;   // total sum

                totalTextView13.setText(String.valueOf(sum));
                flag13 = true;

                sharedPreferences.edit().putFloat("total_13", sum).apply();

                sharedPreferences.edit().putFloat("body_language_13", b).apply();
                sharedPreferences.edit().putFloat("confidence_13", c).apply();
                sharedPreferences.edit().putFloat("crowd_approval_13", ca).apply();
                sharedPreferences.edit().putFloat("situtation_13", s).apply();
                sharedPreferences.edit().putFloat("interview_13", i).apply();

                myGrandChildRootRef13 = myChildRootRef.child("Contestant 13 marks");
                myGrandChildRootRef13.setValue(sum);

            }
            break;
            case R.id.getTotalButton14:
            {
                String blm = bodyLanguageMarks14.getText().toString().trim();
                String cm = confidenceMarks14.getText().toString().trim();
                String cam = crowdApprovalMarks14.getText().toString().trim();
                String sm = situtationMarks14.getText().toString().trim();
                String im = interviewMarks14.getText().toString().trim();

                if(blm.equals("") || cm.equals("") || cam.equals("") || sm.equals("")|| im.equals(""))
                {
                    Toast.makeText(MainActivity.this, "Fill Completely", Toast.LENGTH_LONG).show();
                    return;
                }

                float b = Float.parseFloat(blm);
                float c = Float.parseFloat(cm);
                float ca = Float.parseFloat(cam);
                float s = Float.parseFloat(sm);
                float i = Float.parseFloat(im);

                if(b >10)
                {
                    Toast.makeText(MainActivity.this, "Body Language Marks can't exceed '10' ", Toast.LENGTH_LONG).show();
                    bodyLanguageMarks14.setText("");
                    bodyLanguageMarks14.requestFocus();
                    return;
                }
                else if (c > 10)
                {
                    Toast.makeText(MainActivity.this, "Confidence Marks can't exceed '10' ", Toast.LENGTH_LONG).show();
                    confidenceMarks14.setText("");
                    confidenceMarks14.requestFocus();
                    return;
                }
                else if (ca > 10)
                {
                    Toast.makeText(MainActivity.this, "Crowd Approval Marks can't exceed '10' ", Toast.LENGTH_LONG).show();
                    crowdApprovalMarks14.setText("");
                    crowdApprovalMarks14.requestFocus();
                    return;
                }
                else if (s > 10)
                {
                    Toast.makeText(MainActivity.this, "Situtaion Marks can't exceed '10' ", Toast.LENGTH_LONG).show();
                    situtationMarks14.setText("");
                    situtationMarks14.requestFocus();
                    return;
                }
                else if (i > 10)
                {
                    Toast.makeText(MainActivity.this, "Interview Marks can't exceed '10' ", Toast.LENGTH_LONG).show();
                    interviewMarks14.setText("");
                    interviewMarks14.requestFocus();
                    return;
                }

                float sum = b+c+ca+s+i;   // total sum

                totalTextView14.setText(String.valueOf(sum));
                flag14 = true;

                sharedPreferences.edit().putFloat("total_14", sum).apply();

                sharedPreferences.edit().putFloat("body_language_14", b).apply();
                sharedPreferences.edit().putFloat("confidence_14", c).apply();
                sharedPreferences.edit().putFloat("crowd_approval_14", ca).apply();
                sharedPreferences.edit().putFloat("situtation_14", s).apply();
                sharedPreferences.edit().putFloat("interview_14", i).apply();

                myGrandChildRootRef14 = myChildRootRef.child("Contestant 14 marks");
                myGrandChildRootRef14.setValue(sum);

            }
            break;
        }

    }

    public void storeDataUsingSharedPreference()
    {
        if( !flag1)
        {
            Toast.makeText(MainActivity.this, "Fill Details of Contestent No. 1 ", Toast.LENGTH_LONG).show();
            bodyLanguageMarks.requestFocus();
            return;
        }
        else if (!flag2)
        {
            Toast.makeText(MainActivity.this, "Fill Details of Contestent Nu. 2 ", Toast.LENGTH_LONG).show();
            bodyLanguageMarks2.requestFocus();
            return;
        }
        else if (!flag3)
        {
            Toast.makeText(MainActivity.this, "Fill Details of Contestent Nu. 3 ", Toast.LENGTH_LONG).show();
            bodyLanguageMarks3.requestFocus();
            return;
        }
        else if (!flag4)
        {
            Toast.makeText(MainActivity.this, "Fill Details of Contestent Nu. 4 ", Toast.LENGTH_LONG).show();
            bodyLanguageMarks4.requestFocus();
            return;
        }
        else if (!flag5)
        {
            Toast.makeText(MainActivity.this, "Fill Details of Contestent Nu. 5 ", Toast.LENGTH_LONG).show();
            bodyLanguageMarks5.requestFocus();
            return;
        }
        else if (!flag6)
        {
            Toast.makeText(MainActivity.this, "Fill Details of Contestent Nu. 6 ", Toast.LENGTH_LONG).show();
            bodyLanguageMarks6.requestFocus();
            return;
        }
        else if (!flag7)
        {
            Toast.makeText(MainActivity.this, "Fill Details of Contestent Nu. 7 ", Toast.LENGTH_LONG).show();
            bodyLanguageMarks7.requestFocus();
            return;
        }
        else if (!flag8)
        {
            Toast.makeText(MainActivity.this, "Fill Details of Contestent Nu. 8 ", Toast.LENGTH_LONG).show();
            bodyLanguageMarks8.requestFocus();
            return;
        }
        else if (!flag9)
        {
            Toast.makeText(MainActivity.this, "Fill Details of Contestent Nu. 9 ", Toast.LENGTH_LONG).show();
            bodyLanguageMarks9.requestFocus();
            return;
        }
        else if (!flag10)
        {
            Toast.makeText(MainActivity.this, "Fill Details of Contestent Nu. 10 ", Toast.LENGTH_LONG).show();
            bodyLanguageMarks10.requestFocus();
            return;
        }
        else if (!flag11)
        {
            Toast.makeText(MainActivity.this, "Fill Details of Contestent Nu. 11 ", Toast.LENGTH_LONG).show();
            bodyLanguageMarks11.requestFocus();
            return;
        }
        else if (!flag12)
        {
            Toast.makeText(MainActivity.this, "Fill Details of Contestent Nu. 12 ", Toast.LENGTH_LONG).show();
            bodyLanguageMarks12.requestFocus();
            return;
        }
        else if (!flag13)
        {
            Toast.makeText(MainActivity.this, "Fill Details of Contestent Nu. 13 ", Toast.LENGTH_LONG).show();
            bodyLanguageMarks13.requestFocus();
            return;
        }
        else if (!flag14)
        {
            Toast.makeText(MainActivity.this, "Fill Details of Contestent Nu. 14 ", Toast.LENGTH_LONG).show();
            bodyLanguageMarks14.requestFocus();
            return;
        }

        Intent intent = new Intent(MainActivity.this, ShowTotal.class);
        startActivity(intent);


    }


    private Integer flags[] = new Integer[]{0,0,0,0,0,0,0,0,0,0,0,0,0,0};

    public void checkVisiblity()
    {

        if(flags[0] == 1) {
            contestant1LinearLayout.setVisibility(View.GONE);
            flags[0] = 0;
        }

        if(flags[1] == 1) {
            contestant2LinearLayout.setVisibility(View.GONE);
            flags[1] = 0;
        }

        if(flags[2] == 1) {
            contestant3LinearLayout.setVisibility(View.GONE);
            flags[2] = 0;
        }

        if(flags[3] == 1) {
            contestant4LinearLayout.setVisibility(View.GONE);
            flags[3] = 0;
        }

        if(flags[4] == 1) {
            contestant5LinearLayout.setVisibility(View.GONE);
            flags[4] = 0;
        }

        if(flags[5] == 1) {
            contestant6LinearLayout.setVisibility(View.GONE);
            flags[5] = 0;
        }

        if(flags[6] == 1) {
            contestant7LinearLayout.setVisibility(View.GONE);
            flags[6] = 0;
        }

        if(flags[7] == 1) {
            contestant8LinearLayout.setVisibility(View.GONE);
            flags[7] = 0;
        }

        if(flags[8] == 1) {
            contestant9LinearLayout.setVisibility(View.GONE);
            flags[8] = 0;
        }

        if(flags[9] == 1) {
            contestant10LinearLayout.setVisibility(View.GONE);
            flags[9] = 0;
        }

        if(flags[10] == 1) {
            contestant11LinearLayout.setVisibility(View.GONE);
            flags[10] = 0;
        }

        if(flags[11] == 1) {
            contestant12LinearLayout.setVisibility(View.GONE);
            flags[11] = 0;
        }

        if(flags[12] == 1) {
            contestant13LinearLayout.setVisibility(View.GONE);
            flags[12] = 0;
        }

        if(flags[13] == 1) {
            contestant14LinearLayout.setVisibility(View.GONE);
            flags[13] = 0;
        }

    }

    @Override
    public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {


        switch (i)
        {
            case 0:
                checkVisiblity();

                flags[0] = 1;
                contestant1LinearLayout.setVisibility(View.VISIBLE);
                break;
            case 1:
                checkVisiblity();

                flags[1] = 1;
                contestant2LinearLayout.setVisibility(View.VISIBLE);
                break;
            case 2:
                checkVisiblity();

                flags[2] = 1;
                contestant3LinearLayout.setVisibility(View.VISIBLE);
                break;
            case 3:
                checkVisiblity();

                flags[3] = 1;
                contestant4LinearLayout.setVisibility(View.VISIBLE);

                break;
            case 4:
                checkVisiblity();

                flags[4] = 1;
                contestant5LinearLayout.setVisibility(View.VISIBLE);

                break;
            case 5:
                checkVisiblity();

                flags[5] = 1;
                contestant6LinearLayout.setVisibility(View.VISIBLE);

                break;
            case 6:
                checkVisiblity();

                flags[6] = 1;
                contestant7LinearLayout.setVisibility(View.VISIBLE);

                break;
            case 7:
                checkVisiblity();

                flags[7] = 1;
                contestant8LinearLayout.setVisibility(View.VISIBLE);

                break;
            case 8:
                checkVisiblity();

                flags[8] = 1;
                contestant9LinearLayout.setVisibility(View.VISIBLE);

                break;
            case 9:
                checkVisiblity();

                flags[9] = 1;
                contestant10LinearLayout.setVisibility(View.VISIBLE);

                break;
            case 10:
                checkVisiblity();

                flags[10] = 1;
                contestant11LinearLayout.setVisibility(View.VISIBLE);

                break;
            case 11:
                checkVisiblity();

                flags[11] = 1;
                contestant12LinearLayout.setVisibility(View.VISIBLE);

                break;
            case 12:
                checkVisiblity();

                flags[12] = 1;
                contestant13LinearLayout.setVisibility(View.VISIBLE);

                break;
            case 13:
                checkVisiblity();

                flags[13] = 1;
                contestant14LinearLayout.setVisibility(View.VISIBLE);

                break;
        }

    }

    @Override
    public void onNothingSelected(AdapterView<?> adapterView) {

    }
}
