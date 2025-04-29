package com.ironhack.w1.d4;
// en una interfaz solo puede haber metodos abstractos
public interface IPlayable {
    public abstract void play();
    void pause();
    void mute();
    void increaseVolume();

    final double MAX_VOLUME = 1.0;
}
