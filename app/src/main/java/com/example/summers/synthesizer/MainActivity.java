package com.example.summers.synthesizer;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.NumberPicker;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private final int WHOLE_NOTE = 1000;
    private Button aButton, asButton, bButton, cButton, csButton, dButton, dsButton, eButton, fButton, fsButton, gButton, gsButton, dothingsButton, playTimesButton,twinkleButton;
    private MediaPlayer aNote, asNote, bNote, cNote, csNote, dNote, dsNote, eNote, fNote, fsNote, gNote, gsNote, heNote, haNote, hbNote, hcsNote, hdNote, hfsNote;
    private NumberPicker notePicker, playPicker;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        wireWidgets();
        setListeners();
        createMediaPlayers();
        setNoteChoices();
        setTimesPlayed();
    }

    private void createMediaPlayers() {
        aNote = MediaPlayer.create(this, R.raw.scalea);
        asNote = MediaPlayer.create(this, R.raw.scalebb);
        bNote = MediaPlayer.create(this, R.raw.scaleb);
        cNote = MediaPlayer.create(this, R.raw.scalec);
        csNote = MediaPlayer.create(this, R.raw.scalecs);
        dNote = MediaPlayer.create(this, R.raw.scaled);
        dsNote = MediaPlayer.create(this, R.raw.scaleds);
       eNote = MediaPlayer.create(this, R.raw.scalee);
        fNote = MediaPlayer.create(this, R.raw.scalef);
       fsNote = MediaPlayer.create(this, R.raw.scalefs);
        gNote = MediaPlayer.create(this, R.raw.scaleg);
        gsNote = MediaPlayer.create(this, R.raw.scalegs);
        heNote = MediaPlayer.create(this, R.raw.scalehighe);
        haNote = MediaPlayer.create(this, R.raw.scalehigha);
        hbNote = MediaPlayer.create(this, R.raw.scalehighb);
        hcsNote = MediaPlayer.create(this, R.raw.scalehighcs);
        hdNote = MediaPlayer.create(this, R.raw.scalehighd);
        hfsNote = MediaPlayer.create(this, R.raw.scalehighfs);
    }

    private void setListeners() {
        aButton.setOnClickListener(this);
        asButton.setOnClickListener(this);
        bButton.setOnClickListener(this);
        cButton.setOnClickListener(this);
        csButton.setOnClickListener(this);
        dButton.setOnClickListener(this);
        dsButton.setOnClickListener(this);
        eButton.setOnClickListener(this);
        fButton.setOnClickListener(this);
        fsButton.setOnClickListener(this);
        gButton.setOnClickListener(this);
        gsButton.setOnClickListener(this);
        dothingsButton.setOnClickListener(this);
        playTimesButton.setOnClickListener(this);
        twinkleButton.setOnClickListener(this);

    }

    private void wireWidgets() {
        aButton = (Button) findViewById(R.id.button_a);
        asButton = (Button) findViewById(R.id.button_as);
        bButton = (Button) findViewById(R.id.button_b);
        cButton = (Button) findViewById(R.id.button_c);
        csButton = (Button) findViewById(R.id.button_cs);
        dButton = (Button) findViewById(R.id.button_d);
        dsButton = (Button) findViewById(R.id.button_ds);
        eButton = (Button) findViewById(R.id.button_e);
        fButton = (Button) findViewById(R.id.button_f);
        fsButton = (Button) findViewById(R.id.button_fs);
        gButton = (Button) findViewById(R.id.button_g);
        gsButton = (Button) findViewById(R.id.button_gs);
        dothingsButton = (Button) findViewById(R.id.button_dothings);
        notePicker = (NumberPicker) findViewById(R.id.numberPicker);
        playPicker = (NumberPicker) findViewById(R.id.timesPicker);
        playTimesButton = (Button) findViewById(R.id.button_playtimes);
        twinkleButton = (Button) findViewById(R.id.button_twinkle);

    }

    private void setNoteChoices() {
        notePicker.setMinValue(0);
        notePicker.setMaxValue(11);
        notePicker.setDisplayedValues(new String[]{"A", "A#", "B", "C", "C#", "D", "D#", "E", "F", "F#", "G", "G#"});
    }
    private void setTimesPlayed(){
        playPicker.setMinValue(0);
        playPicker.setMaxValue(4);
        playPicker.setDisplayedValues(new String[]{"1", "2", "3", "4", "5"});
    }

    private void delayPlaying(int delay) {
        try {
            Thread.sleep(delay);
        } catch (InterruptedException e) {
            Log.e("SynthesizerActivity","Audio playback interrupted");
        }

    }

    @Override
    public void onClick(View view) {
        switch(view.getId()) {
            case R.id.button_a:
                aNote.seekTo(0);
                aNote.start();
                break;
            case R.id.button_as:
                asNote.seekTo(0);
                asNote.start();
                break;
            case R.id.button_b:
                bNote.seekTo(0);
                bNote.start();
                break;
            case R.id.button_c:
                cNote.seekTo(0);
                cNote.start();
                break;
            case R.id.button_cs:
                csNote.seekTo(0);
                csNote.start();
                break;
            case R.id.button_d:
                dNote.seekTo(0);
                dNote.start();
                break;
            case R.id.button_ds:
                dsNote.seekTo(0);
                dsNote.start();
                break;
            case R.id.button_e:
                eNote.seekTo(0);
                eNote.start();
                break;
            case R.id.button_f:
                fNote.seekTo(0);
                fNote.start();
                break;
            default:
            case R.id.button_fs:
                fsNote.seekTo(0);
                fsNote.start();
                break;
            case R.id.button_g:
                gNote.seekTo(0);
                gNote.start();
                break;
            case R.id.button_gs:
                gsNote.seekTo(0);
                gsNote.start();
                break;
            case R.id.button_dothings:
                eNote.seekTo(0);
                eNote.start();
                delayPlaying(WHOLE_NOTE/2);
                fsNote.seekTo(0);
                fsNote.start();
                delayPlaying(WHOLE_NOTE/2);
                gNote.seekTo(0);
                gNote.start();
                delayPlaying(WHOLE_NOTE/2);
                haNote.seekTo(0);
                haNote.start();
                delayPlaying(WHOLE_NOTE/2);
                hbNote.seekTo(0);
                hbNote.start();
                delayPlaying(WHOLE_NOTE/2);
                hcsNote.seekTo(0);
                hcsNote.start();
                delayPlaying(WHOLE_NOTE/2);
                hdNote.seekTo(0);
                hdNote.start();
                delayPlaying(WHOLE_NOTE/2);
                heNote.seekTo(0);
                heNote.start();
                delayPlaying(WHOLE_NOTE/2);
            case R.id.button_playtimes:
                int n = notePicker.getValue();
                int y = playPicker.getValue();
                for(int x=0; x<=y; x++) {
                    if (n == 0) {
                        aNote.seekTo(0);
                        aNote.start();
                        delayPlaying(WHOLE_NOTE / 2);
                    }
                    if (n == 1) {
                        aNote.seekTo(0);
                        aNote.start();
                        delayPlaying(WHOLE_NOTE / 2);
                    }
                    if (n == 2) {
                        asNote.seekTo(0);
                        asNote.start();
                        delayPlaying(WHOLE_NOTE / 2);
                    }
                    if (n == 3) {
                        bNote.seekTo(0);
                        bNote.start();
                        delayPlaying(WHOLE_NOTE / 2);
                    }
                    if (n == 4) {
                        csNote.seekTo(0);
                        csNote.start();
                        delayPlaying(WHOLE_NOTE / 2);
                    }
                    if (n == 5) {
                        dNote.seekTo(0);
                        dNote.start();
                        delayPlaying(WHOLE_NOTE / 2);
                    }
                    if (n == 6) {
                        dsNote.seekTo(0);
                        dsNote.start();
                        delayPlaying(WHOLE_NOTE / 2);
                    }
                    if (n == 7) {
                        eNote.seekTo(0);
                        eNote.start();
                        delayPlaying(WHOLE_NOTE / 2);
                    }
                    if (n == 8) {
                        fNote.seekTo(0);
                        fNote.start();
                        delayPlaying(WHOLE_NOTE / 2);
                    }
                    if (n == 9) {
                        fsNote.seekTo(0);
                        fsNote.start();
                        delayPlaying(WHOLE_NOTE / 2);
                    }
                    if (n == 10) {
                        gNote.seekTo(0);
                        gNote.start();
                        delayPlaying(WHOLE_NOTE / 2);
                    }
                    if (n == 11) {
                        gsNote.seekTo(0);
                        gsNote.start();
                        delayPlaying(WHOLE_NOTE / 2);
                    }
                }
                    case R.id.button_twinkle:
                        aNote.seekTo(0);
                        aNote.start();
                        delayPlaying(WHOLE_NOTE/2);
                        aNote.seekTo(0);
                        aNote.start();
                        delayPlaying(WHOLE_NOTE/2);
                        heNote.seekTo(0);
                        heNote.start();
                        delayPlaying(WHOLE_NOTE/2);
                        heNote.seekTo(0);
                        heNote.start();
                        delayPlaying(WHOLE_NOTE/2);
                        hfsNote.seekTo(0);
                        hfsNote.start();
                        delayPlaying(WHOLE_NOTE/2);
                        hfsNote.seekTo(0);
                        hfsNote.start();
                        delayPlaying(WHOLE_NOTE/2);
                        heNote.seekTo(0);
                        heNote.start();
                        delayPlaying(WHOLE_NOTE);
                        dNote.seekTo(0);
                        dNote.start();
                        delayPlaying(WHOLE_NOTE/2);
                        dNote.seekTo(0);
                        dNote.start();
                        delayPlaying(WHOLE_NOTE/2);
                        csNote.seekTo(0);
                        csNote.start();
                        delayPlaying(WHOLE_NOTE/2);
                        csNote.seekTo(0);
                        csNote.start();
                        delayPlaying(WHOLE_NOTE/2);
                        bNote.seekTo(0);
                        bNote.start();
                        delayPlaying(WHOLE_NOTE/2);
                        bNote.seekTo(0);
                        bNote.start();
                        delayPlaying(WHOLE_NOTE/2);
                        aNote.seekTo(0);
                        aNote.start();
                        delayPlaying(WHOLE_NOTE/2);





        }

    }
}
