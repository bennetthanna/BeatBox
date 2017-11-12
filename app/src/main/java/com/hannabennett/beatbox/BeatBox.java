package com.hannabennett.beatbox;

import android.content.Context;
import android.content.res.AssetManager;

/**
 * Created by HannaBennett on 11/12/17.
 */

public class BeatBox {
    private static final String TAG = "BeatBox";
    private static final String SOUNDS_FOLDER = "sample_sounds";

    private AssetManager mAssets;

    public BeatBox(Context context) {
        mAssets = context.getAssets();
    }
}
