package course.lab.modernartui.dialogs;

import android.app.AlertDialog;
import android.app.Dialog;
import android.app.DialogFragment;
import android.content.DialogInterface;
import android.os.Bundle;

import course.lab.modernartui.R;
import course.lab.modernartui.interfaces.FragmentAlertDialog;

/**
 * Builds the more information dialog.
 *
 * @author Tilen Faganel
 * @version 1.0.1
 * @since 1.0.0
 */
public class MoreInformationDialog extends DialogFragment {

    /**
     * Builds the more information alert dialog.
     * <p/>
     * It sets the newly created dialog message, two buttons and a handler for the positive
     * button.
     *
     * @param savedInstanceState The last saved instance state of the Fragment,
     *                           or null if this is a freshly created Fragment.
     * @return Return a new Dialog instance to be displayed by the Fragment.
     */
    @Override
    public Dialog onCreateDialog ( Bundle savedInstanceState ) {

        AlertDialog.Builder builder = new AlertDialog.Builder( getActivity() );
        builder.setMessage( R.string.dialog_text ).setPositiveButton( R.string.dialog_visit,
                new DialogInterface.OnClickListener() {

                    /**
                     * This method will be invoked when the positive button in the dialog
                     * is clicked.
                     * <p/>
                     *
                     * @param dialog The dialog that received the click.
                     * @param id     The button that was clicked (the position
                     *               of the item clicked.)
                     */
                    public void onClick ( DialogInterface dialog, int id ) {

                        ((FragmentAlertDialog)getActivity()).doPositiveClick();
                    }
                } ).setNegativeButton( R.string.dialog_not_now,
                new DialogInterface.OnClickListener() {

                    /**
                     * This method will be invoked when the negative button in the dialog
                     * is clicked.
                     * <p/>
                     *
                     * @param dialog The dialog that received the click.
                     * @param id     The button that was clicked (the position
                     *               of the item clicked.)
                     */
                    public void onClick ( DialogInterface dialog, int id ) {

                        ((FragmentAlertDialog)getActivity()).doNegativeClick();
                    }
                }  );

        return builder.create();
    }
}
