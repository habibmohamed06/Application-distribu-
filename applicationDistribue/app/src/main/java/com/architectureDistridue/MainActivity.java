package com.architectureDistridue;

import android.content.Context;
import android.content.Intent;
import android.media.AudioManager;
import android.media.MediaPlayer;
import android.os.AsyncTask;
import android.os.Handler;
import android.speech.RecognizerIntent;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ImageButton;
import android.widget.ListView;
import android.widget.SeekBar;
import android.widget.TextView;
import android.widget.Toast;


import com.android.volley.Request;
import com.android.volley.RequestQueue;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.JsonObjectRequest;
import com.android.volley.toolbox.Volley;

import org.json.JSONException;
import org.json.JSONObject;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Locale;

import mp3.PrinterPrx;

public class MainActivity extends AppCompatActivity {

    private static final int REQUEST_CODE_SPEECH_INPUT = 1000;
    Handler handler;
    ListView listView;
    TextView mTextTv;
    ImageButton mVoiceBtn;
    MediaPlayer mediaPlayer;
    int maxVolume;
    int curVolume;
    Runnable runnable;
    SeekBar seekBar;
    String serviceURL = "http://192.168.0.110:8080/Analyseur3243069486819322814/analyseRequete/";
    String URLStreamMusique = "http://192.168.0.110:3000/musiques/";
    AudioManager audioManager;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        handler = new Handler();
        audioManager = (AudioManager) this.getSystemService(Context.AUDIO_SERVICE);
        maxVolume = audioManager.getStreamMaxVolume(AudioManager.STREAM_MUSIC);
        curVolume = audioManager.getStreamVolume(AudioManager.STREAM_MUSIC);
        mTextTv = findViewById(R.id.textTv);
        mVoiceBtn = findViewById(R.id.voiceBtn);
        listView = findViewById(R.id.listView);
        mediaPlayer = new MediaPlayer();
        ArrayList<String> arrayList = new ArrayList<>();
        arrayList.add("au DD");
        arrayList.add("paradis");
        arrayList.add("laisse-les parler");

        ArrayAdapter arrayAdapter = new ArrayAdapter(this,android.R.layout.simple_list_item_1,arrayList);
        listView.setAdapter(arrayAdapter);
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener(){
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                jouer(URLStreamMusique+arrayList.get(position)+".mp3");
            }
        });
        //init();
        //new Connection().execute();
        seekBar = (SeekBar) findViewById(R.id.seekBar);
        mVoiceBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                speak();
            }

        });
    }

    private void speak() {
        Intent intent = new Intent(RecognizerIntent.ACTION_RECOGNIZE_SPEECH);
        intent.putExtra(RecognizerIntent.EXTRA_LANGUAGE_MODEL,RecognizerIntent.LANGUAGE_MODEL_FREE_FORM);
        intent.putExtra(RecognizerIntent.EXTRA_LANGUAGE, Locale.getDefault());
        intent.putExtra(RecognizerIntent.EXTRA_PROMPT, "Hi speak something ");

        try {

            startActivityForResult(intent, REQUEST_CODE_SPEECH_INPUT);
        }catch (Exception e){
            Toast.makeText(this,"" + e.getMessage(), Toast.LENGTH_SHORT).show();
        }
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {
        super.onActivityResult(requestCode, resultCode, data);

        switch (requestCode)
        {
            case REQUEST_CODE_SPEECH_INPUT:{
                if (resultCode == RESULT_OK && null!=data)
                {
                    ArrayList<String> result = data.getStringArrayListExtra(RecognizerIntent.EXTRA_RESULTS);

                    String tmp = serviceURL + result.get(0);
                    Log.e("ererr   ",tmp);

                    requeteRest(tmp);
                }
                break;
            }
        }
    }

    protected void requeteRest(String URL)
    {
        RequestQueue requestQueue = Volley.newRequestQueue(this);

        JsonObjectRequest jsonObjectRequest = new JsonObjectRequest(
                Request.Method.GET,
                URL,
                null,
                new Response.Listener<JSONObject>() {
                    @Override
                    public void onResponse(JSONObject response) {
                        String action = "";
                        String musique = "";

                        try {
                            mTextTv.setText(response.getString("action").toString());

                            action = response.getString("action").toString();
                            musique = response.getString("musique").toString();

                            switch (action)
                            {
                                case "augmente":
                                {
                                    augmenter();
                                }
                                break;

                                case "baisse":
                                {
                                    baisser();
                                }
                                break;

                                case "jouer":
                                {
                                    jouer(URLStreamMusique+musique+".mp3");
                                }
                                break;

                                case "supprimer":
                                {
                                    supprimer();
                                }
                                break;

                                case "stopper":
                                {
                                    stopper();
                                }
                                break;

                                case "pause":
                                {
                                    pause();
                                }
                                break;

                                case "reprendre":
                                {
                                    reprendre();
                                }
                                break;

                            }



                        } catch (JSONException e) {
                            e.printStackTrace();
                        }
                        //Log.e("Rest Response",response.toString());
                        //Toast.makeText(getApplicationContext(), response.toString(), Toast.LENGTH_LONG).show();

                    }
                },
                new Response.ErrorListener() {
                    @Override
                    public void onErrorResponse(VolleyError error) {
                        /* mTextTv.setText(error.toString());
                        Log.e("Rest Response",error.toString());*/
                        Toast.makeText(getApplicationContext(),error.toString(),Toast.LENGTH_LONG).show();
                    }
                }
        );

        requestQueue.add(jsonObjectRequest);
    }

    protected void augmenter()
    {
        if(audioManager.getStreamVolume(AudioManager.STREAM_MUSIC) < maxVolume)
            audioManager.setStreamVolume(AudioManager.STREAM_MUSIC,audioManager.getStreamVolume(AudioManager.STREAM_MUSIC) + 1, 0);
    }

    protected void baisser()
    {
        if(audioManager.getStreamVolume(AudioManager.STREAM_MUSIC) > 0)
            audioManager.setStreamVolume(AudioManager.STREAM_MUSIC,audioManager.getStreamVolume(AudioManager.STREAM_MUSIC) -1, 0);
    }

    private void jouer(String musique)
    {
        stopper();
            try {
                mediaPlayer.setDataSource(musique);
                mediaPlayer.prepare();
                seekBar.setMax(mediaPlayer.getDuration());

                //Toast.makeText(getApplicationContext(), String.valueOf(mediaPlayer.getDuration()), Toast.LENGTH_LONG).show();
            } catch (IOException e) {
                e.printStackTrace();
            }
            mediaPlayer.start();
            changeSeekbar();

            seekBar.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
                @Override
                public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {
                    if(fromUser)
                    {
                        mediaPlayer.seekTo(progress);
                    }
                }

                @Override
                public void onStartTrackingTouch(SeekBar seekBar) {

                }

                @Override
                public void onStopTrackingTouch(SeekBar seekBar) {

                }
            });

    }

    private void stopper()
    {
        if(mediaPlayer.isPlaying())
        {
            mediaPlayer.stop();
            mediaPlayer.reset();
        }
    }

    private void pause()
    {
        if(mediaPlayer.isPlaying())
            mediaPlayer.pause();
    }

    private void reprendre()
    {
        if(!mediaPlayer.isPlaying())
            mediaPlayer.start();
    }

    private void supprimer()
    {

    }

    private  void changeSeekbar()
    {
        seekBar.setProgress(mediaPlayer.getCurrentPosition());

        if(mediaPlayer.isPlaying())
        {
            runnable = new Runnable()
            {
                @Override
                public void run()
                {
                    changeSeekbar();
                }
            };
            handler.postDelayed(runnable,1000);
        }
    }

    public class Connection extends AsyncTask<Void, Void, Void>
    {
        @Override
        protected Void doInBackground(Void... voids)
        {
            try(com.zeroc.Ice.Communicator communicator = com.zeroc.Ice.Util.initialize())
            {
                System.out.println("DEBUT du try");
                com.zeroc.Ice.ObjectPrx base = communicator.stringToProxy("SimplePrinter:default -p 10000");
                mp3.PrinterPrx printer = mp3.PrinterPrx.checkedCast(base);
                System.out.println("COMMUNICATION ");
                if(printer == null)
                {
                    throw new Error("Invalid proxy");
                }
                System.out.println(printer.SearchByTitle("paradis"));
            }
            return null;
        }
    }

}
