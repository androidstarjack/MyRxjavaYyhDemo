package sp.yuer.com.myapplication;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

import butterknife.Bind;
import butterknife.ButterKnife;
import butterknife.OnClick;
import sp.yuer.com.myapplication.objs.ObserverSImpleActivity;

public class MainActivity extends AppCompatActivity {
    @Bind(R.id.btn01)
    Button btn01;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);

    }
    @OnClick({R.id.btn01})
    public void onClick(View v){
       switch (v.getId()){
           case R.id.btn01:
               ShowActivityUtils.startActivity(this,ObserverSImpleActivity.class);
               break;
       }
    }

}
