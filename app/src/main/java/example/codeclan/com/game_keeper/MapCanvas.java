package example.codeclan.com.game_keeper;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.Icon;
import android.util.DisplayMetrics;
import android.view.MotionEvent;
import android.view.View;
import android.widget.ImageView;

/**
 * Created by user on 20/03/2017.
 */

public class MapCanvas implements View.OnTouchListener {

    Canvas canvas;
    Paint paint;
    Drawable icon;
    boolean clicked = false;
    Bitmap bitmapIcon;


    public MapCanvas(DisplayMetrics displayMetrics) {

        int height = displayMetrics.heightPixels;
        int width = displayMetrics.widthPixels;
        Bitmap grid = Bitmap.createBitmap(width, height, Bitmap.Config.ARGB_8888);
        canvas = new Canvas(grid);
        Paint paint = new Paint();


    }

    @Override
    public boolean onTouch(View view, MotionEvent event) {
        if(clicked = true) {
            float x = event.getX();
            float y = event.getY();


            switch (event.getAction()) {
                case MotionEvent.ACTION_DOWN:
                   int drawX = Math.round(x);
                    int drawY =Math.round(y);
                    icon.setBounds(drawX, drawY, drawX+20, drawY+20);
                    icon.draw(canvas);
                    clicked = false;
                    break;
            }
        }
        return false;
    }

//    public Bitmap pngToBitmap(Drawable icon){
//        Bitmap bitmapIcon = BitmapFactory.decodeResource(.getResources(),
//                R.drawable.icon_resource);
//
//    }

    public void setIcon(Drawable icon){
        this.icon = icon;
        clicked = true;
    }
}
