package bussaya.library;

import android.support.v7.app.AppCompatActivity;
import android.support.design.widget.Snackbar;
import android.view.View;

import bussaya.library.dialog.QuickDialog;

/**
 * Created by admin on 10/3/2560.
 */

public class BaseActivity extends AppCompatActivity {
    public void showLoading(){
        QuickDialog.getInstance().showLoadingDialog(getSupportFragmentManager());
    }

    public void hideLoading(){
        if(QuickDialog.getInstance().isDialogShowing(getSupportFragmentManager())){
            QuickDialog.getInstance().dismissDialog();
        }
    }

    public boolean isLoadingShowing(){
        return QuickDialog.getInstance().isDialogShowing(getSupportFragmentManager());
    }

    public void showAlert(int resId){
        final Snackbar snackbar = Snackbar.make(getWindow().getDecorView(), resId, Snackbar.LENGTH_SHORT);
        snackbar.setAction(R.string.ok, new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                snackbar.dismiss();
            }
        }).show();
    }

    public void showAlert(String message){
        final Snackbar snackbar = Snackbar.make(getWindow().getDecorView(), message, Snackbar.LENGTH_SHORT);
        snackbar.setAction(R.string.ok, new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                snackbar.dismiss();
            }
        }).show();
    }
}
