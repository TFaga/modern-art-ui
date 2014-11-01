package course.lab.modernartui.activities;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;

import course.lab.modernartui.R;
import course.lab.modernartui.dialogs.MoreInformationDialog;

/**
 * @author Tilen Faganel
 */
public class MainActivity extends Activity {

    private static final String TAG = MainActivity.class.getName();

    private RelativeLayout palette;

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        palette = (RelativeLayout) findViewById(R.id.palette);

        for (int i = 0; i < 10; i++) {

            View v = new View(this);

            v.setLayoutParams(new ViewGroup.LayoutParams(100, 100));
            v.setBackgroundColor(R.color.lightgray);
            palette.addView(v);
        }
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
