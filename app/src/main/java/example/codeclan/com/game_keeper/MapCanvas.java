package example.codeclan.com.game_keeper;


import android.app.Activity;
import android.content.SharedPreferences;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.Icon;
import android.media.Image;
import android.util.DisplayMetrics;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import android.widget.ImageView;

/**
 * Created by user on 20/03/2017.
 */


import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PointF;
import android.support.annotation.NonNull;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.widget.ImageView;

public class MapCanvas extends ImageView {

    private Boolean clicked = false;
    private PointF point;
    private Paint paint = new Paint();
    private int icon;
    private Bitmap iconBitmap;
    Activity main;

    public MapCanvas(Context context, Activity main) {
        super(context);
        this.main = main;
        Log.d("mapcanvas", "is created");
    }

    public MapCanvas(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    public MapCanvas(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    @Override
    public boolean onTouchEvent(@NonNull MotionEvent event) {
        Log.d("touch canvas", "touch canvas");
        Log.d("if click is true do", "if click is true do");
        if(this.getClicked() == true) {
            float x = event.getX();
            float y = event.getY();
            Log.d("doing touch event", "doing touch event");
            switch (event.getAction()) {
                case MotionEvent.ACTION_DOWN:
                    point = new PointF(x, y);

                    invalidate();

                    break;
            }
        }
        return false;
    }


    public int getSavedIcon() {
        Log.d("loading saved icon", "loading saved icon");
        SharedPreferences sharedPref = this.main.getPreferences(Context.MODE_PRIVATE);
        int icon = sharedPref.getInt("saved_icon", 0);
        return icon;
    }

    public boolean getSavedClick() {
        Log.d("loading saved click", "loading saved clik");
        SharedPreferences sharedPref = this.main.getPreferences(Context.MODE_PRIVATE);
        boolean clicked = sharedPref.getBoolean("saved_click", false);
        return clicked;
    }


    public boolean getClicked(){

        return getSavedClick();
    }

    public void setIcon(){

        this.icon = getSavedIcon();
        iconBitmap = BitmapFactory.decodeResource(getResources(), this.icon);

    };

    @Override
    protected void onDraw(@NonNull Canvas canvas) {
        Log.d("onDraw", "onDraw");
        super.onDraw(canvas);
        if (point != null) {
            canvas.drawBitmap(iconBitmap, point.x, point.y, paint);

        }
    }




}
