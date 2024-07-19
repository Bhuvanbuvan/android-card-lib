package com.devbuvan.android_card_lib.internal;

import android.view.animation.Interpolator;

import com.devbuvan.android_card_lib.Direction;


public interface AnimationSetting {
    Direction getDirection();
    int getDuration();
    Interpolator getInterpolator();
}
