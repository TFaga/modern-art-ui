package course.lab.modernartui;

import android.app.Activity;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;

import course.lab.modernartui.dialogs.MoreInformationDialog;

/**
 * @author Tilen Faganel
 */
public class MainActivity extends Activity {

    private static final String TAG = MainActivity.class.getName();

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
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
