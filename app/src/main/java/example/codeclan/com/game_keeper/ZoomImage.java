package example.codeclan.com.game_keeper;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.VectorDrawable;
import android.support.graphics.drawable.VectorDrawableCompat;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.ScaleGestureDetector;
import android.widget.ImageView;

import java.util.EventListener;
import java.util.Vector;

/**
 * Created by user on 18/03/2017.
 */

public class ZoomImage extends ImageView{

    private Vector map;
    private int mapWidth;
    private int mapHeight;
    private final static float minZoom = 1.f;
    private final static float maxZoom = 3.f;
    private float scaleFactor = 1.f;
    private ScaleGestureDetector scaleGestureDetector;
    private final static int NONE = 0;
    private final static int PAN = 1;
    private final static int ZOOM = 2;
    private int eventState;
    private float startX = 0;
    private float startY = 0;
    private float finalX = 0;
    private float finalY = 0;


    private class ScaleListener extends ScaleGestureDetector.SimpleOnScaleGestureListener {

        @Override
        public boolean onScale(ScaleGestureDetector detector) {
            scaleFactor *= detector.getScaleFactor();
            scaleFactor = Math.max(minZoom, Math.min(maxZoom,scaleFactor));
            //invalidate();
            //requestLayout();

            return super.onScale(detector);
        }
    }

    public ZoomImage(Context context, AttributeSet attrs) {
        super(context, attrs);

        scaleGestureDetector = new ScaleGestureDetector(getContext(),new ScaleListener());


    }

    @Override
    public boolean onTouchEvent(MotionEvent event) {
        switch(event.getAction() & MotionEvent.ACTION_MASK){
            case MotionEvent.ACTION_DOWN:
                eventState = PAN;
                startX = event.getX();
                startY = event.getY();
                break;
            case MotionEvent.ACTION_UP:
                eventState = NONE;
                break;
            case MotionEvent.ACTION_MOVE:
                finalX = event.getX()- startX;
                finalY = event.getY()- startY;
                break;
            case MotionEvent.ACTION_POINTER_DOWN:
                eventState = ZOOM;
                startX = event.getX();
                startY = event.getY();
                break;
        }
        scaleGestureDetector.onTouchEvent(event);
            if ((eventState == PAN && scaleFactor !=minZoom)|| eventState == ZOOM){
                invalidate();
                requestLayout();
            }

        return true;
    }

    @Override
    protected void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        super.onMeasure(widthMeasureSpec, heightMeasureSpec);

        int imageWidth = MeasureSpec.getSize(widthMeasureSpec);
        int imageHeight = MeasureSpec.getSize(heightMeasureSpec);
        int scaledWidth = Math.round(imageWidth* scaleFactor);
        int scaledHeight = Math.round(imageHeight* scaleFactor);

        setMeasuredDimension(
                Math.min(imageWidth, scaledWidth),
                Math.min(imageHeight, scaledHeight)
        );
    }


    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);

        canvas.save();
        canvas.scale(scaleFactor,scaleFactor);
        canvas.translate(finalX/scaleFactor, finalY/scaleFactor);
        VectorDrawableCompat canvasMap = VectorDrawableCompat.create(getContext().getResources(),R.drawable.mapfile, null);
        canvasMap.draw(canvas);
        canvas.restore();
    }

    @Override
    protected void onSizeChanged(int width, int height, int oldWidth, int oldHeight) {
        super.onSizeChanged(width, height, oldWidth, oldHeight);
    }

    public void setImage(Drawable ting){

    }
}
