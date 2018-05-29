package sp.yuer.com.myapplication.objs;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

import butterknife.Bind;
import butterknife.ButterKnife;
import butterknife.OnClick;
import io.reactivex.Observable;
import io.reactivex.ObservableEmitter;
import io.reactivex.ObservableOnSubscribe;
import io.reactivex.Observer;
import io.reactivex.disposables.Disposable;
import sp.yuer.com.myapplication.R;
import sp.yuer.com.myapplication.utils.LogUtil;

/**
 * Created by king on 2018/5/29.
 */

public class ObserverSImpleActivity extends AppCompatActivity {
    private final String  TAG = this.getClass().getSimpleName();
    @Bind(R.id.btn01)
    Button btn01;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_observersimple);
        ButterKnife.bind(this);

    }
    @OnClick({R.id.btn01})
    public void onClick(View v){
        switch (v.getId()){
            case R.id.btn01:
                ss0();
                break;
        }
    }
    public void ss0(){
        Observable observable = Observable.create(new ObservableOnSubscribe() {
            @Override
            public void subscribe(ObservableEmitter e) throws Exception {
                for (int i = 0; i < 10; i++) {
                    e.onNext("我发出了一些东西:   "+i);
                }
            }
    });
        Observer observer = new Observer() {
            @Override
            public void onSubscribe(Disposable d) {

            }

            @Override
            public void onNext(Object o) {
                LogUtil.e(TAG,"结果： " + o);
            }

            @Override
            public void onError(Throwable e) {

            }

            @Override
            public void onComplete() {

            }
        };
        observable.subscribe(observer);
    }
}
