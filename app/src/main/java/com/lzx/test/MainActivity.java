package com.lzx.test;

import android.app.Activity;
import android.os.Bundle;
import android.widget.Toast;

/**
 * Created by liangzhenxiong on 2017/10/11.
 */

public class MainActivity extends Activity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        Price_Dialog price_dialog = new Price_Dialog();
        price_dialog.show(MainActivity.this, 100000, 1000, new Price_Dialog.PostLinstener() {
            @Override
            public void post(int price) {
                Toast.makeText(MainActivity.this, "你出的鬼价钱" + price, Toast.LENGTH_LONG).show();

            }
        });

    }
}
