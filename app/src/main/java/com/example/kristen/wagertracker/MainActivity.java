package com.example.kristen.wagertracker;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.EditText;
import android.widget.Toast;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class MainActivity extends AppCompatActivity {

    //Used new technique Michael Showed to tie IDs to controls
    @BindView(R.id.name_of_track_entry) EditText nameEntry;

    @BindView(R.id.amount_wagered_entry) EditText amountEntry;

    @BindView(R.id.date_bet_was_placed_entry) EditText betDate;

    @BindView(R.id.type_of_bet_entry) EditText betType;

    // TODO Geoff: Do these yourself and add the input to the message shown in the Toast
    // TODO Enter the type of bet
    // TODO Enter the date the bet was placed

    @OnClick(R.id.submit_wager_button)
    void submitWager() {
        // TODO Change this to a Wager class rather than a simple String
        // TODO Geoff: Create the wager class and give it a toString method that will be the shown in the Toast

        //Test Data
        Wager wager = new Wager(
                nameEntry.getText().toString(),
                betDate.getText().toString(),
                betType.getText().toString(),
                amountEntry.getText().toString());

        Toast.makeText(this, wager.toString(), Toast.LENGTH_SHORT).show();
       // Toast.makeText(this, thisWager.toString(), Toast.LENGTH_LONG).show();
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);
    }

    public class Wager{
        String trackName;
        String wagerDate;
        String wagerType;
        String wagerAmount;

        //Constructor
        public Wager(String wTrack, String wDate, String wType, String wAmount){
            trackName = wTrack;
            wagerDate = wDate;
            wagerType = wType;
            wagerAmount = wAmount;
        }

        @Override
        public String toString(){
            return "Track: " + trackName + "\n"
                    + "Date of Wager: " + wagerDate + "\n"
                    + "Type of Wager: " + wagerType + "\n"
                    + "Amount of Wager: " + wagerAmount ;
        }

    }
}
