package example.codeclan.com.game_keeper;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.drawable.Icon;
import android.util.DisplayMetrics;
import android.view.MotionEvent;

/**
 * Created by user on 20/03/2017.
 */

public class MapCanvas extends Canvas {

    Canvas canvas;
    Paint paint;
    Bitmap icon;


    public MapCanvas(DisplayMetrics displayMetrics, Bitmap icon) {

        int height = displayMetrics.heightPixels;
        int width = displayMetrics.widthPixels;
        Bitmap grid = Bitmap.createBitmap(width, height, Bitmap.Config.ARGB_8888);
        canvas = new Canvas(grid);
        Paint paint = new Paint();
    }

    public Boolean onTouchEvent(MotionEvent event) {
        float x = event.getX();
        float y = event.getY();


        switch (event.getAction()) {
            case MotionEvent.ACTION_DOWN:
//                paint.set(R.drawable.);
//                canvas.drawPaint(x, y, paint);
            break;

        }
        return true;
    }

}
