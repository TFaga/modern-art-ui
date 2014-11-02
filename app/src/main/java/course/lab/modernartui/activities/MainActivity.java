package course.lab.modernartui.activities;

import android.app.Activity;
import android.graphics.Color;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.RelativeLayout;
import android.widget.SeekBar;

import course.lab.modernartui.R;
import course.lab.modernartui.dialogs.MoreInformationDialog;

/**
 * @author Tilen Faganel
 */
public class MainActivity extends Activity {

    private static final String TAG = MainActivity.class.getName();

    private RelativeLayout palette;
    private SeekBar seek;

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        palette = (RelativeLayout) findViewById(R.id.palette);
        seek = (SeekBar) findViewById(R.id.seekBar);

        seek.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {

            /**
             * Notification that the progress level has changed. Clients can use the fromUser
             * parameter
             * to distinguish user-initiated changes from those that occurred programmatically.
             *
             * @param seekBar  The SeekBar whose progress has changed
             * @param progress The current progress level. This will be in the range 0..100
             * @param fromUser True if the progress change was initiated by the user.
             */
            @Override
            public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {

                for (int i = 0; i < palette.getChildCount(); i++) {
                    View child = palette.getChildAt(i);

                    int originalColor = Color.parseColor((String) child.getTag());
                    int invertedColor = (0x00FFFFFF - (originalColor | 0xFF000000)) |
                            (originalColor & 0xFF000000);

                    if (getResources().getColor(R.color.white) != originalColor && getResources()
                            .getColor(R.color.lightgray) != originalColor) {

                        int origR = (originalColor >> 16) & 0x000000FF;
                        int origG = (originalColor >> 8) & 0x000000FF;
                        int origB = originalColor & 0x000000FF;

                        int invR = (invertedColor >> 16) & 0x000000FF;
                        int invG = (invertedColor >> 8) & 0x000000FF;
                        int invB = invertedColor & 0x000000FF;

                        child.setBackgroundColor(Color.rgb((int) (origR + (invR - origR) *
                                (progress / 100f)), (int) (origG + (invG - origG) * (progress /
                                100f)), (int) (origB + (invB - origB) * (progress / 100f))));
                        child.invalidate();
                    }
                }
            }

            /**
             * Notification that the user has started a touch gesture. Clients may want to use this
             * to disable advancing the seekbar.
             *
             * @param seekBar The SeekBar in which the touch gesture began
             */
            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {

            }

            /**
             * Notification that the user has finished a touch gesture. Clients may want to use this
             * to re-enable advancing the seekbar.
             *
             * @param seekBar The SeekBar in which the touch gesture began
             */
            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {

            }
        });
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {

        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    public void showDialog(MenuItem item) {

        new MoreInformationDialog().show(getFragmentManager(), TAG);
    }
}
