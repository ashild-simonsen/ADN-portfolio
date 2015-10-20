package and.als.portfolio;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class Portfolio extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_portfolio);
    }

    public void showToast(View v) {
        Context context = getApplicationContext();
        String text = context.getResources().getString(R.string.toast_launch_project_buttons);

        switch (v.getId()){
            case R.id.btn_build_it_bigger:      text = String.format(text, context.getString(R.string.btn_build_it_bigger));
                break;
            case R.id.btn_capstone:             text = String.format(text, context.getString(R.string.btn_capstone));
                break;
            case R.id.btn_fotball_scores:       text = String.format(text, context.getString(R.string.btn_fotball_scores));
                break;
            case R.id.btn_library:              text = String.format(text, context.getString(R.string.btn_library));
                break;
            case R.id.btn_spotify_streamer:     text = String.format(text, context.getString(R.string.btn_spotify_streamer));
                break;
            case R.id.btn_xyz_reader:           text = String.format(text, context.getString(R.string.btn_xyz_reader));
                break;
            default: text = "";
        }

        int duration = Toast.LENGTH_SHORT;

        Toast toast = Toast.makeText(context, text, duration);
        toast.show();
    }
}
