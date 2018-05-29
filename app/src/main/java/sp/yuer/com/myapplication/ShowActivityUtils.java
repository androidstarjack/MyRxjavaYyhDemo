package sp.yuer.com.myapplication;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;

/**
 * Created by king on 2018/5/29.
 */

class ShowActivityUtils {
    public static void startActivity(Context context, Class<? extends Activity> T) {
        context.startActivity(new Intent(context,T));
    }
}
