package mg.studio.myapplication;

import android.content.Intent;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private ListView listview;
    private ArrayAdapter<String> adapter;
    private List<String> data;

    @Override
    protected void onCreate(Bundle savedInstanceState) {


        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        getData();
        listview=(ListView)findViewById(R.id.AppList);
        adapter=new ArrayAdapter<String>(MainActivity.this, android.R.layout.simple_list_item_single_choice, data);
        listview.setChoiceMode(ListView.CHOICE_MODE_SINGLE);
        listview.setAdapter(adapter);
        listview.setOnItemClickListener(new AdapterView.OnItemClickListener(){

            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                switch (position){
                    case 0:
                        PackageManager packageManager = getPackageManager();
                        Intent intent=new Intent();
                        intent = packageManager.getLaunchIntentForPackage("mg.studio.activitylifecycle");
                        startActivity(intent);
                        break;
                    case 1:
                        packageManager = getPackageManager();
                        intent = new Intent();
                        intent = packageManager.getLaunchIntentForPackage("mg.studio.username");
                        startActivity(intent);
                        break;
                    case 2:
                        packageManager = getPackageManager();
                        intent = new Intent();
                        intent = packageManager.getLaunchIntentForPackage("com.example.layouts");
                        startActivity(intent);
                        break;
                }
                //Toast.makeText(MainActivity.this, "Click item" + position, Toast.LENGTH_SHORT).show();
            }
        });
    }

    private void getData(){
        data=new ArrayList<String>();
        data.add("00_LifeCycle");
        data.add("01_UserName");
        data.add("02_Layout");
        data.add("03_Button_Design");
        data.add("04_Button_Intent");
        data.add("05_Button_StartActivity");
        data.add("06_ImageButton");
        data.add("07_EditText");
        data.add("08_RadioButtons_listener");
        data.add("09_listView");
        data.add("10_GetColor");
        data.add("11_GradientBackground");
        data.add("12_ImplicitIntent");
        data.add("13_Weather_App_Design");
        data.add("15_ListView");
        data.add("16_ListViewCustomAdapter");
        data.add("17_AudioRecorder");
        data.add("19_DataBase");
        data.add("20_FragmentOne");
        data.add("21_Webview");

    }
}