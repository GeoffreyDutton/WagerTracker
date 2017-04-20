package com.example.kristen.wagertracker;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.EditText;
import android.widget.Toast;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class MainActivity extends AppCompatActivity {

    // TODO Enter the name of the track
    @BindView(R.id.name_of_track_entry)
    EditText nameEntry;

    // TODO Enter the amount wagered
    @BindView(R.id.amount_wagered_entry) EditText amountEntry;

    // TODO Geoff: Do these yourself and add the input to the message shown in the Toast
    // TODO Enter the type of bet
    // TODO Enter the date the bet was placed

    @OnClick(R.id.submit_wager_button)
    void submitWager() {
        // TODO Change this to a Wager class rather than a simple String
        String wager = "";

        String nameOfTrack = nameEntry.getText().toString();
        String amountWagered = amountEntry.getText().toString();

        wager += "name: " + nameOfTrack;
        wager += "\n";
        wager += "amount wagered: " + amountWagered;

        Toast.makeText(this, wager, Toast.LENGTH_SHORT).show();
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);
    }
}
