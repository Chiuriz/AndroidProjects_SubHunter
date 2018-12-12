package com.example.rocco.subhunter;

import android.app.Activity;
import android.os.Bundle;
import android.view.MotionEvent;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Point;
import android.view.Display;
import android.util.Log;
import android.widget.ImageView;
import java.util.Random;


public class SubHunter extends Activity {

    int numberHorizontalPixels;
    int numberVerticalPixels;
    int blockSize;
    int gridWidth = 40;
    int gridHeight;
    float horizontalTouched = -100;
    float verticalTouched = -100;
    int subHorizontalPosition;
    int subVerticalPosition;
    boolean hit = false;
    int shotsTaken;
    int distanceFromSub;
    boolean debugging = true;

    // codice che viene eseguito quando si clicca sull'app
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        // Get the current device's screen resolution 
        Display display = getWindowManager().getDefaultDisplay();
        Point size = new Point();
        display.getSize(size);

        // Initialize our size based variables
        // based on the screen resolution
        numberHorizontalPixels = size.x;
        numberVerticalPixels = size.y;
        blockSize = numberHorizontalPixels / gridWidth;
        gridHeight = numberVerticalPixels / blockSize;

        Log.d("Debugging", "In onCreate");
        newGame();
        draw();

    }

    // questo codice viene eseguito quando parte il gioco
    // o quando il giocatore vince/inizia una partita
    void newGame(){
        Log.d("Debugging", "In newGame");

    }

    // codice che disegna griglie, linee, ecc.
    void draw(){
        Log.d("Debugging", "In draw");
        printDebuggingText();

    }

    //codice che gestisce l'evento di tocco dello schermo
    @Override
    public boolean onTouchEvent(MotionEvent motionEvent){
        Log.d("Debugging","In onTouchEvent");
        takeShot();
        return true;

    }

    //codice che viene eseguito quando l'utente TOCCA lo schermo
    void takeShot (){
        Log.d("Debugging","In takeShot");
        draw();

    }

    // This code says "BOOM!"
    void boom(){

    }

    //codice che scrive il debug
    void printDebuggingText(){
        Log.d("numberHorizontalPixels", "" + numberHorizontalPixels);
        Log.d("numberVerticalPixels", "" + numberVerticalPixels);
        Log.d("blockSize", "" + blockSize);
        Log.d("gridWidth", "" + gridWidth);
        Log.d("gridHeight", "" + gridHeight);
        Log.d("horizontalTouched", "" + horizontalTouched);
        Log.d("verticalTouched", "" + verticalTouched);
        Log.d("subHorizontalPosition", "" + subHorizontalPosition);
        Log.d("subVerticalPosition", "" + subVerticalPosition);
        Log.d("hit", "" + hit);
        Log.d("shotsTaken", "" + shotsTaken);
        Log.d("debugging", "" + debugging);
        Log.d("distanceFromSub", "" + distanceFromSub);

    }

}