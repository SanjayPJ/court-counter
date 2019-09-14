package com.example.courtcounter;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    int teamA = 0;
    int teamB = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        updateTeamA(teamA);
        updateTeamB(teamB);
    }

    private void updateTeamA(int score){
        TextView teamAText = (TextView) findViewById(R.id.teamA);
        teamAText.setText(Integer.toString(score));
    }

    private void updateTeamB(int score){
        TextView teamBText = (TextView) findViewById(R.id.teamB);
        teamBText.setText(Integer.toString(score));
    }

    public void increment_three(View view){
        Button clicked_button = (Button) view;
        String button_tag = clicked_button.getTag().toString();

        if(button_tag.equals("A")){
            teamA += 3;
            updateTeamA(teamA);
        }else{
            teamB += 3;
            updateTeamB(teamB);
        }
    }

    public void increment_two(View view){
        Button clicked_button = (Button) view;
        String button_tag = clicked_button.getTag().toString();

        if(button_tag.equals("A")){
            teamA += 2;
            updateTeamA(teamA);
        }else{
            teamB += 2;
            updateTeamB(teamB);
        }
    }

    public void increment(View view){
        Button clicked_button = (Button) view;
        String button_tag = clicked_button.getTag().toString();

        if(button_tag.equals("A")){
            teamA += 1;
            updateTeamA(teamA);
        }else{
            teamB += 1;
            updateTeamB(teamB);
        }
    }

    public void reset(View view){
        teamB = 0;
        teamA = 0;

        updateTeamB(teamA);
        updateTeamA(teamB);
    }
}
