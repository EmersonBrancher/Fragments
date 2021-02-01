package com.example.fragments.activity;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentTransaction;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.fragments.R;
import com.example.fragments.fragment.ChatFragment;
import com.example.fragments.fragment.ContactsFragment;

public class MainActivity extends AppCompatActivity {

    private Button botaoConversa, botaoContato;
    private ChatFragment chatFragment;
    private ContactsFragment contactFragment;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        botaoContato = findViewById(R.id.buttonContactsID);
        botaoConversa = findViewById(R.id.buttonChatID);

        getSupportActionBar().setElevation(0);

        chatFragment = new ChatFragment();

        FragmentTransaction transaction = getSupportFragmentManager().beginTransaction();
        transaction.replace(R.id.frameLayoutID, chatFragment);
        transaction.commit();

        botaoContato.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                contactFragment = new ContactsFragment();

                FragmentTransaction transaction = getSupportFragmentManager().beginTransaction();
                transaction.replace(R.id.frameLayoutID, contactFragment);
                transaction.commit();

            }
        });

        botaoConversa.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                chatFragment = new ChatFragment();

                FragmentTransaction transaction = getSupportFragmentManager().beginTransaction();
                transaction.replace(R.id.frameLayoutID, chatFragment);
                transaction.commit();

            }
        });

    }
}