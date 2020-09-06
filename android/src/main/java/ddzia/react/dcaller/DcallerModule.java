package ddzia.react.dcaller;

import android.content.Intent;

import androidx.annotation.NonNull;

import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;

public final class DcallerModule extends ReactContextBaseJavaModule {
    DcallerModule(ReactApplicationContext reactContext) {
      super(reactContext);
    }

    @Override
    @NonNull
    public String getName() {
        return "Dcaller";
    }

    @ReactMethod
    public void showIncoming(String appUniqueId) {
        Intent intent = new Intent();
        intent.addCategory("ddzia.react.dcaller.incoming." + appUniqueId);
        getReactApplicationContext().startActivity(intent);
    }
}
