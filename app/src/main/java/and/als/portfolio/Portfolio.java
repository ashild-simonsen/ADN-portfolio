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

    Button btnBuildItBigger;
    Button btnCapstone;
    Button btnFotballScoresApp;
    Button btnLibraryApp;
    Button btnSpotifyStreamer;
    Button btnXYZReader;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_portfolio);

        btnBuildItBigger = (Button)findViewById(R.id.btn_build_it_bigger);
        btnCapstone = (Button)findViewById(R.id.btn_capstone);
        btnFotballScoresApp = (Button)findViewById(R.id.btn_fotball_scores);
        btnLibraryApp = (Button)findViewById(R.id.btn_library);
        btnSpotifyStreamer = (Button)findViewById(R.id.btn_spotify_streamer);
        btnXYZReader = (Button)findViewById(R.id.btn_xyz_reader);

        View.OnClickListener listener = new View.OnClickListener(){
            @Override
            public void onClick(View v) {

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
        };

        btnBuildItBigger.setOnClickListener(listener);
        btnCapstone.setOnClickListener(listener);
        btnFotballScoresApp.setOnClickListener(listener);
        btnLibraryApp.setOnClickListener(listener);
        btnSpotifyStreamer.setOnClickListener(listener);
        btnXYZReader.setOnClickListener(listener);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_portfolio, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
