package com.example.github7;

import android.content.Context;
import android.view.View;

public class GameView extends View {

    private int viewWidth;
    private int viewHeight;
    private int points = 0;

    @Override
    protected void onSizeChanged(int w, int h, int oldw, int oldh) {
        super.onSizeChanged(w, h, oldw, oldh);

        viewWidth = w;
        viewHeight = h;
    }

    public GameView(Context context) {
        super(context);


    }
}
