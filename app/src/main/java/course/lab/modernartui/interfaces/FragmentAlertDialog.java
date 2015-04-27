package course.lab.modernartui.interfaces;

import android.view.MenuItem;

/**
 * Created by asifiqbal on 2015-04-26.
 */
public interface FragmentAlertDialog {
    void showDialog ( MenuItem item );
    void doPositiveClick();
    void doNegativeClick();
}
