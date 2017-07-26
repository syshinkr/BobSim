package dsm.bobsim;
import android.support.design.widget.Snackbar;
import android.view.View;


public class SnackbarManager {

    public static Snackbar createDefaultSnackbar(View v, String text, int duration) {
        final Snackbar snackbar = Snackbar.make(v, text, duration);

        return snackbar;
    }

    public static Snackbar createCancelableSnackbar(View v, String text, int duration, int color) {
        final Snackbar snackbar = Snackbar.make(v, text, duration).setActionTextColor(color).setAction("확인", new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                v.setVisibility(View.GONE);
            }
        });

        return snackbar;
    }

    public static Snackbar createCancelableSnackbar(View v, String text, int duration) {
        final Snackbar snackbar = Snackbar.make(v, text, duration).setActionTextColor(ColorManager.successColor).setAction("확인", new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                v.setVisibility(View.GONE);
            }
        });

        return snackbar;
    }
}