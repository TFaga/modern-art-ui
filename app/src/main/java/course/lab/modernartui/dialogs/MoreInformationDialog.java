package course.lab.modernartui.dialogs;

import android.app.AlertDialog;
import android.app.Dialog;
import android.app.DialogFragment;
import android.content.DialogInterface;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;

import course.lab.modernartui.R;

/**
 * @author Tilen Faganel
 */
public class MoreInformationDialog extends DialogFragment {

    @Override
    public Dialog onCreateDialog(Bundle savedInstanceState) {

        AlertDialog.Builder builder = new AlertDialog.Builder(getActivity());
        builder.setMessage(R.string.dialog_text).setPositiveButton(R.string.dialog_visit,
                new DialogInterface.OnClickListener() {

                    public void onClick(DialogInterface dialog, int id) {

                        Intent visit = new Intent(Intent.ACTION_VIEW,
                                Uri.parse("http://www.moma.org"));
                        startActivity(visit);
                    }
                }).setNegativeButton(R.string.dialog_not_now, null);

        return builder.create();
    }
}
