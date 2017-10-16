package com.example.hswoo.allsettingproject;

import android.arch.lifecycle.LifecycleActivity;
import android.arch.lifecycle.ViewModelProvider;
import android.arch.lifecycle.ViewModelProviders;
import android.support.annotation.BinderThread;
import android.support.v4.widget.TextViewCompat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Editable;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.ProgressBar;
import android.widget.TextView;


import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;
import io.reactivex.Observable;
import io.reactivex.ObservableEmitter;
import io.reactivex.functions.Function;

public class MainActivity extends LifecycleActivity {

    @BindView(R.id.progressbar)
    ProgressBar progressBar;
    @BindView(R.id.list)
    ListView listView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);
//        NameViewModel model = ViewModelProviders.of(this).get(NameViewModel.class);
//        model.getFruitList().observe(this, list -> {
//            ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1,
//                    android.R.id.text1, list);
//            listView.setAdapter(adapter);
//            progressBar.setVisibility(View.GONE);
//        });

    }
}
